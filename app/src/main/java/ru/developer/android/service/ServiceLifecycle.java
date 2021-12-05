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
import ru.developer.android.service.runService.RunServiceActivity;
import ru.developer.android.service.runService.RunServiceLifeCycle;

public class ServiceLifecycle extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_service_lifecycle);

        ActionBar actionBar = this.getSupportActionBar();
        if (actionBar != null){
            actionBar.setDisplayHomeAsUpEnabled(true);
        }
        actionBar.setTitle("Service Lifecycle");

        ZoomInImageView imageXML = findViewById(R.id.imageXML);
        String url = "https://firebasestorage.googleapis.com/v0/b/android-app-5b365.appspot.com/o/Service%2FServiceLifecycle%2Fact_main.png?alt=media&token=f1ea98b4-f86b-40d9-b101-77f7552140ae";
        Glide.with(getApplicationContext()).load(url).into(imageXML);

        ZoomInImageView imageActivity = findViewById(R.id.imageActivity);
        String url2 = "https://firebasestorage.googleapis.com/v0/b/android-app-5b365.appspot.com/o/Service%2FServiceLifecycle%2FMainActivity.png?alt=media&token=74fd575a-cd65-466f-9ea9-4419d4f9bfec";
        Glide.with(getApplicationContext()).load(url2).into(imageActivity);

        ZoomInImageView imageAndroidManifest = findViewById(R.id.imageAndroidManifest);
        String url3 = "https://firebasestorage.googleapis.com/v0/b/android-app-5b365.appspot.com/o/Service%2FServiceLifecycle%2Fmanifest.png?alt=media&token=f7ff7dd7-ea6d-4451-aeab-0b10c88b81c1";
        Glide.with(getApplicationContext()).load(url3).into(imageAndroidManifest);

        ZoomInImageView imageMyServiceLifecycle = findViewById(R.id.imageMyServiceLifecycle);
        String url4 = "https://firebasestorage.googleapis.com/v0/b/android-app-5b365.appspot.com/o/Service%2FServiceLifecycle%2FMyServiceLivecycle.png?alt=media&token=df232d85-51c2-4322-993d-180caff5194f";
        Glide.with(getApplicationContext()).load(url4).into(imageMyServiceLifecycle);

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
            Intent intent = new Intent(ServiceLifecycle.this, RunServiceLifeCycle.class);startActivity(intent);
        }
        return super.onOptionsItemSelected(item);
    }
}