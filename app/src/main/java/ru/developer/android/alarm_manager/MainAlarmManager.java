package ru.developer.android.alarm_manager;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

import ru.developer.android.R;
import ru.developer.android.service.MainService;
import ru.developer.android.service.ServiceActivity;
import ru.developer.android.service.ServiceExample;
import ru.developer.android.service.ServiceLifecycle;

public class MainAlarmManager extends AppCompatActivity {

    ListView listViewAlarmManager;
    ArrayAdapter<String> adapter;
    ArrayList<String> alarmList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_alarm_manager);

        ActionBar actionBar = this.getSupportActionBar();
        if (actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(true);
        }
        actionBar.setTitle("Alarm Manager");


        listViewAlarmManager = findViewById(R.id.listViewAlarmManager);

        setInitialData();

        adapter = new ArrayAdapter<>(this, R.layout.support_simple_spinner_dropdown_item, alarmList);
        listViewAlarmManager.setAdapter(adapter);

        listViewAlarmManager.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position) {
                    case 0:
                        Intent intent = new Intent(MainAlarmManager.this, SimpleAlarmActivity.class);
                        startActivity(intent);
                        break;
                    case 1:
                        Intent intent1 = new Intent(MainAlarmManager.this, SimpleAlarmActivity.class);
                        startActivity(intent1);
                        break;

                }
            }
        });
    }

    private void setInitialData() {

        alarmList = new ArrayList<>();
        alarmList.add("Simple Alarm");
        alarmList.add("Set alarm with Date and time");

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
