package ru.developer.android.resource;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import ru.developer.android.R;

import android.os.Bundle;
import android.view.MenuItem;

import com.bumptech.glide.Glide;
import com.zolad.zoominimageview.ZoomInImageView;

public class Res10Dimension extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_res10_dimension);

        ActionBar actionBar = this.getSupportActionBar();
        if (actionBar != null){
            actionBar.setDisplayHomeAsUpEnabled(true);
        }
        actionBar.setTitle("Ресурсы dimension");

        ZoomInImageView imageResourceLesson10_1 = findViewById(R.id.imageResourceLesson10_1);
        String url = "https://firebasestorage.googleapis.com/v0/b/android-app-5b365.appspot.com/o/Resource%2FLessons10Dimension%2F1.png?alt=media&token=6a3e5a82-b240-4d2e-9776-8d9711b99266";
        Glide.with(getApplicationContext()).load(url).into(imageResourceLesson10_1);

        ZoomInImageView imageResourceLesson10_2 = findViewById(R.id.imageResourceLesson10_2);
        String url2 = "https://firebasestorage.googleapis.com/v0/b/android-app-5b365.appspot.com/o/Resource%2FLessons10Dimension%2F2.png?alt=media&token=122dd853-c959-4841-95bc-6c1e746b3363";
        Glide.with(getApplicationContext()).load(url2).into(imageResourceLesson10_2);

        ZoomInImageView imageResourceLesson10_3 = findViewById(R.id.imageResourceLesson10_3);
        String url3 = "https://firebasestorage.googleapis.com/v0/b/android-app-5b365.appspot.com/o/Resource%2FLessons10Dimension%2F3.png?alt=media&token=ee73a562-289a-4c9a-91cf-3de242b467f1";
        Glide.with(getApplicationContext()).load(url3).into(imageResourceLesson10_3);

        ZoomInImageView imageResourceLesson10_4 = findViewById(R.id.imageResourceLesson10_4);
        String url4 = "https://firebasestorage.googleapis.com/v0/b/android-app-5b365.appspot.com/o/Resource%2FLessons10Dimension%2F4.png?alt=media&token=bfd297fc-82f3-4f29-be93-8d1f122b79d7";
        Glide.with(getApplicationContext()).load(url4).into(imageResourceLesson10_4);

        ZoomInImageView imageResourceLesson10_5 = findViewById(R.id.imageResourceLesson10_5);
        String url5 = "https://firebasestorage.googleapis.com/v0/b/android-app-5b365.appspot.com/o/Resource%2FLessons10Dimension%2F5.jpg?alt=media&token=36db0117-9954-4fe8-a973-88d277c56b5f";
        Glide.with(getApplicationContext()).load(url5).into(imageResourceLesson10_5);

        ZoomInImageView imageResourceLesson10_6 = findViewById(R.id.imageResourceLesson10_6);
        String url6 = "https://firebasestorage.googleapis.com/v0/b/android-app-5b365.appspot.com/o/Resource%2FLessons10Dimension%2F6.png?alt=media&token=2b417c06-2188-44bd-bc8e-e25288068548";
        Glide.with(getApplicationContext()).load(url6).into(imageResourceLesson10_6);

        ZoomInImageView imageResourceLesson10_7 = findViewById(R.id.imageResourceLesson10_7);
        String url7 = "https://firebasestorage.googleapis.com/v0/b/android-app-5b365.appspot.com/o/Resource%2FLessons10Dimension%2F7.png?alt=media&token=0f713b8f-ef49-460f-a6e1-81d8e7152a9e";
        Glide.with(getApplicationContext()).load(url7).into(imageResourceLesson10_7);
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