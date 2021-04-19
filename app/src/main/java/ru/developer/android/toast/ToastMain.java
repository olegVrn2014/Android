package ru.developer.android.toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NavUtils;
import ru.developer.android.R;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class ToastMain extends AppCompatActivity {

    ListView listViewToast;
    ArrayAdapter<String> adapter;
    ArrayList<String> toastList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toast_main);

        ActionBar actionBar = this.getSupportActionBar();
        if (actionBar != null){
            actionBar.setDisplayHomeAsUpEnabled(true);
        }
        actionBar.setTitle("Toast");


        listViewToast = findViewById(R.id.listViewToast);

        setInitialData();

        adapter = new ArrayAdapter<>(this,R.layout.support_simple_spinner_dropdown_item, toastList);
        listViewToast.setAdapter(adapter);

        listViewToast.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position){
                    case 0:
                        Intent intent = new Intent(ToastMain.this, SimpleToastActivity.class); startActivity(intent);
                        break;
                    case 1:
                        Intent intent1 = new Intent(ToastMain.this, PositionToastActivity.class); startActivity(intent1);
                        break;
                    case 2:
                        Intent intent2 = new Intent(ToastMain.this, CustomToastActivity.class); startActivity(intent2);
                        break;

                }
            }
        });

    }

    private void setInitialData() {

        toastList = new ArrayList<>();
        toastList.add("Simple Toast");
        toastList.add("Positioning Toast");
        toastList.add("Custom Toast");


    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();
        if (id == android.R.id.home){
            NavUtils.navigateUpFromSameTask(this);
        }
        return super.onOptionsItemSelected(item);
    }
}