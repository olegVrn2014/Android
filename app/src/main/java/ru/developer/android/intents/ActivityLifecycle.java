package ru.developer.android.intents;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import ru.developer.android.R;
import ru.developer.android.intents.runIntents.RunLifecycle;
import ru.developer.android.toast.CustomToastActivity;
import ru.developer.android.toast.runToast.RunCustomToast;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import com.bumptech.glide.Glide;
import com.zolad.zoominimageview.ZoomInImageView;

public class ActivityLifecycle extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lifecycle);

        ActionBar actionBar = this.getSupportActionBar();
        if (actionBar != null){
            actionBar.setDisplayHomeAsUpEnabled(true);
        }
        actionBar.setTitle("Activity Lifecycle");

        ZoomInImageView imageLifecycle1 = findViewById(R.id.imageLifecycle1);
        String url = "https://firebasestorage.googleapis.com/v0/b/android-app-5b365.appspot.com/o/intents%2FActivityLifeCycle%2Flifecycle1.png?alt=media&token=331c5fdb-ff67-4ca4-ac56-35cb6a6a96fe";
        Glide.with(getApplicationContext()).load(url).into(imageLifecycle1);

        ZoomInImageView imageLifecycle2 = findViewById(R.id.imageLifecycle2);
        String url2 = "https://firebasestorage.googleapis.com/v0/b/android-app-5b365.appspot.com/o/intents%2FActivityLifeCycle%2FLifecycle2.jpg?alt=media&token=e37b8683-4a78-4a23-b328-5a8a802e93ce";
        Glide.with(getApplicationContext()).load(url2).into(imageLifecycle2);

        ZoomInImageView imageLifecycle3 = findViewById(R.id.imageLifecycle3);
        String url3 = "https://firebasestorage.googleapis.com/v0/b/android-app-5b365.appspot.com/o/intents%2FActivityLifeCycle%2FlifeCycle-activity.jpg?alt=media&token=f55560ef-bef9-41b3-9703-5d8a43ceb0b7";
        Glide.with(getApplicationContext()).load(url3).into(imageLifecycle3);

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
            Intent intent = new Intent(ActivityLifecycle.this, RunLifecycle.class);startActivity(intent);
        }
        return super.onOptionsItemSelected(item);
    }
}