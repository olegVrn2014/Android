package ru.developer.android.menu;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import ru.developer.android.R;
import ru.developer.android.menu.runMenu.RunContexMenu;
import ru.developer.android.menu.runMenu.RunPopUpMenu;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import com.bumptech.glide.Glide;
import com.zolad.zoominimageview.ZoomInImageView;

public class PopUpMenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pop_up_menu);

        ActionBar actionBar = this.getSupportActionBar();
        if (actionBar != null){
            actionBar.setDisplayHomeAsUpEnabled(true);
        }
        actionBar.setTitle("PopUp menu");

        ZoomInImageView imageXML = findViewById(R.id.imageXML);
        String url = "https://firebasestorage.googleapis.com/v0/b/android-app-5b365.appspot.com/o/Menu%2FPopUp%20Menu%2Factivity_main_xml.png?alt=media&token=2ab23794-2672-4e20-aad4-a76b240b30d9";
        Glide.with(getApplicationContext()).load(url).into(imageXML);

        ZoomInImageView imageActivity = findViewById(R.id.imageActivity);
        String url2 = "https://firebasestorage.googleapis.com/v0/b/android-app-5b365.appspot.com/o/Menu%2FPopUp%20Menu%2FMainActivity_java.png?alt=media&token=30230cff-a21a-49ea-a7a2-f15b140280c6";
        Glide.with(getApplicationContext()).load(url2).into(imageActivity);

        ZoomInImageView imageMenu = findViewById(R.id.imageMenu);
        String url3 = "https://firebasestorage.googleapis.com/v0/b/android-app-5b365.appspot.com/o/Menu%2FPopUp%20Menu%2Fmenu.png?alt=media&token=b18e7be9-b257-4000-beee-453ed5b66154";
        Glide.with(getApplicationContext()).load(url3).into(imageMenu);

        ZoomInImageView imagePopUp_menu = findViewById(R.id.imagePopUp_menu);
        String url4 = "https://firebasestorage.googleapis.com/v0/b/android-app-5b365.appspot.com/o/Menu%2FPopUp%20Menu%2Fpopup_menu.png?alt=media&token=33ef6105-d084-48bd-ab80-20206fd178b3";
        Glide.with(getApplicationContext()).load(url4).into(imagePopUp_menu);

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
            Intent intent = new Intent(PopUpMenuActivity.this, RunPopUpMenu.class);startActivity(intent);
        }
        return super.onOptionsItemSelected(item);
    }
}

