package ru.developer.android.layouts;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import ru.developer.android.R;

import android.os.Bundle;
import android.view.MenuItem;

import com.bumptech.glide.Glide;
import com.zolad.zoominimageview.ZoomInImageView;

public class FrameActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frame);

        ActionBar actionBar = this.getSupportActionBar();
        if (actionBar != null){
            actionBar.setDisplayHomeAsUpEnabled(true);
        }
        actionBar.setTitle("FrameLayout");

        ZoomInImageView imageFrameActivity1 = findViewById(R.id.imageFrameActivity1);
        String url = "https://firebasestorage.googleapis.com/v0/b/android-app-5b365.appspot.com/o/Layouts%2FFrame%2F1.png?alt=media&token=23588975-6175-492f-bb22-4b15cb7b6e5b";
        Glide.with(getApplicationContext()).load(url).into(imageFrameActivity1);

        ZoomInImageView imageFrameActivity2 = findViewById(R.id.imageFrameActivity2);
        String url2 = "https://firebasestorage.googleapis.com/v0/b/android-app-5b365.appspot.com/o/Layouts%2FFrame%2F2.jpg?alt=media&token=7ee5b9d7-5509-4d73-a603-44d4e22fcb3c";
        Glide.with(getApplicationContext()).load(url2).into(imageFrameActivity2);

        ZoomInImageView imageFrameActivity3 = findViewById(R.id.imageFrameActivity3);
        String url3 = "https://firebasestorage.googleapis.com/v0/b/android-app-5b365.appspot.com/o/Layouts%2FFrame%2F3.png?alt=media&token=8ed02783-d7b4-4a40-970d-f9874c394f1a";
        Glide.with(getApplicationContext()).load(url3).into(imageFrameActivity3);

        ZoomInImageView imageFrameActivity4 = findViewById(R.id.imageFrameActivity4);
        String url4 = "https://firebasestorage.googleapis.com/v0/b/android-app-5b365.appspot.com/o/Layouts%2FFrame%2F4.jpg?alt=media&token=b3634313-8c11-4a61-a8d8-3b0f24dff38d";
        Glide.with(getApplicationContext()).load(url4).into(imageFrameActivity4);

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