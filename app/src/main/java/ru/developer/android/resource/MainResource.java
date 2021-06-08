package ru.developer.android.resource;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import ru.developer.android.R;
import ru.developer.android.layouts.ConstraintActivity;
import ru.developer.android.layouts.FrameActivity;
import ru.developer.android.layouts.GridActivity;
import ru.developer.android.layouts.LinearActivity;
import ru.developer.android.layouts.MainLayouts;
import ru.developer.android.layouts.RelativeActivity;
import ru.developer.android.layouts.ScrollViewActivity;
import ru.developer.android.layouts.TableActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainResource extends AppCompatActivity {

    ListView listViewResource;
    ArrayAdapter<String> adapter;
    ArrayList<String> resourceList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_resource);

        ActionBar actionBar = this.getSupportActionBar();
        if (actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(true);
        }
        actionBar.setTitle("Resources");
        listViewResource = findViewById(R.id.listViewResource);

        setInitialData();

        adapter = new ArrayAdapter<>(this, R.layout.support_simple_spinner_dropdown_item, resourceList);
        listViewResource.setAdapter(adapter);

        listViewResource.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position) {
                    case 0:
                        Intent intent = new Intent(MainResource.this, Res1lessons.class);
                        startActivity(intent);
                        break;
                    case 1:
                        Intent intent1 = new Intent(MainResource.this, Res2TypeLessons.class);
                        startActivity(intent1);
                        break;
                    case 2:
                        Intent intent2 = new Intent(MainResource.this, Res3PrimLessons.class);
                        startActivity(intent2);
                        break;
                    case 3:
                        Intent intent3 = new Intent(MainResource.this, Res4AccessLessons.class);
                        startActivity(intent3);
                        break;
                    case 4:
                        Intent intent4 = new Intent(MainResource.this, Res5GetResources.class);
                        startActivity(intent4);
                        break;
                    case 5:
                        Intent intent5 = new Intent(MainResource.this, Res6Lessons.class);
                        startActivity(intent5);
                        break;
                }
            }
        });
    }

    private void setInitialData() {

        resourceList = new ArrayList<>();
        resourceList.add("Введение в ресурсы");
        resourceList.add("Типы ресурсов");
        resourceList.add("Применение ресурсов");
        resourceList.add("Доступ в файле xml");
        resourceList.add("Метод getResources");
        resourceList.add("Ресурсы строк");
        resourceList.add("Форматирование строк");
        resourceList.add("Ресурсы Plurals");
        resourceList.add("String array");
        resourceList.add("Ресурсы dimension");
        resourceList.add("Ресурсы Color");
        resourceList.add("Установка цвета");
        resourceList.add("Drawable");


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
