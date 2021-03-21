package ru.developer.android.widgets;

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
import android.widget.Toast;

import java.util.ArrayList;

public class WidgetsMain extends AppCompatActivity{

    ListView listViewWidgets;
    ArrayAdapter<String> adapter;
    ArrayList<String> widgetsList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.widgets_main);
        ActionBar actionBar = this.getSupportActionBar();
        if (actionBar != null){
            actionBar.setDisplayHomeAsUpEnabled(true);
        }
        actionBar.setTitle("Widgets");


        listViewWidgets = findViewById(R.id.listViewWidgets);

        setInitialData();

        adapter = new ArrayAdapter<>(this,R.layout.support_simple_spinner_dropdown_item,widgetsList);
        listViewWidgets.setAdapter(adapter);


        listViewWidgets.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position){
                    case 0:
                        Intent intent = new Intent(WidgetsMain.this, TextViewActivity.class); startActivity(intent);
                        break;
                    case 1:
                        Toast.makeText(WidgetsMain.this, "Позиция "+ position, Toast.LENGTH_SHORT).show();
                        break;
                    case 2:
                        Toast.makeText(WidgetsMain.this, "Позиция "+ position, Toast.LENGTH_SHORT).show();
                        break;
                }
            }
        });





    }
    private void setInitialData() {

        widgetsList = new ArrayList<>();
        widgetsList.add("TextView");
        widgetsList.add("EditText");
        widgetsList.add("Button");
        widgetsList.add("ToggleButton");
        widgetsList.add("RadioButton");
        widgetsList.add("ImageView");
        widgetsList.add("ImageButton");
        widgetsList.add("Switch");
        widgetsList.add("Checkbox");
        widgetsList.add("CustomCheckbox");
        widgetsList.add("Spinner");
        widgetsList.add("SeekBar");
        widgetsList.add("RatingBar");
        widgetsList.add("AutoCompleteTextView");
        widgetsList.add("MultiCompleteTextView");
        widgetsList.add("ImageSwitcher");
        widgetsList.add("TextSwitcher");
        widgetsList.add("ScrollView");
        widgetsList.add("AlertDialog");


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