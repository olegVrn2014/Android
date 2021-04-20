package ru.developer.android.intents;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import ru.developer.android.R;
import ru.developer.android.intents.runIntents.RunIntentMainActivity;
import ru.developer.android.intents.runIntents.RunPassBetweenMain;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import com.bumptech.glide.Glide;
import com.zolad.zoominimageview.ZoomInImageView;

public class PassDataBetweenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pass_data_between);

        ActionBar actionBar = this.getSupportActionBar();
        if (actionBar != null){
            actionBar.setDisplayHomeAsUpEnabled(true);
        }
        actionBar.setTitle("PassData Between Activity");

        ZoomInImageView imageXML = findViewById(R.id.imageXML);
        String url = "https://firebasestorage.googleapis.com/v0/b/android-app-5b365.appspot.com/o/intents%2FPassDataBetweenActivity%2Factivity_main_xml.png?alt=media&token=4cd0a4bd-5dce-40d8-a81f-5922c5f9a9ba";
        Glide.with(getApplicationContext()).load(url).into(imageXML);

        ZoomInImageView imageActivity = findViewById(R.id.imageActivity);
        String url2 = "https://firebasestorage.googleapis.com/v0/b/android-app-5b365.appspot.com/o/intents%2FPassDataBetweenActivity%2FMainActivity_java.png?alt=media&token=3f897c50-be98-4bf6-b9b0-b26f7d38d6d3";
        Glide.with(getApplicationContext()).load(url2).into(imageActivity);

        ZoomInImageView imageCreateSecondActivity1 = findViewById(R.id.imageCreateSecondActivity1);
        String url3 = "https://firebasestorage.googleapis.com/v0/b/android-app-5b365.appspot.com/o/intents%2FchangeActivity%20by%20intent%2Fintent1.png?alt=media&token=f9675fad-f33a-40d3-a6bf-ea2fcab47d22";
        Glide.with(getApplicationContext()).load(url3).into(imageCreateSecondActivity1);

        ZoomInImageView imageCreateSecondActivity2 = findViewById(R.id.imageCreateSecondActivity2);
        String url4 = "https://firebasestorage.googleapis.com/v0/b/android-app-5b365.appspot.com/o/intents%2FchangeActivity%20by%20intent%2Fintent2.png?alt=media&token=48133f7e-7fad-4970-81c2-78c19fa5533e";
        Glide.with(getApplicationContext()).load(url4).into(imageCreateSecondActivity2);

        ZoomInImageView imageActivitySecondXml = findViewById(R.id.imageActivitySecondXml);
        String url5 = "https://firebasestorage.googleapis.com/v0/b/android-app-5b365.appspot.com/o/intents%2FPassDataBetweenActivity%2Factivity_second_xml.png?alt=media&token=4b7c239b-1ee5-481f-b4d0-37b3b0301448";
        Glide.with(getApplicationContext()).load(url5).into(imageActivitySecondXml);

        ZoomInImageView imageSecondActivityJava = findViewById(R.id.imageSecondActivityJava);
        String url6 = "https://firebasestorage.googleapis.com/v0/b/android-app-5b365.appspot.com/o/intents%2FPassDataBetweenActivity%2FSecondActivity_java.png?alt=media&token=5d1909c1-3f1d-4104-805f-f6f8dbd40775";
        Glide.with(getApplicationContext()).load(url6).into(imageSecondActivityJava);

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
            Intent intent = new Intent(PassDataBetweenActivity.this, RunPassBetweenMain.class);startActivity(intent);
        }
        return super.onOptionsItemSelected(item);
    }
}