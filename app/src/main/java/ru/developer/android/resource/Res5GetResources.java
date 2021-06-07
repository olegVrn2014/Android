package ru.developer.android.resource;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import ru.developer.android.R;

import android.os.Bundle;
import android.view.MenuItem;

import com.bumptech.glide.Glide;
import com.zolad.zoominimageview.ZoomInImageView;

public class Res5GetResources extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_res5_get_resources);

        ActionBar actionBar = this.getSupportActionBar();
        if (actionBar != null){
            actionBar.setDisplayHomeAsUpEnabled(true);
        }
        actionBar.setTitle("Метод GetResources");

        ZoomInImageView imageResourceGetRes1 = findViewById(R.id.imageResourceGetRes1);
        String url = "https://firebasestorage.googleapis.com/v0/b/android-app-5b365.appspot.com/o/Resource%2FLesson5GetResources%2F1.png?alt=media&token=d9068f8f-296a-40e7-a037-3c6e9d21b90c";
        Glide.with(getApplicationContext()).load(url).into(imageResourceGetRes1);

        ZoomInImageView imageResourceGetRes2 = findViewById(R.id.imageResourceGetRes2);
        String url2 = "https://firebasestorage.googleapis.com/v0/b/android-app-5b365.appspot.com/o/Resource%2FLesson5GetResources%2F2.png?alt=media&token=115e1163-d215-4ab0-87b2-50ec756f992e";
        Glide.with(getApplicationContext()).load(url2).into(imageResourceGetRes2);

        ZoomInImageView imageResourceGetRes3 = findViewById(R.id.imageResourceGetRes3);
        String url3 = "https://firebasestorage.googleapis.com/v0/b/android-app-5b365.appspot.com/o/Resource%2FLesson5GetResources%2F3.jpg?alt=media&token=850d80ee-476b-4248-89b1-3f29691de6fe";
        Glide.with(getApplicationContext()).load(url3).into(imageResourceGetRes3);

        ZoomInImageView imageResourceGetRes4 = findViewById(R.id.imageResourceGetRes4);
        String url4 = "https://firebasestorage.googleapis.com/v0/b/android-app-5b365.appspot.com/o/Resource%2FLesson5GetResources%2F4.jpg?alt=media&token=3adec308-02c4-488d-b6d7-ee7e249e61f0";
        Glide.with(getApplicationContext()).load(url4).into(imageResourceGetRes4);


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