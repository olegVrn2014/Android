package ru.developer.android.multimedia;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import ru.developer.android.R;
import ru.developer.android.multimedia.runMultimedia.RunRecordingActivity;
import ru.developer.android.multimedia.runMultimedia.RunVideoPlayerActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import com.bumptech.glide.Glide;
import com.zolad.zoominimageview.ZoomInImageView;

public class RecordingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recording);

        ActionBar actionBar = this.getSupportActionBar();
        if (actionBar != null){
            actionBar.setDisplayHomeAsUpEnabled(true);
        }
        actionBar.setTitle("Recording Media");

        ZoomInImageView imageXML = findViewById(R.id.imageXML);
        String url = "";
        Glide.with(getApplicationContext()).load(url).into(imageXML);

        ZoomInImageView imageActivity = findViewById(R.id.imageActivity);
        String url2 = "";
        Glide.with(getApplicationContext()).load(url2).into(imageActivity);

        ZoomInImageView imageRaw = findViewById(R.id.imageRaw);
        String url3 = "";
        Glide.with(getApplicationContext()).load(url3).into(imageRaw);

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
            Intent intent = new Intent(RecordingActivity.this, RunRecordingActivity.class);startActivity(intent);
        }
        return super.onOptionsItemSelected(item);
    }
}
