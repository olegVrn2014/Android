package ru.developer.android.styles_themes;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import ru.developer.android.R;

import android.os.Bundle;
import android.view.MenuItem;

import com.bumptech.glide.Glide;
import com.zolad.zoominimageview.ZoomInImageView;

public class ThemesLess2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_themes_less2);

        ActionBar actionBar = this.getSupportActionBar();
        if (actionBar != null){
            actionBar.setDisplayHomeAsUpEnabled(true);
        }
        actionBar.setTitle("Темы");

        ZoomInImageView imageThemesLess2_1 = findViewById(R.id.imageThemesLess2_1);
        String url = "https://firebasestorage.googleapis.com/v0/b/android-app-5b365.appspot.com/o/Styles_Themes%2FThemes2%2F1.png?alt=media&token=82c3de00-e7ff-43af-baa8-e7e213254a1a";
        Glide.with(getApplicationContext()).load(url).into(imageThemesLess2_1);

        ZoomInImageView imageThemesLess2_2 = findViewById(R.id.imageThemesLess2_2);
        String url2 = "https://firebasestorage.googleapis.com/v0/b/android-app-5b365.appspot.com/o/Styles_Themes%2FThemes2%2F2.png?alt=media&token=a160d503-c1b5-400f-aceb-2ed3fe5836fa";
        Glide.with(getApplicationContext()).load(url2).into(imageThemesLess2_2);

        ZoomInImageView imageThemesLess2_3 = findViewById(R.id.imageThemesLess2_3);
        String url3 = "https://firebasestorage.googleapis.com/v0/b/android-app-5b365.appspot.com/o/Styles_Themes%2FThemes2%2F3.png?alt=media&token=09ea2a41-1518-41e9-8d40-ba75995920c1";
        Glide.with(getApplicationContext()).load(url3).into(imageThemesLess2_3);

        ZoomInImageView imageThemesLess2_4 = findViewById(R.id.imageThemesLess2_4);
        String url4 = "https://firebasestorage.googleapis.com/v0/b/android-app-5b365.appspot.com/o/Styles_Themes%2FThemes2%2F4.png?alt=media&token=0d2e8698-a561-40c6-9750-4e089adbef11";
        Glide.with(getApplicationContext()).load(url4).into(imageThemesLess2_4);

        ZoomInImageView imageThemesLess2_5 = findViewById(R.id.imageThemesLess2_5);
        String url5 = "https://firebasestorage.googleapis.com/v0/b/android-app-5b365.appspot.com/o/Styles_Themes%2FThemes2%2F5.png?alt=media&token=ae829a92-cce0-44c1-a3c8-d20c04534f4d";
        Glide.with(getApplicationContext()).load(url5).into(imageThemesLess2_5);

        ZoomInImageView imageThemesLess2_6 = findViewById(R.id.imageThemesLess2_6);
        String url6 = "https://firebasestorage.googleapis.com/v0/b/android-app-5b365.appspot.com/o/Styles_Themes%2FThemes2%2F6.jpg?alt=media&token=77a58409-89b1-4175-86cb-128d0e42daa1";
        Glide.with(getApplicationContext()).load(url6).into(imageThemesLess2_6);


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