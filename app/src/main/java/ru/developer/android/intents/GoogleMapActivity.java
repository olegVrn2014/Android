package ru.developer.android.intents;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import ru.developer.android.R;
import ru.developer.android.intents.runIntents.RunGoogleMap;
import ru.developer.android.intents.runIntents.RunPlayStore;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import com.bumptech.glide.Glide;
import com.zolad.zoominimageview.ZoomInImageView;

public class GoogleMapActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_google_map);

        ActionBar actionBar = this.getSupportActionBar();
        if (actionBar != null){
            actionBar.setDisplayHomeAsUpEnabled(true);
        }
        actionBar.setTitle("Launch Google Map");

        ZoomInImageView imageXML = findViewById(R.id.imageXML);
        String url = "https://firebasestorage.googleapis.com/v0/b/android-app-5b365.appspot.com/o/intents%2FGoogle%20Map%2Factivity_main_xml.png?alt=media&token=06ab8d50-793c-496c-907b-56c2b1036580";
        Glide.with(getApplicationContext()).load(url).into(imageXML);

        ZoomInImageView imageActivity = findViewById(R.id.imageActivity);
        String url2 = "https://firebasestorage.googleapis.com/v0/b/android-app-5b365.appspot.com/o/intents%2FGoogle%20Map%2FMainActivity_java.png?alt=media&token=5a7fbd3a-2bc1-4c29-a175-c0614876c7e2";
        Glide.with(getApplicationContext()).load(url2).into(imageActivity);

        ZoomInImageView imageAndroidManifest = findViewById(R.id.imageAndroidManifest);
        String url3 = "https://firebasestorage.googleapis.com/v0/b/android-app-5b365.appspot.com/o/intents%2FGoogle%20Map%2FManifest.png?alt=media&token=858d9666-1e34-4f8a-8860-bc31c98a1f0a";
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
            Intent intent = new Intent(GoogleMapActivity.this, RunGoogleMap.class);startActivity(intent);
        }
        return super.onOptionsItemSelected(item);
    }
}