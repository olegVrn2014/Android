package ru.developer.android.runWidgets;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import ru.developer.android.MainActivity;
import ru.developer.android.R;

import android.os.Bundle;
import android.view.Gravity;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextSwitcher;
import android.widget.TextView;
import android.widget.ViewSwitcher;

public class RunTextSwitcher extends AppCompatActivity {

    TextSwitcher textSwitcher;
    Button buttonNext;
    Button buttonBack;
    String [] listNumbers = {"Один","Два","Три","Четыре","Пять", "Шесть","Семь","Восемь","Девять","Десять"};
    int position = -1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_run_text_switcher);

        ActionBar actionBar = this.getSupportActionBar();
        if (actionBar != null){
            actionBar.setDisplayHomeAsUpEnabled(true);
        }
        actionBar.setTitle("Run app");
        actionBar.setHomeButtonEnabled(true);
        actionBar.setDisplayHomeAsUpEnabled(true);

        // Находим ссылки по id из файла activity_main.xml
        textSwitcher = findViewById(R.id.textSwitcher);
        buttonNext = findViewById(R.id.buttonNext);
        buttonBack = findViewById(R.id.buttonBack);

        // Добавим TextView к TextSwitcher программно..
        textSwitcher.setFactory(new ViewSwitcher.ViewFactory() {
            @Override
            public View makeView() {
                TextView textView = new TextView(RunTextSwitcher.this);
                textView.setTextSize(30);
                textView.setTextColor(getResources().getColor(R.color.red));
                textView.setGravity(Gravity.CENTER);

                return textView;
            }
        });

        // Обработчик нажатия кнопки Вперёд
        buttonNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (position < listNumbers.length -1){
                    position = position + 1;
                    textSwitcher.setText(listNumbers[position]);
                }
            }
        });

        // Обработчик нажатия кнопки Назад
        buttonBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (position > 0){
                    position = position - 1;
                    textSwitcher.setText(listNumbers[position]);
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