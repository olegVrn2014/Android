package ru.developer.android.widgets;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NavUtils;
import ru.developer.android.R;
import ru.developer.android.runWidgets.RunButton;
import ru.developer.android.runWidgets.RunEditText;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import com.bumptech.glide.Glide;
import com.zolad.zoominimageview.ZoomInImageView;

public class ButtonActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button);

        ActionBar actionBar = this.getSupportActionBar();
        if (actionBar != null){
            actionBar.setDisplayHomeAsUpEnabled(true);
        }
        actionBar.setTitle("Button");

        ZoomInImageView imageXML = findViewById(R.id.imageXML);
        String url = "https://firebasestorage.googleapis.com/v0/b/android-app-5b365.appspot.com/o/Widgets%2FButton%2FButton%20XML.png?alt=media&token=aaf50c55-d4ab-4dda-97a4-c9945ef98ec9";
        Glide.with(getApplicationContext()).load(url).into(imageXML);

        ZoomInImageView imageActivity = findViewById(R.id.imageActivity);
        String url2 = "https://firebasestorage.googleapis.com/v0/b/android-app-5b365.appspot.com/o/Widgets%2FButton%2FButton%20Activity.png?alt=media&token=fed2a713-f22e-4458-b711-0ace1668e044";
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
            Intent intent = new Intent(ButtonActivity.this, RunButton.class);startActivity(intent);
        }
        return super.onOptionsItemSelected(item);
    }
}