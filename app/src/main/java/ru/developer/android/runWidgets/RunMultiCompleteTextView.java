package ru.developer.android.runWidgets;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import ru.developer.android.R;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.MultiAutoCompleteTextView;

import java.util.ArrayList;
import java.util.List;

public class RunMultiCompleteTextView extends AppCompatActivity {

    MultiAutoCompleteTextView multi_text;
    List<String> fruits_List;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_run_multi_complete_text_view);

        ActionBar actionBar = this.getSupportActionBar();
        if (actionBar != null){
            actionBar.setDisplayHomeAsUpEnabled(true);
        }
        actionBar.setTitle("Run app");
        actionBar.setHomeButtonEnabled(true);
        actionBar.setDisplayHomeAsUpEnabled(true);

        multi_text = findViewById(R.id.multi_text);
        fruits_List = new ArrayList<>();
        fruits_List.add("Бананы");
        fruits_List.add("Яблоки");
        fruits_List.add("Абрикосы");
        fruits_List.add("Ежевика");
        fruits_List.add("Черника");
        fruits_List.add("Вишня");
        fruits_List.add("Манго");
        fruits_List.add("Папайя");

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, R.layout.support_simple_spinner_dropdown_item, fruits_List);
        multi_text.setAdapter(adapter);
        multi_text.setTokenizer(new MultiAutoCompleteTextView.CommaTokenizer());
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