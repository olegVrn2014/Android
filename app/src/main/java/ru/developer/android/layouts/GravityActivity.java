package ru.developer.android.layouts;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import ru.developer.android.R;

import android.os.Bundle;
import android.view.MenuItem;

import com.bumptech.glide.Glide;
import com.zolad.zoominimageview.ZoomInImageView;

public class GravityActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gravity);

        ActionBar actionBar = this.getSupportActionBar();
        if (actionBar != null){
            actionBar.setDisplayHomeAsUpEnabled(true);
        }
        actionBar.setTitle("Gravity");

        ZoomInImageView imageGravity1 = findViewById(R.id.imageGravity1);
        String url = "https://firebasestorage.googleapis.com/v0/b/android-app-5b365.appspot.com/o/Layouts%2FGravity%2F1.png?alt=media&token=2ac0656f-992e-49cf-97c9-da8921b5ef44";
        Glide.with(getApplicationContext()).load(url).into(imageGravity1);

        ZoomInImageView imageGravity2 = findViewById(R.id.imageGravity2);
        String url2 = "https://firebasestorage.googleapis.com/v0/b/android-app-5b365.appspot.com/o/Layouts%2FGravity%2F2.jpg?alt=media&token=345a3376-c3af-465a-8095-4cafbd80686d";
        Glide.with(getApplicationContext()).load(url2).into(imageGravity2);

        ZoomInImageView imageGravity3 = findViewById(R.id.imageGravity3);
        String url3 = "https://firebasestorage.googleapis.com/v0/b/android-app-5b365.appspot.com/o/Layouts%2FGravity%2F3.png?alt=media&token=5602b804-24b8-40d5-bdc6-f5469831a6d1";
        Glide.with(getApplicationContext()).load(url3).into(imageGravity3);

        ZoomInImageView imageGravity4 = findViewById(R.id.imageGravity4);
        String url4= "https://firebasestorage.googleapis.com/v0/b/android-app-5b365.appspot.com/o/Layouts%2FGravity%2F4.jpg?alt=media&token=b3fab019-f3ac-44e3-a65a-868e40f05497";
        Glide.with(getApplicationContext()).load(url4).into(imageGravity4);
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