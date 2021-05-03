package ru.developer.android.menu;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import ru.developer.android.R;
import ru.developer.android.menu.runMenu.RunContexMenu;
import ru.developer.android.menu.runMenu.RunOptionMenu;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import com.bumptech.glide.Glide;
import com.zolad.zoominimageview.ZoomInImageView;

public class ContexMenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contex_menu);

        ActionBar actionBar = this.getSupportActionBar();
        if (actionBar != null){
            actionBar.setDisplayHomeAsUpEnabled(true);
        }
        actionBar.setTitle("Contex menu");

        ZoomInImageView imageXML = findViewById(R.id.imageXML);
        String url = "https://firebasestorage.googleapis.com/v0/b/android-app-5b365.appspot.com/o/Menu%2FContex_menu%2Factivity_main_xml.png?alt=media&token=1100789f-c870-44ea-ba9c-8d5787a7e6bd";
        Glide.with(getApplicationContext()).load(url).into(imageXML);

        ZoomInImageView imageActivity = findViewById(R.id.imageActivity);
        String url2 = "https://firebasestorage.googleapis.com/v0/b/android-app-5b365.appspot.com/o/Menu%2FContex_menu%2FMainActivity_java.png?alt=media&token=6d060a1b-667b-4673-bbb1-fa9f0fc51254";
        Glide.with(getApplicationContext()).load(url2).into(imageActivity);

        ZoomInImageView imageMenu = findViewById(R.id.imageMenu);
        String url3 = "https://firebasestorage.googleapis.com/v0/b/android-app-5b365.appspot.com/o/Menu%2FContex_menu%2FMENU.png?alt=media&token=065e5ff7-b4bc-4058-946b-99900a80e749";
        Glide.with(getApplicationContext()).load(url3).into(imageMenu);

        ZoomInImageView imageContex_menu = findViewById(R.id.imageContex_menu);
        String url4 = "https://firebasestorage.googleapis.com/v0/b/android-app-5b365.appspot.com/o/Menu%2FContex_menu%2Fcontex_menu_xml.png?alt=media&token=1c8a0d3f-d1bd-4b57-a560-904be0b94f6f";
        Glide.with(getApplicationContext()).load(url4).into(imageContex_menu);

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
            Intent intent = new Intent(ContexMenuActivity.this, RunContexMenu.class);startActivity(intent);
        }
        return super.onOptionsItemSelected(item);
    }
}

