package ru.developer.android;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;
import com.google.android.material.tabs.TabLayout;
import java.util.Objects;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




        SectionsPageAdapter mSectionsPageAdapter = new SectionsPageAdapter(getSupportFragmentManager());

        ViewPager mViewPager = findViewById(R.id.container);
        setupViewPager(mViewPager);
        TabLayout tabLayout =  findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(mViewPager);

        Objects.requireNonNull(tabLayout.getTabAt(0)).setText(R.string.tutorial_android);
        Objects.requireNonNull(tabLayout.getTabAt(1)).setText(R.string.Questions);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main_menu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.share){
            Toast.makeText(this,getResources().getText(R.string.share), Toast.LENGTH_SHORT).show();
        }else if (id == R.id.star){
            Toast.makeText(this,getResources().getText(R.string.rating), Toast.LENGTH_SHORT).show();
        } else if (id == R.id.settings){
            Toast.makeText(this,getResources().getText(R.string.settings), Toast.LENGTH_SHORT).show();
        }
        return super.onOptionsItemSelected(item);
    }

    private void setupViewPager(ViewPager viewPager) {
        SectionsPageAdapter adapter = new SectionsPageAdapter(getSupportFragmentManager());
        adapter.addFragment(new TutorialFragment());
        adapter.addFragment(new QuestionsFragment());
        viewPager.setAdapter(adapter);
    }
}