package ru.developer.android.animations;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import ru.developer.android.R;
import ru.developer.android.animations.runAnimations.RunSlideActivity;
import ru.developer.android.animations.runAnimations.RunZoomActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import com.bumptech.glide.Glide;
import com.zolad.zoominimageview.ZoomInImageView;

public class SlideActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_slide);

        ActionBar actionBar = this.getSupportActionBar();
        if (actionBar != null){
            actionBar.setDisplayHomeAsUpEnabled(true);
        }
        actionBar.setTitle("Slide Animations");

        ZoomInImageView imageXML = findViewById(R.id.imageXML);
        String url = "https://firebasestorage.googleapis.com/v0/b/android-app-5b365.appspot.com/o/Animations%2FSLide%2Fxml.png?alt=media&token=2a871063-6a4f-4b2a-bb90-dba9d1ac9eb2";
        Glide.with(getApplicationContext()).load(url).into(imageXML);

        ZoomInImageView imageActivity = findViewById(R.id.imageActivity);
        String url2 = "https://firebasestorage.googleapis.com/v0/b/android-app-5b365.appspot.com/o/Animations%2FSLide%2Factivity.jpg?alt=media&token=71303867-4258-407b-b83e-dbd5ed921c59";
        Glide.with(getApplicationContext()).load(url2).into(imageActivity);

        ZoomInImageView imageAnim = findViewById(R.id.imageAnim);
        String url3 = "https://firebasestorage.googleapis.com/v0/b/android-app-5b365.appspot.com/o/Animations%2FSLide%2Fanim.png?alt=media&token=f13c5828-9b40-45cf-a52a-8c86514dec27";
        Glide.with(getApplicationContext()).load(url3).into(imageAnim);

        ZoomInImageView imageSlideUp = findViewById(R.id.imageSlideUp);
        String url4 = "https://firebasestorage.googleapis.com/v0/b/android-app-5b365.appspot.com/o/Animations%2FSLide%2Fup.png?alt=media&token=e34e31e4-3386-4bc2-9d9c-ff2af7e0ccee";
        Glide.with(getApplicationContext()).load(url4).into(imageSlideUp);

        ZoomInImageView imageSlideDown = findViewById(R.id.imageSlideDown);
        String url5 = "https://firebasestorage.googleapis.com/v0/b/android-app-5b365.appspot.com/o/Animations%2FSLide%2Fdown.png?alt=media&token=30d5e3e2-57f3-469a-b167-0925687ca603";
        Glide.with(getApplicationContext()).load(url5).into(imageSlideDown);

        ZoomInImageView imageSlideRight = findViewById(R.id.imageSlideRight);
        String url6 = "https://firebasestorage.googleapis.com/v0/b/android-app-5b365.appspot.com/o/Animations%2FSLide%2Fright.png?alt=media&token=d585ec7a-b0b4-407d-a700-2c0c6bbb567c";
        Glide.with(getApplicationContext()).load(url6).into(imageSlideRight);

        ZoomInImageView imageSlideDownLeft = findViewById(R.id.imageSlideDownLeft);
        String url7 = "https://firebasestorage.googleapis.com/v0/b/android-app-5b365.appspot.com/o/Animations%2FSLide%2Fleft.png?alt=media&token=90faf3d3-b577-4932-8e6b-a55dab13b8d0";
        Glide.with(getApplicationContext()).load(url7).into(imageSlideDownLeft);

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
            Intent intent = new Intent(SlideActivity.this, RunSlideActivity.class);startActivity(intent);
        }
        return super.onOptionsItemSelected(item);
    }
}
