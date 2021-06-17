package ru.developer.android.android;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import ru.developer.android.R;

import android.os.Bundle;
import android.view.MenuItem;

import com.bumptech.glide.Glide;
import com.zolad.zoominimageview.ZoomInImageView;

public class AndroidManifestActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_android_manifest);

        ActionBar actionBar = this.getSupportActionBar();
        if (actionBar != null){
            actionBar.setDisplayHomeAsUpEnabled(true);
        }
        actionBar.setTitle("AndroidManifest.xml");

        ZoomInImageView imageAndroidManifest1 = findViewById(R.id.imageAndroidManifest1);
        String url = "https://firebasestorage.googleapis.com/v0/b/android-app-5b365.appspot.com/o/Android%2FAndroidMAnifest%2F1.png?alt=media&token=1c6b046a-0f2c-437c-a736-b4fea6f26748";
        Glide.with(getApplicationContext()).load(url).into(imageAndroidManifest1);

        ZoomInImageView imageAndroidManifest2 = findViewById(R.id.imageAndroidManifest2);
        String url2 = "https://firebasestorage.googleapis.com/v0/b/android-app-5b365.appspot.com/o/Android%2FAndroidMAnifest%2F2.png?alt=media&token=d8ecd63f-87fa-41fa-bd76-6b5dfbdd6b32";
        Glide.with(getApplicationContext()).load(url2).into(imageAndroidManifest2);

        ZoomInImageView imageAndroidManifest3 = findViewById(R.id.imageAndroidManifest3);
        String url3 = "https://firebasestorage.googleapis.com/v0/b/android-app-5b365.appspot.com/o/Android%2FAndroidMAnifest%2F3.png?alt=media&token=ace7f235-773c-4fab-af8a-22513461a7f1";
        Glide.with(getApplicationContext()).load(url3).into(imageAndroidManifest3);

        ZoomInImageView imageAndroidManifest4 = findViewById(R.id.imageAndroidManifest4);
        String url4 = "https://firebasestorage.googleapis.com/v0/b/android-app-5b365.appspot.com/o/Android%2FAndroidMAnifest%2F4.png?alt=media&token=50d20950-95e6-4391-a920-4dd9f3964e34";
        Glide.with(getApplicationContext()).load(url4).into(imageAndroidManifest4);

        ZoomInImageView imageAndroidManifest5 = findViewById(R.id.imageAndroidManifest5);
        String url5 = "https://firebasestorage.googleapis.com/v0/b/android-app-5b365.appspot.com/o/Android%2FAndroidMAnifest%2F5.png?alt=media&token=d9c18515-41c1-4c2b-89f7-35208d8324eb";
        Glide.with(getApplicationContext()).load(url5).into(imageAndroidManifest5);

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