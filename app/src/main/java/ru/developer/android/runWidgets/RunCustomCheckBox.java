package ru.developer.android.runWidgets;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import ru.developer.android.MainActivity;
import ru.developer.android.R;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.Toast;

public class RunCustomCheckBox extends AppCompatActivity {

    private CheckBox checkBox1;
    private CheckBox checkBox2;
    private Button show;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_run_custom_check_box);

        ActionBar actionBar = this.getSupportActionBar();
        if (actionBar != null){
            actionBar.setDisplayHomeAsUpEnabled(true);
        }
        actionBar.setTitle("Run app");
        actionBar.setHomeButtonEnabled(true);
        actionBar.setDisplayHomeAsUpEnabled(true);

        checkBox1 = findViewById(R.id.checkbox1);
        checkBox2 = findViewById(R.id.checkbox2);
        show = findViewById(R.id.show);

        checkBox1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @SuppressLint("UseCompatLoadingForDrawables")
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (checkBox1.isChecked()) {
                    checkBox1.setButtonDrawable(getResources().getDrawable(R.drawable.ic_checkbox_checked));
                    checkBox1.setTextColor(Color.GREEN);
                } else {
                    checkBox1.setButtonDrawable(getResources().getDrawable(R.drawable.ic_checkbox_no_checked));
                    checkBox1.setTextColor(Color.RED);
                }
            }
        });

        checkBox2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @SuppressLint("UseCompatLoadingForDrawables")
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (checkBox2.isChecked()) {
                    checkBox2.setButtonDrawable(getResources().getDrawable(R.drawable.ic_checkbox_checked));
                    checkBox2.setTextColor(Color.GREEN);
                } else {
                    checkBox2.setButtonDrawable(getResources().getDrawable(R.drawable.ic_checkbox_no_checked));
                    checkBox2.setTextColor(Color.RED);
                }
            }
        });

        show.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                StringBuilder stringBuilder = new StringBuilder();

                if (checkBox1.isChecked()){
                    String sb1 = checkBox1.getText().toString();
                    stringBuilder.append(sb1);
                }
                if (checkBox2.isChecked()){
                    String sb2 = checkBox2.getText().toString();
                    stringBuilder.append("\n" + sb2);
                }
                if (stringBuilder!=null && !stringBuilder.toString().equals("")){
                    Toast.makeText(RunCustomCheckBox.this, stringBuilder, Toast.LENGTH_SHORT).show();
                }
                else {
                    Toast.makeText(RunCustomCheckBox.this, "Ничего не выбрано", Toast.LENGTH_SHORT).show();
                }
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