package ru.developer.android.android;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import ru.developer.android.R;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import com.bumptech.glide.Glide;
import com.zolad.zoominimageview.ZoomInImageView;

public class RunPhoneActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_run_phone);

        ActionBar actionBar = this.getSupportActionBar();
        if (actionBar != null){
            actionBar.setDisplayHomeAsUpEnabled(true);
        }
        actionBar.setTitle("Запуск на телефоне");

        ZoomInImageView imageRunPhone1 = findViewById(R.id.imageRunPhone1);
        String url = "https://firebasestorage.googleapis.com/v0/b/android-app-5b365.appspot.com/o/Android%2FRunPhone%2F1.jpg?alt=media&token=854be96f-f84e-4787-8d37-08a35a7b9da8";
        Glide.with(getApplicationContext()).load(url).into(imageRunPhone1);

        ZoomInImageView imageRunPhone2 = findViewById(R.id.imageRunPhone2);
        String url2 = "https://firebasestorage.googleapis.com/v0/b/android-app-5b365.appspot.com/o/Android%2FRunPhone%2F2.jpg?alt=media&token=d670665c-b845-4a83-9c73-d077ad6fc0f5";
        Glide.with(getApplicationContext()).load(url2).into(imageRunPhone2);

        ZoomInImageView imageRunPhone3 = findViewById(R.id.imageRunPhone3);
        String url3 = "https://firebasestorage.googleapis.com/v0/b/android-app-5b365.appspot.com/o/Android%2FRunPhone%2F3.jpg?alt=media&token=2d6bbb08-f2ba-410d-a1a0-d0636ea7311e";
        Glide.with(getApplicationContext()).load(url3).into(imageRunPhone3);

        ZoomInImageView imageRunPhone4 = findViewById(R.id.imageRunPhone4);
        String url4 = "https://firebasestorage.googleapis.com/v0/b/android-app-5b365.appspot.com/o/Android%2FRunPhone%2F4.jpg?alt=media&token=9b7b284b-bc25-48a3-9e08-eb5893c2bfa0";
        Glide.with(getApplicationContext()).load(url4).into(imageRunPhone4);

        ZoomInImageView imageRunPhone5 = findViewById(R.id.imageRunPhone5);
        String url5 = "https://firebasestorage.googleapis.com/v0/b/android-app-5b365.appspot.com/o/Android%2FRunPhone%2F5.jpg?alt=media&token=cab898a6-945e-4a0e-a695-7360d91a04de";
        Glide.with(getApplicationContext()).load(url5).into(imageRunPhone5);

        ZoomInImageView imageRunPhone6 = findViewById(R.id.imageRunPhone6);
        String url6 = "https://firebasestorage.googleapis.com/v0/b/android-app-5b365.appspot.com/o/Android%2FRunPhone%2F6.jpg?alt=media&token=59629325-b2fb-4355-9c57-af638459b1a6";
        Glide.with(getApplicationContext()).load(url6).into(imageRunPhone6);

        ZoomInImageView imageRunPhone7 = findViewById(R.id.imageRunPhone7);
        String url7 = "https://firebasestorage.googleapis.com/v0/b/android-app-5b365.appspot.com/o/Android%2FRunPhone%2F7.png?alt=media&token=6a6416a8-b7bf-4497-8250-726e14ad3c2d";
        Glide.with(getApplicationContext()).load(url7).into(imageRunPhone7);

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
