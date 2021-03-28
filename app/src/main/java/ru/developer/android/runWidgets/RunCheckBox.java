package ru.developer.android.runWidgets;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import ru.developer.android.MainActivity;
import ru.developer.android.R;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class RunCheckBox extends AppCompatActivity {

    private CheckBox tea;
    private CheckBox coffee;
    private CheckBox water;
    private Button send;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_run_check_box);

        ActionBar actionBar = this.getSupportActionBar();
        if (actionBar != null){
            actionBar.setDisplayHomeAsUpEnabled(true);
        }
        actionBar.setTitle("Run app");
        actionBar.setHomeButtonEnabled(true);
        actionBar.setDisplayHomeAsUpEnabled(true);

        tea = findViewById(R.id.tea);
        coffee = findViewById(R.id.coffee);
        water = findViewById(R.id.water);
        send = findViewById(R.id.send);

        send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                StringBuffer result = new StringBuffer();

                if (coffee.isChecked()){
                    result.append(coffee.getText());
                } if (water.isChecked()){
                    result.append(" " + water.getText());
                } if (tea.isChecked()) {
                    result.append(" " + tea.getText());
                }if (coffee.isChecked() || water.isChecked() || tea.isChecked()){
                    Toast.makeText(RunCheckBox.this, "Вы выбрали: "
                            + result, Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(RunCheckBox.this,
                            "Вы ничего не выбрали", Toast.LENGTH_SHORT).show();
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