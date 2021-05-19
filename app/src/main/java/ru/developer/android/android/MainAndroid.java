package ru.developer.android.android;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import ru.developer.android.R;
import ru.developer.android.menu.ContexMenuActivity;
import ru.developer.android.menu.MainMenu;
import ru.developer.android.menu.OptionMenuActivity;
import ru.developer.android.menu.PopUpMenuActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainAndroid extends AppCompatActivity {

    ListView listViewAndroid;
    ArrayAdapter<String> adapter;
    ArrayList<String> androidList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_android);

        ActionBar actionBar = this.getSupportActionBar();
        if (actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(true);
        }
        actionBar.setTitle("Начало Android");


        listViewAndroid = findViewById(R.id.listViewAndroid);

        setInitialData();

        adapter = new ArrayAdapter<>(this, R.layout.support_simple_spinner_dropdown_item, androidList);
        listViewAndroid.setAdapter(adapter);

        listViewAndroid.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position) {
                    case 0:
                        Intent intent = new Intent(MainAndroid.this, BeginAndroidActivity.class);
                        startActivity(intent);
                        break;
                    case 1:
                        Intent intent1 = new Intent(MainAndroid.this, AndroidStudioActivity.class);
                        startActivity(intent1);
                        break;
                    case 2:
                        Intent intent2 = new Intent(MainAndroid.this, CreateProjectActivity.class);
                        startActivity(intent2);
                        break;
                    case 3:
                        Intent intent3 = new Intent(MainAndroid.this, StructureProjectActivity.class);
                        startActivity(intent3);
                        break;
                    case 4:
                        Intent intent4 = new Intent(MainAndroid.this, ExampleMainActivityJava.class);
                        startActivity(intent4);
                        break;
                    case 5:
                        Intent intent5 = new Intent(MainAndroid.this, ExampleActivityMainXml.class);
                        startActivity(intent5);
                        break;
                    case 6:
                        Intent intent6 = new Intent(MainAndroid.this, AndroidManifestActivity.class);
                        startActivity(intent6);
                        break;
                    case 7:
                        Intent intent7 = new Intent(MainAndroid.this, RunEmulatorActivity.class);
                        startActivity(intent7);
                        break;
                    case 8:
                        Intent intent8 = new Intent(MainAndroid.this, RunPhoneActivity.class);
                        startActivity(intent8);
                        break;
                    case 9:
                        Intent intent9 = new Intent(MainAndroid.this, HelloWorldActivity.class);
                        startActivity(intent9);
                        break;
                    case 10:
                        Intent intent10 = new Intent(MainAndroid.this, CreateNewActivity.class);
                        startActivity(intent10);
                        break;
                }
            }
        });
    }

    private void setInitialData() {

        androidList = new ArrayList<>();
        androidList.add("Введение");
        androidList.add("Установка Android Studio");
        androidList.add("Как создать проект?");
        androidList.add("Структура проекта");
        androidList.add("Обзор MainActivity.java");
        androidList.add("Обзор activity_main.xml");
        androidList.add("Обзор AndroidManifest.xml");
        androidList.add("Запуск проекта на эмуляторе");
        androidList.add("Запуск проекта на телефоне");
        androidList.add("Первая программа");
        androidList.add("Как создать новую Activity?");
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