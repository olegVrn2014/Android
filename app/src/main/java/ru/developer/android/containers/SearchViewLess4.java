package ru.developer.android.containers;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import ru.developer.android.R;
import ru.developer.android.containers.runContainer.RunSearchView;
import ru.developer.android.containers.runContainer.RunWebView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import com.bumptech.glide.Glide;
import com.zolad.zoominimageview.ZoomInImageView;

public class SearchViewLess4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_view_less4);

        ActionBar actionBar = this.getSupportActionBar();
        if (actionBar != null){
            actionBar.setDisplayHomeAsUpEnabled(true);
        }
        actionBar.setTitle("SearchView");

        ZoomInImageView imageXML = findViewById(R.id.imageXML);
        String url = "https://firebasestorage.googleapis.com/v0/b/android-app-5b365.appspot.com/o/Containers%2FSearchView%2Fxml_searchView.png?alt=media&token=febe02b5-f9ab-4ddd-a88a-00ba83ed2d26";
        Glide.with(getApplicationContext()).load(url).into(imageXML);

        ZoomInImageView imageActivity = findViewById(R.id.imageActivity);
        String url2 = "https://firebasestorage.googleapis.com/v0/b/android-app-5b365.appspot.com/o/Containers%2FSearchView%2Factivity.png?alt=media&token=3d811a6a-d52a-4d39-a356-f5f83d7b73e6";
        Glide.with(getApplicationContext()).load(url2).into(imageActivity);
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
            Intent intent = new Intent(SearchViewLess4.this, RunSearchView.class);startActivity(intent);
        }
        return super.onOptionsItemSelected(item);
    }
}
