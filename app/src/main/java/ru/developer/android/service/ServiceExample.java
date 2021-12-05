package ru.developer.android.service;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import com.bumptech.glide.Glide;
import com.zolad.zoominimageview.ZoomInImageView;

import ru.developer.android.R;
import ru.developer.android.service.runService.RunServiceExample;
import ru.developer.android.service.runService.RunServiceLifeCycle;

public class ServiceExample extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_service_example);

        ActionBar actionBar = this.getSupportActionBar();
        if (actionBar != null){
            actionBar.setDisplayHomeAsUpEnabled(true);
        }
        actionBar.setTitle("Service Example");

        ZoomInImageView imageXML = findViewById(R.id.imageXML);
        String url = "https://firebasestorage.googleapis.com/v0/b/android-app-5b365.appspot.com/o/Service%2FServiceExample%2Factivity_main.png?alt=media&token=61e8caea-ec56-4dd6-89e0-04cf51f0e7a6";
        Glide.with(getApplicationContext()).load(url).into(imageXML);

        ZoomInImageView imageActivity = findViewById(R.id.imageActivity);
        String url2 = "https://firebasestorage.googleapis.com/v0/b/android-app-5b365.appspot.com/o/Service%2FServiceExample%2FMainActivity_java.png?alt=media&token=c9288938-9ac1-45f9-a4e5-957610af9d58";
        Glide.with(getApplicationContext()).load(url2).into(imageActivity);

        ZoomInImageView imageAndroidManifest = findViewById(R.id.imageAndroidManifest);
        String url3 = "https://firebasestorage.googleapis.com/v0/b/android-app-5b365.appspot.com/o/Service%2FServiceExample%2Fmanifest.png?alt=media&token=503e27fc-98cd-4ab2-bc67-46e30caba96c";
        Glide.with(getApplicationContext()).load(url3).into(imageAndroidManifest);

        ZoomInImageView imageMyServiceExample = findViewById(R.id.imageMyServiceExample);
        String url4 = "https://firebasestorage.googleapis.com/v0/b/android-app-5b365.appspot.com/o/Service%2FServiceExample%2FMyServiceExample.png?alt=media&token=be26eb6f-8a69-49e9-b2f0-ab283ac00bb5";
        Glide.with(getApplicationContext()).load(url4).into(imageMyServiceExample);

        ZoomInImageView imageNewFolder = findViewById(R.id.imageNewFolder);
        String url5 = "https://firebasestorage.googleapis.com/v0/b/android-app-5b365.appspot.com/o/Service%2FServiceExample%2FnewFolder.png?alt=media&token=4bf58bce-fdb2-491b-be0a-40ffa63ecc40";
        Glide.with(getApplicationContext()).load(url5).into(imageNewFolder);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.run_menu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();
        if (id == android.R.id.home){
            finish();
            return true;
        }else{
            Intent intent = new Intent(ServiceExample.this, RunServiceExample.class);startActivity(intent);
        }
        return super.onOptionsItemSelected(item);
    }
}