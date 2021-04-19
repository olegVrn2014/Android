package ru.developer.android.toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import ru.developer.android.R;
import ru.developer.android.toast.runToast.RunPositionToast;
import ru.developer.android.toast.runToast.RunSimpleToast;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import com.bumptech.glide.Glide;
import com.zolad.zoominimageview.ZoomInImageView;

public class PositionToastActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_position_toast);

        ActionBar actionBar = this.getSupportActionBar();
        if (actionBar != null){
            actionBar.setDisplayHomeAsUpEnabled(true);
        }
        actionBar.setTitle("Positioning Toast");

        ZoomInImageView imageXML = findViewById(R.id.imageXML);
        String url = "https://firebasestorage.googleapis.com/v0/b/android-app-5b365.appspot.com/o/Toast%2FPositioningToast%2FPositionongToast%20xml.png?alt=media&token=94589a10-eafa-4a4d-bdd5-6797a7c5a1bf";
        Glide.with(getApplicationContext()).load(url).into(imageXML);

        ZoomInImageView imageActivity = findViewById(R.id.imageActivity);
        String url2 = "https://firebasestorage.googleapis.com/v0/b/android-app-5b365.appspot.com/o/Toast%2FPositioningToast%2FPositionongToast%201%20563.png?alt=media&token=73aef0ed-def6-40f9-90f8-17168907cd90";
        Glide.with(getApplicationContext()).load(url2).into(imageActivity);

        ZoomInImageView imageActivity2 = findViewById(R.id.imageActivity2);
        String url3 = "https://firebasestorage.googleapis.com/v0/b/android-app-5b365.appspot.com/o/Toast%2FPositioningToast%2FPositionongToast%202%20563.png?alt=media&token=528993ab-c28a-48fa-83b4-144b9247d751";
        Glide.with(getApplicationContext()).load(url3).into(imageActivity2);



    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.run_menu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();
        if (id == android.R.id.home){
            finish();
            return true;
        }else{
            Intent intent = new Intent(PositionToastActivity.this, RunPositionToast.class);startActivity(intent);
        }
        return super.onOptionsItemSelected(item);
    }
}
