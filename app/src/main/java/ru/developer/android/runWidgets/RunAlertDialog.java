package ru.developer.android.runWidgets;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import ru.developer.android.MainActivity;
import ru.developer.android.R;
import ru.developer.android.widgets.AlertDialogActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class RunAlertDialog extends AppCompatActivity {

    private Button button;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_run_alert_dialog);

        ActionBar actionBar = this.getSupportActionBar();
        if (actionBar != null){
            actionBar.setDisplayHomeAsUpEnabled(true);
        }
        actionBar.setTitle("Run app");
        actionBar.setHomeButtonEnabled(true);
        actionBar.setDisplayHomeAsUpEnabled(true);

        button = findViewById(R.id.button);
        textView = findViewById(R.id.textView);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder alertDialog = new AlertDialog.Builder(RunAlertDialog.this);
                alertDialog.setTitle("Выход");
                alertDialog.setIcon(R.mipmap.ic_launcher_round);
                alertDialog.setMessage("Вы уверены, что хотите выйти?");
                alertDialog.setCancelable(false);

                alertDialog.setPositiveButton("Да", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Intent intent = new Intent(RunAlertDialog.this, AlertDialogActivity.class);
                        startActivity(intent);
                    }
                });

                alertDialog.setNegativeButton("Нет", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(RunAlertDialog.this, "Вы нажали НЕТ", Toast.LENGTH_SHORT).show();
                    }
                });

                alertDialog.setNeutralButton("Назад", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(RunAlertDialog.this, "Вы нажали НАЗАД", Toast.LENGTH_SHORT).show();
                    }
                });

                AlertDialog dialog = alertDialog.create();
                dialog.show();

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