package ru.developer.android.multimedia;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import ru.developer.android.R;
import ru.developer.android.animations.BlinkActivity;
import ru.developer.android.animations.BounceActivity;
import ru.developer.android.animations.FadeActivity;
import ru.developer.android.animations.InterpolatorActivity;
import ru.developer.android.animations.MainAnimations;
import ru.developer.android.animations.MoveActivity;
import ru.developer.android.animations.RotateActivity;
import ru.developer.android.animations.SlideActivity;
import ru.developer.android.animations.ZoomActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainMultimedia extends AppCompatActivity {

    ListView listViewMultimedia;
    ArrayAdapter<String> adapter;
    ArrayList<String> multimedia_list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_mulimedia);

        ActionBar actionBar = this.getSupportActionBar();
        if (actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(true);
        }
        actionBar.setTitle("Multimedia");

        listViewMultimedia = findViewById(R.id.listViewMultimedia);

        setInitialData();

        adapter = new ArrayAdapter<>(this, R.layout.support_simple_spinner_dropdown_item, multimedia_list);
        listViewMultimedia.setAdapter(adapter);

        listViewMultimedia.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position) {
                    case 0:
                          Intent intent = new Intent(MainMultimedia.this,MediaPlayerActivity.class); startActivity(intent);
                        break;
                    case 1:
                          Intent intent1 = new Intent(MainMultimedia.this,VideoPlayerActivity.class); startActivity(intent1);
                        break;
                    case 2:
                        Toast.makeText(MainMultimedia.this, "Урок на доработке", Toast.LENGTH_SHORT).show();
                         //  Intent intent2 = new Intent(MainMultimedia.this,RecordingActivity.class); startActivity(intent2);
                        break;
                }
            }
        });
    }

        private void setInitialData() {

            multimedia_list = new ArrayList<>();
            multimedia_list.add("Media Player");
            multimedia_list.add("Video Player");
            multimedia_list.add("Recording Media");

        }


        @Override
        public boolean onOptionsItemSelected(MenuItem item) {
            switch (item.getItemId()) {
                case android.R.id.home:
                    finish();
                    return true;
            }
            return super.onOptionsItemSelected(item);

    }
}