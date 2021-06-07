package ru.developer.android.resource;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import ru.developer.android.R;

import android.os.Bundle;
import android.view.MenuItem;

import com.bumptech.glide.Glide;
import com.zolad.zoominimageview.ZoomInImageView;

public class Res2TypeLessons extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_res2_type_lessons);

        ActionBar actionBar = this.getSupportActionBar();
        if (actionBar != null){
            actionBar.setDisplayHomeAsUpEnabled(true);
        }
        actionBar.setTitle("Типы ресурсов");

        ZoomInImageView imageResourceType1 = findViewById(R.id.imageResourceType1);
        String url = "https://firebasestorage.googleapis.com/v0/b/android-app-5b365.appspot.com/o/Resource%2FLesson2Type%2F1.png?alt=media&token=11d43960-7166-4cfd-8aca-9d304acb9236";
        Glide.with(getApplicationContext()).load(url).into(imageResourceType1);

        ZoomInImageView imageResourceType2 = findViewById(R.id.imageResourceType2);
        String url2 = "https://firebasestorage.googleapis.com/v0/b/android-app-5b365.appspot.com/o/Resource%2FLesson2Type%2F2.png?alt=media&token=cc9252ee-68ce-431e-9f01-86ff112448dd";
        Glide.with(getApplicationContext()).load(url2).into(imageResourceType2);
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