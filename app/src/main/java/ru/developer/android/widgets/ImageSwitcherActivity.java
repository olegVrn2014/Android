package ru.developer.android.widgets;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import ru.developer.android.R;
import ru.developer.android.runWidgets.RunImageSwitcher;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import com.bumptech.glide.Glide;
import com.zolad.zoominimageview.ZoomInImageView;

public class ImageSwitcherActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_switcher);


        ActionBar actionBar = this.getSupportActionBar();
        if (actionBar != null){
            actionBar.setDisplayHomeAsUpEnabled(true);
        }
        actionBar.setTitle("ImageSwitcher");

        ZoomInImageView imageXML = findViewById(R.id.imageXML);
        String url = "https://firebasestorage.googleapis.com/v0/b/android-app-5b365.appspot.com/o/Widgets%2FImageSwitcher%2FImageSwitcher%20XML.png?alt=media&token=4b194446-0927-41c2-93f2-545e4ce4a452";
        Glide.with(getApplicationContext()).load(url).into(imageXML);

        ZoomInImageView imageActivity = findViewById(R.id.imageActivity);
        String url2 = "https://firebasestorage.googleapis.com/v0/b/android-app-5b365.appspot.com/o/Widgets%2FImageSwitcher%2FImageSwitche-Activityr.jpg?alt=media&token=41ac9ac1-baca-4536-bbd4-cee87c9f1c4d";
        Glide.with(getApplicationContext()).load(url2).into(imageActivity);

        ZoomInImageView imageDrawable = findViewById(R.id.imageSwitcherDrawable);
        String url3 = "https://firebasestorage.googleapis.com/v0/b/android-app-5b365.appspot.com/o/Widgets%2FImageSwitcher%2FImageSwitcher%20Drawable.png?alt=media&token=4dd7804b-2720-406d-99e2-a72ffbe76fd6";
        Glide.with(getApplicationContext()).load(url3).into(imageDrawable);


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
            Intent intent = new Intent(ImageSwitcherActivity.this, RunImageSwitcher.class);startActivity(intent);
        }
        return super.onOptionsItemSelected(item);
    }
}
