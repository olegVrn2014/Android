package ru.developer.android.android;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import ru.developer.android.R;
import ru.developer.android.menu.PopUpMenuActivity;
import ru.developer.android.menu.runMenu.RunPopUpMenu;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import com.bumptech.glide.Glide;
import com.zolad.zoominimageview.ZoomInImageView;

public class HelloWorldActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hello_world);

        ActionBar actionBar = this.getSupportActionBar();
        if (actionBar != null){
            actionBar.setDisplayHomeAsUpEnabled(true);
        }
        actionBar.setTitle("Первая программа");

        ZoomInImageView imageRunPhoneMainActivity = findViewById(R.id.imageRunPhoneMainActivity);
        String url = "https://firebasestorage.googleapis.com/v0/b/android-app-5b365.appspot.com/o/Android%2FHello%20World%2FMainActivity.png?alt=media&token=b9a59296-9e66-4b27-9e61-45cb483d879f";
        Glide.with(getApplicationContext()).load(url).into(imageRunPhoneMainActivity);

        ZoomInImageView imageRunPhoneActivityMainXml = findViewById(R.id.imageRunPhoneActivityMainXml);
        String url2 = "https://firebasestorage.googleapis.com/v0/b/android-app-5b365.appspot.com/o/Android%2FHello%20World%2Factivity_main.png?alt=media&token=6d613bf7-08d8-4ba1-8ea0-4e0eb16ae38c";
        Glide.with(getApplicationContext()).load(url2).into(imageRunPhoneActivityMainXml);

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
            Intent intent = new Intent(HelloWorldActivity.this, RunHelloWorld.class);startActivity(intent);
        }
        return super.onOptionsItemSelected(item);
    }
}
