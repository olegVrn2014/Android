package ru.developer.android.toast.runToast;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import ru.developer.android.MainActivity;
import ru.developer.android.R;

import android.os.Bundle;
import android.view.Gravity;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class RunPositionToast extends AppCompatActivity {

    Button topToast, bottomToast, leftToast, rightToast, centerToast;
    Toast toast;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_run_position_toast);

        ActionBar actionBar = this.getSupportActionBar();
        if (actionBar != null){
            actionBar.setDisplayHomeAsUpEnabled(true);
        }
        actionBar.setTitle("Run app");
        actionBar.setHomeButtonEnabled(true);
        actionBar.setDisplayHomeAsUpEnabled(true);

        topToast = findViewById(R.id.topToast);
        bottomToast = findViewById(R.id.bottomToast);
        leftToast = findViewById(R.id.leftToast);
        rightToast = findViewById(R.id.rightToast);
        centerToast = findViewById(R.id.centerToast);

        topToast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                toast = Toast.makeText(RunPositionToast.this, "Top", Toast.LENGTH_SHORT);
                toast.setGravity(Gravity.TOP,0,0);
                toast.show();
            }
        });

        bottomToast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                toast = Toast.makeText(RunPositionToast.this, "Bottom", Toast.LENGTH_SHORT);
                toast.setGravity(Gravity.BOTTOM,0,0);
                toast.show();
            }
        });

        leftToast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                toast = Toast.makeText(RunPositionToast.this, "Left", Toast.LENGTH_SHORT);
                toast.setGravity(Gravity.LEFT,0,0);
                toast.show();
            }
        });

        rightToast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                toast = Toast.makeText(RunPositionToast.this, "Right", Toast.LENGTH_SHORT);
                toast.setGravity(Gravity.RIGHT,0,0);
                toast.show();
            }
        });

        centerToast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                toast = Toast.makeText(RunPositionToast.this, "Center", Toast.LENGTH_SHORT);
                toast.setGravity(Gravity.CENTER,0,0);
                toast.show();
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