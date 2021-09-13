package ru.developer.android.animations;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import ru.developer.android.R;
import ru.developer.android.animations.runAnimations.RunBlinkActivity;
import ru.developer.android.animations.runAnimations.RunInterpolatorActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import com.bumptech.glide.Glide;
import com.zolad.zoominimageview.ZoomInImageView;

public class InterpolatorActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_interpolator);

        ActionBar actionBar = this.getSupportActionBar();
        if (actionBar != null){
            actionBar.setDisplayHomeAsUpEnabled(true);
        }
        actionBar.setTitle("Interpolator Animations");

        ZoomInImageView imageXML = findViewById(R.id.imageXML);
        String url = "https://firebasestorage.googleapis.com/v0/b/android-app-5b365.appspot.com/o/Animations%2FInterpolator%2Fxml.png?alt=media&token=07b551a0-3c39-498b-91f8-a9946c79f349";
        Glide.with(getApplicationContext()).load(url).into(imageXML);

        ZoomInImageView imageActivity = findViewById(R.id.imageActivity);
        String url2 = "https://firebasestorage.googleapis.com/v0/b/android-app-5b365.appspot.com/o/Animations%2FInterpolator%2Factivity.png?alt=media&token=5f060a82-d88c-4981-8400-38ba52a851c3";
        Glide.with(getApplicationContext()).load(url2).into(imageActivity);

        ZoomInImageView imageAnim = findViewById(R.id.imageAnim);
        String url3 = "https://firebasestorage.googleapis.com/v0/b/android-app-5b365.appspot.com/o/Animations%2FInterpolator%2Fanim.png?alt=media&token=0af5e26d-90d5-49fc-974a-bbe61a81a4d4";
        Glide.with(getApplicationContext()).load(url3).into(imageAnim);

        ZoomInImageView imageInterpolator = findViewById(R.id.imageInterpolator);
        String url4 = "https://firebasestorage.googleapis.com/v0/b/android-app-5b365.appspot.com/o/Animations%2FInterpolator%2Finter.png?alt=media&token=9ddfd532-11fb-4bbc-9e2a-d1094148bc5f";
        Glide.with(getApplicationContext()).load(url4).into(imageInterpolator);

    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.run_menu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();
        if (id == android.R.id.home){
            finish();
            return true;
        }else{
            Intent intent = new Intent(InterpolatorActivity.this, RunInterpolatorActivity.class);startActivity(intent);
        }
        return super.onOptionsItemSelected(item);
    }
}
