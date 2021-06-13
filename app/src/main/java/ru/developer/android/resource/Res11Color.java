package ru.developer.android.resource;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import ru.developer.android.R;

import android.os.Bundle;
import android.view.MenuItem;

import com.bumptech.glide.Glide;
import com.zolad.zoominimageview.ZoomInImageView;

public class Res11Color extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_res11_color);

        ActionBar actionBar = this.getSupportActionBar();
        if (actionBar != null){
            actionBar.setDisplayHomeAsUpEnabled(true);
        }
        actionBar.setTitle("Ресурсы Color");

        ZoomInImageView imageResourceLesson11_1 = findViewById(R.id.imageResourceLesson11_1);
        String url = "https://firebasestorage.googleapis.com/v0/b/android-app-5b365.appspot.com/o/Resource%2FLess11%2F1.png?alt=media&token=df5d551f-168d-44f4-bc16-7c703a8dd6fc";
        Glide.with(getApplicationContext()).load(url).into(imageResourceLesson11_1);

        ZoomInImageView imageResourceLesson11_2 = findViewById(R.id.imageResourceLesson11_2);
        String url2 = "https://firebasestorage.googleapis.com/v0/b/android-app-5b365.appspot.com/o/Resource%2FLess11%2F2.png?alt=media&token=4982a11c-5b71-41ad-945e-496040a69ab7";
        Glide.with(getApplicationContext()).load(url2).into(imageResourceLesson11_2);

        ZoomInImageView imageResourceLesson11_3 = findViewById(R.id.imageResourceLesson11_3);
        String url3 = "https://firebasestorage.googleapis.com/v0/b/android-app-5b365.appspot.com/o/Resource%2FLess11%2F3.png?alt=media&token=3d37c424-d05d-4ea6-b3aa-8805c3ea5532";
        Glide.with(getApplicationContext()).load(url3).into(imageResourceLesson11_3);
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