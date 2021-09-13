package ru.developer.android.animations;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import ru.developer.android.R;
import ru.developer.android.animations.runAnimations.RunRotateActivity;
import ru.developer.android.animations.runAnimations.RunZoomActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import com.bumptech.glide.Glide;
import com.zolad.zoominimageview.ZoomInImageView;

public class ZoomActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_zoom);

        ActionBar actionBar = this.getSupportActionBar();
        if (actionBar != null){
            actionBar.setDisplayHomeAsUpEnabled(true);
        }
        actionBar.setTitle("Zoom Animations");

        ZoomInImageView imageXML = findViewById(R.id.imageXML);
        String url = "https://firebasestorage.googleapis.com/v0/b/android-app-5b365.appspot.com/o/Animations%2FZoom%2Fxml.png?alt=media&token=79f09c0d-7443-46fc-af9e-610b1ffb8ebb";
        Glide.with(getApplicationContext()).load(url).into(imageXML);

        ZoomInImageView imageActivity = findViewById(R.id.imageActivity);
        String url2 = "https://firebasestorage.googleapis.com/v0/b/android-app-5b365.appspot.com/o/Animations%2FZoom%2Factivity.png?alt=media&token=c4a69af2-0e78-4d98-bd7c-7f88793f75b5";
        Glide.with(getApplicationContext()).load(url2).into(imageActivity);

        ZoomInImageView imageAnim = findViewById(R.id.imageAnim);
        String url3 = "https://firebasestorage.googleapis.com/v0/b/android-app-5b365.appspot.com/o/Animations%2FZoom%2Fanim.png?alt=media&token=f743d9ec-2b7d-495c-913a-c18b4104c8e7";
        Glide.with(getApplicationContext()).load(url3).into(imageAnim);

        ZoomInImageView imageZoomin = findViewById(R.id.imageZoomin);
        String url4 = "https://firebasestorage.googleapis.com/v0/b/android-app-5b365.appspot.com/o/Animations%2FZoom%2FZoom_in.png?alt=media&token=d4de90d1-a551-43c8-b2a4-a43c93047921";
        Glide.with(getApplicationContext()).load(url4).into(imageZoomin);

        ZoomInImageView imageZoomOut = findViewById(R.id.imageZoomOut);
        String url5 = "https://firebasestorage.googleapis.com/v0/b/android-app-5b365.appspot.com/o/Animations%2FZoom%2FZoom_out.png?alt=media&token=d06e1b2f-c4fb-4f56-860f-76cac293791b";
        Glide.with(getApplicationContext()).load(url5).into(imageZoomOut);

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
            Intent intent = new Intent(ZoomActivity.this, RunZoomActivity.class);startActivity(intent);
        }
        return super.onOptionsItemSelected(item);
    }
}
