package ru.developer.android.animations;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import ru.developer.android.R;
import ru.developer.android.animations.runAnimations.RunMoveActivity;
import ru.developer.android.animations.runAnimations.RunRotateActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import com.bumptech.glide.Glide;
import com.zolad.zoominimageview.ZoomInImageView;

public class RotateActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rotate);

        ActionBar actionBar = this.getSupportActionBar();
        if (actionBar != null){
            actionBar.setDisplayHomeAsUpEnabled(true);
        }
        actionBar.setTitle("Rotate Animations");

        ZoomInImageView imageXML = findViewById(R.id.imageXML);
        String url = "https://firebasestorage.googleapis.com/v0/b/android-app-5b365.appspot.com/o/Animations%2FRotate%2Fxml.png?alt=media&token=29fcd160-abcc-43d3-a7c6-172a17dec03b";
        Glide.with(getApplicationContext()).load(url).into(imageXML);

        ZoomInImageView imageActivity = findViewById(R.id.imageActivity);
        String url2 = "https://firebasestorage.googleapis.com/v0/b/android-app-5b365.appspot.com/o/Animations%2FRotate%2Factivity.png?alt=media&token=7b75d376-277c-4e53-a908-f1438ded38be";
        Glide.with(getApplicationContext()).load(url2).into(imageActivity);

        ZoomInImageView imageAnim = findViewById(R.id.imageAnim);
        String url3 = "https://firebasestorage.googleapis.com/v0/b/android-app-5b365.appspot.com/o/Animations%2FRotate%2Fanim.png?alt=media&token=5e4107e6-efdf-4663-bff8-c3de1a375097";
        Glide.with(getApplicationContext()).load(url3).into(imageAnim);

        ZoomInImageView imageRotateCenter = findViewById(R.id.imageRotateCenter);
        String url4 = "https://firebasestorage.googleapis.com/v0/b/android-app-5b365.appspot.com/o/Animations%2FRotate%2Fxml_center.png?alt=media&token=1b1cb0de-3129-4596-a85e-5dddb02a3842";
        Glide.with(getApplicationContext()).load(url4).into(imageRotateCenter);

        ZoomInImageView imageRotateCorner = findViewById(R.id.imageRotateCorner);
        String url5 = "https://firebasestorage.googleapis.com/v0/b/android-app-5b365.appspot.com/o/Animations%2FRotate%2Fxml_corner.png?alt=media&token=90632c3d-63ca-4998-bad9-c9a950f5106f";
        Glide.with(getApplicationContext()).load(url5).into(imageRotateCorner);

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
            Intent intent = new Intent(RotateActivity.this, RunRotateActivity.class);startActivity(intent);
        }
        return super.onOptionsItemSelected(item);
    }
}
