package ru.developer.android.tel_manager;

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
import ru.developer.android.intents.runIntents.RunPhoneCall;
import ru.developer.android.tel_manager.run.RunPhoneCallActivity;

public class MainTelephoneManager extends AppCompatActivity {

    ListView listViewTelManager;
    ArrayAdapter<String> adapter;
    ArrayList<String> telManagerList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_telephon_manager);

        ActionBar actionBar = this.getSupportActionBar();
        if (actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(true);
        }
        actionBar.setTitle("Telephone Manager");


        listViewTelManager = findViewById(R.id.listViewTelManager);

        setInitialData();

        adapter = new ArrayAdapter<>(this, R.layout.support_simple_spinner_dropdown_item, telManagerList);
        listViewTelManager.setAdapter(adapter);

        listViewTelManager.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position) {
                    case 0:
                        Intent intent = new Intent(MainTelephoneManager.this, PhoneDetailsActivity.class);
                        startActivity(intent);
                        break;
                    case 1:
                        Intent intent1 = new Intent(MainTelephoneManager.this, PhoneCallActivity.class);
                        startActivity(intent1);
                        break;

                }
            }
        });
    }

    private void setInitialData() {

        telManagerList = new ArrayList<>();
        telManagerList.add("Phone details");
        telManagerList.add("Phone Call");
        telManagerList.add("Send EMAIL");
        telManagerList.add("Read contacts");

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

