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
        String url = "";
        Glide.with(getApplicationContext()).load(url).into(imageThemesLess3_1);

        ZoomInImageView imageThemesLess3_2 = findViewById(R.id.imageThemesLess3_2);
        String url2 = "";
        Glide.with(getApplicationContext()).load(url2).into(imageThemesLess3_2);

        ZoomInImageView imageThemesLess3_3 = findViewById(R.id.imageThemesLess3_3);
        String url3 = "";
        Glide.with(getApplicationContext()).load(url3).into(imageThemesLess3_3);

        ZoomInImageView imageThemesLess3_4 = findViewById(R.id.imageThemesLess3_4);
        String url4 = "";
        Glide.with(getApplicationContext()).load(url4).into(imageThemesLess3_4);

        ZoomInImageView imageThemesLess3_5 = findViewById(R.id.imageThemesLess3_5);
        String url5 = "";
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