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
import ru.developer.android.fragment.runFragments.RunDisplayRadioButton;
import ru.developer.android.fragment.runFragments.RunTransactionBetweenActivity;

public class TransactionBetweenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transaction_beetween);

        ActionBar actionBar = this.getSupportActionBar();
        if (actionBar != null){
            actionBar.setDisplayHomeAsUpEnabled(true);
        }
        actionBar.setTitle("Transaction Between");

        ZoomInImageView imageXML = findViewById(R.id.imageXML);
        String url = "https://firebasestorage.googleapis.com/v0/b/android-app-5b365.appspot.com/o/Fragments%2FTransaction%20Between%2Factivity_main.png?alt=media&token=482a543b-4aa3-44f6-bb43-2fd4e13f9a11";
        Glide.with(getApplicationContext()).load(url).into(imageXML);

        ZoomInImageView imageActivity = findViewById(R.id.imageActivity);
        String url2 = "https://firebasestorage.googleapis.com/v0/b/android-app-5b365.appspot.com/o/Fragments%2FTransaction%20Between%2FMainActivity.png?alt=media&token=aa1faa1e-0f06-4c46-8772-fa668497adb6";
        Glide.with(getApplicationContext()).load(url2).into(imageActivity);

        ZoomInImageView imageItemListFragment = findViewById(R.id.imageItemListFragment);
        String url3 = "https://firebasestorage.googleapis.com/v0/b/android-app-5b365.appspot.com/o/Fragments%2FTransaction%20Between%2FItemListFragment.png?alt=media&token=9d23bb46-fd96-4287-9976-0453b8436be2";
        Glide.with(getApplicationContext()).load(url3).into(imageItemListFragment);

        ZoomInImageView imageTextFragment = findViewById(R.id.imageTextFragment);
        String url4 = "https://firebasestorage.googleapis.com/v0/b/android-app-5b365.appspot.com/o/Fragments%2FTransaction%20Between%2FTextFragment.png?alt=media&token=dab2968e-7fff-4cd2-b407-77e800b926ce";
        Glide.with(getApplicationContext()).load(url4).into(imageTextFragment);

        ZoomInImageView image_text_view_xml = findViewById(R.id.image_text_view_xml);
        String url5 = "https://firebasestorage.googleapis.com/v0/b/android-app-5b365.appspot.com/o/Fragments%2FTransaction%20Between%2Ftext_view_xml.png?alt=media&token=b9975659-0ecc-46d5-b483-bcbcc08c1d4b";
        Glide.with(getApplicationContext()).load(url5).into(image_text_view_xml);

        ZoomInImageView image_list_view_xml = findViewById(R.id.image_list_view_xml);
        String url6 = "https://firebasestorage.googleapis.com/v0/b/android-app-5b365.appspot.com/o/Fragments%2FTransaction%20Between%2Flist_view_xml.png?alt=media&token=b1fef348-1f02-41ba-b561-e4406d7b9782";
        Glide.with(getApplicationContext()).load(url6).into(image_list_view_xml);

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
            Intent intent = new Intent(TransactionBetweenActivity.this, RunTransactionBetweenActivity.class);startActivity(intent);
        }
        return super.onOptionsItemSelected(item);
    }
}
