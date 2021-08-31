package ru.developer.android.animations.runAnimations;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import ru.developer.android.R;
import android.view.animation.AnimationUtils;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.Animation;
import android.widget.Button;
import android.widget.ImageView;

public class RunRotateActivity extends AppCompatActivity {

    Button btnRotateCenter, btnRotateCorner;
    ImageView imageView;
    Animation animRotateCorner,animRotateCenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_run_rotate);

        ActionBar actionBar = this.getSupportActionBar();
        if (actionBar != null){
            actionBar.setDisplayHomeAsUpEnabled(true);
        }
        actionBar.setTitle("Запуск Rotate");
        actionBar.setHomeButtonEnabled(true);
        actionBar.setDisplayHomeAsUpEnabled(true);

        btnRotateCenter = findViewById(R.id.btnRotateCenter);
        btnRotateCorner = findViewById(R.id.btnRotateCorner);
        imageView = findViewById(R.id.image_view);


        btnRotateCenter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                animRotateCenter = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.rotate_center);
                imageView.setVisibility(View.VISIBLE);
                imageView.startAnimation(animRotateCenter);
            }
        });

        btnRotateCorner.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                animRotateCorner = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.rotate_corner);
                imageView.setVisibility(View.VISIBLE);
                imageView.startAnimation(animRotateCorner);
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