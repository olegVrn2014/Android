package ru.developer.android.dateTime.runDateTime;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import ru.developer.android.R;

import android.os.Bundle;
import android.view.MenuItem;

public class RunDigitalClock extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_run_digital_clock);

        ActionBar actionBar = this.getSupportActionBar();
        if (actionBar != null){
            actionBar.setDisplayHomeAsUpEnabled(true);
        }
        actionBar.setTitle("Запуск DigitalClock");
        actionBar.setHomeButtonEnabled(true);
        actionBar.setDisplayHomeAsUpEnabled(true);
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
