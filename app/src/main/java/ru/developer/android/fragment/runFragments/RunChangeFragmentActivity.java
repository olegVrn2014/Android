package ru.developer.android.fragment.runFragments;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import ru.developer.android.R;
import ru.developer.android.fragment.FragmentOne;
import ru.developer.android.fragment.FragmentTwo;

public class RunChangeFragmentActivity extends AppCompatActivity {

    Button button;
    boolean result = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_run_change_fragment);

        ActionBar actionBar = this.getSupportActionBar();
        if (actionBar != null){
            actionBar.setDisplayHomeAsUpEnabled(true);
        }
        actionBar.setTitle("Запуск change fragment");
        actionBar.setHomeButtonEnabled(true);
        actionBar.setDisplayHomeAsUpEnabled(true);

        button = findViewById(R.id.change_fragment);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fragmentManager = getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

                if (!result) {
                    FragmentOne fragmentOne = new FragmentOne();
                    fragmentTransaction.replace(R.id.frameLayout, fragmentOne);
                    fragmentTransaction.commit();
                    button.setText("Открыть второй фрагмент");
                    result = true;
                }else{
                    FragmentTwo fragmentTwo = new FragmentTwo();
                    fragmentTransaction.replace(R.id.frameLayout, fragmentTwo);
                    fragmentTransaction.commit();
                    button.setText("Открыть первый фрагмент");
                    result = false;
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

