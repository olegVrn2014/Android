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

public class RunFadeActivity extends AppCompatActivity {

    Button fadeIn, fadeOut;
    ImageView imageView;
    Animation animFadeIn, animFadeOut;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_run_fade);

        ActionBar actionBar = this.getSupportActionBar();
        if (actionBar != null){
            actionBar.setDisplayHomeAsUpEnabled(true);
        }
        actionBar.setTitle("Запуск Fade");
        actionBar.setHomeButtonEnabled(true);
        actionBar.setDisplayHomeAsUpEnabled(true);

        fadeIn = findViewById(R.id.fade_in);
        fadeOut = findViewById(R.id.fade_out);
        imageView = findViewById(R.id.image_view);
        imageView.setVisibility(View.INVISIBLE);

        fadeIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                animFadeIn = AnimationUtils.loadAnimation(RunFadeActivity.this, R.anim.fade_in);
                imageView.setVisibility(View.VISIBLE);
                imageView.startAnimation(animFadeIn);
            }
        });

        fadeOut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                animFadeOut = AnimationUtils.loadAnimation(RunFadeActivity.this, R.anim.fade_out);
                imageView.setVisibility(View.INVISIBLE);
                imageView.startAnimation(animFadeOut);
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