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
import ru.developer.android.fragment.runFragments.RunChangeFragmentActivity;
import ru.developer.android.fragment.runFragments.RunDialogFragmentActivity;

public class DialogFragmentActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dailog_fragment);

        ActionBar actionBar = this.getSupportActionBar();
        if (actionBar != null){
            actionBar.setDisplayHomeAsUpEnabled(true);
        }
        actionBar.setTitle("Dialog Fragment");

        ZoomInImageView imageXML = findViewById(R.id.imageXML);
        String url = "https://firebasestorage.googleapis.com/v0/b/android-app-5b365.appspot.com/o/Fragments%2Fdialog%20fragment%2Fxml.png?alt=media&token=1996f10a-aef4-4eb2-ab8d-c60df287ce62";
        Glide.with(getApplicationContext()).load(url).into(imageXML);

        ZoomInImageView imageActivity = findViewById(R.id.imageActivity);
        String url2 = "https://firebasestorage.googleapis.com/v0/b/android-app-5b365.appspot.com/o/Fragments%2Fdialog%20fragment%2Factivity.png?alt=media&token=3c494cc5-6ba8-4461-8e26-a46e72203fc3";
        Glide.with(getApplicationContext()).load(url2).into(imageActivity);

        ZoomInImageView imageMyDialogFragment = findViewById(R.id.imageMyDialogFragment);
        String url3 = "https://firebasestorage.googleapis.com/v0/b/android-app-5b365.appspot.com/o/Fragments%2Fdialog%20fragment%2FmyDialogFragment.png?alt=media&token=0273906d-1d8d-4ef2-a84e-e8783098f252";
        Glide.with(getApplicationContext()).load(url3).into(imageMyDialogFragment);

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
            Intent intent = new Intent(DialogFragmentActivity.this, RunDialogFragmentActivity.class);startActivity(intent);
        }
        return super.onOptionsItemSelected(item);
    }
}
