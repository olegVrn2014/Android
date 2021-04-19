package ru.developer.android.widgets;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import ru.developer.android.R;
import ru.developer.android.runWidgets.RunAdapterViewFlipper;
import ru.developer.android.runWidgets.RunAlertDialog;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import com.bumptech.glide.Glide;
import com.zolad.zoominimageview.ZoomInImageView;

public class AdapterViewFlipperActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adapter_view_flipper);

        ActionBar actionBar = this.getSupportActionBar();
        if (actionBar != null){
            actionBar.setDisplayHomeAsUpEnabled(true);
        }
        actionBar.setTitle("Adapter ViewFlipper");

        ZoomInImageView imageXML = findViewById(R.id.imageXML);
        String url = "https://firebasestorage.googleapis.com/v0/b/android-app-5b365.appspot.com/o/Widgets%2FAdapter%20View%20Flipper%2FAdapter%20ViewFlipper%20ACTIVITY_MAIN_XML.png?alt=media&token=9c26c2bf-43b1-403e-b752-cf2e603ab02b";
        Glide.with(getApplicationContext()).load(url).into(imageXML);

        ZoomInImageView imageActivity = findViewById(R.id.imageActivity);
        String url2 = "https://firebasestorage.googleapis.com/v0/b/android-app-5b365.appspot.com/o/Widgets%2FAdapter%20View%20Flipper%2FAdapter%20ViewFlipper%20ACTIVITY_MAIN.png?alt=media&token=f5399012-a56c-485a-8b36-0b22dbbbae27";
        Glide.with(getApplicationContext()).load(url2).into(imageActivity);

        ZoomInImageView imageList_item_XML = findViewById(R.id.imageList_item_XML);
        String url3 = "https://firebasestorage.googleapis.com/v0/b/android-app-5b365.appspot.com/o/Widgets%2FAdapter%20View%20Flipper%2FAdapter%20ViewFlipper%20LIST_ITEM_XML.png?alt=media&token=f885170c-d276-42aa-9c0f-6785b86ac9f3";
        Glide.with(getApplicationContext()).load(url3).into(imageList_item_XML);

        ZoomInImageView imageAdapterActivity = findViewById(R.id.imageAdapterActivity);
        String url4 = "https://firebasestorage.googleapis.com/v0/b/android-app-5b365.appspot.com/o/Widgets%2FAdapter%20View%20Flipper%2FAdapter%20ViewFlipper%20ADAPTER_JAVA.png?alt=media&token=8f88ffda-3fb4-46d4-994a-6b0443a5ed9d";
        Glide.with(getApplicationContext()).load(url4).into(imageAdapterActivity);

        ZoomInImageView imageDrawableAdapterViewFlipper = findViewById(R.id.imageDrawableAdapterViewFlipper);
        String url5 = "https://firebasestorage.googleapis.com/v0/b/android-app-5b365.appspot.com/o/Widgets%2FAdapter%20View%20Flipper%2FAdapter%20ViewFlipper%20drawable.png?alt=media&token=4c47045d-7c23-491e-9fa7-52131cc3a482";
        Glide.with(getApplicationContext()).load(url5).into(imageDrawableAdapterViewFlipper);


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
            Intent intent = new Intent(AdapterViewFlipperActivity.this, RunAdapterViewFlipper.class);startActivity(intent);
        }
        return super.onOptionsItemSelected(item);
    }
}