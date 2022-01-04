package ru.developer.android.tel_manager;

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
import ru.developer.android.tel_manager.run.RunReadContactActivity;
import ru.developer.android.tel_manager.run.RunSendEmailActivity;

public class ReadContactActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_read_contact);

        ActionBar actionBar = this.getSupportActionBar();
        if (actionBar != null){
            actionBar.setDisplayHomeAsUpEnabled(true);
        }
        actionBar.setTitle("Чтение контактов");

        ZoomInImageView imageXML = findViewById(R.id.imageXML);
        String url = "https://firebasestorage.googleapis.com/v0/b/android-app-5b365.appspot.com/o/Telephone%20Manager%2FRead%20Contact%2Factivity_main.png?alt=media&token=db02378f-aed0-4f29-bec3-33e6a7df0f34";
        Glide.with(getApplicationContext()).load(url).into(imageXML);

        ZoomInImageView imageActivity = findViewById(R.id.imageActivity);
        String url2 = "https://firebasestorage.googleapis.com/v0/b/android-app-5b365.appspot.com/o/Telephone%20Manager%2FRead%20Contact%2FMainActivity.png?alt=media&token=9b5ccdc1-c61c-483d-915c-8c2cb16879ed";
        Glide.with(getApplicationContext()).load(url2).into(imageActivity);

        ZoomInImageView imageAndroidManifest = findViewById(R.id.imageAndroidManifest);
        String url3 = "https://firebasestorage.googleapis.com/v0/b/android-app-5b365.appspot.com/o/Telephone%20Manager%2FRead%20Contact%2Fmanifest.png?alt=media&token=2aa4e3af-7f2c-431c-a9ec-806ab14e226c";
        Glide.with(getApplicationContext()).load(url3).into(imageAndroidManifest);


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
            Intent intent = new Intent(ReadContactActivity.this, RunReadContactActivity.class);startActivity(intent);
        }
        return super.onOptionsItemSelected(item);
    }
}
