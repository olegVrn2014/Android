package ru.developer.android.animations.runAnimations;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import ru.developer.android.R;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.Animation;
import android.widget.Button;
import android.widget.ImageView;
import android.view.animation.AnimationUtils;

public class RunMoveActivity extends AppCompatActivity {

    Button btnUp, btnDown, btnRight,btnLeft;
    ImageView imageView;
    Animation animMoveUp, animMoveDown, animMoveRight, animMoveLeft;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_run_move);

        ActionBar actionBar = this.getSupportActionBar();
        if (actionBar != null){
            actionBar.setDisplayHomeAsUpEnabled(true);
        }
        actionBar.setTitle("Запуск Move");
        actionBar.setHomeButtonEnabled(true);
        actionBar.setDisplayHomeAsUpEnabled(true);

        btnUp = findViewById(R.id.btnUp);
        btnDown = findViewById(R.id.btnDown);
        btnRight = findViewById(R.id.btnRight);
        btnLeft = findViewById(R.id.btnLeft);
        imageView = findViewById(R.id.image_view);


        btnUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                animMoveUp = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.move_up);
                imageView.setVisibility(View.VISIBLE);
                imageView.startAnimation(animMoveUp);
            }
        });

        btnDown.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                animMoveDown = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.move_down);
                imageView.setVisibility(View.VISIBLE);
                imageView.startAnimation(animMoveDown);
            }
        });

        btnRight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                animMoveRight = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.move_right);
                imageView.setVisibility(View.VISIBLE);
                imageView.startAnimation(animMoveRight);
            }
        });

        btnLeft.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                animMoveLeft = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.move_left);
                imageView.setVisibility(View.VISIBLE);
                imageView.startAnimation(animMoveLeft);
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