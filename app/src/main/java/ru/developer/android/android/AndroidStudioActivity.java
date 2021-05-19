package ru.developer.android.android;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import ru.developer.android.R;

import android.os.Bundle;
import android.view.MenuItem;

import com.bumptech.glide.Glide;
import com.zolad.zoominimageview.ZoomInImageView;

public class AndroidStudioActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_android_studio);

        ActionBar actionBar = this.getSupportActionBar();
        if (actionBar != null){
            actionBar.setDisplayHomeAsUpEnabled(true);
        }
        actionBar.setTitle("Установка Android Studio");

        ZoomInImageView imageDownloadAndroidStudio = findViewById(R.id.imageDownloadAndroidStudio);
        String url = "https://firebasestorage.googleapis.com/v0/b/android-app-5b365.appspot.com/o/Android%2FAndroidStudio%2FdownloadAndStudio.png?alt=media&token=19fe638c-f56e-441d-8072-112888be1514";
        Glide.with(getApplicationContext()).load(url).into(imageDownloadAndroidStudio);

        ZoomInImageView imageWelcomeAndroidStudio = findViewById(R.id.imageWelcomeAndroidStudio);
        String url01 = "https://firebasestorage.googleapis.com/v0/b/android-app-5b365.appspot.com/o/Android%2FAndroidStudio%2FstudiaWelcome.jpg?alt=media&token=13b153c6-09eb-4dd8-b36b-b7e7d48ba2b4";
        Glide.with(getApplicationContext()).load(url01).into(imageWelcomeAndroidStudio);

        ZoomInImageView imageWelcomeAndroidStudio1 = findViewById(R.id.imageWelcomeAndroidStudio1);
        String url1 = "https://firebasestorage.googleapis.com/v0/b/android-app-5b365.appspot.com/o/Android%2FAndroidStudio%2F1.png?alt=media&token=2174a99c-5cca-470e-aa62-5fe3ac447c6b";
        Glide.with(getApplicationContext()).load(url1).into(imageWelcomeAndroidStudio1);

        ZoomInImageView imageWelcomeAndroidStudio2 = findViewById(R.id.imageWelcomeAndroidStudio2);
        String url2 = "https://firebasestorage.googleapis.com/v0/b/android-app-5b365.appspot.com/o/Android%2FAndroidStudio%2F2.png?alt=media&token=37be0af3-09be-4b8d-8842-74b5ff8fcd18";
        Glide.with(getApplicationContext()).load(url2).into(imageWelcomeAndroidStudio2);

        ZoomInImageView imageWelcomeAndroidStudio3 = findViewById(R.id.imageWelcomeAndroidStudio3);
        String url3 = "https://firebasestorage.googleapis.com/v0/b/android-app-5b365.appspot.com/o/Android%2FAndroidStudio%2F3.png?alt=media&token=66659d62-4ba0-4cb2-81f7-676fdac7d416";
        Glide.with(getApplicationContext()).load(url3).into(imageWelcomeAndroidStudio3);

        ZoomInImageView imageWelcomeAndroidStudio4 = findViewById(R.id.imageWelcomeAndroidStudio4);
        String url4 = "https://firebasestorage.googleapis.com/v0/b/android-app-5b365.appspot.com/o/Android%2FAndroidStudio%2F4.png?alt=media&token=8210db73-6405-4665-8b7c-92f777bfcf52";
        Glide.with(getApplicationContext()).load(url4).into(imageWelcomeAndroidStudio4);

        ZoomInImageView imageWelcomeAndroidStudio5 = findViewById(R.id.imageWelcomeAndroidStudio5);
        String url5 = "https://firebasestorage.googleapis.com/v0/b/android-app-5b365.appspot.com/o/Android%2FAndroidStudio%2F5.png?alt=media&token=d7e38466-cca5-4b0e-80ec-0589bb67ae46";
        Glide.with(getApplicationContext()).load(url5).into(imageWelcomeAndroidStudio5);

        ZoomInImageView imageWelcomeAndroidStudio6 = findViewById(R.id.imageWelcomeAndroidStudio6);
        String url6 = "https://firebasestorage.googleapis.com/v0/b/android-app-5b365.appspot.com/o/Android%2FAndroidStudio%2F6.png?alt=media&token=4fbd3010-3e0e-49ce-b71d-42646df1f790";
        Glide.with(getApplicationContext()).load(url6).into(imageWelcomeAndroidStudio6);

        ZoomInImageView imageWelcomeAndroidStudio7 = findViewById(R.id.imageWelcomeAndroidStudio7);
        String url7 = "https://firebasestorage.googleapis.com/v0/b/android-app-5b365.appspot.com/o/Android%2FAndroidStudio%2F7.png?alt=media&token=b4100140-2a6f-40fd-9471-1c3873c49344";
        Glide.with(getApplicationContext()).load(url7).into(imageWelcomeAndroidStudio7);

        ZoomInImageView imageWelcomeAndroidStudio8 = findViewById(R.id.imageWelcomeAndroidStudio8);
        String url8 = "https://firebasestorage.googleapis.com/v0/b/android-app-5b365.appspot.com/o/Android%2FAndroidStudio%2F8.png?alt=media&token=068e79b8-b883-4d69-a5a8-fc83af856b4d";
        Glide.with(getApplicationContext()).load(url8).into(imageWelcomeAndroidStudio8);

        ZoomInImageView imageWelcomeAndroidStudio9 = findViewById(R.id.imageWelcomeAndroidStudio9);
        String url9 = "https://firebasestorage.googleapis.com/v0/b/android-app-5b365.appspot.com/o/Android%2FAndroidStudio%2F9.png?alt=media&token=b30ec0ef-ad34-4442-acac-bec3b3a55d33";
        Glide.with(getApplicationContext()).load(url9).into(imageWelcomeAndroidStudio9);

        ZoomInImageView imageWelcomeAndroidStudio10 = findViewById(R.id.imageWelcomeAndroidStudio10);
        String url10 = "https://firebasestorage.googleapis.com/v0/b/android-app-5b365.appspot.com/o/Android%2FAndroidStudio%2F10.png?alt=media&token=c0c30340-4777-4931-b85a-e0b87d73c6e6";
        Glide.with(getApplicationContext()).load(url10).into(imageWelcomeAndroidStudio10);

        ZoomInImageView imageWelcomeAndroidStudio11 = findViewById(R.id.imageWelcomeAndroidStudio11);
        String url11 = "https://firebasestorage.googleapis.com/v0/b/android-app-5b365.appspot.com/o/Android%2FAndroidStudio%2F11.png?alt=media&token=ac09a1f5-972d-4ca5-b0ec-6d5407c68365";
        Glide.with(getApplicationContext()).load(url11).into(imageWelcomeAndroidStudio11);
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