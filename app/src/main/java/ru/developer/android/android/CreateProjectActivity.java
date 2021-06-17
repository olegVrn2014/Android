package ru.developer.android.android;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import ru.developer.android.R;

import android.os.Bundle;
import android.view.MenuItem;

import com.bumptech.glide.Glide;
import com.zolad.zoominimageview.ZoomInImageView;

public class CreateProjectActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_project);

        ActionBar actionBar = this.getSupportActionBar();
        if (actionBar != null){
            actionBar.setDisplayHomeAsUpEnabled(true);
        }
        actionBar.setTitle("Создание нового проекта");

        ZoomInImageView imageCreateNewProject = findViewById(R.id.imageCreateNewProject);
        String url = "https://firebasestorage.googleapis.com/v0/b/android-app-5b365.appspot.com/o/Android%2FCreateProject%2FandroidStudio1.png?alt=media&token=cc72391e-bd09-4cc1-adf4-729a0562021a";
        Glide.with(getApplicationContext()).load(url).into(imageCreateNewProject);

        ZoomInImageView imageSelectTemplate = findViewById(R.id.imageSelectTemplate);
        String url1 = "https://firebasestorage.googleapis.com/v0/b/android-app-5b365.appspot.com/o/Android%2FCreateProject%2FselectTemple.png?alt=media&token=270bcebc-9fa5-4b65-888d-583647bda943";
        Glide.with(getApplicationContext()).load(url1).into(imageSelectTemplate);

        ZoomInImageView imageConfigureProject = findViewById(R.id.imageConfigureProject);
        String url2 = "https://firebasestorage.googleapis.com/v0/b/android-app-5b365.appspot.com/o/Android%2FCreateProject%2FconfigProject.png?alt=media&token=32ccb63d-6987-4f59-9b67-8278a6eac571";
        Glide.with(getApplicationContext()).load(url2).into(imageConfigureProject);

        ZoomInImageView imageTestApp = findViewById(R.id.imageTestApp);
        String url3 = "https://firebasestorage.googleapis.com/v0/b/android-app-5b365.appspot.com/o/Android%2FCreateProject%2FtestApp.png?alt=media&token=6565559e-cf00-4f78-b84a-77c2a88edc32";
        Glide.with(getApplicationContext()).load(url3).into(imageTestApp);

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