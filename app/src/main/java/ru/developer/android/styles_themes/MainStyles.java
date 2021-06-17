package ru.developer.android.styles_themes;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import ru.developer.android.R;
import ru.developer.android.android.AndroidManifestActivity;
import ru.developer.android.android.AndroidStudioActivity;
import ru.developer.android.android.BeginAndroidActivity;
import ru.developer.android.android.CreateNewActivity;
import ru.developer.android.android.CreateProjectActivity;
import ru.developer.android.android.ExampleActivityMainXml;
import ru.developer.android.android.ExampleMainActivityJava;
import ru.developer.android.android.HelloWorldActivity;
import ru.developer.android.android.MainAndroid;
import ru.developer.android.android.RunEmulatorActivity;
import ru.developer.android.android.RunPhoneActivity;
import ru.developer.android.android.StructureProjectActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainStyles extends AppCompatActivity {

    ListView listViewStyles;
    ArrayAdapter<String> adapter;
    ArrayList<String> stylesList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_styles);

        ActionBar actionBar = this.getSupportActionBar();
        if (actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(true);
        }
        actionBar.setTitle("Стили и темы");


        listViewStyles = findViewById(R.id.listViewStyles);

        setInitialData();

        adapter = new ArrayAdapter<>(this, R.layout.support_simple_spinner_dropdown_item, stylesList);
        listViewStyles.setAdapter(adapter);

        listViewStyles.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position) {
                    case 0:
                        Intent intent = new Intent(MainStyles.this, StylesLess1.class);
                        startActivity(intent);
                        break;

                }
            }
        });
    }

    private void setInitialData() {

        stylesList = new ArrayList<>();
        stylesList.add("Стили");
        stylesList.add("Темы");
        stylesList.add("Создание своей темы");
        stylesList.add("Применение темы");
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