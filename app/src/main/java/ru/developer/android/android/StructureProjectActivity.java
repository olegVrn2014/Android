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
        String url2 = "https://firebasestorage.googleapis.com/v0/b/android-app-5b365.appspot.com/o/Android%2FStructureProject%2FMainActivity.png?alt=media&token=5d4699a1-f4ed-4913-81dc-1b197f62b1e5";
        Glide.with(getApplicationContext()).load(url2).into(imageJavaProject);

        ZoomInImageView imageRes = findViewById(R.id.imageRes);
        String url3 = "https://firebasestorage.googleapis.com/v0/b/android-app-5b365.appspot.com/o/Android%2FStructureProject%2Fres.png?alt=media&token=d5dc0e21-e895-492a-abc5-b65d64b2df89";
        Glide.with(getApplicationContext()).load(url3).into(imageRes);

        ZoomInImageView imageValues = findViewById(R.id.imageValues);
        String url4 = "https://firebasestorage.googleapis.com/v0/b/android-app-5b365.appspot.com/o/Android%2FStructureProject%2Fvalues.png?alt=media&token=08490992-d055-438a-aa8a-77cacf710c21";
        Glide.with(getApplicationContext()).load(url4).into(imageValues);

        ZoomInImageView imageGradleScripts = findViewById(R.id.imageGradleScripts);
        String url5 = "https://firebasestorage.googleapis.com/v0/b/android-app-5b365.appspot.com/o/Android%2FStructureProject%2FGradle.png?alt=media&token=b70605ab-7755-439a-9fba-949915f87ebf";
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