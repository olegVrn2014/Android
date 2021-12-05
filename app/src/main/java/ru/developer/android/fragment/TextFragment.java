package ru.developer.android.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import ru.developer.android.R;


public class TextFragment extends Fragment {
    TextView textViewOS;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.text_view,container,false);
        textViewOS = view.findViewById(R.id.textDisplay);
        return view;
    }
    public void change (String txt) {
        textViewOS.setText(txt);
    }
}



