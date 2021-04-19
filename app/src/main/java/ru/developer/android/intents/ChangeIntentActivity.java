package ru.developer.android.intents;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import ru.developer.android.R;
import ru.developer.android.intents.runIntents.RunIntentMainActivity;
import ru.developer.android.toast.CustomToastActivity;
import ru.developer.android.toast.runToast.RunCustomToast;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import com.bumptech.glide.Glide;
import com.zolad.zoominimageview.ZoomInImageView;

public class ChangeIntentActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_change_intent);

        ActionBar actionBar = this.getSupportActionBar();
        if (actionBar != null){
            actionBar.setDisplayHomeAsUpEnabled(true);
        }
        actionBar.setTitle("ChangeActivity By Intent");

        ZoomInImageView imageXML = findViewById(R.id.imageXML);
        String url = "https://firebasestorage.googleapis.com/v0/b/android-app-5b365.appspot.com/o/intents%2FchangeActivity%20by%20intent%2Fintent%20activity_main%20%20xml.png?alt=media&token=542d02a2-7f1f-4be2-997c-2734d1f72c4a";
        Glide.with(getApplicationContext()).load(url).into(imageXML);

        ZoomInImageView imageActivity = findViewById(R.id.imageActivity);
        String url2 = "https://firebasestorage.googleapis.com/v0/b/android-app-5b365.appspot.com/o/intents%2FchangeActivity%20by%20intent%2Fintent%20mainActivity.png?alt=media&token=670cb4d9-20e6-4577-8dff-cbca7b33d04a";
        Glide.with(getApplicationContext()).load(url2).into(imageActivity);

        ZoomInImageView imageCreateSecondActivity1 = findViewById(R.id.imageCreateSecondActivity1);
        String url3 = "https://firebasestorage.googleapis.com/v0/b/android-app-5b365.appspot.com/o/intents%2FchangeActivity%20by%20intent%2Fintent1.png?alt=media&token=f9675fad-f33a-40d3-a6bf-ea2fcab47d22";
        Glide.with(getApplicationContext()).load(url3).into(imageCreateSecondActivity1);

        ZoomInImageView imageCreateSecondActivity2 = findViewById(R.id.imageCreateSecondActivity2);
        String url4 = "https://firebasestorage.googleapis.com/v0/b/android-app-5b365.appspot.com/o/intents%2FchangeActivity%20by%20intent%2Fintent2.png?alt=media&token=48133f7e-7fad-4970-81c2-78c19fa5533e";
        Glide.with(getApplicationContext()).load(url4).into(imageCreateSecondActivity2);

        ZoomInImageView imageActivitySecondXml = findViewById(R.id.imageActivitySecondXml);
        String url5 = "https://firebasestorage.googleapis.com/v0/b/android-app-5b365.appspot.com/o/intents%2FchangeActivity%20by%20intent%2Fintent%20activity%20second%20xml.png?alt=media&token=122a9679-480b-4816-8438-6b2ba4657fca";
        Glide.with(getApplicationContext()).load(url5).into(imageActivitySecondXml);

        ZoomInImageView imageSecondActivityJava = findViewById(R.id.imageSecondActivityJava);
        String url6 = "https://firebasestorage.googleapis.com/v0/b/android-app-5b365.appspot.com/o/intents%2FchangeActivity%20by%20intent%2Fintent%20secondActivity.png?alt=media&token=16c98038-8211-4874-bb6e-78242cb09b62";
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
            Intent intent = new Intent(ChangeIntentActivity.this, RunIntentMainActivity.class);startActivity(intent);
        }
        return super.onOptionsItemSelected(item);
    }
}