package ru.developer.android.service;

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
import ru.developer.android.fragment.ChangeFragmentActivity;
import ru.developer.android.fragment.DialogFragmentActivity;
import ru.developer.android.fragment.DisplayCheckboxOnDisplay;
import ru.developer.android.fragment.DisplayListOnDialogActivity;
import ru.developer.android.fragment.DisplayRadioButton;
import ru.developer.android.fragment.ListFragmentActivity;
import ru.developer.android.fragment.MainFragments;
import ru.developer.android.fragment.PassDataBeetweenActivity;
import ru.developer.android.fragment.TransactionBetweenActivity;

public class MainService extends AppCompatActivity {

    ListView listViewService;
    ArrayAdapter<String> adapter;
    ArrayList<String> serviceList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_service);

        ActionBar actionBar = this.getSupportActionBar();
        if (actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(true);
        }
        actionBar.setTitle("Сервисы");


        listViewService = findViewById(R.id.listViewService);

        setInitialData();

        adapter = new ArrayAdapter<>(this, R.layout.support_simple_spinner_dropdown_item, serviceList);
        listViewService.setAdapter(adapter);

        listViewService.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position) {
                    case 0:
                        Intent intent = new Intent(MainService.this, ServiceActivity.class);
                        startActivity(intent);
                        break;
                    case 1:
                        Intent intent1 = new Intent(MainService.this, ServiceLifecycle.class);
                        startActivity(intent1);
                        break;
                    case 2:
                        Intent intent2 = new Intent(MainService.this, ServiceExample.class);
                        startActivity(intent2);
                        break;

                }
            }
        });
    }

    private void setInitialData() {

        serviceList = new ArrayList<>();
       serviceList.add("Service");
       serviceList.add("Service lifecycle");
       serviceList.add("Service example");



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
