package ru.developer.android.toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import ru.developer.android.R;
import ru.developer.android.toast.runToast.RunCustomToast;
import ru.developer.android.toast.runToast.RunPositionToast;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import com.bumptech.glide.Glide;
import com.zolad.zoominimageview.ZoomInImageView;

public class CustomToastActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_toast);

        ActionBar actionBar = this.getSupportActionBar();
        if (actionBar != null){
            actionBar.setDisplayHomeAsUpEnabled(true);
        }
        actionBar.setTitle("Custom Toast");

        ZoomInImageView imageXML = findViewById(R.id.imageXML);
        String url = "https://firebasestorage.googleapis.com/v0/b/android-app-5b365.appspot.com/o/Toast%2FCustomToast%2Factivity_main.png?alt=media&token=35e433d8-28be-4742-ad33-d366f505117f";
        Glide.with(getApplicationContext()).load(url).into(imageXML);

        ZoomInImageView imageActivity = findViewById(R.id.imageActivity);
        String url2 = "https://firebasestorage.googleapis.com/v0/b/android-app-5b365.appspot.com/o/Toast%2FCustomToast%2FMainActivity.png?alt=media&token=1507778e-e56a-434a-b885-7e0f4fa152fd";
        Glide.with(getApplicationContext()).load(url2).into(imageActivity);

        ZoomInImageView imageCustomToast = findViewById(R.id.imageCustomToast);
        String url3 = "https://firebasestorage.googleapis.com/v0/b/android-app-5b365.appspot.com/o/Toast%2FCustomToast%2Fcustom_toast_xml.png?alt=media&token=c89b368d-4f0a-470e-8b83-0641410544cc";
        Glide.with(getApplicationContext()).load(url3).into(imageCustomToast);



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
            Intent intent = new Intent(CustomToastActivity.this, RunCustomToast.class);startActivity(intent);
        }
        return super.onOptionsItemSelected(item);
    }
}