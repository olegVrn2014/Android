package ru.developer.android.layouts;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import ru.developer.android.R;

import android.os.Bundle;
import android.view.MenuItem;

import com.bumptech.glide.Glide;
import com.zolad.zoominimageview.ZoomInImageView;

public class GridActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid);

        ActionBar actionBar = this.getSupportActionBar();
        if (actionBar != null){
            actionBar.setDisplayHomeAsUpEnabled(true);
        }
        actionBar.setTitle("GridLayout");

        ZoomInImageView imageGridActivity1 = findViewById(R.id.imageGridActivity1);
        String url = "https://firebasestorage.googleapis.com/v0/b/android-app-5b365.appspot.com/o/Layouts%2FGrid%2F1.png?alt=media&token=62335f88-9baa-4b31-9c89-a4d38b367bd8";
        Glide.with(getApplicationContext()).load(url).into(imageGridActivity1);

        ZoomInImageView imageGridActivity2 = findViewById(R.id.imageGridActivity2);
        String url2 = "https://firebasestorage.googleapis.com/v0/b/android-app-5b365.appspot.com/o/Layouts%2FGrid%2F2.jpg?alt=media&token=b2875ced-dd9b-49dd-a1b6-f3276b9337ad";
        Glide.with(getApplicationContext()).load(url2).into(imageGridActivity2);

        ZoomInImageView imageGridActivity3 = findViewById(R.id.imageGridActivity3);
        String url3 = "https://firebasestorage.googleapis.com/v0/b/android-app-5b365.appspot.com/o/Layouts%2FGrid%2F3.png?alt=media&token=e7fdc348-e884-4a60-b5c1-d88c59cbd91e";
        Glide.with(getApplicationContext()).load(url3).into(imageGridActivity3);

        ZoomInImageView imageGridActivity4 = findViewById(R.id.imageGridActivity4);
        String url4 = "https://firebasestorage.googleapis.com/v0/b/android-app-5b365.appspot.com/o/Layouts%2FGrid%2F4.jpg?alt=media&token=40773f70-163b-4ec3-893e-bd0af1412512";
        Glide.with(getApplicationContext()).load(url4).into(imageGridActivity4);


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