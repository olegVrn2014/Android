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
import ru.developer.android.tel_manager.run.RunPhoneCallActivity;
import ru.developer.android.tel_manager.run.RunSendEmailActivity;

public class SendEmailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_send_email);

        ActionBar actionBar = this.getSupportActionBar();
        if (actionBar != null){
            actionBar.setDisplayHomeAsUpEnabled(true);
        }
        actionBar.setTitle("Send Email");

        ZoomInImageView imageXML = findViewById(R.id.imageXML);
        String url = "https://firebasestorage.googleapis.com/v0/b/android-app-5b365.appspot.com/o/Telephone%20Manager%2FSend%20Email%2Factivity_main.png?alt=media&token=b034236d-066d-4ba8-880b-74125beaa408";
        Glide.with(getApplicationContext()).load(url).into(imageXML);

        ZoomInImageView imageActivity = findViewById(R.id.imageActivity);
        String url2 = "https://firebasestorage.googleapis.com/v0/b/android-app-5b365.appspot.com/o/Telephone%20Manager%2FSend%20Email%2FMainActivity.png?alt=media&token=6f68c8bd-d7ef-4c78-ba42-9d72389fb95d";
        Glide.with(getApplicationContext()).load(url2).into(imageActivity);

        ZoomInImageView imageAndroidManifest = findViewById(R.id.imageAndroidManifest);
        String url3 = "https://firebasestorage.googleapis.com/v0/b/android-app-5b365.appspot.com/o/Telephone%20Manager%2FSend%20Email%2Fmanifest.png?alt=media&token=d78ccecb-3697-465c-adba-c0af7f53a637";
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
           Intent intent = new Intent(SendEmailActivity.this, RunSendEmailActivity.class);startActivity(intent);
        }
        return super.onOptionsItemSelected(item);
    }
}
