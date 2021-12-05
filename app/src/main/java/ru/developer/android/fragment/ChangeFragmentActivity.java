package ru.developer.android.fragment;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import com.bumptech.glide.Glide;
import com.zolad.zoominimageview.ZoomInImageView;

import ru.developer.android.R;
import ru.developer.android.fragment.runFragments.RunChangeFragmentActivity;
import ru.developer.android.fragment.runFragments.RunListFragmentActivity;

public class ChangeFragmentActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_change_fragment);

        ActionBar actionBar = this.getSupportActionBar();
        if (actionBar != null){
            actionBar.setDisplayHomeAsUpEnabled(true);
        }
        actionBar.setTitle("Change Fragment");

        ZoomInImageView imageXML = findViewById(R.id.imageXML);
        String url = "https://firebasestorage.googleapis.com/v0/b/android-app-5b365.appspot.com/o/Fragments%2Fchange%20fragment%2Factivity_xml.png?alt=media&token=5dc2c8f2-2be6-4b5f-81fb-a9d827018775";
        Glide.with(getApplicationContext()).load(url).into(imageXML);

        ZoomInImageView imageActivity = findViewById(R.id.imageActivity);
        String url2 = "https://firebasestorage.googleapis.com/v0/b/android-app-5b365.appspot.com/o/Fragments%2Fchange%20fragment%2FMainActivity.png?alt=media&token=4d0a590b-d1a1-4acc-aeb7-3409399ec17f";
        Glide.with(getApplicationContext()).load(url2).into(imageActivity);

        ZoomInImageView imageFragmentOneActivity = findViewById(R.id.imageFragmentOneActivity);
        String url3 = "https://firebasestorage.googleapis.com/v0/b/android-app-5b365.appspot.com/o/Fragments%2Fchange%20fragment%2FFragmentOne_activity.png?alt=media&token=e641e0fc-bd70-4cba-9009-2babc60e4527";
        Glide.with(getApplicationContext()).load(url3).into(imageFragmentOneActivity);

        ZoomInImageView imageFragmentTwoActivity = findViewById(R.id.imageFragmentTwoActivity);
        String url4 = "https://firebasestorage.googleapis.com/v0/b/android-app-5b365.appspot.com/o/Fragments%2Fchange%20fragment%2FFragmentTwo_activity.png?alt=media&token=850a00c4-c0ff-42f3-bce9-56b056897942";
        Glide.with(getApplicationContext()).load(url4).into(imageFragmentTwoActivity);

        ZoomInImageView imageFragmentOwoXml = findViewById(R.id.imageFragmentOwoXml);
        String url5 = "https://firebasestorage.googleapis.com/v0/b/android-app-5b365.appspot.com/o/Fragments%2Fchange%20fragment%2Fragment_one_xml.png?alt=media&token=8b2c799e-746f-4fe3-a9df-5e2dd694c702";
        Glide.with(getApplicationContext()).load(url5).into(imageFragmentOwoXml);

        ZoomInImageView imageFragmentTwoXml = findViewById(R.id.imageFragmentTwoXml);
        String url6 = "https://firebasestorage.googleapis.com/v0/b/android-app-5b365.appspot.com/o/Fragments%2Fchange%20fragment%2Fragment_two_xml.png?alt=media&token=cdd966de-2b49-457b-90db-2513c8aa0a12";
        Glide.with(getApplicationContext()).load(url6).into(imageFragmentTwoXml);
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
            Intent intent = new Intent(ChangeFragmentActivity.this, RunChangeFragmentActivity.class);startActivity(intent);
        }
        return super.onOptionsItemSelected(item);
    }
}