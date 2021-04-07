package ru.developer.android.widgets;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import ru.developer.android.R;
import ru.developer.android.runWidgets.RunScrollViewVer;
import ru.developer.android.runWidgets.RunTextSwitcher;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import com.bumptech.glide.Glide;
import com.zolad.zoominimageview.ZoomInImageView;

public class ScrollViewVerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scroll_view_ver);

        ActionBar actionBar = this.getSupportActionBar();
        if (actionBar != null){
            actionBar.setDisplayHomeAsUpEnabled(true);
        }
        actionBar.setTitle("ScrollView Vertical");

        ZoomInImageView imageXML = findViewById(R.id.imageXML);
        String url = "https://firebasestorage.googleapis.com/v0/b/android-app-5b365.appspot.com/o/Widgets%2FScrollView%2FScrollView-Vertical-XML1.jpg?alt=media&token=5133f3c7-020a-4316-84fa-97c76487eee0";
        Glide.with(getApplicationContext()).load(url).into(imageXML);

        ZoomInImageView imageXML2 = findViewById(R.id.imageXML2);
        String url3 = "https://firebasestorage.googleapis.com/v0/b/android-app-5b365.appspot.com/o/Widgets%2FScrollView%2FScrollView-Vertical-XML2.jpg?alt=media&token=10bcd373-b05b-4dd0-a680-d782b3d63f7a";
        Glide.with(getApplicationContext()).load(url3).into(imageXML2);

        ZoomInImageView imageActivity = findViewById(R.id.imageActivity);
        String url2 = "https://firebasestorage.googleapis.com/v0/b/android-app-5b365.appspot.com/o/Widgets%2FScrollView%2FScrollView%20Activity.png?alt=media&token=13f8fe46-881b-42de-8233-348005d8e8dd";
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
            finish();
            return true;
        }else{
            Intent intent = new Intent(ScrollViewVerActivity.this, RunScrollViewVer.class);startActivity(intent);
        }
        return super.onOptionsItemSelected(item);
    }
}