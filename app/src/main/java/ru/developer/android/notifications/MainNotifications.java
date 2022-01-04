package ru.developer.android.notifications;

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
import ru.developer.android.wifi.ChangeWifi;
import ru.developer.android.wifi.MainWifi;
import ru.developer.android.wifi.ScanWifiActivity;
import ru.developer.android.wifi.infoWifi;

public class MainNotifications extends AppCompatActivity {

    ListView listViewNotifications;
    ArrayAdapter<String> adapter;
    ArrayList<String> notificationsList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_notifications);

        ActionBar actionBar = this.getSupportActionBar();
        if (actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(true);
        }
        actionBar.setTitle("Notifications");

        listViewNotifications = findViewById(R.id.listViewNotifications);

        setInitialData();

        adapter = new ArrayAdapter<>(this, R.layout.support_simple_spinner_dropdown_item, notificationsList);
        listViewNotifications.setAdapter(adapter);

        listViewNotifications.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position) {
                    case 0:
                        Intent intent = new Intent(MainNotifications.this, SimpleNotifications.class);
                        startActivity(intent);
                        break;
//                    case 1:
//                        Intent intent1 = new Intent(MainNotifications.this, infoWifi.class);
//                        startActivity(intent1);
//                        break;
//                    case 2:
//                        Intent intent2 = new Intent(MainNotifications.this, ScanWifiActivity.class);
//                        startActivity(intent2);
//                        break;

                }
            }
        });
    }

    private void setInitialData() {

        notificationsList = new ArrayList<>();
        notificationsList.add("Simple Notification");
        notificationsList.add("Big TEXT Style");
        notificationsList.add("Big Picture Style");
        notificationsList.add("Inbox Style ");
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
