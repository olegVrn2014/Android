package ru.developer.android.android;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import ru.developer.android.R;

import android.os.Bundle;
import android.view.MenuItem;

import com.bumptech.glide.Glide;
import com.zolad.zoominimageview.ZoomInImageView;

public class CreateNewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_new);

        ActionBar actionBar = this.getSupportActionBar();
        if (actionBar != null){
            actionBar.setDisplayHomeAsUpEnabled(true);
        }
        actionBar.setTitle("Создание Активности");

        ZoomInImageView imageCreateNewActivity1 = findViewById(R.id.imageCreateNewActivity1);
        String url = "https://firebasestorage.googleapis.com/v0/b/android-app-5b365.appspot.com/o/Android%2FCreateNewActivity%2F1.png?alt=media&token=b27968ab-0af7-4b46-9c7b-d61dfd791708";
        Glide.with(getApplicationContext()).load(url).into(imageCreateNewActivity1);

        ZoomInImageView imageCreateNewActivity2 = findViewById(R.id.imageCreateNewActivity2);
        String url2 = "https://firebasestorage.googleapis.com/v0/b/android-app-5b365.appspot.com/o/Android%2FCreateNewActivity%2F2.png?alt=media&token=82681a15-afb6-4c4d-82c4-cf34da71ebdd";
        Glide.with(getApplicationContext()).load(url2).into(imageCreateNewActivity2);

        ZoomInImageView imageCreateNewActivity3 = findViewById(R.id.imageCreateNewActivity3);
        String url3 = "https://firebasestorage.googleapis.com/v0/b/android-app-5b365.appspot.com/o/Android%2FCreateNewActivity%2F3.png?alt=media&token=0ed4b6d1-af7e-4ee1-9912-e3b4471f68b7";
        Glide.with(getApplicationContext()).load(url3).into(imageCreateNewActivity3);
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