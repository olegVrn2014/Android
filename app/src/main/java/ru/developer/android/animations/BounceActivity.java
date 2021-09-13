package ru.developer.android.animations;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import ru.developer.android.R;
import ru.developer.android.animations.runAnimations.RunBounceActivity;
import ru.developer.android.animations.runAnimations.RunSlideActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import com.bumptech.glide.Glide;
import com.zolad.zoominimageview.ZoomInImageView;

public class BounceActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bounce);

        ActionBar actionBar = this.getSupportActionBar();
        if (actionBar != null){
            actionBar.setDisplayHomeAsUpEnabled(true);
        }
        actionBar.setTitle("Bounce Animations");

        ZoomInImageView imageXML = findViewById(R.id.imageXML);
        String url = "https://firebasestorage.googleapis.com/v0/b/android-app-5b365.appspot.com/o/Animations%2FBounce%2Fxml.png?alt=media&token=732d1a02-80ba-4e8d-af65-5bd0c52401a2";
        Glide.with(getApplicationContext()).load(url).into(imageXML);

        ZoomInImageView imageActivity = findViewById(R.id.imageActivity);
        String url2 = "https://firebasestorage.googleapis.com/v0/b/android-app-5b365.appspot.com/o/Animations%2FBounce%2Factivity.png?alt=media&token=f3f10585-fd62-4be2-8317-9bd48857602b";
        Glide.with(getApplicationContext()).load(url2).into(imageActivity);

        ZoomInImageView imageAnim = findViewById(R.id.imageAnim);
        String url3 = "https://firebasestorage.googleapis.com/v0/b/android-app-5b365.appspot.com/o/Animations%2FBounce%2Fanim.png?alt=media&token=fc62a927-6f20-4919-812e-f9471614040f";
        Glide.with(getApplicationContext()).load(url3).into(imageAnim);

        ZoomInImageView imageBounce = findViewById(R.id.imageBounce);
        String url4 = "https://firebasestorage.googleapis.com/v0/b/android-app-5b365.appspot.com/o/Animations%2FBounce%2Fbounce.png?alt=media&token=a152b638-2444-4a98-af32-f0b7c16ee8d0";
        Glide.with(getApplicationContext()).load(url4).into(imageBounce);

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
            Intent intent = new Intent(BounceActivity.this, RunBounceActivity.class);startActivity(intent);
        }
        return super.onOptionsItemSelected(item);
    }
}
