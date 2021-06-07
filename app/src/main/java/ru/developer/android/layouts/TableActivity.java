package ru.developer.android.layouts;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import ru.developer.android.R;

import android.os.Bundle;
import android.view.MenuItem;

import com.bumptech.glide.Glide;
import com.zolad.zoominimageview.ZoomInImageView;

public class TableActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_table);

        ActionBar actionBar = this.getSupportActionBar();
        if (actionBar != null){
            actionBar.setDisplayHomeAsUpEnabled(true);
        }
        actionBar.setTitle("TableLayout");

        ZoomInImageView imageTableActivity1 = findViewById(R.id.imageTableActivity1);
        String url = "https://firebasestorage.googleapis.com/v0/b/android-app-5b365.appspot.com/o/Layouts%2FTable%2F1.png?alt=media&token=98dbcc4a-937c-4afe-a0e6-553d61de0180";
        Glide.with(getApplicationContext()).load(url).into(imageTableActivity1);

        ZoomInImageView imageTableActivity2 = findViewById(R.id.imageTableActivity2);
        String url2 = "https://firebasestorage.googleapis.com/v0/b/android-app-5b365.appspot.com/o/Layouts%2FTable%2F2.jpg?alt=media&token=0d69d4da-cc3b-4771-b450-0bcc9fdada94";
        Glide.with(getApplicationContext()).load(url2).into(imageTableActivity2);

        ZoomInImageView imageTableActivity3 = findViewById(R.id.imageTableActivity3);
        String url3 = "https://firebasestorage.googleapis.com/v0/b/android-app-5b365.appspot.com/o/Layouts%2FTable%2F3.png?alt=media&token=50913c90-4743-4fa5-9d2d-66fd9f35e226";
        Glide.with(getApplicationContext()).load(url3).into(imageTableActivity3);

        ZoomInImageView imageTableActivity4 = findViewById(R.id.imageTableActivity4);
        String url4 = "https://firebasestorage.googleapis.com/v0/b/android-app-5b365.appspot.com/o/Layouts%2FTable%2F4.jpg?alt=media&token=205392bd-c918-4522-ac9f-78be2d8f07c2";
        Glide.with(getApplicationContext()).load(url4).into(imageTableActivity4);


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