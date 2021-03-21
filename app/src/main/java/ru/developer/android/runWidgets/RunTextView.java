package ru.developer.android.runWidgets;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import ru.developer.android.MainActivity;
import ru.developer.android.R;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class RunTextView extends AppCompatActivity {

    private TextView textView, textViewLink;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.run_text_view);

        ActionBar actionBar = this.getSupportActionBar();
        if (actionBar != null){
            actionBar.setDisplayHomeAsUpEnabled(true);
        }
        actionBar.setTitle("Run app");
        actionBar.setHomeButtonEnabled(true);
        actionBar.setDisplayHomeAsUpEnabled(true);

        textView = findViewById(R.id.textView);
        textViewLink = findViewById(R.id.textViewLink);

        textViewLink.setBackgroundColor(getResources()
                .getColor(R.color.purple_200));

        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(RunTextView.this,
                        "Это TextView", Toast.LENGTH_SHORT).show();
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