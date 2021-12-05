package ru.developer.android.fragment;

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
import ru.developer.android.fragment.runFragments.RunDialogFragmentActivity;
import ru.developer.android.fragment.runFragments.RunPassDataBetweenActivity;

public class PassDataBeetweenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pass_data_beetween);

        ActionBar actionBar = this.getSupportActionBar();
        if (actionBar != null){
            actionBar.setDisplayHomeAsUpEnabled(true);
        }
        actionBar.setTitle("Pass Data Between Fragment ");

        ZoomInImageView imageXML = findViewById(R.id.imageXML);
        String url = "https://firebasestorage.googleapis.com/v0/b/android-app-5b365.appspot.com/o/Fragments%2Fpass%20data%20between%2Factivity_main.png?alt=media&token=e844da58-4b98-460b-a39d-21b3471917be";
        Glide.with(getApplicationContext()).load(url).into(imageXML);

        ZoomInImageView imageActivity = findViewById(R.id.imageActivity);
        String url2 = "https://firebasestorage.googleapis.com/v0/b/android-app-5b365.appspot.com/o/Fragments%2Fpass%20data%20between%2FMainActivity.png?alt=media&token=c38d165c-1484-4656-b0a0-674aa46cd7ae";
        Glide.with(getApplicationContext()).load(url2).into(imageActivity);

        ZoomInImageView imageFragmentFirstActivity = findViewById(R.id.imageFragmentFirstActivity);
        String url3 = "https://firebasestorage.googleapis.com/v0/b/android-app-5b365.appspot.com/o/Fragments%2Fpass%20data%20between%2FFragmentFirst.png?alt=media&token=6b89926e-3ae9-4cb3-b9c2-46ab64024b9b";
        Glide.with(getApplicationContext()).load(url3).into(imageFragmentFirstActivity);

        ZoomInImageView imageFragmentSecondActivity = findViewById(R.id.imageFragmentSecondActivity);
        String url4 = "https://firebasestorage.googleapis.com/v0/b/android-app-5b365.appspot.com/o/Fragments%2Fpass%20data%20between%2FFragmentSecond.png?alt=media&token=edc74008-725e-468e-9905-8388b6c03ba6";
        Glide.with(getApplicationContext()).load(url4).into(imageFragmentSecondActivity);

        ZoomInImageView imageFragmentFirstXml = findViewById(R.id.imageFragmentFirstXml);
        String url5 = "https://firebasestorage.googleapis.com/v0/b/android-app-5b365.appspot.com/o/Fragments%2Fpass%20data%20between%2Ffragment_first_xml.png?alt=media&token=5b169ffb-5b0f-4343-925d-cdbafd57639e";
        Glide.with(getApplicationContext()).load(url5).into(imageFragmentFirstXml);

        ZoomInImageView imageFragmentSecondXml = findViewById(R.id.imageFragmentSecondXml);
        String url6 = "https://firebasestorage.googleapis.com/v0/b/android-app-5b365.appspot.com/o/Fragments%2Fpass%20data%20between%2Ffragment_second_xml.png?alt=media&token=3c16b1c1-f098-4e7d-86c9-595f410f7fcf";
        Glide.with(getApplicationContext()).load(url6).into(imageFragmentSecondXml);

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
            Intent intent = new Intent(PassDataBeetweenActivity.this, RunPassDataBetweenActivity.class);startActivity(intent);
        }
        return super.onOptionsItemSelected(item);
    }
}