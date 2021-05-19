package ru.developer.android.android;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import ru.developer.android.R;

import android.os.Bundle;
import android.view.MenuItem;

import com.bumptech.glide.Glide;
import com.zolad.zoominimageview.ZoomInImageView;

public class ExampleMainActivityJava extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_example_main_java);

        ActionBar actionBar = this.getSupportActionBar();
        if (actionBar != null){
            actionBar.setDisplayHomeAsUpEnabled(true);
        }
        actionBar.setTitle("Обзор MainActivity.java");

        ZoomInImageView imageExampleMainActivityJava = findViewById(R.id.imageExampleMainActivityJava);
        String url = "https://firebasestorage.googleapis.com/v0/b/android-app-5b365.appspot.com/o/Android%2FExampleMainActivityJava%2FexampleMainActivityJava.png?alt=media&token=092af48a-59cd-44bd-8674-c9889228b40f";
        Glide.with(getApplicationContext()).load(url).into(imageExampleMainActivityJava);

        ZoomInImageView imagePackage = findViewById(R.id.imagePackage);
        String url1 = "https://firebasestorage.googleapis.com/v0/b/android-app-5b365.appspot.com/o/Android%2FExampleMainActivityJava%2Fpackage.png?alt=media&token=cc9f088e-378e-4a6a-b6e7-74493db2e0d5";
        Glide.with(getApplicationContext()).load(url1).into(imagePackage);

        ZoomInImageView imageImport = findViewById(R.id.imageImport);
        String url2 = "https://firebasestorage.googleapis.com/v0/b/android-app-5b365.appspot.com/o/Android%2FExampleMainActivityJava%2Fimport.png?alt=media&token=ff67b128-d87c-4f68-b84c-74c43d1d7f1a";
        Glide.with(getApplicationContext()).load(url2).into(imageImport);

        ZoomInImageView imageClass = findViewById(R.id.imageClass);
        String url3 = "https://firebasestorage.googleapis.com/v0/b/android-app-5b365.appspot.com/o/Android%2FExampleMainActivityJava%2Fclass.png?alt=media&token=89747076-0048-4fff-9c48-4cba1a14e191";
        Glide.with(getApplicationContext()).load(url3).into(imageClass);

        ZoomInImageView imgOnCreate = findViewById(R.id.imgOnCreate);
        String url4 = "https://firebasestorage.googleapis.com/v0/b/android-app-5b365.appspot.com/o/Android%2FExampleMainActivityJava%2FonCreate.png?alt=media&token=b56c9e01-e915-4c1c-8a31-1cc01562894b";
        Glide.with(getApplicationContext()).load(url4).into(imgOnCreate);
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