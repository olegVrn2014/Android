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

public class MyDisplayOnFragment extends DialogFragment {

    List<String> countries;

    @NonNull
    @Override
    public Dialog onCreateDialog(@Nullable Bundle savedInstanceState) {

        countries = new ArrayList<>();
        countries.add("Россия");
        countries.add("Португалия");
        countries.add("Бразилия");
        countries.add("Англия");
        countries.add("Беларусь");
        countries.add("Дубай");

        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setTitle("Страны: ");
        builder.setItems(countries.toArray(new String[0]), new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(getActivity(), "Мне нравится " + countries.get(which), Toast.LENGTH_SHORT).show();
            }
        });

        return builder.create();
    }
}
