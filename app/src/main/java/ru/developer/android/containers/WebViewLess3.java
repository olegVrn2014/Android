package ru.developer.android.containers;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import ru.developer.android.R;
import ru.developer.android.containers.runContainer.RunGridView;
import ru.developer.android.containers.runContainer.RunWebView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import com.bumptech.glide.Glide;
import com.zolad.zoominimageview.ZoomInImageView;

public class WebViewLess3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_view_less3);

        ActionBar actionBar = this.getSupportActionBar();
        if (actionBar != null){
            actionBar.setDisplayHomeAsUpEnabled(true);
        }
        actionBar.setTitle("WebView");

        ZoomInImageView imageXML = findViewById(R.id.imageXML);
        String url = "https://firebasestorage.googleapis.com/v0/b/android-app-5b365.appspot.com/o/Containers%2FWebView%2Fxml.png?alt=media&token=9bfdbdf5-2c22-42ee-ba4b-5b9d6f24228b";
        Glide.with(getApplicationContext()).load(url).into(imageXML);

        ZoomInImageView imageActivity = findViewById(R.id.imageActivity);
        String url2 = "https://firebasestorage.googleapis.com/v0/b/android-app-5b365.appspot.com/o/Containers%2FWebView%2Factivity.png?alt=media&token=763c2467-e977-4c31-9533-9a2678486be0";
        Glide.with(getApplicationContext()).load(url2).into(imageActivity);

        ZoomInImageView imageManifest = findViewById(R.id.imageManifest);
        String url3 = "https://firebasestorage.googleapis.com/v0/b/android-app-5b365.appspot.com/o/Containers%2FWebView%2Fmanifest.png?alt=media&token=253af103-cd4f-49d2-b6c8-dba435e70165";
        Glide.with(getApplicationContext()).load(url3).into(imageManifest);
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
            Intent intent = new Intent(WebViewLess3.this, RunWebView.class);startActivity(intent);
        }
        return super.onOptionsItemSelected(item);
    }
}
