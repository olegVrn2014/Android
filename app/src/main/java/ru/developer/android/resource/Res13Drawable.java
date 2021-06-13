package ru.developer.android.resource;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import ru.developer.android.R;

import android.os.Bundle;
import android.view.MenuItem;

import com.bumptech.glide.Glide;
import com.zolad.zoominimageview.ZoomInImageView;

public class Res13Drawable extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_res13_drawable);

        ActionBar actionBar = this.getSupportActionBar();
        if (actionBar != null){
            actionBar.setDisplayHomeAsUpEnabled(true);
        }
        actionBar.setTitle("Ресурсы изображений");

        ZoomInImageView imageResourceLesson13_1 = findViewById(R.id.imageResourceLesson13_1);
        String url = "https://firebasestorage.googleapis.com/v0/b/android-app-5b365.appspot.com/o/Resource%2FLess13%2F1.png?alt=media&token=310627f4-c452-491e-b53a-a05a14f0432c";
        Glide.with(getApplicationContext()).load(url).into(imageResourceLesson13_1);

        ZoomInImageView imageResourceLesson13_2 = findViewById(R.id.imageResourceLesson13_2);
        String url2 = "https://firebasestorage.googleapis.com/v0/b/android-app-5b365.appspot.com/o/Resource%2FLess13%2F2.png?alt=media&token=448fa873-4257-49c2-aeb7-a1d23f27a279";
        Glide.with(getApplicationContext()).load(url2).into(imageResourceLesson13_2);

        ZoomInImageView imageResourceLesson13_3 = findViewById(R.id.imageResourceLesson13_3);
        String url3 = "https://firebasestorage.googleapis.com/v0/b/android-app-5b365.appspot.com/o/Resource%2FLess13%2F3.png?alt=media&token=00f09872-9acc-4e98-a43a-c3251ba4f210";
        Glide.with(getApplicationContext()).load(url3).into(imageResourceLesson13_3);

        ZoomInImageView imageResourceLesson13_4 = findViewById(R.id.imageResourceLesson13_4);
        String url4 = "https://firebasestorage.googleapis.com/v0/b/android-app-5b365.appspot.com/o/Resource%2FLess13%2F4.png?alt=media&token=6d0f900a-279f-48cc-8f90-73da9891d4d9";
        Glide.with(getApplicationContext()).load(url4).into(imageResourceLesson13_4);

        ZoomInImageView imageResourceLesson13_5 = findViewById(R.id.imageResourceLesson13_5);
        String url5 = "https://firebasestorage.googleapis.com/v0/b/android-app-5b365.appspot.com/o/Resource%2FLess13%2F5.png?alt=media&token=a3592117-bbb5-4773-adc2-de7139e98e18";
        Glide.with(getApplicationContext()).load(url5).into(imageResourceLesson13_5);

        ZoomInImageView imageResourceLesson13_6 = findViewById(R.id.imageResourceLesson13_6);
        String url6 = "https://firebasestorage.googleapis.com/v0/b/android-app-5b365.appspot.com/o/Resource%2FLess13%2F6.png?alt=media&token=445f4eb4-2859-40e2-a5cc-82caed5fd54b";
        Glide.with(getApplicationContext()).load(url6).into(imageResourceLesson13_6);

        ZoomInImageView imageResourceLesson13_7 = findViewById(R.id.imageResourceLesson13_7);
        String url7 = "https://firebasestorage.googleapis.com/v0/b/android-app-5b365.appspot.com/o/Resource%2FLess13%2F7.png?alt=media&token=075d9727-dae7-4b84-9f1f-f3f7ebfea896";
        Glide.with(getApplicationContext()).load(url7).into(imageResourceLesson13_7);

        ZoomInImageView imageResourceLesson13_8 = findViewById(R.id.imageResourceLesson13_8);
        String url8 = "https://firebasestorage.googleapis.com/v0/b/android-app-5b365.appspot.com/o/Resource%2FLess13%2F8.jpg?alt=media&token=3d32d72f-3e76-47cd-aaff-c8e7f2c7c851";
        Glide.with(getApplicationContext()).load(url8).into(imageResourceLesson13_8);

        ZoomInImageView imageResourceLesson13_9 = findViewById(R.id.imageResourceLesson13_9);
        String url9 = "https://firebasestorage.googleapis.com/v0/b/android-app-5b365.appspot.com/o/Resource%2FLess13%2F9.png?alt=media&token=688d0e10-2335-4f05-af6d-3ddf68e723d2";
        Glide.with(getApplicationContext()).load(url9).into(imageResourceLesson13_9);

        ZoomInImageView imageResourceLesson13_10 = findViewById(R.id.imageResourceLesson13_10);
        String url10 = "https://firebasestorage.googleapis.com/v0/b/android-app-5b365.appspot.com/o/Resource%2FLess13%2F10.png?alt=media&token=22e7571c-a8b2-4a5d-bf7e-b9db023cb722";
        Glide.with(getApplicationContext()).load(url10).into(imageResourceLesson13_10);

        ZoomInImageView imageResourceLesson13_11 = findViewById(R.id.imageResourceLesson13_11);
        String url11 = "https://firebasestorage.googleapis.com/v0/b/android-app-5b365.appspot.com/o/Resource%2FLess13%2F11.png?alt=media&token=ba8415d4-7e84-4ebd-8b16-de738fcea050";
        Glide.with(getApplicationContext()).load(url11).into(imageResourceLesson13_11);

        ZoomInImageView imageResourceLesson13_12 = findViewById(R.id.imageResourceLesson13_12);
        String url12 = "https://firebasestorage.googleapis.com/v0/b/android-app-5b365.appspot.com/o/Resource%2FLess13%2F12.png?alt=media&token=57bfc0ce-1df7-4d0f-8bf8-f7f739ae74d2";
        Glide.with(getApplicationContext()).load(url12).into(imageResourceLesson13_12);

        ZoomInImageView imageResourceLesson13_13 = findViewById(R.id.imageResourceLesson13_13);
        String url13 = "https://firebasestorage.googleapis.com/v0/b/android-app-5b365.appspot.com/o/Resource%2FLess13%2F12.png?alt=media&token=57bfc0ce-1df7-4d0f-8bf8-f7f739ae74d2";
        Glide.with(getApplicationContext()).load(url13).into(imageResourceLesson13_13);
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