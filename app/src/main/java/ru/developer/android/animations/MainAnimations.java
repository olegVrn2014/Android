package ru.developer.android.animations;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import ru.developer.android.R;
import ru.developer.android.material_design.BottomSheetsActivity;
import ru.developer.android.material_design.FloatingActivity;
import ru.developer.android.material_design.MaterialDesignMain;
import ru.developer.android.material_design.SnackBarActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainAnimations extends AppCompatActivity {

    ListView listViewAnimations;
    ArrayAdapter<String> adapter;
    ArrayList<String> animations_list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_animations);

        ActionBar actionBar = this.getSupportActionBar();
        if (actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(true);
        }
        actionBar.setTitle("Animations");

        listViewAnimations = findViewById(R.id.listViewAnimations);

        setInitialData();

        adapter = new ArrayAdapter<>(this, R.layout.support_simple_spinner_dropdown_item, animations_list);
        listViewAnimations.setAdapter(adapter);


        listViewAnimations.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position) {
                    case 0:
                        Intent intent = new Intent(MainAnimations.this,FadeActivity.class); startActivity(intent);
                        break;
                    case 1:
                        Intent intent1 = new Intent(MainAnimations.this,MoveActivity.class); startActivity(intent1);
                        break;
                    case 2:
                        Intent intent2 = new Intent(MainAnimations.this,RotateActivity.class); startActivity(intent2);
                        break;

                }
            }
        });

    }

    private void setInitialData() {

        animations_list = new ArrayList<>();
        animations_list.add("Fade");
        animations_list.add("Move");
        animations_list.add("Rotate");
        animations_list.add("Zoom");
        animations_list.add("Slide");
        animations_list.add("Bounce");
        animations_list.add("Blink");
        animations_list.add("Interpolator");
        animations_list.add("Cell");
        animations_list.add("Tween");

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