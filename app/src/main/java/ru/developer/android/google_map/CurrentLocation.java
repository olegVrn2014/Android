package ru.developer.android.google_map;

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
import ru.developer.android.google_map.run.RunCurrentLocation;
import ru.developer.android.google_map.run.RunGoogleMapActivity;

public class CurrentLocation extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_current_location);

        ActionBar actionBar = this.getSupportActionBar();
        if (actionBar != null){
            actionBar.setDisplayHomeAsUpEnabled(true);
        }
        actionBar.setTitle("Current location");

        ZoomInImageView imageXML = findViewById(R.id.imageXML);
        String url = "https://firebasestorage.googleapis.com/v0/b/android-app-5b365.appspot.com/o/googleMap%2Fcurrent%20location%2Factivity_main.png?alt=media&token=c1ecdb9a-e60b-4df3-a7bc-63a47b0767f3";
        Glide.with(getApplicationContext()).load(url).into(imageXML);

        ZoomInImageView imageActivity = findViewById(R.id.imageActivity);
        String url2 = "https://firebasestorage.googleapis.com/v0/b/android-app-5b365.appspot.com/o/googleMap%2Fcurrent%20location%2FMainActivity.png?alt=media&token=08fd50c4-36bf-4256-b8fa-b0eecada8bce";
        Glide.with(getApplicationContext()).load(url2).into(imageActivity);

        ZoomInImageView imageAndroidManifest = findViewById(R.id.imageAndroidManifest);
        String url3 = "https://firebasestorage.googleapis.com/v0/b/android-app-5b365.appspot.com/o/googleMap%2Fcurrent%20location%2Fmanifest.png?alt=media&token=fc30286e-93e2-4584-b15d-9ab1a9472d67";
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
           Intent intent = new Intent(CurrentLocation.this, RunCurrentLocation.class);startActivity(intent);
        }
        return super.onOptionsItemSelected(item);
    }
}
