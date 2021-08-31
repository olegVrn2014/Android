package ru.developer.android.material_design;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NavUtils;
import ru.developer.android.R;
import ru.developer.android.widgets.AdapterViewFlipperActivity;
import ru.developer.android.widgets.AlertDialogActivity;
import ru.developer.android.widgets.AutoCompleteTextViewActivity;
import ru.developer.android.widgets.ButtonActivity;
import ru.developer.android.widgets.CheckBoxActivity;
import ru.developer.android.widgets.CheckedTextViewActivity;
import ru.developer.android.widgets.CustomCheckBoxActivity;
import ru.developer.android.widgets.EditTextActivity;
import ru.developer.android.widgets.ImageButtonActivity;
import ru.developer.android.widgets.ImageSwitcherActivity;
import ru.developer.android.widgets.ImageViewActivity;
import ru.developer.android.widgets.MultiCompleteTextViewActivity;
import ru.developer.android.widgets.ProgressBarActivity;
import ru.developer.android.widgets.RadioBtnActivity;
import ru.developer.android.widgets.RatingBarActivity;
import ru.developer.android.widgets.ScrollViewHorActivity;
import ru.developer.android.widgets.ScrollViewVerActivity;
import ru.developer.android.widgets.SeekBarActivity;
import ru.developer.android.widgets.SpinnerActivity;
import ru.developer.android.widgets.SwitchActivity;
import ru.developer.android.widgets.TextSwitcherActivity;
import ru.developer.android.widgets.TextViewActivity;
import ru.developer.android.widgets.ToggleActivity;
import ru.developer.android.widgets.WidgetsMain;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MaterialDesignMain extends AppCompatActivity {

    ListView listViewMaterialDesign;
    ArrayAdapter<String> adapter;
    ArrayList<String> material_design_list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_material_design_main);

        ActionBar actionBar = this.getSupportActionBar();
        if (actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(true);
        }
        actionBar.setTitle("Material Design");

        listViewMaterialDesign = findViewById(R.id.listViewWidgets);

        setInitialData();

        adapter = new ArrayAdapter<>(this, R.layout.support_simple_spinner_dropdown_item, material_design_list);
        listViewMaterialDesign.setAdapter(adapter);


        listViewMaterialDesign.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position) {
                    case 0:
                           Intent intent = new Intent(MaterialDesignMain.this, FloatingActivity.class); startActivity(intent);
                        break;
                    case 1:
                        Intent intent1 = new Intent(MaterialDesignMain.this, SnackBarActivity.class); startActivity(intent1);
                        break;
                    case 2:
                        Intent intent2 = new Intent(MaterialDesignMain.this, BottomSheetsActivity.class); startActivity(intent2);
                        break;
                }
            }
        });
    }

    private void setInitialData() {

        material_design_list = new ArrayList<>();
        material_design_list.add("Floating Action Button");
        material_design_list.add("SnackBar");
        material_design_list.add("Bottom Sheets");
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