
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
import ru.developer.android.fragment.runFragments.RunDisplayCheckboxOnDisplay;
import ru.developer.android.fragment.runFragments.RunDisplayListOnDialogActivity;

public class DisplayCheckboxOnDisplay extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_checkbox_on_display);

        ActionBar actionBar = this.getSupportActionBar();
        if (actionBar != null){
            actionBar.setDisplayHomeAsUpEnabled(true);
        }
        actionBar.setTitle("DisplayCheckbox On Dialog");

        ZoomInImageView imageXML = findViewById(R.id.imageXML);
        String url = "https://firebasestorage.googleapis.com/v0/b/android-app-5b365.appspot.com/o/Fragments%2Fdisplay%20checkBox%2Factivity_main_xml.png?alt=media&token=730658ac-e5e8-4a1b-b751-152d71eff17b";
        Glide.with(getApplicationContext()).load(url).into(imageXML);

        ZoomInImageView imageActivity = findViewById(R.id.imageActivity);
        String url2 = "https://firebasestorage.googleapis.com/v0/b/android-app-5b365.appspot.com/o/Fragments%2Fdisplay%20checkBox%2FMainActivity.png?alt=media&token=dde16162-67f9-4e1c-bddb-7aa7b0b2e698";
        Glide.with(getApplicationContext()).load(url2).into(imageActivity);

        ZoomInImageView imageMyCheckboxFragment = findViewById(R.id.imageMyCheckboxFragment);
        String url3 = "https://firebasestorage.googleapis.com/v0/b/android-app-5b365.appspot.com/o/Fragments%2Fdisplay%20checkBox%2FMyCheckbox.jpg?alt=media&token=cccda74e-2e5b-46e2-8dec-73c3f087d366";
        Glide.with(getApplicationContext()).load(url3).into(imageMyCheckboxFragment);

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
            Intent intent = new Intent(DisplayCheckboxOnDisplay.this, RunDisplayCheckboxOnDisplay.class);startActivity(intent);
        }
        return super.onOptionsItemSelected(item);
    }
}