package ru.developer.android.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import ru.developer.android.R;

public class FragmentOne extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                                                      @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.activity_fragment_one,container,false);
    }
}


