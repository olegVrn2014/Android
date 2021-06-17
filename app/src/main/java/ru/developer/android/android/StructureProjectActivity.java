package ru.developer.android.android;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import ru.developer.android.R;

import android.os.Bundle;
import android.view.MenuItem;

import com.bumptech.glide.Glide;
import com.zolad.zoominimageview.ZoomInImageView;

public class StructureProjectActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_structure_project);

        ActionBar actionBar = this.getSupportActionBar();
        if (actionBar != null){
            actionBar.setDisplayHomeAsUpEnabled(true);
        }
        actionBar.setTitle("Структура проекта");

        ZoomInImageView imageStructureProject = findViewById(R.id.imageStructureProject);
        String url = "https://firebasestorage.googleapis.com/v0/b/android-app-5b365.appspot.com/o/Android%2FStructureProject%2Fstructureproject1.png?alt=media&token=7a86fff0-943f-4fad-aa78-02be88f6f875";
        Glide.with(getApplicationContext()).load(url).into(imageStructureProject);

        ZoomInImageView imageManifest = findViewById(R.id.imageManifest);
        String url1 = "https://firebasestorage.googleapis.com/v0/b/android-app-5b365.appspot.com/o/Android%2FStructureProject%2Fmanifest.png?alt=media&token=b43cb639-493a-45a2-b016-9c1a19efd998";
        Glide.with(getApplicationContext()).load(url1).into(imageManifest);

        ZoomInImageView imageJavaProject = findViewById(R.id.imageJavaProject);
        String url2 = "https://firebasestorage.googleapis.com/v0/b/android-app-5b365.appspot.com/o/Android%2FStructureProject%2FMainActivity.png?alt=media&token=e0d96f00-c031-48f5-9f26-9b833b3ec9e7";
        Glide.with(getApplicationContext()).load(url2).into(imageJavaProject);

        ZoomInImageView imageRes = findViewById(R.id.imageRes);
        String url3 = "https://firebasestorage.googleapis.com/v0/b/android-app-5b365.appspot.com/o/Android%2FStructureProject%2Fres.png?alt=media&token=11ff98cd-05ec-49dc-baac-449010c13c2d";
        Glide.with(getApplicationContext()).load(url3).into(imageRes);

        ZoomInImageView imageValues = findViewById(R.id.imageValues);
        String url4 = "https://firebasestorage.googleapis.com/v0/b/android-app-5b365.appspot.com/o/Android%2FStructureProject%2Fvalues.png?alt=media&token=7e6d2258-f70f-43d2-b2e8-f766ee426326";
        Glide.with(getApplicationContext()).load(url4).into(imageValues);

        ZoomInImageView imageGradleScripts = findViewById(R.id.imageGradleScripts);
        String url5 = "https://firebasestorage.googleapis.com/v0/b/android-app-5b365.appspot.com/o/Android%2FStructureProject%2FGradle.png?alt=media&token=1ed5cd0a-9d4a-4a79-bb94-aac23c2f69c6";
        Glide.with(getApplicationContext()).load(url5).into(imageGradleScripts);

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                finish();
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
}