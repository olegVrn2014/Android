package ru.developer.android.resource;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import ru.developer.android.R;

import android.os.Bundle;
import android.view.MenuItem;

import com.bumptech.glide.Glide;
import com.zolad.zoominimageview.ZoomInImageView;

public class Res7FormLesson extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_res7_form_lesson);

        ActionBar actionBar = this.getSupportActionBar();
        if (actionBar != null){
            actionBar.setDisplayHomeAsUpEnabled(true);
        }
        actionBar.setTitle("Форматирование строк");

        ZoomInImageView imageResourceLesson7_1 = findViewById(R.id.imageResourceLesson7_1);
        String url = "https://firebasestorage.googleapis.com/v0/b/android-app-5b365.appspot.com/o/Resource%2FLesson7Formatirovanie%2F1.png?alt=media&token=84851d05-0d65-4093-8b34-b2d2b5bbc6b6";
        Glide.with(getApplicationContext()).load(url).into(imageResourceLesson7_1);

        ZoomInImageView imageResourceLesson7_2 = findViewById(R.id.imageResourceLesson7_2);
        String url2 = "https://firebasestorage.googleapis.com/v0/b/android-app-5b365.appspot.com/o/Resource%2FLesson7Formatirovanie%2F2.png?alt=media&token=f8c1a7a4-d710-4011-a6fe-ce796840b2b8";
        Glide.with(getApplicationContext()).load(url2).into(imageResourceLesson7_2);

        ZoomInImageView imageResourceLesson7_3 = findViewById(R.id.imageResourceLesson7_3);
        String url3 = "https://firebasestorage.googleapis.com/v0/b/android-app-5b365.appspot.com/o/Resource%2FLesson7Formatirovanie%2F3.jpg?alt=media&token=2f2c9f5e-cadb-457c-b020-b9509dfd9195";
        Glide.with(getApplicationContext()).load(url3).into(imageResourceLesson7_3);

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