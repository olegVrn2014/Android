package ru.developer.android.containers;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import ru.developer.android.R;
import ru.developer.android.containers.runContainer.RunSearchView;
import ru.developer.android.containers.runContainer.RunSearchViewOnToolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import com.bumptech.glide.Glide;
import com.zolad.zoominimageview.ZoomInImageView;

public class SearchViewOnToolbar extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_view_on_toolbar);

        ActionBar actionBar = this.getSupportActionBar();
        if (actionBar != null){
            actionBar.setDisplayHomeAsUpEnabled(true);
        }
        actionBar.setTitle("SearchViewOnToolbar");

        ZoomInImageView imageXML = findViewById(R.id.imageXML);
        String url = "https://firebasestorage.googleapis.com/v0/b/android-app-5b365.appspot.com/o/Containers%2FSearchViewOnToolbar%2Factivity_main_xml.png?alt=media&token=01bdf107-3644-4461-8a40-5fac159668b6";
        Glide.with(getApplicationContext()).load(url).into(imageXML);

        ZoomInImageView imageActivity = findViewById(R.id.imageActivity);
        String url2 = "https://firebasestorage.googleapis.com/v0/b/android-app-5b365.appspot.com/o/Containers%2FSearchViewOnToolbar%2FActivity.jpg?alt=media&token=cf0f9bcf-bc5d-41d7-8a0c-c87b9d16da1f";
        Glide.with(getApplicationContext()).load(url2).into(imageActivity);

        ZoomInImageView imageSearchMenuXml = findViewById(R.id.imageSearchMenuXml);
        String url3 = "https://firebasestorage.googleapis.com/v0/b/android-app-5b365.appspot.com/o/Containers%2FSearchViewOnToolbar%2Fsearch_menu.png?alt=media&token=da659610-8b08-4c9a-af84-8606a600e2dc";
        Glide.with(getApplicationContext()).load(url3).into(imageSearchMenuXml);
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
           Intent intent = new Intent(SearchViewOnToolbar.this, RunSearchViewOnToolbar.class);startActivity(intent);
        }
        return super.onOptionsItemSelected(item);
    }
}
