package ru.developer.android.menu;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NavUtils;
import ru.developer.android.R;
import ru.developer.android.intents.ActivityLifecycle;
import ru.developer.android.intents.ChangeIntentActivity;
import ru.developer.android.intents.EmailActivity;
import ru.developer.android.intents.GoogleMapActivity;
import ru.developer.android.intents.GoogleSearchActivity;
import ru.developer.android.intents.IntentMain;
import ru.developer.android.intents.PassDataBetweenActivity;
import ru.developer.android.intents.PhoneCallActivity;
import ru.developer.android.intents.PlayStoreActivity;
import ru.developer.android.intents.ShareIntentActivity;
import ru.developer.android.intents.StartActForResultActivity;
import ru.developer.android.intents.WhatsAppActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainMenu extends AppCompatActivity {

    ListView listViewMenu;
    ArrayAdapter<String> adapter;
    ArrayList<String> menuList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);

        ActionBar actionBar = this.getSupportActionBar();
        if (actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(true);
        }
        actionBar.setTitle("Menu");


        listViewMenu = findViewById(R.id.listViewMenu);

        setInitialData();

        adapter = new ArrayAdapter<>(this, R.layout.support_simple_spinner_dropdown_item, menuList);
        listViewMenu.setAdapter(adapter);

        listViewMenu.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position) {
                    case 0:
//                        Intent intent = new Intent(MainMenu.this, ActivityLifecycle.class);
//                        startActivity(intent);
                        Toast.makeText(MainMenu.this, "Введение", Toast.LENGTH_SHORT).show();
                        break;
                    case 1:
//                        Intent intent = new Intent(MainMenu.this, ActivityLifecycle.class);
//                        startActivity(intent);
                        Toast.makeText(MainMenu.this, "Установка", Toast.LENGTH_SHORT).show();
                        break;
                    case 2:
//                        Intent intent = new Intent(MainMenu.this, ActivityLifecycle.class);
//                        startActivity(intent);
                        Toast.makeText(MainMenu.this, "Первая программа", Toast.LENGTH_SHORT).show();
                        break;
                }
            }
        });
    }

    private void setInitialData() {

        menuList = new ArrayList<>();
        menuList.add("Введение в Android");
        menuList.add("Установка Android Studio");
        menuList.add("Первое приложение");

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