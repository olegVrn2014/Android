package ru.developer.android.alarm_manager;

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
import ru.developer.android.alarm_manager.runAlarm.RunSimpleAlarmActivity;
import ru.developer.android.service.ServiceExample;
import ru.developer.android.service.runService.RunServiceExample;

public class SimpleAlarmActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simple_alarm);

        ActionBar actionBar = this.getSupportActionBar();
        if (actionBar != null){
            actionBar.setDisplayHomeAsUpEnabled(true);
        }
        actionBar.setTitle("Alarm Manager");

        ZoomInImageView imageXML = findViewById(R.id.imageXML);
        String url = "https://firebasestorage.googleapis.com/v0/b/android-app-5b365.appspot.com/o/Alarm_Manager%2FSet%20Simple%20Date%20With%20Time%2Fact_main_xml.png?alt=media&token=87c538a2-d2e3-4fd6-a5c5-41c6cfbe7d88";
        Glide.with(getApplicationContext()).load(url).into(imageXML);

        ZoomInImageView imageActivity = findViewById(R.id.imageActivity);
        String url2 = "https://firebasestorage.googleapis.com/v0/b/android-app-5b365.appspot.com/o/Alarm_Manager%2FSet%20Simple%20Date%20With%20Time%2FMainActivity.jpg?alt=media&token=ac3416b0-c6ca-4f02-a05a-93e98f6c2bcf";
        Glide.with(getApplicationContext()).load(url2).into(imageActivity);

        ZoomInImageView imageAndroidManifest = findViewById(R.id.imageAndroidManifest);
        String url3 = "https://firebasestorage.googleapis.com/v0/b/android-app-5b365.appspot.com/o/Alarm_Manager%2FSet%20Simple%20Date%20With%20Time%2Fmanifest.png?alt=media&token=7c1d04ed-31ba-476b-bf99-617f698d2b7b";
        Glide.with(getApplicationContext()).load(url3).into(imageAndroidManifest);

        ZoomInImageView imageMySimpleAlarm = findViewById(R.id.imageMySimpleAlarm);
        String url4 = "https://firebasestorage.googleapis.com/v0/b/android-app-5b365.appspot.com/o/Alarm_Manager%2FSet%20Simple%20Date%20With%20Time%2FMySimpleAlarm.png?alt=media&token=a7f18c7f-19d0-48f7-9540-369550036486";
        Glide.with(getApplicationContext()).load(url4).into(imageMySimpleAlarm);

        ZoomInImageView imageNewFolder = findViewById(R.id.imageNewFolder);
        String url5 = "https://firebasestorage.googleapis.com/v0/b/android-app-5b365.appspot.com/o/Alarm_Manager%2FSet%20Simple%20Date%20With%20Time%2Ffolder.png?alt=media&token=89bf65d8-12cc-4f04-9264-97ffd9086fc6";
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
            Intent intent = new Intent(SimpleAlarmActivity.this, RunSimpleAlarmActivity.class);startActivity(intent);
        }
        return super.onOptionsItemSelected(item);
    }
}