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

public class RunInterpolatorActivity extends AppCompatActivity {

    Button btnInterpolator;
    ImageView imageView;
    Animation animInterpolator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_run_interpolator);

        ActionBar actionBar = this.getSupportActionBar();
        if (actionBar != null){
            actionBar.setDisplayHomeAsUpEnabled(true);
        }
        actionBar.setTitle("Запуск Interpolator");
        actionBar.setHomeButtonEnabled(true);
        actionBar.setDisplayHomeAsUpEnabled(true);

        btnInterpolator = findViewById(R.id.btnInterpolator);
        imageView = findViewById(R.id.image_view);


        btnInterpolator.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                animInterpolator = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.interpolator);
                imageView.setVisibility(View.VISIBLE);
                imageView.startAnimation(animInterpolator);
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