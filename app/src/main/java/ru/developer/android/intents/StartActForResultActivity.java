package ru.developer.android.intents;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import ru.developer.android.R;
import ru.developer.android.intents.runIntents.RunGoogleSearch;
import ru.developer.android.intents.runIntents.RunStartActForResult;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import com.bumptech.glide.Glide;
import com.zolad.zoominimageview.ZoomInImageView;

public class StartActForResultActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start_act_for_result);

        ActionBar actionBar = this.getSupportActionBar();
        if (actionBar != null){
            actionBar.setDisplayHomeAsUpEnabled(true);
        }
        actionBar.setTitle("StartActivityForResult");

        ZoomInImageView imageXML = findViewById(R.id.imageXML);
        String url = "https://firebasestorage.googleapis.com/v0/b/android-app-5b365.appspot.com/o/intents%2FStartActivityForResult%2Factivity_main_xml.png?alt=media&token=fdad14e1-60b8-4479-8bbc-947c6804130e";
        Glide.with(getApplicationContext()).load(url).into(imageXML);

        ZoomInImageView imageActivity = findViewById(R.id.imageActivity);
        String url2 = "https://firebasestorage.googleapis.com/v0/b/android-app-5b365.appspot.com/o/intents%2FStartActivityForResult%2FMainActivity_java.png?alt=media&token=a25dcd46-1e33-4f39-b39f-e086301a310d";
        Glide.with(getApplicationContext()).load(url2).into(imageActivity);

        ZoomInImageView imageActivitySecond = findViewById(R.id.imageActivitySecond);
        String url3 = "https://firebasestorage.googleapis.com/v0/b/android-app-5b365.appspot.com/o/intents%2FStartActivityForResult%2Factivity_second_xml.png?alt=media&token=b46d68ce-41c6-4195-afbb-2940a66b6dd6";
        Glide.with(getApplicationContext()).load(url3).into(imageActivitySecond);

        ZoomInImageView imageSecondActivity = findViewById(R.id.imageSecondActivity);
        String url4 = "https://firebasestorage.googleapis.com/v0/b/android-app-5b365.appspot.com/o/intents%2FStartActivityForResult%2FSecondActivity_java.png?alt=media&token=d9f4e4d2-df72-47e7-a4e7-e5ee9558b08c";
        Glide.with(getApplicationContext()).load(url4).into(imageSecondActivity);

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
            Intent intent = new Intent(StartActForResultActivity.this, RunStartActForResult.class);startActivity(intent);
        }
        return super.onOptionsItemSelected(item);
    }
}
