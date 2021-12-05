package ru.developer.android.multimedia;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import ru.developer.android.R;
import ru.developer.android.multimedia.runMultimedia.RunMultimediaActivity;
import ru.developer.android.multimedia.runMultimedia.RunVideoPlayerActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import com.bumptech.glide.Glide;
import com.zolad.zoominimageview.ZoomInImageView;

public class VideoPlayerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video_player);
        ActionBar actionBar = this.getSupportActionBar();
        if (actionBar != null){
            actionBar.setDisplayHomeAsUpEnabled(true);
        }
        actionBar.setTitle("Video player");

        ZoomInImageView imageXML = findViewById(R.id.imageXML);
        String url = "https://firebasestorage.googleapis.com/v0/b/android-app-5b365.appspot.com/o/MultiMedia%2FVideoPlayer%2Fxml.png?alt=media&token=06938672-5e25-4c7d-ad4a-17d115488ad7";
        Glide.with(getApplicationContext()).load(url).into(imageXML);

        ZoomInImageView imageActivity = findViewById(R.id.imageActivity);
        String url2 = "https://firebasestorage.googleapis.com/v0/b/android-app-5b365.appspot.com/o/MultiMedia%2FVideoPlayer%2Factivity.png?alt=media&token=1cc97b25-7d8d-4fea-889d-4f4781ea0be4";
        Glide.with(getApplicationContext()).load(url2).into(imageActivity);

        ZoomInImageView imageRaw = findViewById(R.id.imageRaw);
        String url3 = "https://firebasestorage.googleapis.com/v0/b/android-app-5b365.appspot.com/o/MultiMedia%2FVideoPlayer%2Fraw.png?alt=media&token=2b58232a-dfe8-430f-9858-94a400607bac";
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
            Intent intent = new Intent(VideoPlayerActivity.this, RunVideoPlayerActivity.class);startActivity(intent);
        }
        return super.onOptionsItemSelected(item);
    }
}
