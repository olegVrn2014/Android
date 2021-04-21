package ru.developer.android.intents;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import ru.developer.android.R;
import ru.developer.android.intents.runIntents.RunPassBetweenMain;
import ru.developer.android.intents.runIntents.RunWhatsApp;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import com.bumptech.glide.Glide;
import com.zolad.zoominimageview.ZoomInImageView;

public class WhatsAppActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_whats_app);

        ActionBar actionBar = this.getSupportActionBar();
        if (actionBar != null){
            actionBar.setDisplayHomeAsUpEnabled(true);
        }
        actionBar.setTitle("Launch WhatsApp");

        ZoomInImageView imageXML = findViewById(R.id.imageXML);
        String url = "https://firebasestorage.googleapis.com/v0/b/android-app-5b365.appspot.com/o/intents%2FLaunch%20WhatsApp%2Factivity_main_xml.png?alt=media&token=f4751509-3202-463e-a9be-14617a5c301c";
        Glide.with(getApplicationContext()).load(url).into(imageXML);

        ZoomInImageView imageActivity = findViewById(R.id.imageActivity);
        String url2 = "https://firebasestorage.googleapis.com/v0/b/android-app-5b365.appspot.com/o/intents%2FLaunch%20WhatsApp%2FMainActivity_java.png?alt=media&token=3060f9dc-f731-4edf-b783-9ee1ad3e9113";
        Glide.with(getApplicationContext()).load(url2).into(imageActivity);

        ZoomInImageView imageAndroidManifest = findViewById(R.id.imageAndroidManifest);
        String url3 = "https://firebasestorage.googleapis.com/v0/b/android-app-5b365.appspot.com/o/intents%2FLaunch%20WhatsApp%2FAndroidManifest_xml.png?alt=media&token=c5bf4ef2-a394-4fc0-9f10-5ce91ecbe732";
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
            Intent intent = new Intent(WhatsAppActivity.this, RunWhatsApp.class);startActivity(intent);
        }
        return super.onOptionsItemSelected(item);
    }
}