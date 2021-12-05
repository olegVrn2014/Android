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
import ru.developer.android.fragment.runFragments.RunDisplayListOnDialogActivity;
import ru.developer.android.fragment.runFragments.RunPassDataBetweenActivity;

public class DisplayListOnDialogActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_list_on_dialog);

        ActionBar actionBar = this.getSupportActionBar();
        if (actionBar != null){
            actionBar.setDisplayHomeAsUpEnabled(true);
        }
        actionBar.setTitle("Display List On Dialog");

        ZoomInImageView imageXML = findViewById(R.id.imageXML);
        String url = "https://firebasestorage.googleapis.com/v0/b/android-app-5b365.appspot.com/o/Fragments%2Fdisplay%20list%20onDialog%2Factivity_xml.png?alt=media&token=465797dd-5c85-4419-9730-22226c274ad1";
        Glide.with(getApplicationContext()).load(url).into(imageXML);

        ZoomInImageView imageActivity = findViewById(R.id.imageActivity);
        String url2 = "https://firebasestorage.googleapis.com/v0/b/android-app-5b365.appspot.com/o/Fragments%2Fdisplay%20list%20onDialog%2FMain_Activity.png?alt=media&token=6705e5fb-d278-4029-8d3c-31fdfe4996c2";
        Glide.with(getApplicationContext()).load(url2).into(imageActivity);

        ZoomInImageView imageMyDisplayOnFragment = findViewById(R.id.imageMyDisplayOnFragment);
        String url3 = "https://firebasestorage.googleapis.com/v0/b/android-app-5b365.appspot.com/o/Fragments%2Fdisplay%20list%20onDialog%2FMyDiasplayOnFragment.png?alt=media&token=c7ba5100-c258-4fd5-9bce-c78cc99d8785";
        Glide.with(getApplicationContext()).load(url3).into(imageMyDisplayOnFragment);

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
            Intent intent = new Intent(DisplayListOnDialogActivity.this, RunDisplayListOnDialogActivity.class);startActivity(intent);
        }
        return super.onOptionsItemSelected(item);
    }
}