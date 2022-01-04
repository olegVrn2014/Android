package ru.developer.android.google_map;

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
import ru.developer.android.tel_manager.MainTelephoneManager;
import ru.developer.android.tel_manager.PhoneCallActivity;
import ru.developer.android.tel_manager.PhoneDetailsActivity;
import ru.developer.android.tel_manager.ReadContactActivity;
import ru.developer.android.tel_manager.SendEmailActivity;

public class MainGoogleMap extends AppCompatActivity {

    ListView listViewGoogleMap;
    ArrayAdapter<String> adapter;
    ArrayList<String> googleMapList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.google_map);

        ActionBar actionBar = this.getSupportActionBar();
        if (actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(true);
        }
        actionBar.setTitle("Google Map");


        listViewGoogleMap = findViewById(R.id.listViewGoogleMap);

        setInitialData();

        adapter = new ArrayAdapter<>(this, R.layout.support_simple_spinner_dropdown_item, googleMapList);
        listViewGoogleMap.setAdapter(adapter);

        listViewGoogleMap.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position) {
                    case 0:
                        Intent intent = new Intent(MainGoogleMap.this, GoogleMapActivity.class);
                        startActivity(intent);
                        break;
                    case 1:
                        Intent intent1 = new Intent(MainGoogleMap.this, CurrentLocation.class);
                        startActivity(intent1);
                        break;

                }
            }
        });
    }

    private void setInitialData() {

        googleMapList = new ArrayList<>();
        googleMapList.add("Google Map");
        googleMapList.add("Current Location");

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

