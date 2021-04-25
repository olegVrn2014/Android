package ru.developer.android.intents.runIntents;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import ru.developer.android.MainActivity;
import ru.developer.android.R;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class RunPhoneCall extends AppCompatActivity {

    EditText editTextNumber;
    Button buttonCall;
    String number;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_run_phone_call);

        ActionBar actionBar = this.getSupportActionBar();
        if (actionBar != null){
            actionBar.setDisplayHomeAsUpEnabled(true);
        }
        actionBar.setTitle("Run app");
        actionBar.setHomeButtonEnabled(true);
        actionBar.setDisplayHomeAsUpEnabled(true);

        buttonCall = findViewById(R.id.buttonCall);
        editTextNumber = findViewById(R.id.editTextNumber);

        buttonCall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent intentCall = new Intent(Intent.ACTION_CALL);
                number = editTextNumber.getText().toString();
                if (number.trim().isEmpty()) {
                    intentCall.setData(Uri.parse("tel:"));
                    Toast.makeText(RunPhoneCall.this, "Введите номер телефона", Toast.LENGTH_SHORT).show();
                }
                else {
                    intentCall.setData(Uri.parse("tel:" + number));
                }
                if (ActivityCompat.checkSelfPermission(getApplicationContext(),
                        Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                    Toast.makeText(RunPhoneCall.this, "Включите разрешение", Toast.LENGTH_SHORT).show();
                    requestPermission();
                }else {
                    startActivity(intentCall);
                }
            }
        });
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                finish();
                return true;
        }
        return super.onOptionsItemSelected(item);
    }

    private void requestPermission() {
        ActivityCompat.requestPermissions(RunPhoneCall.this, new String[]{Manifest.permission.CALL_PHONE}, 1);
    }
}