package ru.developer.android.widgets;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import ru.developer.android.R;
import ru.developer.android.runWidgets.RunCheckBox;
import ru.developer.android.runWidgets.RunCustomCheckBox;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import com.bumptech.glide.Glide;
import com.zolad.zoominimageview.ZoomInImageView;

public class CustomCheckBoxActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_check_box);

        ActionBar actionBar = this.getSupportActionBar();
        if (actionBar != null){
            actionBar.setDisplayHomeAsUpEnabled(true);
        }
        actionBar.setTitle("CustomCheckBox");

        ZoomInImageView imageXML = findViewById(R.id.imageXML);
        String url = "https://firebasestorage.googleapis.com/v0/b/android-app-5b365.appspot.com/o/Widgets%2FCustomCheckBox%2FCustomCheckBox%20XML.png?alt=media&token=25e04496-9930-464b-838e-24f79a6850c6";
        Glide.with(getApplicationContext()).load(url).into(imageXML);

        ZoomInImageView imageActivity = findViewById(R.id.imageActivity);
        String url2 = "https://firebasestorage.googleapis.com/v0/b/android-app-5b365.appspot.com/o/Widgets%2FCustomCheckBox%2FCustomCheckBox-Activity.png?alt=media&token=1920ff9d-198a-46e4-9707-c88ec55b54fc";
        Glide.with(getApplicationContext()).load(url2).into(imageActivity);

        ZoomInImageView imageDrawable = findViewById(R.id.imageDrawable);
        String url3 = "https://firebasestorage.googleapis.com/v0/b/android-app-5b365.appspot.com/o/Widgets%2FCustomCheckBox%2FCustomCheckBox%20drawable.png?alt=media&token=13cd44c9-c9ff-4e0a-a0e3-68a1fd3f5313";
        Glide.with(getApplicationContext()).load(url3).into(imageDrawable);

        ZoomInImageView imageDrawable1 = findViewById(R.id.imageDrawable1);
        String url4 = "https://firebasestorage.googleapis.com/v0/b/android-app-5b365.appspot.com/o/Widgets%2FCustomCheckBox%2FCustomCheckBox%20drawable1.png?alt=media&token=fe6669a3-2ad4-4455-96b4-214dcbbe5fda";
        Glide.with(getApplicationContext()).load(url4).into(imageDrawable1);

        ZoomInImageView imageDrawable2= findViewById(R.id.imageDrawable2);
        String url5 = "https://firebasestorage.googleapis.com/v0/b/android-app-5b365.appspot.com/o/Widgets%2FCustomCheckBox%2FCustomCheckBox%20drawable2.png?alt=media&token=d0f520b6-d389-4d89-a911-ab2ad6beefa5";
        Glide.with(getApplicationContext()).load(url5).into(imageDrawable2);

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
            Intent intent = new Intent(CustomCheckBoxActivity.this, RunCustomCheckBox.class);startActivity(intent);
        }
        return super.onOptionsItemSelected(item);
    }
}