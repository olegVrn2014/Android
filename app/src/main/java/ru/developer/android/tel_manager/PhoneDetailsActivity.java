package ru.developer.android.tel_manager;

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
import ru.developer.android.alarm_manager.SimpleAlarmActivity;
import ru.developer.android.alarm_manager.runAlarm.RunSimpleAlarmActivity;
import ru.developer.android.tel_manager.run.RunPhoneDetails;

public class PhoneDetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phone_details);

        ActionBar actionBar = this.getSupportActionBar();
        if (actionBar != null){
            actionBar.setDisplayHomeAsUpEnabled(true);
        }
        actionBar.setTitle("Phone Details");

        ZoomInImageView imageXML = findViewById(R.id.imageXML);
        String url = "https://firebasestorage.googleapis.com/v0/b/android-app-5b365.appspot.com/o/Telephone%20Manager%2FPhone%20details%2Factivity_main.png?alt=media&token=1d0d2d95-d9de-4214-a0b6-2ec16827a371";
        Glide.with(getApplicationContext()).load(url).into(imageXML);

        ZoomInImageView imageActivity = findViewById(R.id.imageActivity);
        String url2 = "https://firebasestorage.googleapis.com/v0/b/android-app-5b365.appspot.com/o/Telephone%20Manager%2FPhone%20details%2FMainActivity.png?alt=media&token=66e00e62-85f8-46a1-85cf-a5a649487da5";
        Glide.with(getApplicationContext()).load(url2).into(imageActivity);

        ZoomInImageView imageAndroidManifest = findViewById(R.id.imageAndroidManifest);
        String url3 = "https://firebasestorage.googleapis.com/v0/b/android-app-5b365.appspot.com/o/Telephone%20Manager%2FPhone%20details%2Fmanifest.png?alt=media&token=782a08a7-80e8-4bfb-aa84-9ae5e4d2eca1";
        Glide.with(getApplicationContext()).load(url3).into(imageAndroidManifest);

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
            Intent intent = new Intent(PhoneDetailsActivity.this, RunPhoneDetails.class);startActivity(intent);
        }
        return super.onOptionsItemSelected(item);
    }
}
