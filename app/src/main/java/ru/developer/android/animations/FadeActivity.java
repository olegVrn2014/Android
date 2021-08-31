package ru.developer.android.animations;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import ru.developer.android.R;
import ru.developer.android.animations.runAnimations.RunFadeActivity;
import ru.developer.android.material_design.BottomSheetsActivity;
import ru.developer.android.material_design.runMaterialDesign.RunBottomSheets;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import com.bumptech.glide.Glide;
import com.zolad.zoominimageview.ZoomInImageView;

public class FadeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fade);

        ActionBar actionBar = this.getSupportActionBar();
        if (actionBar != null){
            actionBar.setDisplayHomeAsUpEnabled(true);
        }
        actionBar.setTitle("Fade Animations");

        ZoomInImageView imageXML = findViewById(R.id.imageXML);
        String url = "https://firebasestorage.googleapis.com/v0/b/android-app-5b365.appspot.com/o/Animations%2FFade%2Fxml.png?alt=media&token=215d6421-2004-4b55-a186-f3e07a2f5d62";
        Glide.with(getApplicationContext()).load(url).into(imageXML);

        ZoomInImageView imageActivity = findViewById(R.id.imageActivity);
        String url2 = "https://firebasestorage.googleapis.com/v0/b/android-app-5b365.appspot.com/o/Animations%2FFade%2Factivity.png?alt=media&token=4a1c780c-4c71-4fce-a5f7-a1427ee6ce1e";
        Glide.with(getApplicationContext()).load(url2).into(imageActivity);

        ZoomInImageView imageAnim = findViewById(R.id.imageAnim);
        String url3 = "https://firebasestorage.googleapis.com/v0/b/android-app-5b365.appspot.com/o/Animations%2FFade%2Fanim.png?alt=media&token=bdb16940-9bfb-4b09-97f8-26dba4eced0a";
        Glide.with(getApplicationContext()).load(url3).into(imageAnim);

        ZoomInImageView imageFadeIn = findViewById(R.id.imageFadeIn);
        String url4 = "https://firebasestorage.googleapis.com/v0/b/android-app-5b365.appspot.com/o/Animations%2FFade%2Ffade_in.png?alt=media&token=cbd1de49-c834-4ad1-89bb-d1d6dc63e2be";
        Glide.with(getApplicationContext()).load(url4).into(imageFadeIn);

        ZoomInImageView imageFadeOut = findViewById(R.id.imageFadeOut);
        String url5 = "https://firebasestorage.googleapis.com/v0/b/android-app-5b365.appspot.com/o/Animations%2FFade%2Ffade_out.png?alt=media&token=a1f3132e-ad1a-4837-9943-0cee48ceb3e2";
        Glide.with(getApplicationContext()).load(url5).into(imageFadeOut);
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
            Intent intent = new Intent(FadeActivity.this, RunFadeActivity.class);startActivity(intent);
        }
        return super.onOptionsItemSelected(item);
    }
}