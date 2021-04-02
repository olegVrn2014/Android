package ru.developer.android.runWidgets;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import ru.developer.android.R;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

import java.util.ArrayList;
import java.util.List;

public class RunAutoCompleteTextView extends AppCompatActivity {

    AutoCompleteTextView text;
    List<String> cityList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_run_auto_complete_text_view);

        ActionBar actionBar = this.getSupportActionBar();
        if (actionBar != null){
            actionBar.setDisplayHomeAsUpEnabled(true);
        }
        actionBar.setTitle("Run app");
        actionBar.setHomeButtonEnabled(true);
        actionBar.setDisplayHomeAsUpEnabled(true);

        text = findViewById(R.id.text);
        cityList = new ArrayList<>();
        cityList.add("Москва");
        cityList.add("Санкт-Петербург");
        cityList.add("Милан");
        cityList.add("Барселона");
        cityList.add("Дубай");
        cityList.add("Египет");
        cityList.add("Нью-Йорк");
        cityList.add("Мадрид");
        cityList.add("Венеция");
        cityList.add("Берлин");
        cityList.add("Лас-Вегас");

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,
                R.layout.support_simple_spinner_dropdown_item,cityList);
        text.setAdapter(adapter);
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