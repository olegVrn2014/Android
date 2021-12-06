package ru.developer.android.tel_manager.run;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import ru.developer.android.R;

public class RunSendEmailActivity extends AppCompatActivity {

    EditText editTextMailTo, editTextSubject, editTextMessage;
    Button buttonEmail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_run_send_email);

        ActionBar actionBar = this.getSupportActionBar();
        if (actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(true);
        }
        actionBar.setTitle("Запуск программы");
        actionBar.setHomeButtonEnabled(true);
        actionBar.setDisplayHomeAsUpEnabled(true);

        editTextMailTo = findViewById(R.id.editTextMailTo);
        editTextSubject = findViewById(R.id.editTextSubject);
        editTextMessage = findViewById(R.id.editTextMessage);
        buttonEmail = findViewById(R.id.buttonEmail);

        buttonEmail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String mailTo = editTextMailTo.getText().toString();
                String subject = editTextSubject.getText().toString();
                String message = editTextMessage.getText().toString();

                Intent intent = new Intent(Intent.ACTION_SEND);
                intent.putExtra(Intent.EXTRA_EMAIL,new String[]{mailTo});
                intent.putExtra(Intent.EXTRA_SUBJECT,subject);
                intent.putExtra(Intent.EXTRA_TEXT,message);
                intent.setType("message/rfc822");
                startActivity(Intent.createChooser(intent,"Выберите приложение: "));
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
}