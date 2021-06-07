package ru.developer.android.resource;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import ru.developer.android.R;

import android.os.Bundle;
import android.view.MenuItem;

import com.bumptech.glide.Glide;
import com.zolad.zoominimageview.ZoomInImageView;

public class Res4AccessLessons extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_res4_access_lessons);

        ActionBar actionBar = this.getSupportActionBar();
        if (actionBar != null){
            actionBar.setDisplayHomeAsUpEnabled(true);
        }
        actionBar.setTitle("Доступ в файле xml");

        ZoomInImageView imageResourceAccess1 = findViewById(R.id.imageResourceAccess1);
        String url = "https://firebasestorage.googleapis.com/v0/b/android-app-5b365.appspot.com/o/Resource%2FLesson4Access%2F1.png?alt=media&token=07c6df13-c794-404c-b2f0-2c5b16186120";
        Glide.with(getApplicationContext()).load(url).into(imageResourceAccess1);

        ZoomInImageView imageResourceAccess2 = findViewById(R.id.imageResourceAccess2);
        String url2 = "https://firebasestorage.googleapis.com/v0/b/android-app-5b365.appspot.com/o/Resource%2FLesson4Access%2F2.png?alt=media&token=16e5f958-10b5-45c2-94d5-efcabbaabea0";
        Glide.with(getApplicationContext()).load(url2).into(imageResourceAccess2);

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