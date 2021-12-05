package ru.developer.android.multimedia;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import ru.developer.android.R;
import ru.developer.android.animations.InterpolatorActivity;
import ru.developer.android.animations.runAnimations.RunInterpolatorActivity;
import ru.developer.android.multimedia.runMultimedia.RunMultimediaActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import com.bumptech.glide.Glide;
import com.zolad.zoominimageview.ZoomInImageView;

public class MediaPlayerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_media_player);

        ActionBar actionBar = this.getSupportActionBar();
        if (actionBar != null){
            actionBar.setDisplayHomeAsUpEnabled(true);
        }
        actionBar.setTitle("Media player");

        ZoomInImageView imageXML = findViewById(R.id.imageXML);
        String url = "https://firebasestorage.googleapis.com/v0/b/android-app-5b365.appspot.com/o/MultiMedia%2FMediaPlayer%2Fxml.png?alt=media&token=5ef56a38-b6a5-4912-99cd-3633694679c0";
        Glide.with(getApplicationContext()).load(url).into(imageXML);

        ZoomInImageView imageActivity = findViewById(R.id.imageActivity);
        String url2 = "https://firebasestorage.googleapis.com/v0/b/android-app-5b365.appspot.com/o/MultiMedia%2FMediaPlayer%2Factivity.jpg?alt=media&token=4a211fb6-847a-4efe-8375-3d27e8c4b1ac";
        Glide.with(getApplicationContext()).load(url2).into(imageActivity);

        ZoomInImageView imageRaw = findViewById(R.id.imageRaw);
        String url3 = "https://firebasestorage.googleapis.com/v0/b/android-app-5b365.appspot.com/o/MultiMedia%2FMediaPlayer%2Fraw.png?alt=media&token=974c3f79-5bf8-485a-badc-1f733b767363";
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
            Intent intent = new Intent(MediaPlayerActivity.this, RunMultimediaActivity.class);startActivity(intent);
        }
        return super.onOptionsItemSelected(item);
    }
}
