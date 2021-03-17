package ru.developer.android.widgets;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;
import ru.developer.android.AdapterTutorial;
import ru.developer.android.R;
import ru.developer.android.Tutorial;

import android.os.Bundle;

import java.util.ArrayList;

public class WidgetsMain extends AppCompatActivity {

    ArrayList<Tutorial> tutorials = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.widgets_main);

        RecyclerView recyclerView = findViewById(R.id.recyclerTutorial);
        setInitialData();

        AdapterTutorial adapter = new AdapterTutorial(this, tutorials);
        recyclerView.setAdapter(adapter);
    }
    private void setInitialData() {

        tutorials.add(new Tutorial("TextView", R.drawable.ic_android_24));
        tutorials.add(new Tutorial("EditText", R.drawable.ic_android_24));
        tutorials.add(new Tutorial("Button", R.drawable.ic_android_24));
        tutorials.add(new Tutorial("ToggleButton", R.drawable.ic_android_24));
        tutorials.add(new Tutorial("RadioButton", R.drawable.ic_android_24));
        tutorials.add(new Tutorial("ImageView", R.drawable.ic_android_24));
        tutorials.add(new Tutorial("ImageButton", R.drawable.ic_android_24));
        tutorials.add(new Tutorial("Switch", R.drawable.ic_android_24));
        tutorials.add(new Tutorial("Checkbox", R.drawable.ic_android_24));
        tutorials.add(new Tutorial("CustomCheckbox", R.drawable.ic_android_24));
        tutorials.add(new Tutorial("Spinner", R.drawable.ic_android_24));
        tutorials.add(new Tutorial("SeekBar", R.drawable.ic_android_24));
        tutorials.add(new Tutorial("RatingBar", R.drawable.ic_android_24));
        tutorials.add(new Tutorial("AutoCompleteTextView", R.drawable.ic_android_24));
        tutorials.add(new Tutorial("MultiCompleteTextView", R.drawable.ic_android_24));
        tutorials.add(new Tutorial("ImageSwitcher", R.drawable.ic_android_24));
        tutorials.add(new Tutorial("TextSwitcher", R.drawable.ic_android_24));
        tutorials.add(new Tutorial("ScrollView", R.drawable.ic_android_24));
        tutorials.add(new Tutorial("AlertDialog", R.drawable.ic_android_24));


    }
}