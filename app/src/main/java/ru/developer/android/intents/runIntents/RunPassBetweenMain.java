package ru.developer.android.intents.runIntents;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import ru.developer.android.MainActivity;
import ru.developer.android.R;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class RunPassBetweenMain extends AppCompatActivity {

    EditText editName;
    EditText editLastName;
    Button buttonSend;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_run_pass_between_main);

        ActionBar actionBar = this.getSupportActionBar();
        if (actionBar != null){
            actionBar.setDisplayHomeAsUpEnabled(true);
        }
        actionBar.setTitle("Run app");
        actionBar.setHomeButtonEnabled(true);
        actionBar.setDisplayHomeAsUpEnabled(true);

        editName = findViewById(R.id.editName);
        editLastName = findViewById(R.id.editLastName);
        buttonSend = findViewById(R.id.buttonSend);

        buttonSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = editName.getText().toString().trim();
                String lastName = editLastName.getText().toString().trim();

                if (name.equals("") || lastName.equals("")){
                    Toast.makeText(RunPassBetweenMain.this, "Заполните все поля", Toast.LENGTH_SHORT).show();
                } else {
                    Intent intent = new Intent(RunPassBetweenMain.this, RunPassBetweenSecond.class);
                    intent.putExtra("NAME",name);
                    intent.putExtra("LAST_NAME",lastName);
                    startActivity(intent);
                    finish();
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
}