package ru.developer.android.fragment;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import ru.developer.android.R;

public class FragmentFirst extends Fragment {

    EditText editText;
    Button buttonConfirm;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_fragment_first, container, false);
        editText = view.findViewById(R.id.edit_text);
        buttonConfirm = view.findViewById(R.id.button_confirm);

        buttonConfirm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text= editText.getText().toString().trim();
                if (text.equals("")){
                    Toast.makeText(getActivity(), "Заполните текстовое поле", Toast.LENGTH_SHORT).show();
                }else {
                    FragmentSecond fragmentSecond = new FragmentSecond(text);
                    FragmentManager fragmentManager = getFragmentManager();
                    FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                    fragmentTransaction.replace(R.id.frame_layout,fragmentSecond);
                    fragmentTransaction.commit();
                }
            }
        });

        return view;
    }
}

