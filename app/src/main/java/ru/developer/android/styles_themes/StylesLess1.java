package ru.developer.android.styles_themes;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import ru.developer.android.R;

import android.os.Bundle;
import android.view.MenuItem;

import com.bumptech.glide.Glide;
import com.zolad.zoominimageview.ZoomInImageView;

public class StylesLess1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_styles_less1);

        ActionBar actionBar = this.getSupportActionBar();
        if (actionBar != null){
            actionBar.setDisplayHomeAsUpEnabled(true);
        }
        actionBar.setTitle("Стили");

        ZoomInImageView imageStylesLess1_1 = findViewById(R.id.imageStylesLess1_1);
        String url = "https://firebasestorage.googleapis.com/v0/b/android-app-5b365.appspot.com/o/Styles_Themes%2F1.png?alt=media&token=3c6175c7-8f09-4286-8650-140b358271e0";
        Glide.with(getApplicationContext()).load(url).into(imageStylesLess1_1);

        ZoomInImageView imageStylesLess1_2 = findViewById(R.id.imageStylesLess1_2);
        String url2 = "https://firebasestorage.googleapis.com/v0/b/android-app-5b365.appspot.com/o/Styles_Themes%2F2.jpg?alt=media&token=9838b766-0455-4202-963e-47fe9bb6867d";
        Glide.with(getApplicationContext()).load(url2).into(imageStylesLess1_2);

        ZoomInImageView imageStylesLess1_3 = findViewById(R.id.imageStylesLess1_3);
        String url3 = "https://firebasestorage.googleapis.com/v0/b/android-app-5b365.appspot.com/o/Styles_Themes%2F3.png?alt=media&token=d737b017-6f78-488b-811d-b9a4872f453d";
        Glide.with(getApplicationContext()).load(url3).into(imageStylesLess1_3);

        ZoomInImageView imageStylesLess1_4 = findViewById(R.id.imageStylesLess1_4);
        String url4 = "https://firebasestorage.googleapis.com/v0/b/android-app-5b365.appspot.com/o/Styles_Themes%2F4.png?alt=media&token=d24b4eba-57c6-4f78-a8bb-f6244733c6eb";
        Glide.with(getApplicationContext()).load(url4).into(imageStylesLess1_4);

        ZoomInImageView imageStylesLess1_5 = findViewById(R.id.imageStylesLess1_5);
        String url5 = "https://firebasestorage.googleapis.com/v0/b/android-app-5b365.appspot.com/o/Styles_Themes%2F5.png?alt=media&token=32402ce2-1d43-496f-93bc-3a15425529e8";
        Glide.with(getApplicationContext()).load(url5).into(imageStylesLess1_5);
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