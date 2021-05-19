package ru.developer.android.android;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import ru.developer.android.R;

import android.os.Bundle;
import android.view.MenuItem;

import com.bumptech.glide.Glide;
import com.zolad.zoominimageview.ZoomInImageView;

public class RunEmulatorActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_run_emulator);

        ActionBar actionBar = this.getSupportActionBar();
        if (actionBar != null){
            actionBar.setDisplayHomeAsUpEnabled(true);
        }
        actionBar.setTitle("Запуск на эмуляторе");

        ZoomInImageView image1 = findViewById(R.id.image1);
        String url = "https://firebasestorage.googleapis.com/v0/b/android-app-5b365.appspot.com/o/Android%2FCreate%20AVD%20Manager%2F1%20AVD%20Manager.png?alt=media&token=babdd608-06f3-4999-8323-cd194640ce10";
        Glide.with(getApplicationContext()).load(url).into(image1);

        ZoomInImageView image2 = findViewById(R.id.image2);
        String url2 = "https://firebasestorage.googleapis.com/v0/b/android-app-5b365.appspot.com/o/Android%2FCreate%20AVD%20Manager%2F2%20create%20virtual%20device.png?alt=media&token=17e5151c-9419-4620-b573-7ce4b5681410";
        Glide.with(getApplicationContext()).load(url2).into(image2);

        ZoomInImageView image3 = findViewById(R.id.image3);
        String url3 = "https://firebasestorage.googleapis.com/v0/b/android-app-5b365.appspot.com/o/Android%2FCreate%20AVD%20Manager%2F3.png?alt=media&token=8d3c326c-dbc1-4b84-a749-aa5bcffcf013";
        Glide.with(getApplicationContext()).load(url3).into(image3);

        ZoomInImageView image4 = findViewById(R.id.image4);
        String url4 = "https://firebasestorage.googleapis.com/v0/b/android-app-5b365.appspot.com/o/Android%2FCreate%20AVD%20Manager%2F4.png?alt=media&token=14df0e57-fda1-4ef0-b992-8bc7dc5eae24";
        Glide.with(getApplicationContext()).load(url4).into(image4);

        ZoomInImageView image5 = findViewById(R.id.image5);
        String url5 = "https://firebasestorage.googleapis.com/v0/b/android-app-5b365.appspot.com/o/Android%2FCreate%20AVD%20Manager%2F5.png?alt=media&token=8759476c-babc-46b8-954e-a121d5250f52";
        Glide.with(getApplicationContext()).load(url5).into(image5);

        ZoomInImageView image6 = findViewById(R.id.image6);
        String url6 = "https://firebasestorage.googleapis.com/v0/b/android-app-5b365.appspot.com/o/Android%2FCreate%20AVD%20Manager%2F6.png?alt=media&token=0c3b50ee-d98d-4232-abae-9f9f2daa7d93";
        Glide.with(getApplicationContext()).load(url6).into(image6);

        ZoomInImageView image7 = findViewById(R.id.image7);
        String url7 = "https://firebasestorage.googleapis.com/v0/b/android-app-5b365.appspot.com/o/Android%2FCreate%20AVD%20Manager%2F7.png?alt=media&token=bbcf1ee1-7aa7-4792-b27c-6e9f10b05433";
        Glide.with(getApplicationContext()).load(url7).into(image7);

        ZoomInImageView image8 = findViewById(R.id.image8);
        String url8 = "https://firebasestorage.googleapis.com/v0/b/android-app-5b365.appspot.com/o/Android%2FCreate%20AVD%20Manager%2F8.png?alt=media&token=95e68669-cd32-4361-ac54-fa7fb06d3e96";
        Glide.with(getApplicationContext()).load(url8).into(image8);
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