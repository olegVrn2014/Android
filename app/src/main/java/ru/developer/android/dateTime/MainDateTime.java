package ru.developer.android.dateTime;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NavUtils;
import ru.developer.android.R;
import ru.developer.android.containers.GridViewLess2;
import ru.developer.android.containers.ListViewLess1;
import ru.developer.android.containers.MainContainers;
import ru.developer.android.containers.SearchViewLess4;
import ru.developer.android.containers.SearchViewOnToolbar;
import ru.developer.android.containers.WebViewLess3;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainDateTime extends AppCompatActivity {

    ListView listViewDateTime;
    ArrayAdapter<String> arrayAdapterDateTime;
    ArrayList<String> arrayListDateTime;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_date_time);

        ActionBar actionBar = this.getSupportActionBar();
        if (actionBar != null){
            actionBar.setDisplayHomeAsUpEnabled(true);
        }
        actionBar.setTitle("DateTime");


        listViewDateTime = findViewById(R.id.listViewDateTime);

        setInitialData();

        arrayAdapterDateTime = new ArrayAdapter<>(this,R.layout.support_simple_spinner_dropdown_item, arrayListDateTime);
        listViewDateTime.setAdapter(arrayAdapterDateTime);

        listViewDateTime.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position){
                    case 0:
                       Intent intent = new Intent(MainDateTime.this, TextClock.class); startActivity(intent);
                        break;
                    case 1:
                        Intent intent1 = new Intent(MainDateTime.this, AnalogClock.class); startActivity(intent1);
                        break;
                    case 2:
                        Intent intent2 = new Intent(MainDateTime.this, DigitalClock.class); startActivity(intent2);
                        break;
                    case 3:
                        Intent intent3 = new Intent(MainDateTime.this, DatePicker.class); startActivity(intent3);
                        break;

                }
            }
        });
    }

    private void setInitialData() {

        arrayListDateTime = new ArrayList<>();
        arrayListDateTime.add("TextClock");
        arrayListDateTime.add("AnalogClock");
        arrayListDateTime.add("DigitalClock");
        arrayListDateTime.add("DatePicker");
        arrayListDateTime.add("TimePicker");
        arrayListDateTime.add("DatePickerDialog");
        arrayListDateTime.add("TimePickerDialog");
        arrayListDateTime.add("Chronometer");

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