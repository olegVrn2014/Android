package ru.developer.android.resource;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import ru.developer.android.R;

import android.os.Bundle;
import android.view.MenuItem;

import com.bumptech.glide.Glide;
import com.zolad.zoominimageview.ZoomInImageView;

public class Res3PrimLessons extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_res3_prim_lessons);

        ActionBar actionBar = this.getSupportActionBar();
        if (actionBar != null){
            actionBar.setDisplayHomeAsUpEnabled(true);
        }
        actionBar.setTitle("Применение ресурсов");

        ZoomInImageView imageResourcePrim1 = findViewById(R.id.imageResourcePrim1);
        String url = "https://firebasestorage.googleapis.com/v0/b/android-app-5b365.appspot.com/o/Resource%2FLesson3Prim%2F1.png?alt=media&token=6e2ef46e-64a3-4011-9446-273ec03ca412";
        Glide.with(getApplicationContext()).load(url).into(imageResourcePrim1);

        ZoomInImageView imageResourcePrim2 = findViewById(R.id.imageResourcePrim2);
        String url2 = "https://firebasestorage.googleapis.com/v0/b/android-app-5b365.appspot.com/o/Resource%2FLesson3Prim%2F2.png?alt=media&token=05606531-682b-4e45-8874-a971c6e699b9";
        Glide.with(getApplicationContext()).load(url2).into(imageResourcePrim2);

        ZoomInImageView imageResourcePrim3 = findViewById(R.id.imageResourcePrim3);
        String url3 = "https://firebasestorage.googleapis.com/v0/b/android-app-5b365.appspot.com/o/Resource%2FLesson3Prim%2F3.png?alt=media&token=3eb77bdd-5519-4e26-9dc2-f889713ef815";
        Glide.with(getApplicationContext()).load(url3).into(imageResourcePrim3);

        ZoomInImageView imageResourcePrim4 = findViewById(R.id.imageResourcePrim4);
        String url4 = "https://firebasestorage.googleapis.com/v0/b/android-app-5b365.appspot.com/o/Resource%2FLesson3Prim%2F4.png?alt=media&token=add3cafa-bcd8-4c6d-848b-fd6dfff88e2a";
        Glide.with(getApplicationContext()).load(url4).into(imageResourcePrim4);

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