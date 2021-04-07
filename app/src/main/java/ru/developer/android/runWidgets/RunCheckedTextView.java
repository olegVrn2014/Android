package ru.developer.android.runWidgets;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import ru.developer.android.MainActivity;
import ru.developer.android.R;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.CheckedTextView;
import android.widget.Toast;

public class RunCheckedTextView extends AppCompatActivity {

    CheckedTextView checkedTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_run_checked_text_view);

        ActionBar actionBar = this.getSupportActionBar();
        if (actionBar != null){
            actionBar.setDisplayHomeAsUpEnabled(true);
        }
        actionBar.setTitle("Run app");
        actionBar.setHomeButtonEnabled(true);
        actionBar.setDisplayHomeAsUpEnabled(true);

        checkedTextView = findViewById(R.id.checkedTextView);
        checkedTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkedTextView.toggle();
                if (checkedTextView.isChecked()){
                    Toast.makeText(RunCheckedTextView.this, "Checked", Toast.LENGTH_SHORT).show();
                } else{
                    Toast.makeText(RunCheckedTextView.this, "Unchecked", Toast.LENGTH_SHORT).show();
                }
            }
        });
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