package ru.developer.android.intents;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NavUtils;
import androidx.lifecycle.Lifecycle;
import ru.developer.android.R;
import ru.developer.android.toast.CustomToastActivity;
import ru.developer.android.toast.PositionToastActivity;
import ru.developer.android.toast.SimpleToastActivity;
import ru.developer.android.toast.ToastMain;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.google.android.gms.common.api.internal.LifecycleActivity;

import java.util.ArrayList;

public class IntentMain extends AppCompatActivity {

    ListView listViewIntents;
    ArrayAdapter<String> adapter;
    ArrayList<String> intentList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intent_main);

        ActionBar actionBar = this.getSupportActionBar();
        if (actionBar != null){
            actionBar.setDisplayHomeAsUpEnabled(true);
        }
        actionBar.setTitle("Intent");


        listViewIntents = findViewById(R.id.listViewIntents);

        setInitialData();

        adapter = new ArrayAdapter<>(this,R.layout.support_simple_spinner_dropdown_item, intentList);
        listViewIntents.setAdapter(adapter);

        listViewIntents.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position){
                    case 0:
                        Intent intent = new Intent(IntentMain.this, ActivityLifecycle.class); startActivity(intent);
                        break;
                    case 1:
                        Intent intent1 = new Intent(IntentMain.this, ChangeIntentActivity.class); startActivity(intent1);
                        break;
                    case 2:
                        Intent intent2 = new Intent(IntentMain.this, PassDataBetweenActivity.class); startActivity(intent2);
                        break;
                    case 3:
                        Intent intent3 = new Intent(IntentMain.this, WhatsAppActivity.class); startActivity(intent3);
                        break;
                    case 4:
                        Intent intent4 = new Intent(IntentMain.this, EmailActivity.class); startActivity(intent4);
                        break;
                    case 5:
                        Intent intent5 = new Intent(IntentMain.this, PhoneCallActivity.class); startActivity(intent5);
                        break;
                    case 6:
                        Intent intent6 = new Intent(IntentMain.this, PlayStoreActivity.class); startActivity(intent6);
                        break;
                    case 7:
                        Intent intent7 = new Intent(IntentMain.this, GoogleMapActivity.class); startActivity(intent7);
                        break;
                    case 8:
                        Intent intent8 = new Intent(IntentMain.this, GoogleSearchActivity.class); startActivity(intent8);
                        break;
                    case 9:
                        Intent intent9 = new Intent(IntentMain.this, StartActForResultActivity.class); startActivity(intent9);
                        break;
                    case 10:
                        Intent intent10 = new Intent(IntentMain.this, ShareIntentActivity.class); startActivity(intent10);
                        break;

                }
            }
        });
    }

    private void setInitialData() {

        intentList = new ArrayList<>();
        intentList.add("Activity Lifecycle");
        intentList.add("Change Activity by Intent");
        intentList.add("Pass Data Between Activity");
        intentList.add("Launch WhatsApp");
        intentList.add("Launch Email");
        intentList.add("Launch PhoneCall");
        intentList.add("Launch PlayStore");
        intentList.add("Launch Google Map");
        intentList.add("Launch Google Search");
        intentList.add("StartActivityForResult");
        intentList.add("Share Intent");
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();
        if (id == android.R.id.home){
            NavUtils.navigateUpFromSameTask(this);
        }
        return super.onOptionsItemSelected(item);
    }
}