package ru.developer.android.resource;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import ru.developer.android.R;

import android.os.Bundle;
import android.view.MenuItem;

import com.bumptech.glide.Glide;
import com.zolad.zoominimageview.ZoomInImageView;

public class Res8Plurals extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_res8_plurals);

        ActionBar actionBar = this.getSupportActionBar();
        if (actionBar != null){
            actionBar.setDisplayHomeAsUpEnabled(true);
        }
        actionBar.setTitle("Ресурсы Plurals");

        ZoomInImageView imageResourceLesson8_1 = findViewById(R.id.imageResourceLesson8_1);
        String url = "https://firebasestorage.googleapis.com/v0/b/android-app-5b365.appspot.com/o/Resource%2FLesson8Plurals%2F1.png?alt=media&token=52d0df14-8c22-4faf-a735-2f722b4e888d";
        Glide.with(getApplicationContext()).load(url).into(imageResourceLesson8_1);

        ZoomInImageView imageResourceLesson8_2 = findViewById(R.id.imageResourceLesson8_2);
        String url2 = "https://firebasestorage.googleapis.com/v0/b/android-app-5b365.appspot.com/o/Resource%2FLesson8Plurals%2F2.png?alt=media&token=2feead2c-f468-4ed4-847e-1b1c8c245e8b";
        Glide.with(getApplicationContext()).load(url2).into(imageResourceLesson8_2);

        ZoomInImageView imageResourceLesson8_3 = findViewById(R.id.imageResourceLesson8_3);
        String url3 = "https://firebasestorage.googleapis.com/v0/b/android-app-5b365.appspot.com/o/Resource%2FLesson8Plurals%2F3.png?alt=media&token=f3da56db-8071-485d-98d0-a3cfd3bdc5f5";
        Glide.with(getApplicationContext()).load(url3).into(imageResourceLesson8_3);

        ZoomInImageView imageResourceLesson8_4 = findViewById(R.id.imageResourceLesson8_4);
        String url4= "https://firebasestorage.googleapis.com/v0/b/android-app-5b365.appspot.com/o/Resource%2FLesson8Plurals%2F4.jpg?alt=media&token=3ba5f888-160f-456d-b97b-b14889e6e4de";
        Glide.with(getApplicationContext()).load(url4).into(imageResourceLesson8_4);
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