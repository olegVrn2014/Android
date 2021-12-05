package ru.developer.android.camera_sensor;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import ru.developer.android.R;
import ru.developer.android.multimedia.MainMultimedia;
import ru.developer.android.multimedia.MediaPlayerActivity;
import ru.developer.android.multimedia.VideoPlayerActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainCameraSensor extends AppCompatActivity {

    ListView listViewCameraSensor;
    ArrayAdapter<String> adapter;
    ArrayList<String> camera_sensor_list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_camera_sensor);

        ActionBar actionBar = this.getSupportActionBar();
        if (actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(true);
        }
        actionBar.setTitle("Камера и Сенсор");

        listViewCameraSensor = findViewById(R.id.listViewCameraSensor);

        setInitialData();

        adapter = new ArrayAdapter<>(this, R.layout.support_simple_spinner_dropdown_item, camera_sensor_list);
        listViewCameraSensor.setAdapter(adapter);

        listViewCameraSensor.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position) {
                    case 0:
                            Intent intent = new Intent(MainCameraSensor.this, TakingPhotosActivity.class); startActivity(intent);
                        break;
                    case 1:
                        Toast.makeText(MainCameraSensor.this, "В разработке", Toast.LENGTH_SHORT).show();
                       // Intent intent1 = new Intent(MainCameraSensor.this, RecordingVideoActivity.class); startActivity(intent1);
                        break;
                }
            }
        });
    }

        private void setInitialData () {

            camera_sensor_list = new ArrayList<>();
            camera_sensor_list.add("Taking Photos");
            camera_sensor_list.add("Recording Video");

        }


        @Override
        public boolean onOptionsItemSelected (MenuItem item){
            switch (item.getItemId()) {
                case android.R.id.home:
                    finish();
                    return true;
            }
            return super.onOptionsItemSelected(item);

        }
    }
