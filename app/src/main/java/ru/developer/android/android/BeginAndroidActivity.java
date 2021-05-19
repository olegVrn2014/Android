package ru.developer.android.android;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import ru.developer.android.R;
import ru.developer.android.menu.PopUpMenuActivity;
import ru.developer.android.menu.runMenu.RunPopUpMenu;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

import com.bumptech.glide.Glide;
import com.zolad.zoominimageview.ZoomInImageView;

public class BeginAndroidActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_begin_android);

        ActionBar actionBar = this.getSupportActionBar();
        if (actionBar != null){
            actionBar.setDisplayHomeAsUpEnabled(true);
        }
        actionBar.setTitle("Введение Android");

        ZoomInImageView imageAndroid = findViewById(R.id.imageAndroid);
        String url = "https://firebasestorage.googleapis.com/v0/b/android-app-5b365.appspot.com/o/Android%2FBegin%20Android%2Fbegin_android.jpg?alt=media&token=2be33599-de75-4e3d-85ff-1397a7e84f41";
        Glide.with(getApplicationContext()).load(url).into(imageAndroid);

        ZoomInImageView imageJava = findViewById(R.id.imageJava);
        String url1 = "https://firebasestorage.googleapis.com/v0/b/android-app-5b365.appspot.com/o/Android%2FBegin%20Android%2Fbegin_Java.jpg?alt=media&token=152e6710-0a6d-408e-88b1-20fd90617e53";
        Glide.with(getApplicationContext()).load(url1).into(imageJava);

        ZoomInImageView imageIDE = findViewById(R.id.imageIDE);
        String url2 = "https://firebasestorage.googleapis.com/v0/b/android-app-5b365.appspot.com/o/Android%2FBegin%20Android%2FIDE.png?alt=media&token=4fd8df31-40d5-48db-8058-647f5249ed69";
        Glide.with(getApplicationContext()).load(url2).into(imageIDE);

        ZoomInImageView imageAndroidStudio = findViewById(R.id.imageAndroidStudio);
        String url3 = "https://firebasestorage.googleapis.com/v0/b/android-app-5b365.appspot.com/o/Android%2FBegin%20Android%2Fandroid-impaxive.jpg?alt=media&token=69c45176-0234-40db-a82b-cdfff16ca3a6";
        Glide.with(getApplicationContext()).load(url3).into(imageAndroidStudio);

        ZoomInImageView imageJDK = findViewById(R.id.imageJDK);
        String url4 = "https://firebasestorage.googleapis.com/v0/b/android-app-5b365.appspot.com/o/Android%2FBegin%20Android%2Fjdk.jpg?alt=media&token=f5d071cc-c6bf-4d2c-af22-c8247c435669";
        Glide.with(getApplicationContext()).load(url4).into(imageJDK);

        ZoomInImageView imageDownloadJDK = findViewById(R.id.imageDownloadJDK);
        String url5 = "https://firebasestorage.googleapis.com/v0/b/android-app-5b365.appspot.com/o/Android%2FBegin%20Android%2FdownloadsJDK.png?alt=media&token=dbf8be73-c2a1-4401-90b3-0ccdac2728f5";
        Glide.with(getApplicationContext()).load(url5).into(imageDownloadJDK);
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