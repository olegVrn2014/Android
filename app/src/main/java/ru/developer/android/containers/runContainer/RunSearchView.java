package ru.developer.android.containers.runContainer;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import ru.developer.android.R;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SearchView;

import java.util.ArrayList;

public class RunSearchView extends AppCompatActivity {

    SearchView searchView;
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_run_search_view);

        ActionBar actionBar = this.getSupportActionBar();
        if (actionBar != null){
            actionBar.setDisplayHomeAsUpEnabled(true);
        }
        actionBar.setTitle("Запуск SearchView");
        actionBar.setHomeButtonEnabled(true);
        actionBar.setDisplayHomeAsUpEnabled(true);

        searchView = findViewById(R.id.searchView);
        listView = findViewById(R.id.listView);
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Россия");
        arrayList.add("Украина");
        arrayList.add("Беларусь");
        arrayList.add("Англия");
        arrayList.add("Португалия");
        arrayList.add("Германия");
        arrayList.add("Франция");

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(this,R.layout.support_simple_spinner_dropdown_item,arrayList);
        listView.setAdapter(arrayAdapter);

        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                arrayAdapter.getFilter().filter(newText);
                return false;
            }
        });

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