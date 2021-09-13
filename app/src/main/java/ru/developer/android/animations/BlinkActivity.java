package ru.developer.android.animations;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import ru.developer.android.R;
import ru.developer.android.animations.runAnimations.RunBlinkActivity;
import ru.developer.android.animations.runAnimations.RunBounceActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import com.bumptech.glide.Glide;
import com.zolad.zoominimageview.ZoomInImageView;

public class BlinkActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_blink);

        ActionBar actionBar = this.getSupportActionBar();
        if (actionBar != null){
            actionBar.setDisplayHomeAsUpEnabled(true);
        }
        actionBar.setTitle("Blink Animations");

        ZoomInImageView imageXML = findViewById(R.id.imageXML);
        String url = "https://firebasestorage.googleapis.com/v0/b/android-app-5b365.appspot.com/o/Animations%2FBlink%2Fxml.png?alt=media&token=02812bff-bd7e-4478-9851-6eb969046987";
        Glide.with(getApplicationContext()).load(url).into(imageXML);

        ZoomInImageView imageActivity = findViewById(R.id.imageActivity);
        String url2 = "https://firebasestorage.googleapis.com/v0/b/android-app-5b365.appspot.com/o/Animations%2FBlink%2Factivity.png?alt=media&token=3c59ceb8-24a2-4a06-9bbc-2b53e7149fae";
        Glide.with(getApplicationContext()).load(url2).into(imageActivity);

        ZoomInImageView imageAnim = findViewById(R.id.imageAnim);
        String url3 = "https://firebasestorage.googleapis.com/v0/b/android-app-5b365.appspot.com/o/Animations%2FBlink%2Fanim.png?alt=media&token=78be5045-4e7a-45fa-b0a2-5aae4e36dedd";
        Glide.with(getApplicationContext()).load(url3).into(imageAnim);

        ZoomInImageView imageBlink = findViewById(R.id.imageBlink);
        String url4 = "https://firebasestorage.googleapis.com/v0/b/android-app-5b365.appspot.com/o/Animations%2FBlink%2FBlin.png?alt=media&token=2596e705-64e4-44b8-84d5-9b7c8c8ad296";
        Glide.with(getApplicationContext()).load(url4).into(imageBlink);

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
            Intent intent = new Intent(BlinkActivity.this, RunBlinkActivity.class);startActivity(intent);
        }
        return super.onOptionsItemSelected(item);
    }
}
