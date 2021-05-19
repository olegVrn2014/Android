package ru.developer.android.android;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import ru.developer.android.R;

import android.os.Bundle;
import android.view.MenuItem;

import com.bumptech.glide.Glide;
import com.zolad.zoominimageview.ZoomInImageView;

public class ExampleActivityMainXml extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_example_main_xml);

        ActionBar actionBar = this.getSupportActionBar();
        if (actionBar != null){
            actionBar.setDisplayHomeAsUpEnabled(true);
        }
        actionBar.setTitle("Обзор activity_main.xml");

        ZoomInImageView imageExampleActivityMainXml = findViewById(R.id.imageExampleActivityMainXml);
        String url = "https://firebasestorage.googleapis.com/v0/b/android-app-5b365.appspot.com/o/Android%2FExampleActivityMainXml%2Fact_main_design.png?alt=media&token=4bb122eb-85b2-4c06-832d-1b111847d143";
        Glide.with(getApplicationContext()).load(url).into(imageExampleActivityMainXml);

        ZoomInImageView imageActivityMainXml = findViewById(R.id.imageActivityMainXml);
        String url1 = "https://firebasestorage.googleapis.com/v0/b/android-app-5b365.appspot.com/o/Android%2FExampleActivityMainXml%2Fact_main_xml.png?alt=media&token=66fd7d77-bc1b-4762-a498-9ddbe3f1b80b";
        Glide.with(getApplicationContext()).load(url1).into(imageActivityMainXml);

        ZoomInImageView imageConstr_Layout = findViewById(R.id.imageConstr_Layout);
        String url2 = "https://firebasestorage.googleapis.com/v0/b/android-app-5b365.appspot.com/o/Android%2FExampleActivityMainXml%2Fconst_lay.png?alt=media&token=a2390632-2431-4864-b144-9870626fa975";
        Glide.with(getApplicationContext()).load(url2).into(imageConstr_Layout);

        ZoomInImageView imageXmlns = findViewById(R.id.imageXmlns);
        String url3 = "https://firebasestorage.googleapis.com/v0/b/android-app-5b365.appspot.com/o/Android%2FExampleActivityMainXml%2Fxmlns.png?alt=media&token=820663ea-af68-4eab-b042-e348016f798c";
        Glide.with(getApplicationContext()).load(url3).into(imageXmlns);

        ZoomInImageView imageWidth_height = findViewById(R.id.imageWidth_height);
        String url4 = "https://firebasestorage.googleapis.com/v0/b/android-app-5b365.appspot.com/o/Android%2FExampleActivityMainXml%2Fheight_weight.png?alt=media&token=f4b45913-aaed-4f33-9396-05b47499c8e3";
        Glide.with(getApplicationContext()).load(url4).into(imageWidth_height);

        ZoomInImageView imageTextView = findViewById(R.id.imageTextView);
        String url5 = "https://firebasestorage.googleapis.com/v0/b/android-app-5b365.appspot.com/o/Android%2FExampleActivityMainXml%2FtextView.png?alt=media&token=901df301-9be4-44e8-ab2a-2984dcb2e112";
        Glide.with(getApplicationContext()).load(url5).into(imageTextView);


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