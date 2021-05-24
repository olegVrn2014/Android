package ru.developer.android.layouts;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import ru.developer.android.R;
import ru.developer.android.android.AndroidManifestActivity;
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
import android.widget.Toast;

import java.util.ArrayList;

public class MainLayouts extends AppCompatActivity {

    ListView listViewLayouts;
    ArrayAdapter<String> adapter;
    ArrayList<String> layoutsList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_layouts);

        ActionBar actionBar = this.getSupportActionBar();
        if (actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(true);
        }
        actionBar.setTitle("Layouts");


        listViewLayouts = findViewById(R.id.listViewLayouts);

        setInitialData();

        adapter = new ArrayAdapter<>(this, R.layout.support_simple_spinner_dropdown_item, layoutsList);
        listViewLayouts.setAdapter(adapter);

        listViewLayouts.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position) {
                    case 0:
                        Intent intent = new Intent(MainLayouts.this, ConstraintActivity.class);
                        startActivity(intent);
                        break;
                    case 1:
                        Intent intent1 = new Intent(MainLayouts.this, LinearActivity.class);
                        startActivity(intent1);
                        break;
                    case 2:
                        Intent intent2 = new Intent(MainLayouts.this, RelativeActivity.class);
                        startActivity(intent2);
                        break;
                    case 3:
                        Toast.makeText(MainLayouts.this, "TableActivity", Toast.LENGTH_SHORT).show();
//                        Intent intent3 = new Intent(MainLayouts.this, TableActivity.class);
//                        startActivity(intent3);
                        break;
                    case 4:
                        Toast.makeText(MainLayouts.this, "FrameActivity", Toast.LENGTH_SHORT).show();
//                        Intent intent4 = new Intent(MainLayouts.this, FrameActivity.class);
//                        startActivity(intent4);
                        break;
                    case 5:
                        Toast.makeText(MainLayouts.this, "GridActivity", Toast.LENGTH_SHORT).show();
//                        Intent intent5 = new Intent(MainLayouts.this, GridActivity.class);
//                        startActivity(intent5);
                        break;
                    case 6:
                        Toast.makeText(MainLayouts.this, "ScrollViewActivity", Toast.LENGTH_SHORT).show();
//                        Intent intent6 = new Intent(MainLayouts.this, ScrollViewActivity.class);
//                        startActivity(intent6);
                        break;
                    case 7:
                        Toast.makeText(MainLayouts.this, "GravityActivity", Toast.LENGTH_SHORT).show();
//                        Intent intent7 = new Intent(MainLayouts.this, GravityActivity.class);
//                        startActivity(intent7);
                        break;

                }
            }
        });
    }

    private void setInitialData() {

        layoutsList = new ArrayList<>();
        layoutsList.add("ConstraintLayout");
        layoutsList.add("LinearLayout");
        layoutsList.add("RelativeLayout");
        layoutsList.add("TableLayout");
        layoutsList.add("FrameLayout");
        layoutsList.add("GridLayout");
        layoutsList.add("ScrollView");
        layoutsList.add("Gravity");

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
