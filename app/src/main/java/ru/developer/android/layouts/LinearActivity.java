package ru.developer.android.layouts;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import ru.developer.android.R;

import android.os.Bundle;
import android.view.MenuItem;

import com.bumptech.glide.Glide;
import com.zolad.zoominimageview.ZoomInImageView;

public class LinearActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linear);

        ActionBar actionBar = this.getSupportActionBar();
        if (actionBar != null){
            actionBar.setDisplayHomeAsUpEnabled(true);
        }
        actionBar.setTitle("LinearLayout");

        ZoomInImageView imageLinearActivity1 = findViewById(R.id.imageLinearActivity1);
        String url = "https://firebasestorage.googleapis.com/v0/b/android-app-5b365.appspot.com/o/Layouts%2FLinear%2F1.png?alt=media&token=3dfbd36d-a3f8-437c-824b-7816d9f77310";
        Glide.with(getApplicationContext()).load(url).into(imageLinearActivity1);

        ZoomInImageView imageLinearActivity2 = findViewById(R.id.imageLinearActivity2);
        String url2 = "https://firebasestorage.googleapis.com/v0/b/android-app-5b365.appspot.com/o/Layouts%2FLinear%2F2.jpg?alt=media&token=95cb5737-8442-48d9-8035-b48497a5f607";
        Glide.with(getApplicationContext()).load(url2).into(imageLinearActivity2);

        ZoomInImageView imageLinearActivity3 = findViewById(R.id.imageLinearActivity3);
        String url3= "https://firebasestorage.googleapis.com/v0/b/android-app-5b365.appspot.com/o/Layouts%2FLinear%2F3.png?alt=media&token=56ca701d-563e-474c-bf94-96ef67d20d47";
        Glide.with(getApplicationContext()).load(url3).into(imageLinearActivity3);

        ZoomInImageView imageLinearActivity4 = findViewById(R.id.imageLinearActivity4);
        String url4= "https://firebasestorage.googleapis.com/v0/b/android-app-5b365.appspot.com/o/Layouts%2FLinear%2F4.jpg?alt=media&token=313a0d85-8281-4a7e-8e51-31bed6b3583d";
        Glide.with(getApplicationContext()).load(url4).into(imageLinearActivity4);

        ZoomInImageView imageLinearActivity5 = findViewById(R.id.imageLinearActivity5);
        String url5= "https://firebasestorage.googleapis.com/v0/b/android-app-5b365.appspot.com/o/Layouts%2FLinear%2F5.png?alt=media&token=8fc1d772-41c7-4548-82e3-df5b92a799e3";
        Glide.with(getApplicationContext()).load(url5).into(imageLinearActivity5);

        ZoomInImageView imageLinearActivity6 = findViewById(R.id.imageLinearActivity6);
        String url6= "https://firebasestorage.googleapis.com/v0/b/android-app-5b365.appspot.com/o/Layouts%2FLinear%2F6.png?alt=media&token=9de77e0e-556b-418b-88b0-24008913ece2";
        Glide.with(getApplicationContext()).load(url6).into(imageLinearActivity6);

        ZoomInImageView imageLinearActivity7 = findViewById(R.id.imageLinearActivity7);
        String url7= "https://firebasestorage.googleapis.com/v0/b/android-app-5b365.appspot.com/o/Layouts%2FLinear%2F7.jpg?alt=media&token=5990052a-ef7f-4942-8f6f-697c581257d0";
        Glide.with(getApplicationContext()).load(url7).into(imageLinearActivity7);

        ZoomInImageView imageLinearActivity8 = findViewById(R.id.imageLinearActivity8);
        String url8= "https://firebasestorage.googleapis.com/v0/b/android-app-5b365.appspot.com/o/Layouts%2FLinear%2F8.png?alt=media&token=cd037b5e-d692-4b1f-a23a-a8b3e1509e1a";
        Glide.with(getApplicationContext()).load(url8).into(imageLinearActivity8);

        ZoomInImageView imageLinearActivity9 = findViewById(R.id.imageLinearActivity9);
        String url9= "https://firebasestorage.googleapis.com/v0/b/android-app-5b365.appspot.com/o/Layouts%2FLinear%2F9.png?alt=media&token=c195c17b-6541-47ab-ac49-701da6ba1996";
        Glide.with(getApplicationContext()).load(url9).into(imageLinearActivity9);

        ZoomInImageView imageLinearActivity10 = findViewById(R.id.imageLinearActivity10);
        String url10= "https://firebasestorage.googleapis.com/v0/b/android-app-5b365.appspot.com/o/Layouts%2FLinear%2F10.jpg?alt=media&token=d28619a0-642f-4102-b462-7b99db0060ae";
        Glide.with(getApplicationContext()).load(url10).into(imageLinearActivity10);

        ZoomInImageView imageLinearActivity11 = findViewById(R.id.imageLinearActivity11);
        String url11= "https://firebasestorage.googleapis.com/v0/b/android-app-5b365.appspot.com/o/Layouts%2FLinear%2F11.png?alt=media&token=dd007e5b-e154-4574-88ff-bc50e21e16e2";
        Glide.with(getApplicationContext()).load(url11).into(imageLinearActivity11);

        ZoomInImageView imageLinearActivity12 = findViewById(R.id.imageLinearActivity12);
        String url12= "https://firebasestorage.googleapis.com/v0/b/android-app-5b365.appspot.com/o/Layouts%2FLinear%2F12.jpg?alt=media&token=fd911ae7-1114-41f3-b093-37e36aa80334";
        Glide.with(getApplicationContext()).load(url12).into(imageLinearActivity12);
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