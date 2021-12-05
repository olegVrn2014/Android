package ru.developer.android.fragment;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.DialogFragment;

import java.util.ArrayList;
import java.util.List;

public class MyRadioButtonFragment extends DialogFragment {

    List<String> fruits;
    String fruit;

    @NonNull
    @Override
    public Dialog onCreateDialog(@Nullable Bundle savedInstanceState) {

        fruits = new ArrayList<>();
        fruits.add("Апельсин");
        fruits.add("Яблоко");
        fruits.add("Банан");
        fruits.add("Вишня");
        fruits.add("Папайя");
        fruits.add("Манго");

        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setTitle("Фрукты:");
        builder.setCancelable(false);

        builder.setSingleChoiceItems(fruits.toArray(new String[0]), -1, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                fruit = fruits.get(which);
            }
        });

        builder.setPositiveButton("Ок", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(getActivity(), "Вы выбрали: " + fruit, Toast.LENGTH_SHORT).show();
            }
        });

        builder.setNegativeButton("Отмена", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        });

        return builder.create();
    }
}


