package ru.developer.android.runWidgets;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import ru.developer.android.MainActivity;
import ru.developer.android.R;
import ru.developer.android.widgets.RadioBtnActivity;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class RunRadioBtn extends AppCompatActivity {

    private RadioGroup radioGroup;
    private RadioButton beer, water;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_run_radio_btn);

        ActionBar actionBar = this.getSupportActionBar();
        if (actionBar != null){
            actionBar.setDisplayHomeAsUpEnabled(true);
        }
        actionBar.setTitle("Run app");
        actionBar.setHomeButtonEnabled(true);
        actionBar.setDisplayHomeAsUpEnabled(true);

        radioGroup = findViewById(R.id.radioGroup);
        beer = findViewById(R.id.beer);
        water = findViewById(R.id.water);

        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId){
                    case R.id.beer:
                        Toast.makeText(RunRadioBtn.this, "Вы выбрали пиво",
                                Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.water:
                        Toast.makeText(RunRadioBtn.this, "Вы выбрали воду",
                                Toast.LENGTH_SHORT).show();
                        break;
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