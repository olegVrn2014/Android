package ru.developer.android.tel_manager.run;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

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

import ru.developer.android.R;

public class RunPhoneCallActivity extends AppCompatActivity {

    EditText editText;
    Button buttonCall;
    String number;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.run_phone_call);

        ActionBar actionBar = this.getSupportActionBar();
        if (actionBar != null){
            actionBar.setDisplayHomeAsUpEnabled(true);
        }
        actionBar.setTitle("Запуск программы");
        actionBar.setHomeButtonEnabled(true);
        actionBar.setDisplayHomeAsUpEnabled(true);

        editText=findViewById(R.id.edit_text);
        buttonCall = findViewById(R.id.buttonCall);

        buttonCall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_CALL);
                number = editText.getText().toString();
                if (number.trim().isEmpty()){
                    intent.setData(Uri.parse("tel:"));
                    Toast.makeText(getApplicationContext(),
                            "Пожалуйста, введите номер", Toast.LENGTH_SHORT).show();
                }else {
                    intent.setData(Uri.parse("tel:"+number));
                }
                if (ActivityCompat.checkSelfPermission(getApplicationContext(), Manifest.permission.CALL_PHONE)
                        != PackageManager.PERMISSION_GRANTED){
                    Toast.makeText(getApplicationContext(), "Включите разрешения", Toast.LENGTH_SHORT).show();
                    requestPermissions();
                }else {
                    startActivity(intent);
                }
            }
        });
    }

    private void requestPermissions(){
        ActivityCompat.requestPermissions(RunPhoneCallActivity.this,new String[]{Manifest.permission.CALL_PHONE},1);
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
}