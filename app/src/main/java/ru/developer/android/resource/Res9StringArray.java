package ru.developer.android.resource;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import ru.developer.android.R;

import android.os.Bundle;
import android.view.MenuItem;

import com.bumptech.glide.Glide;
import com.zolad.zoominimageview.ZoomInImageView;

public class Res9StringArray extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_res9_string_array);

        ActionBar actionBar = this.getSupportActionBar();
        if (actionBar != null){
            actionBar.setDisplayHomeAsUpEnabled(true);
        }
        actionBar.setTitle("String array");

        ZoomInImageView imageResourceLesson9_1 = findViewById(R.id.imageResourceLesson9_1);
        String url = "https://firebasestorage.googleapis.com/v0/b/android-app-5b365.appspot.com/o/Resource%2FRes9StringArray%2F1.png?alt=media&token=e46989ce-9bd2-4216-bf7c-0eaba93770f8";
        Glide.with(getApplicationContext()).load(url).into(imageResourceLesson9_1);

        ZoomInImageView imageResourceLesson9_2 = findViewById(R.id.imageResourceLesson9_2);
        String url2 = "https://firebasestorage.googleapis.com/v0/b/android-app-5b365.appspot.com/o/Resource%2FRes9StringArray%2F2.png?alt=media&token=0a665a78-fe0f-4276-ae80-6861783d4934";
        Glide.with(getApplicationContext()).load(url2).into(imageResourceLesson9_2);

        ZoomInImageView imageResourceLesson9_3 = findViewById(R.id.imageResourceLesson9_3);
        String url3 = "https://firebasestorage.googleapis.com/v0/b/android-app-5b365.appspot.com/o/Resource%2FRes9StringArray%2F3.png?alt=media&token=c3f056f4-c504-497e-9fe2-b7f20598cf13";
        Glide.with(getApplicationContext()).load(url3).into(imageResourceLesson9_3);

        ZoomInImageView imageResourceLesson9_4 = findViewById(R.id.imageResourceLesson9_4);
        String url4 = "https://firebasestorage.googleapis.com/v0/b/android-app-5b365.appspot.com/o/Resource%2FRes9StringArray%2F4.jpg?alt=media&token=98e3c435-d34f-48a0-8b4e-82492f22c79b";
        Glide.with(getApplicationContext()).load(url4).into(imageResourceLesson9_4);

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