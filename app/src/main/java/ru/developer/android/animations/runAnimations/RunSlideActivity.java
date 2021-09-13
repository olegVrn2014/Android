package ru.developer.android.animations.runAnimations;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import ru.developer.android.R;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

public class RunSlideActivity extends AppCompatActivity {

    Button btnSlideUp, btnSlideDown, btnSlideRight, btnSlideLeft;
    ImageView imageView;
    Animation animSlideUp, animSlideDown, animSlideRight, animSlideLeft;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_run_slide);

        ActionBar actionBar = this.getSupportActionBar();
        if (actionBar != null){
            actionBar.setDisplayHomeAsUpEnabled(true);
        }
        actionBar.setTitle("Запуск Slide");
        actionBar.setHomeButtonEnabled(true);
        actionBar.setDisplayHomeAsUpEnabled(true);

        btnSlideUp = findViewById(R.id.btnSlideUp);
        btnSlideDown = findViewById(R.id.btnSlideDown);
        btnSlideRight = findViewById(R.id.btnSlideRight);
        btnSlideLeft = findViewById(R.id.btnSlideLeft);
        imageView = findViewById(R.id.image_view);


        btnSlideUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                animSlideUp = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.slide_up);
                imageView.setVisibility(View.VISIBLE);
                imageView.startAnimation(animSlideUp);
            }
        });

        btnSlideDown.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                animSlideDown = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.slide_down);
                imageView.setVisibility(View.VISIBLE);
                imageView.startAnimation(animSlideDown);
            }
        });

        btnSlideRight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                animSlideRight = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.slide_right);
                imageView.setVisibility(View.VISIBLE);
                imageView.startAnimation(animSlideRight);
            }
        });

        btnSlideLeft.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                animSlideLeft = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.slide_left);
                imageView.setVisibility(View.VISIBLE);
                imageView.startAnimation(animSlideLeft);
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