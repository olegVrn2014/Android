package ru.developer.android.layouts;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import ru.developer.android.R;

import android.os.Bundle;
import android.view.MenuItem;

import com.bumptech.glide.Glide;
import com.zolad.zoominimageview.ZoomInImageView;

public class ConstraintActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_constraint);

        ActionBar actionBar = this.getSupportActionBar();
        if (actionBar != null){
            actionBar.setDisplayHomeAsUpEnabled(true);
        }
        actionBar.setTitle("ConstraintLayout");

        ZoomInImageView imageConstraintActivity1 = findViewById(R.id.imageConstraintActivity1);
        String url = "https://firebasestorage.googleapis.com/v0/b/android-app-5b365.appspot.com/o/Layouts%2FConstraintLayout%2F1.png?alt=media&token=e5d436f1-f290-4d9b-8fe7-b53f2f1128f3";
        Glide.with(getApplicationContext()).load(url).into(imageConstraintActivity1);

        ZoomInImageView imageConstraintActivity2 = findViewById(R.id.imageConstraintActivity2);
        String url2 = "https://firebasestorage.googleapis.com/v0/b/android-app-5b365.appspot.com/o/Layouts%2FConstraintLayout%2F2.png?alt=media&token=d7083479-a69b-438f-959a-29883353bfba";
        Glide.with(getApplicationContext()).load(url2).into(imageConstraintActivity2);

        ZoomInImageView imageConstraintActivity3 = findViewById(R.id.imageConstraintActivity3);
        String url3 = "https://firebasestorage.googleapis.com/v0/b/android-app-5b365.appspot.com/o/Layouts%2FConstraintLayout%2F3.png?alt=media&token=a40f1040-9c84-43bb-9322-00d68aecfb92";
        Glide.with(getApplicationContext()).load(url3).into(imageConstraintActivity3);

        ZoomInImageView imageConstraintActivity4 = findViewById(R.id.imageConstraintActivity4);
        String url4 = "https://firebasestorage.googleapis.com/v0/b/android-app-5b365.appspot.com/o/Layouts%2FConstraintLayout%2F4.png?alt=media&token=87375660-f232-4b0f-82b1-a58f5cadffa8";
        Glide.with(getApplicationContext()).load(url4).into(imageConstraintActivity4);

        ZoomInImageView imageConstraintActivity5 = findViewById(R.id.imageConstraintActivity5);
        String url5 = "https://firebasestorage.googleapis.com/v0/b/android-app-5b365.appspot.com/o/Layouts%2FConstraintLayout%2F5.jpg?alt=media&token=629570df-88a7-406f-8a8a-28d5bb137fd1";
        Glide.with(getApplicationContext()).load(url5).into(imageConstraintActivity5);


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
