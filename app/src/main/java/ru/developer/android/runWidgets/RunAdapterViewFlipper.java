package ru.developer.android.runWidgets;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import ru.developer.android.R;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.AdapterViewFlipper;

public class RunAdapterViewFlipper extends AppCompatActivity {

    int[] iconsImage = {R.drawable.ic_previous_24,R.drawable.ic_next_24,
            R.drawable.ic_checkbox_no_checked,R.drawable.ic_checkbox_checked,R.drawable.ic_phone_24};

    String iconText[] = {"Previous","Next","unChecked","Checked","Phone"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_run_adapter_view_flipper);

        ActionBar actionBar = this.getSupportActionBar();
        if (actionBar != null){
            actionBar.setDisplayHomeAsUpEnabled(true);
        }
        actionBar.setTitle("Run app");
        actionBar.setHomeButtonEnabled(true);
        actionBar.setDisplayHomeAsUpEnabled(true);

        AdapterViewFlipper adapterViewFlipper = findViewById(R.id.adapterViewFlipper);
        ru.developer.android.runWidgets.AdapterViewFlipper adapter = new ru.developer.android.runWidgets.AdapterViewFlipper(this,iconsImage,iconText);
        adapterViewFlipper.setAdapter(adapter);
        adapterViewFlipper.setFlipInterval(2000);
        adapterViewFlipper.setAutoStart(true);

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