package ru.developer.android.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import ru.developer.android.R;

public class MainFragments extends AppCompatActivity {

    ListView listViewFragments;
    ArrayAdapter<String> adapter;
    ArrayList<String> fragmentsList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_fragments);

        ActionBar actionBar = this.getSupportActionBar();
        if (actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(true);
        }
        actionBar.setTitle("Фрагменты");


        listViewFragments = findViewById(R.id.listViewFragments);

        setInitialData();

        adapter = new ArrayAdapter<>(this, R.layout.support_simple_spinner_dropdown_item, fragmentsList);
        listViewFragments.setAdapter(adapter);

        listViewFragments.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position) {
                    case 0:
                        Intent intent = new Intent(MainFragments.this, ListFragmentActivity.class);
                        startActivity(intent);
                        break;
                    case 1:
                        Intent intent1 = new Intent(MainFragments.this, ChangeFragmentActivity.class);
                        startActivity(intent1);
                        break;
                    case 2:
                        Intent intent2 = new Intent(MainFragments.this, DialogFragmentActivity.class);
                        startActivity(intent2);
                        break;
                    case 3:
                        Intent intent3 = new Intent(MainFragments.this, PassDataBeetweenActivity.class);
                        startActivity(intent3);
                        break;
                    case 4:
                        Intent intent4 = new Intent(MainFragments.this, DisplayListOnDialogActivity.class);
                        startActivity(intent4);
                        break;
                    case 5:
                        Intent intent5 = new Intent(MainFragments.this, DisplayCheckboxOnDisplay.class);
                        startActivity(intent5);
                        break;
                    case 6:
                        Intent intent6 = new Intent(MainFragments.this, DisplayRadioButton.class);
                        startActivity(intent6);
                        break;
                    case 7:
                        Intent intent7 = new Intent(MainFragments.this, TransactionBetweenActivity.class);
                        startActivity(intent7);
                        break;
                }
            }
        });
    }

    private void setInitialData() {

        fragmentsList = new ArrayList<>();
        fragmentsList.add("List Fragment");
        fragmentsList.add("Change Fragment");
        fragmentsList.add("Dialog Fragment");
        fragmentsList.add("Pass Data Between");
        fragmentsList.add("Display List on Dialog");
        fragmentsList.add("Display CheckBox");
        fragmentsList.add("Display RadioButton");
        fragmentsList.add("Transaction between");


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
