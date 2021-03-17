package ru.developer.android;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.bumptech.glide.Glide;
import com.zolad.zoominimageview.ZoomInImageView;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import ru.developer.android.widgets.WidgetsMain;


public class Tab1Fragment extends Fragment {


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment1_layout, container, false);

        ZoomImage(view);
        onClickImage(view);

        return view;
    }

    private void onClickImage(View view) {
        ZoomInImageView widgets = view.findViewById(R.id.widgets);
        String url = "https://firebasestorage.googleapis.com/v0/b/android-app-5b365.appspot.com/o/MainPictures%2Fwidgets.png?alt=media&token=44e0c4e2-6ec1-4d81-91f2-54af7a7ed127";
        widgets.setClipToOutline(true);
        Glide.with(getContext()).load(url).into(widgets);

        ZoomInImageView toast = view.findViewById(R.id.toast);
        String url2 = "https://firebasestorage.googleapis.com/v0/b/android-app-5b365.appspot.com/o/MainPictures%2Ftoast.png?alt=media&token=9ad00a23-d80d-41a4-a4f0-d0a55470fc72";
        toast.setClipToOutline(true);
        Glide.with(getContext()).load(url2).into(toast);

        ZoomInImageView menu = view.findViewById(R.id.menu);
        String url3 = "https://firebasestorage.googleapis.com/v0/b/android-app-5b365.appspot.com/o/MainPictures%2Fmenu.png?alt=media&token=6ac73133-4ea1-4a7e-81d7-85ec88fc030c";
        menu.setClipToOutline(true);
        Glide.with(getContext()).load(url3).into(menu);
    }

    private void ZoomImage(View view) {
        ZoomInImageView widgets = view.findViewById(R.id.widgets);
        widgets.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), WidgetsMain.class);
                startActivity(intent);
            }
        });
    }


}