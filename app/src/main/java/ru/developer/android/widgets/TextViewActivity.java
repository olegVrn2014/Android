package ru.developer.android.widgets;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NavUtils;
import ru.developer.android.R;
import ru.developer.android.runWidgets.RunTextView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import com.bumptech.glide.Glide;
import com.zolad.zoominimageview.ZoomInImageView;

public class TextViewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text_view);
        ActionBar actionBar = this.getSupportActionBar();
        if (actionBar != null){
            actionBar.setDisplayHomeAsUpEnabled(true);
        }
        actionBar.setTitle("TextView");

        ZoomInImageView imageXML = findViewById(R.id.imageXML);
        String url = "https://firebasestorage.googleapis.com/v0/b/android-app-5b365.appspot.com/o/Widgets%2FTextView%2FTextView%20xml.png?alt=media&token=f14802f2-e6b7-4d46-a2e0-2401fe687488";
        Glide.with(getApplicationContext()).load(url).into(imageXML);

        ZoomInImageView imageActivity = findViewById(R.id.imageActivity);
        String url2 = "https://firebasestorage.googleapis.com/v0/b/android-app-5b365.appspot.com/o/Widgets%2FTextView%2FTextView%20Activity.png?alt=media&token=e0b05ce4-cfc3-4be9-8afc-3b7756d6b449";
        Glide.with(getApplicationContext()).load(url2).into(imageActivity);


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
            NavUtils.navigateUpFromSameTask(this);
        }else{
            Intent intent = new Intent(TextViewActivity.this, RunTextView.class);startActivity(intent);
        }
        return super.onOptionsItemSelected(item);
    }
}