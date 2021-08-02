package ru.developer.android.containers;

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
import android.widget.SearchView;

import java.util.ArrayList;

public class MainContainers extends AppCompatActivity {

    ListView listViewContainers;
    ArrayAdapter<String> adapter;
    ArrayList<String> containersList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_containers);

        ActionBar actionBar = this.getSupportActionBar();
        if (actionBar != null){
            actionBar.setDisplayHomeAsUpEnabled(true);
        }
        actionBar.setTitle("Containers");


        listViewContainers = findViewById(R.id.listViewContainers);

        setInitialData();

        adapter = new ArrayAdapter<>(this,R.layout.support_simple_spinner_dropdown_item, containersList);
        listViewContainers.setAdapter(adapter);

        listViewContainers.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position){
                    case 0:
                        Intent intent = new Intent(MainContainers.this,ListViewLess1.class); startActivity(intent);
                        break;
                    case 1:
                        Intent intent1 = new Intent(MainContainers.this,GridViewLess2.class); startActivity(intent1);
                        break;
                    case 2:
                        Intent intent2 = new Intent(MainContainers.this, WebViewLess3.class); startActivity(intent2);
                        break;
                    case 3:
                        Intent intent3 = new Intent(MainContainers.this, SearchViewLess4.class); startActivity(intent3);
                        break;
                    case 4:
                        Intent intent4 = new Intent(MainContainers.this, SearchViewOnToolbar.class); startActivity(intent4);
                        break;
                }
            }
        });
    }

    private void setInitialData() {

        containersList = new ArrayList<>();
        containersList.add("ListView");
        containersList.add("GridView");
        containersList.add("WebView");
        containersList.add("SearchView");
        containersList.add("SearchView toolbar");

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
