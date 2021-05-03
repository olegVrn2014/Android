package ru.developer.android.menu;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import ru.developer.android.R;
import ru.developer.android.intents.ShareIntentActivity;
import ru.developer.android.intents.runIntents.RunShareIntent;
import ru.developer.android.menu.runMenu.RunOptionMenu;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import com.bumptech.glide.Glide;
import com.zolad.zoominimageview.ZoomInImageView;

public class OptionMenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_option_menu);

        ActionBar actionBar = this.getSupportActionBar();
        if (actionBar != null){
            actionBar.setDisplayHomeAsUpEnabled(true);
        }
        actionBar.setTitle("Option menu");

        ZoomInImageView imageXML = findViewById(R.id.imageXML);
        String url = "https://firebasestorage.googleapis.com/v0/b/android-app-5b365.appspot.com/o/Menu%2FOption%20Menu%2Fact_main_xml.png?alt=media&token=f9ea3013-17dc-418b-aff0-7878758ce881";
        Glide.with(getApplicationContext()).load(url).into(imageXML);

        ZoomInImageView imageActivity = findViewById(R.id.imageActivity);
        String url2 = "https://firebasestorage.googleapis.com/v0/b/android-app-5b365.appspot.com/o/Menu%2FOption%20Menu%2FMainActivity_java.png?alt=media&token=d288997d-01b1-45ae-ac3a-5e8fa2e38ab4";
        Glide.with(getApplicationContext()).load(url2).into(imageActivity);

        ZoomInImageView imageMenu = findViewById(R.id.imageMenu);
        String url3 = "https://firebasestorage.googleapis.com/v0/b/android-app-5b365.appspot.com/o/Menu%2FOption%20Menu%2FMENU_option_menu.png?alt=media&token=d0fbef10-d4ad-4a56-8ef9-c1f11eb0ad40";
        Glide.with(getApplicationContext()).load(url3).into(imageMenu);

        ZoomInImageView imageOption_menu = findViewById(R.id.imageOption_menu);
        String url4 = "https://firebasestorage.googleapis.com/v0/b/android-app-5b365.appspot.com/o/Menu%2FOption%20Menu%2Foption_menu.png?alt=media&token=07913546-bec4-4453-9efd-b69b914bcbb6";
        Glide.with(getApplicationContext()).load(url4).into(imageOption_menu);

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
            Intent intent = new Intent(OptionMenuActivity.this, RunOptionMenu.class);startActivity(intent);
        }
        return super.onOptionsItemSelected(item);
    }
}
