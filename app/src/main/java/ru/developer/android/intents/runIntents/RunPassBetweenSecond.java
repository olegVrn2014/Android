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
import android.widget.TextView;

public class RunPassBetweenSecond extends AppCompatActivity {

    TextView textName;
    TextView textLastName;
    Button buttonBack;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_run_pass_between_second);

        ActionBar actionBar = this.getSupportActionBar();
        if (actionBar != null){
            actionBar.setDisplayHomeAsUpEnabled(true);
        }
        actionBar.setTitle("Run app");
        actionBar.setHomeButtonEnabled(true);
        actionBar.setDisplayHomeAsUpEnabled(true);

        textName = findViewById(R.id.textName);
        textLastName = findViewById(R.id.textLastName);
        buttonBack = findViewById(R.id.buttonBack);

        Intent intent = getIntent();
        String name = intent.getStringExtra("NAME");
        String lastName = intent.getStringExtra("LAST_NAME");
        textName.setText("Имя: " + name);
        textLastName.setText("Фамилия: " + lastName);

        buttonBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(RunPassBetweenSecond.this, RunPassBetweenMain.class);
                startActivity(intent1);
                finish();
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