package ru.developer.android.styles_themes;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import ru.developer.android.R;

import android.os.Bundle;
import android.view.MenuItem;

import com.bumptech.glide.Glide;
import com.zolad.zoominimageview.ZoomInImageView;

public class ThemesLess3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_themes_less3);

        ActionBar actionBar = this.getSupportActionBar();
        if (actionBar != null){
            actionBar.setDisplayHomeAsUpEnabled(true);
        }
        actionBar.setTitle("Создание своей темы");

        ZoomInImageView imageThemesLess3_1 = findViewById(R.id.imageThemesLess3_1);
        String url = "https://firebasestorage.googleapis.com/v0/b/android-app-5b365.appspot.com/o/Styles_Themes%2FThemes3%2F1.png?alt=media&token=3bd242b6-4fbb-40db-8003-c566cc83ecca";
        Glide.with(getApplicationContext()).load(url).into(imageThemesLess3_1);

        ZoomInImageView imageThemesLess3_2 = findViewById(R.id.imageThemesLess3_2);
        String url2 = "https://firebasestorage.googleapis.com/v0/b/android-app-5b365.appspot.com/o/Styles_Themes%2FThemes3%2F2.png?alt=media&token=931aa1e5-c0df-43de-8c77-fc90728e1789";
        Glide.with(getApplicationContext()).load(url2).into(imageThemesLess3_2);

        ZoomInImageView imageThemesLess3_3 = findViewById(R.id.imageThemesLess3_3);
        String url3 = "https://firebasestorage.googleapis.com/v0/b/android-app-5b365.appspot.com/o/Styles_Themes%2FThemes3%2F3.png?alt=media&token=e02043f4-b897-4d16-87ef-a4ec7b6b54c5";
        Glide.with(getApplicationContext()).load(url3).into(imageThemesLess3_3);

        ZoomInImageView imageThemesLess3_4 = findViewById(R.id.imageThemesLess3_4);
        String url4 = "https://firebasestorage.googleapis.com/v0/b/android-app-5b365.appspot.com/o/Styles_Themes%2FThemes3%2F4.png?alt=media&token=a0297d08-db48-4e76-977f-3a33f3e5a456";
        Glide.with(getApplicationContext()).load(url4).into(imageThemesLess3_4);

        ZoomInImageView imageThemesLess3_5 = findViewById(R.id.imageThemesLess3_5);
        String url5 = "https://firebasestorage.googleapis.com/v0/b/android-app-5b365.appspot.com/o/Styles_Themes%2FThemes3%2F5.jpg?alt=media&token=3f97646b-ccdf-416e-8bb7-0543cf1bc796";
        Glide.with(getApplicationContext()).load(url5).into(imageThemesLess3_5);

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