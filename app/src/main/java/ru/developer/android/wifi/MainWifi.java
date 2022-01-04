package ru.developer.android.wifi;

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
import ru.developer.android.google_map.CurrentLocation;
import ru.developer.android.google_map.GoogleMapActivity;
import ru.developer.android.google_map.MainGoogleMap;

public class MainWifi extends AppCompatActivity {

    ListView listViewWifi;
    ArrayAdapter<String> adapter;
    ArrayList<String> wifiList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_wifi);

        ActionBar actionBar = this.getSupportActionBar();
        if (actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(true);
        }
        actionBar.setTitle("Wifi");

        listViewWifi = findViewById(R.id.listViewWifi);

        setInitialData();

        adapter = new ArrayAdapter<>(this, R.layout.support_simple_spinner_dropdown_item, wifiList);
        listViewWifi.setAdapter(adapter);

        listViewWifi.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position) {
                    case 0:
                        Intent intent = new Intent(MainWifi.this, ChangeWifi.class);
                        startActivity(intent);
                        break;
                    case 1:
                        Intent intent1 = new Intent(MainWifi.this, infoWifi.class);
                        startActivity(intent1);
                        break;
                    case 2:
                        Intent intent2 = new Intent(MainWifi.this, ScanWifiActivity.class);
                        startActivity(intent2);
                        break;

                }
            }
        });
    }

    private void setInitialData() {

        wifiList = new ArrayList<>();
        wifiList.add("Change WIFI State");
        wifiList.add("WIFI Information");
        wifiList.add("WIFI list");

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
