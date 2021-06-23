package ru.developer.android.styles_themes;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import ru.developer.android.R;

import android.os.Bundle;
import android.view.MenuItem;

import com.bumptech.glide.Glide;
import com.zolad.zoominimageview.ZoomInImageView;

public class ThemesLess4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_themes_less4);

        ActionBar actionBar = this.getSupportActionBar();
        if (actionBar != null){
            actionBar.setDisplayHomeAsUpEnabled(true);
        }
        actionBar.setTitle("Применение темы");

        ZoomInImageView imageThemesLess4_1 = findViewById(R.id.imageThemesLess4_1);
        String url = "https://firebasestorage.googleapis.com/v0/b/android-app-5b365.appspot.com/o/Styles_Themes%2FThemes4%2F1.png?alt=media&token=6a7afcea-2158-4934-84af-1d647506328a";
        Glide.with(getApplicationContext()).load(url).into(imageThemesLess4_1);

        ZoomInImageView imageThemesLess4_2 = findViewById(R.id.imageThemesLess4_2);
        String url2 = "https://firebasestorage.googleapis.com/v0/b/android-app-5b365.appspot.com/o/Styles_Themes%2FThemes4%2F2.png?alt=media&token=f6dc95a4-4470-4cb9-bb8f-69732934b5d2";
        Glide.with(getApplicationContext()).load(url2).into(imageThemesLess4_2);

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