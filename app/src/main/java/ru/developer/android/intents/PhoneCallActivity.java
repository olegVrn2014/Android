package ru.developer.android.intents;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import ru.developer.android.R;
import ru.developer.android.intents.runIntents.RunEmail;
import ru.developer.android.intents.runIntents.RunPhoneCall;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import com.bumptech.glide.Glide;
import com.zolad.zoominimageview.ZoomInImageView;

public class PhoneCallActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phone_call);

        ActionBar actionBar = this.getSupportActionBar();
        if (actionBar != null){
            actionBar.setDisplayHomeAsUpEnabled(true);
        }
        actionBar.setTitle("Launch PhoneCall");

        ZoomInImageView imageXML = findViewById(R.id.imageXML);
        String url = "https://firebasestorage.googleapis.com/v0/b/android-app-5b365.appspot.com/o/intents%2FPhoneCall%2Factivity_main_xml.png?alt=media&token=aef8725d-fef2-48bd-a500-fcffddefaacf";
        Glide.with(getApplicationContext()).load(url).into(imageXML);

        ZoomInImageView imageActivity = findViewById(R.id.imageActivity);
        String url2 = "https://firebasestorage.googleapis.com/v0/b/android-app-5b365.appspot.com/o/intents%2FPhoneCall%2FMainActivity.jpg?alt=media&token=9a5ffb2d-3dc2-4d45-9982-bcdc1d447892";
        Glide.with(getApplicationContext()).load(url2).into(imageActivity);

        ZoomInImageView imageAndroidManifest = findViewById(R.id.imageAndroidManifest);
        String url3 = "https://firebasestorage.googleapis.com/v0/b/android-app-5b365.appspot.com/o/intents%2FPhoneCall%2Fmanifest.png?alt=media&token=aca49b09-405e-4856-aa63-0734587ad358";
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
            Intent intent = new Intent(PhoneCallActivity.this, RunPhoneCall.class);startActivity(intent);
        }
        return super.onOptionsItemSelected(item);
    }
}