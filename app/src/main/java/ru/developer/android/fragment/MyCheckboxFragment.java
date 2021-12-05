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

public class MyCheckboxFragment extends DialogFragment {

    List<String> countries;
    List<String> strCountries = new ArrayList<>();

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
        builder.setTitle("Страны:");
        builder.setMultiChoiceItems(countries.toArray(new String[0]), null, new DialogInterface.OnMultiChoiceClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which, boolean isChecked) {
                if (isChecked){
                    strCountries.add(countries.get(which));
                }else {
                    strCountries.remove(countries.get(which));
                }
            }
        });

        builder.setPositiveButton("Ок", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                String selection = "";
                for (String item : strCountries){
                    selection = selection + "\n" + item;
                }
                Toast.makeText(getActivity(), "Вы выбрали: "+ selection, Toast.LENGTH_SHORT).show();
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
