package ru.developer.android.animations;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import ru.developer.android.R;
import ru.developer.android.animations.runAnimations.RunFadeActivity;
import ru.developer.android.animations.runAnimations.RunMoveActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import com.bumptech.glide.Glide;
import com.zolad.zoominimageview.ZoomInImageView;

public class MoveActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_move);

        ActionBar actionBar = this.getSupportActionBar();
        if (actionBar != null){
            actionBar.setDisplayHomeAsUpEnabled(true);
        }
        actionBar.setTitle("Move Animations");

        ZoomInImageView imageXML = findViewById(R.id.imageXML);
        String url = "https://firebasestorage.googleapis.com/v0/b/android-app-5b365.appspot.com/o/Animations%2FMove%2Fxml_1.jpg?alt=media&token=6fce2d76-885d-48d7-aaf2-14639acc6a81";
        Glide.with(getApplicationContext()).load(url).into(imageXML);

        ZoomInImageView imageActivity = findViewById(R.id.imageActivity);
        String url2 = "https://firebasestorage.googleapis.com/v0/b/android-app-5b365.appspot.com/o/Animations%2FMove%2Factivity.jpg?alt=media&token=9b62ce46-1441-4634-b7d7-24614a57e20f";
        Glide.with(getApplicationContext()).load(url2).into(imageActivity);

        ZoomInImageView imageAnim = findViewById(R.id.imageAnim);
        String url3 = "https://firebasestorage.googleapis.com/v0/b/android-app-5b365.appspot.com/o/Animations%2FMove%2Fanim.png?alt=media&token=8a8ccb65-1938-4376-a885-e9e65f0766b4";
        Glide.with(getApplicationContext()).load(url3).into(imageAnim);

        ZoomInImageView imageMoveUp = findViewById(R.id.imageMoveUp);
        String url4 = "https://firebasestorage.googleapis.com/v0/b/android-app-5b365.appspot.com/o/Animations%2FMove%2Fup.png?alt=media&token=02220e56-ba77-4d9d-8654-2e7c3cc267aa";
        Glide.with(getApplicationContext()).load(url4).into(imageMoveUp);

        ZoomInImageView imageMoveDown = findViewById(R.id.imageMoveDown);
        String url5 = "https://firebasestorage.googleapis.com/v0/b/android-app-5b365.appspot.com/o/Animations%2FMove%2Fdown.png?alt=media&token=82fbba14-8821-4726-841a-914e688bd0cb";
        Glide.with(getApplicationContext()).load(url5).into(imageMoveDown);

        ZoomInImageView imageMoveRight = findViewById(R.id.imageMoveRight);
        String url6 = "https://firebasestorage.googleapis.com/v0/b/android-app-5b365.appspot.com/o/Animations%2FMove%2Fright.png?alt=media&token=08b50ec2-da9d-45a4-97b3-696d03d7581d";
        Glide.with(getApplicationContext()).load(url6).into(imageMoveRight);

        ZoomInImageView imageMoveLeft = findViewById(R.id.imageMoveLeft);
        String url7 = "https://firebasestorage.googleapis.com/v0/b/android-app-5b365.appspot.com/o/Animations%2FMove%2Fleft.png?alt=media&token=9e5c9cd1-aaf0-4fdd-9fdc-6ff4fff8e29a";
        Glide.with(getApplicationContext()).load(url7).into(imageMoveLeft);
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
            Intent intent = new Intent(MoveActivity.this, RunMoveActivity.class);startActivity(intent);
        }
        return super.onOptionsItemSelected(item);
    }
}
