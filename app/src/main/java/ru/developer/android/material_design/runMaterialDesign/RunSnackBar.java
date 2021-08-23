package ru.developer.android.material_design.runMaterialDesign;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import ru.developer.android.MainActivity;
import ru.developer.android.R;

import android.graphics.Color;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;

public class RunSnackBar extends AppCompatActivity {

    Button showSnackBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_run_snack_bar);

        ActionBar actionBar = this.getSupportActionBar();
        if (actionBar != null){
            actionBar.setDisplayHomeAsUpEnabled(true);
        }
        actionBar.setTitle("Запуск SnackBar");
        actionBar.setHomeButtonEnabled(true);
        actionBar.setDisplayHomeAsUpEnabled(true);

        showSnackBar = findViewById(R.id.snackBar);
        showSnackBar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Snackbar snackbar = Snackbar.make(v, "ShackBar", Snackbar.LENGTH_SHORT);
                snackbar.setAction("Отмена", new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(RunSnackBar.this, "Отмена", Toast.LENGTH_SHORT).show();
                    }
                });
                snackbar.setTextColor(Color.WHITE);
                snackbar.setBackgroundTint(Color.BLACK);
                snackbar.setActionTextColor(Color.GREEN);
                snackbar.show();
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