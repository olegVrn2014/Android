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
import ru.developer.android.intents.EmailActivity;
import ru.developer.android.intents.runIntents.RunEmail;
import ru.developer.android.service.runService.RunServiceActivity;

public class ServiceActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_service);

        ActionBar actionBar = this.getSupportActionBar();
        if (actionBar != null){
            actionBar.setDisplayHomeAsUpEnabled(true);
        }
        actionBar.setTitle("Service");

        ZoomInImageView imageXML = findViewById(R.id.imageXML);
        String url = "https://firebasestorage.googleapis.com/v0/b/android-app-5b365.appspot.com/o/Service%2FService%2Fact_main_xml.png?alt=media&token=55efc95f-f7d8-4825-8918-2ed8bb13ac86";
        Glide.with(getApplicationContext()).load(url).into(imageXML);

        ZoomInImageView imageActivity = findViewById(R.id.imageActivity);
        String url2 = "https://firebasestorage.googleapis.com/v0/b/android-app-5b365.appspot.com/o/Service%2FService%2FmainActivity_java.png?alt=media&token=c0006c00-f29d-4c91-b03c-11ecca7b7278";
        Glide.with(getApplicationContext()).load(url2).into(imageActivity);

        ZoomInImageView imageAndroidManifest = findViewById(R.id.imageAndroidManifest);
        String url3 = "https://firebasestorage.googleapis.com/v0/b/android-app-5b365.appspot.com/o/Service%2FService%2Fand_manif.png?alt=media&token=97078362-d576-49a6-82c3-e725ac920717";
        Glide.with(getApplicationContext()).load(url3).into(imageAndroidManifest);

        ZoomInImageView imageMyService = findViewById(R.id.imageMyService);
        String url4 = "https://firebasestorage.googleapis.com/v0/b/android-app-5b365.appspot.com/o/Service%2FService%2FMyService_java.png?alt=media&token=dceecaca-1cdf-41b1-b240-7d813341866d";
        Glide.with(getApplicationContext()).load(url4).into(imageMyService);

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
            Intent intent = new Intent(ServiceActivity.this, RunServiceActivity.class);startActivity(intent);
        }
        return super.onOptionsItemSelected(item);
    }
}