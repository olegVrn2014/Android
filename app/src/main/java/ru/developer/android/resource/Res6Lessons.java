package ru.developer.android.resource;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import ru.developer.android.R;

import android.os.Bundle;
import android.view.MenuItem;

import com.bumptech.glide.Glide;
import com.zolad.zoominimageview.ZoomInImageView;

public class Res6Lessons extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_res6_lessons);

        ActionBar actionBar = this.getSupportActionBar();
        if (actionBar != null){
            actionBar.setDisplayHomeAsUpEnabled(true);
        }
        actionBar.setTitle("Ресурсы строк");

        ZoomInImageView imageResourceLesson6_1 = findViewById(R.id.imageResourceLesson6_1);
        String url = "https://firebasestorage.googleapis.com/v0/b/android-app-5b365.appspot.com/o/Resource%2FLesson6%2F1.png?alt=media&token=a7f237e1-9631-4a8b-8e8c-e3cf82f9ecb8";
        Glide.with(getApplicationContext()).load(url).into(imageResourceLesson6_1);

        ZoomInImageView imageResourceLesson6_2 = findViewById(R.id.imageResourceLesson6_2);
        String url2 = "https://firebasestorage.googleapis.com/v0/b/android-app-5b365.appspot.com/o/Resource%2FLesson6%2F2.png?alt=media&token=d234672e-e085-4f11-a88d-5c3309b951ad";
        Glide.with(getApplicationContext()).load(url2).into(imageResourceLesson6_2);

        ZoomInImageView imageResourceLesson6_3 = findViewById(R.id.imageResourceLesson6_3);
        String url3 = "https://firebasestorage.googleapis.com/v0/b/android-app-5b365.appspot.com/o/Resource%2FLesson6%2F3.png?alt=media&token=02fc0a9d-4cd1-48c1-ab01-f0fadf7ff7ad";
        Glide.with(getApplicationContext()).load(url3).into(imageResourceLesson6_3);

        ZoomInImageView imageResourceLesson6_4 = findViewById(R.id.imageResourceLesson6_4);
        String url4 = "https://firebasestorage.googleapis.com/v0/b/android-app-5b365.appspot.com/o/Resource%2FLesson6%2F4.png?alt=media&token=7936e556-88d6-467d-992c-7a3027d6d7d0";
        Glide.with(getApplicationContext()).load(url4).into(imageResourceLesson6_4);

        ZoomInImageView imageResourceLesson6_5 = findViewById(R.id.imageResourceLesson6_5);
        String url5 = "https://firebasestorage.googleapis.com/v0/b/android-app-5b365.appspot.com/o/Resource%2FLesson6%2F5.png?alt=media&token=ef85a32b-3bff-4ee8-9281-facfe301d379";
        Glide.with(getApplicationContext()).load(url5).into(imageResourceLesson6_5);

        ZoomInImageView imageResourceLesson6_6 = findViewById(R.id.imageResourceLesson6_6);
        String url6 = "https://firebasestorage.googleapis.com/v0/b/android-app-5b365.appspot.com/o/Resource%2FLesson6%2F6.png?alt=media&token=b6f98050-8ec9-4187-98f0-30257b10c630";
        Glide.with(getApplicationContext()).load(url6).into(imageResourceLesson6_6);

        ZoomInImageView imageResourceLesson6_7 = findViewById(R.id.imageResourceLesson6_7);
        String url7 = "https://firebasestorage.googleapis.com/v0/b/android-app-5b365.appspot.com/o/Resource%2FLesson6%2F7.png?alt=media&token=22b47469-7ea2-4ec9-8517-801345317957";
        Glide.with(getApplicationContext()).load(url7).into(imageResourceLesson6_7);

        ZoomInImageView imageResourceLesson6_8 = findViewById(R.id.imageResourceLesson6_8);
        String url8 = "https://firebasestorage.googleapis.com/v0/b/android-app-5b365.appspot.com/o/Resource%2FLesson6%2F8.jpg?alt=media&token=97c62e1f-2cfd-487a-a60e-38edf51d5ce1";
        Glide.with(getApplicationContext()).load(url8).into(imageResourceLesson6_8);

        ZoomInImageView imageResourceLesson6_9 = findViewById(R.id.imageResourceLesson6_9);
        String url9 = "https://firebasestorage.googleapis.com/v0/b/android-app-5b365.appspot.com/o/Resource%2FLesson6%2F9.png?alt=media&token=b4936c40-ba77-4e09-accb-81a1320c07eb";
        Glide.with(getApplicationContext()).load(url9).into(imageResourceLesson6_9);

        ZoomInImageView imageResourceLesson6_10 = findViewById(R.id.imageResourceLesson6_10);
        String url10 = "https://firebasestorage.googleapis.com/v0/b/android-app-5b365.appspot.com/o/Resource%2FLesson6%2F10.jpg?alt=media&token=010b4546-3bd8-4795-b791-7fb6fb725bd3";
        Glide.with(getApplicationContext()).load(url10).into(imageResourceLesson6_10);

        ZoomInImageView imageResourceLesson6_11 = findViewById(R.id.imageResourceLesson6_11);
        String url11 = "https://firebasestorage.googleapis.com/v0/b/android-app-5b365.appspot.com/o/Resource%2FLesson6%2F11.png?alt=media&token=d804d2f2-e90b-4f4d-8af3-e3df1c685f1a";
        Glide.with(getApplicationContext()).load(url11).into(imageResourceLesson6_11);

        ZoomInImageView imageResourceLesson6_12 = findViewById(R.id.imageResourceLesson6_12);
        String url12 = "https://firebasestorage.googleapis.com/v0/b/android-app-5b365.appspot.com/o/Resource%2FLesson6%2F12.png?alt=media&token=c72c7823-103b-43fe-adb9-abf82358621f";
        Glide.with(getApplicationContext()).load(url12).into(imageResourceLesson6_12);

        ZoomInImageView imageResourceLesson6_13 = findViewById(R.id.imageResourceLesson6_13);
        String url13 = "https://firebasestorage.googleapis.com/v0/b/android-app-5b365.appspot.com/o/Resource%2FLesson6%2F13.png?alt=media&token=49e5424a-40d7-4d75-8601-8a07bc738834";
        Glide.with(getApplicationContext()).load(url13).into(imageResourceLesson6_13);

        ZoomInImageView imageResourceLesson6_14 = findViewById(R.id.imageResourceLesson6_14);
        String url14 = "https://firebasestorage.googleapis.com/v0/b/android-app-5b365.appspot.com/o/Resource%2FLesson6%2F14.png?alt=media&token=e81b842d-bc96-4fc9-afb7-76cd4bef6d76";
        Glide.with(getApplicationContext()).load(url14).into(imageResourceLesson6_14);

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