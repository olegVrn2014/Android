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
import ru.developer.android.google_map.run.RunGoogleMapActivity;
import ru.developer.android.tel_manager.ReadContactActivity;
import ru.developer.android.tel_manager.run.RunReadContactActivity;

public class GoogleMapActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_google_map2);

        ActionBar actionBar = this.getSupportActionBar();
        if (actionBar != null){
            actionBar.setDisplayHomeAsUpEnabled(true);
        }
        actionBar.setTitle("Google Map");

        ZoomInImageView imageXML = findViewById(R.id.imageXML);
        String url = "https://firebasestorage.googleapis.com/v0/b/android-app-5b365.appspot.com/o/googleMap%2Fgoogle%20map%2Fxml.png?alt=media&token=9ddf7fe2-b074-4242-94b9-38f76c9f723c";
        Glide.with(getApplicationContext()).load(url).into(imageXML);

        ZoomInImageView imageActivity = findViewById(R.id.imageActivity);
        String url2 = "https://firebasestorage.googleapis.com/v0/b/android-app-5b365.appspot.com/o/googleMap%2Fgoogle%20map%2FActivity.png?alt=media&token=a71c549f-110f-4943-9b25-f3277ec3e7a6";
        Glide.with(getApplicationContext()).load(url2).into(imageActivity);

        ZoomInImageView imageAndroidManifest = findViewById(R.id.imageAndroidManifest);
        String url3 = "https://firebasestorage.googleapis.com/v0/b/android-app-5b365.appspot.com/o/googleMap%2Fgoogle%20map%2Fmanifest.png?alt=media&token=659fd91b-b1f5-40d3-b9cb-39782b382176";
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
           Intent intent = new Intent(GoogleMapActivity.this, RunGoogleMapActivity.class);startActivity(intent);
        }
        return super.onOptionsItemSelected(item);
    }
}
