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
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.MultiAutoCompleteTextView;
import android.widget.ProgressBar;
import android.widget.RatingBar;
import android.widget.Toast;
import android.widget.ToggleButton;

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
                        Intent intent1 = new Intent(WidgetsMain.this, EditTextActivity.class); startActivity(intent1);
                        break;
                    case 2:
                        Intent intent2 = new Intent(WidgetsMain.this, ButtonActivity.class); startActivity(intent2);
                        break;
                    case 3:
                        Intent intent3 = new Intent(WidgetsMain.this, ToggleActivity.class); startActivity(intent3);
                        break;
                    case 4:
                        Intent intent4 = new Intent(WidgetsMain.this, RadioBtnActivity.class); startActivity(intent4);
                        break;
                    case 5:
                        Intent intent5 = new Intent(WidgetsMain.this, ImageViewActivity.class); startActivity(intent5);
                        break;
                    case 6:
                        Intent intent6 = new Intent(WidgetsMain.this, ImageButtonActivity.class); startActivity(intent6);
                        break;
                    case 7:
                        Intent intent7 = new Intent(WidgetsMain.this, SwitchActivity.class); startActivity(intent7);
                        break;
                    case 8:
                        Intent intent8 = new Intent(WidgetsMain.this, CheckBoxActivity.class); startActivity(intent8);
                        break;
                    case 9:
                        Intent intent9 = new Intent(WidgetsMain.this, CustomCheckBoxActivity.class); startActivity(intent9);
                        break;
                    case 10:
                        Intent intent10 = new Intent(WidgetsMain.this, SpinnerActivity.class); startActivity(intent10);
                        break;
                    case 11:
                        Intent intent11 = new Intent(WidgetsMain.this, SeekBarActivity.class); startActivity(intent11);
                        break;
                    case 12:
                        Intent intent12 = new Intent(WidgetsMain.this, RatingBarActivity.class); startActivity(intent12);
                        break;
                    case 13:
                        Intent intent13= new Intent(WidgetsMain.this, ProgressBarActivity.class); startActivity(intent13);
                        break;
                    case 14:
                        Intent intent14= new Intent(WidgetsMain.this, AutoCompleteTextViewActivity.class); startActivity(intent14);
                        break;
                    case 15:
                        Intent intent15= new Intent(WidgetsMain.this, MultiCompleteTextViewActivity.class); startActivity(intent15);
                        break;
                    case 16:
                        Intent intent16= new Intent(WidgetsMain.this, ImageSwitcherActivity.class); startActivity(intent16);
                        break;
                    case 17:
                        Intent intent17= new Intent(WidgetsMain.this, TextSwitcherActivity.class); startActivity(intent17);
                        break;
                    case 18:
                        Intent intent18= new Intent(WidgetsMain.this, ScrollViewVerActivity.class); startActivity(intent18);
                        break;
                    case 19:
                        Intent intent19= new Intent(WidgetsMain.this, ScrollViewHorActivity.class); startActivity(intent19);
                        break;
                    case 20:
                        Intent intent20= new Intent(WidgetsMain.this, CheckedTextViewActivity.class); startActivity(intent20);
                        break;
                    case 21:
                        Intent intent21= new Intent(WidgetsMain.this, AlertDialogActivity.class); startActivity(intent21);
                        break;
                    case 22:
                        Intent intent22= new Intent(WidgetsMain.this, AdapterViewFlipperActivity.class); startActivity(intent22);
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
        widgetsList.add("ProgressBar");
        widgetsList.add("AutoCompleteTextView");
        widgetsList.add("MultiCompleteTextView");
        widgetsList.add("ImageSwitcher");
        widgetsList.add("TextSwitcher");
        widgetsList.add("ScrollView Vertical");
        widgetsList.add("ScrollView Horizontal");
        widgetsList.add("CheckedTextView");
        widgetsList.add("AlertDialog");
        widgetsList.add("AdapterViewFlipper");


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