package ru.developer.android.layouts;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import ru.developer.android.R;

import android.os.Bundle;
import android.view.MenuItem;

import com.bumptech.glide.Glide;
import com.zolad.zoominimageview.ZoomInImageView;

public class ScrollViewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scroll_view);

        ActionBar actionBar = this.getSupportActionBar();
        if (actionBar != null){
            actionBar.setDisplayHomeAsUpEnabled(true);
        }
        actionBar.setTitle("ScrollView");

        ZoomInImageView imageScroll1 = findViewById(R.id.imageScroll1);
        String url = "https://firebasestorage.googleapis.com/v0/b/android-app-5b365.appspot.com/o/Layouts%2FScrollView%2F1.png?alt=media&token=062be795-80fd-4e11-b6b8-bbe14ee83bf8";
        Glide.with(getApplicationContext()).load(url).into(imageScroll1);

        ZoomInImageView imageScroll2 = findViewById(R.id.imageScroll2);
        String url2 = "https://firebasestorage.googleapis.com/v0/b/android-app-5b365.appspot.com/o/Layouts%2FScrollView%2F2.jpg?alt=media&token=f40cc467-ff0d-470c-b90b-732c708df27c";
        Glide.with(getApplicationContext()).load(url2).into(imageScroll2);
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