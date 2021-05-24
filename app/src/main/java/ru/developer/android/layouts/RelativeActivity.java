package ru.developer.android.layouts;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import ru.developer.android.R;

import android.os.Bundle;
import android.view.MenuItem;

import com.bumptech.glide.Glide;
import com.zolad.zoominimageview.ZoomInImageView;

public class RelativeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_relative);

        ActionBar actionBar = this.getSupportActionBar();
        if (actionBar != null){
            actionBar.setDisplayHomeAsUpEnabled(true);
        }
        actionBar.setTitle("RelativeLayout");

        ZoomInImageView imageRelativeActivity1 = findViewById(R.id.imageRelativeActivity1);
        String url = "https://firebasestorage.googleapis.com/v0/b/android-app-5b365.appspot.com/o/Layouts%2FRelative%2F1.png?alt=media&token=5a5e6738-f295-4aca-8a45-ab44b5d01abc";
        Glide.with(getApplicationContext()).load(url).into(imageRelativeActivity1);

        ZoomInImageView imageRelativeActivity2 = findViewById(R.id.imageRelativeActivity2);
        String url2 = "https://firebasestorage.googleapis.com/v0/b/android-app-5b365.appspot.com/o/Layouts%2FRelative%2F2.jpg?alt=media&token=c08ba3ec-6a86-4fad-9ffa-9a239e6ef58b";
        Glide.with(getApplicationContext()).load(url2).into(imageRelativeActivity2);

        ZoomInImageView imageRelativeActivity3 = findViewById(R.id.imageRelativeActivity3);
        String url3 = "https://firebasestorage.googleapis.com/v0/b/android-app-5b365.appspot.com/o/Layouts%2FRelative%2F3.png?alt=media&token=5f855b5d-90c4-4175-ad66-a786f028ed29";
        Glide.with(getApplicationContext()).load(url3).into(imageRelativeActivity3);

        ZoomInImageView imageRelativeActivity4 = findViewById(R.id.imageRelativeActivity4);
        String url4 = "https://firebasestorage.googleapis.com/v0/b/android-app-5b365.appspot.com/o/Layouts%2FRelative%2F4.jpg?alt=media&token=bd5aef85-aa97-41fc-aaf2-bfc571269ac0";
        Glide.with(getApplicationContext()).load(url4).into(imageRelativeActivity4);


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