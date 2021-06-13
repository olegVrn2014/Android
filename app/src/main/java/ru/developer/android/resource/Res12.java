package ru.developer.android.resource;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import ru.developer.android.R;

import android.os.Bundle;
import android.view.MenuItem;

import com.bumptech.glide.Glide;
import com.zolad.zoominimageview.ZoomInImageView;

public class Res12 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_res12);

        ActionBar actionBar = this.getSupportActionBar();
        if (actionBar != null){
            actionBar.setDisplayHomeAsUpEnabled(true);
        }
        actionBar.setTitle("Установка цвета");

        ZoomInImageView imageResourceLesson12_1 = findViewById(R.id.imageResourceLesson12_1);
        String url = "https://firebasestorage.googleapis.com/v0/b/android-app-5b365.appspot.com/o/Resource%2FLess12%2F1.png?alt=media&token=9ffee5a7-5546-43b6-ac67-51e84c2f9374";
        Glide.with(getApplicationContext()).load(url).into(imageResourceLesson12_1);

        ZoomInImageView imageResourceLesson12_2 = findViewById(R.id.imageResourceLesson12_2);
        String url2 = "https://firebasestorage.googleapis.com/v0/b/android-app-5b365.appspot.com/o/Resource%2FLess12%2F2.jpg?alt=media&token=ce84d8d3-eee3-46d0-a771-93908f0b0e77";
        Glide.with(getApplicationContext()).load(url2).into(imageResourceLesson12_2);

        ZoomInImageView imageResourceLesson12_3 = findViewById(R.id.imageResourceLesson12_3);
        String url3 = "https://firebasestorage.googleapis.com/v0/b/android-app-5b365.appspot.com/o/Resource%2FLess12%2F3.png?alt=media&token=b10a6fce-6935-4e65-b753-dbf4a6965a3c";
        Glide.with(getApplicationContext()).load(url3).into(imageResourceLesson12_3);

        ZoomInImageView imageResourceLesson12_4 = findViewById(R.id.imageResourceLesson12_4);
        String url4 = "https://firebasestorage.googleapis.com/v0/b/android-app-5b365.appspot.com/o/Resource%2FLess12%2F4.jpg?alt=media&token=17f53901-cb8b-4fb3-b883-17a537168bf0";
        Glide.with(getApplicationContext()).load(url4).into(imageResourceLesson12_4);
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