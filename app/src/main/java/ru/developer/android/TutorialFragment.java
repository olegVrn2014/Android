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
import ru.developer.android.intents.IntentMain;
import ru.developer.android.toast.ToastMain;
import ru.developer.android.widgets.WidgetsMain;


public class TutorialFragment extends Fragment {


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_tutorial, container, false);

        ZoomImage(view);
        onClickImage(view);

        return view;
    }



    private void onClickImage(View view) {
        ZoomInImageView android = view.findViewById(R.id.android);
        String url = "https://firebasestorage.googleapis.com/v0/b/android-app-5b365.appspot.com/o/MainPictures%2Fabdroid-studio.jpg?alt=media&token=5abdb52e-3f2f-4740-ae26-83cca2eec0d4";
        android.setClipToOutline(true);
        Glide.with(getContext()).load(url).into(android);

        ZoomInImageView layouts = view.findViewById(R.id.layouts);
        String url2 = "https://firebasestorage.googleapis.com/v0/b/android-app-5b365.appspot.com/o/MainPictures%2Flayouts.jpg?alt=media&token=b83c6e88-6620-4e55-b06e-ae991081f6e1";
        layouts.setClipToOutline(true);
        Glide.with(getContext()).load(url2).into(layouts);

        ZoomInImageView widgets = view.findViewById(R.id.widgets);
        String url3 = "https://firebasestorage.googleapis.com/v0/b/android-app-5b365.appspot.com/o/MainPictures%2Fwidgets.png?alt=media&token=44e0c4e2-6ec1-4d81-91f2-54af7a7ed127";
        widgets.setClipToOutline(true);
        Glide.with(getContext()).load(url3).into(widgets);

        ZoomInImageView resources = view.findViewById(R.id.resources);
        String url4 = "https://firebasestorage.googleapis.com/v0/b/android-app-5b365.appspot.com/o/MainPictures%2Fresources.jpg?alt=media&token=95bd6802-942c-4e9c-b2e0-83d20f6f1a51";
        resources.setClipToOutline(true);
        Glide.with(getContext()).load(url4).into(resources);

        ZoomInImageView stylesThemes = view.findViewById(R.id.styles_themes);
        String url5 = "https://firebasestorage.googleapis.com/v0/b/android-app-5b365.appspot.com/o/MainPictures%2Fstyle-themes.jpg?alt=media&token=e90c5dc6-30c7-4400-b269-556177f53fd2";
        stylesThemes.setClipToOutline(true);
        Glide.with(getContext()).load(url5).into(stylesThemes);

        ZoomInImageView toast = view.findViewById(R.id.toast);
        String url6 = "https://firebasestorage.googleapis.com/v0/b/android-app-5b365.appspot.com/o/MainPictures%2Ftoast.png?alt=media&token=9ad00a23-d80d-41a4-a4f0-d0a55470fc72";
        toast.setClipToOutline(true);
        Glide.with(getContext()).load(url6).into(toast);

        ZoomInImageView intents = view.findViewById(R.id.intents);
        String url7 = "https://firebasestorage.googleapis.com/v0/b/android-app-5b365.appspot.com/o/MainPictures%2Fintent.png?alt=media&token=bb1c1c68-da8f-4074-9cbe-8d2069508d6a";
        intents.setClipToOutline(true);
        Glide.with(getContext()).load(url7).into(intents);

        ZoomInImageView menu = view.findViewById(R.id.menu);
        String url8 = "https://firebasestorage.googleapis.com/v0/b/android-app-5b365.appspot.com/o/MainPictures%2Fmenu.png?alt=media&token=6ac73133-4ea1-4a7e-81d7-85ec88fc030c";
        menu.setClipToOutline(true);
        Glide.with(getContext()).load(url8).into(menu);

        ZoomInImageView containers = view.findViewById(R.id.containers);
        String url9 = "https://firebasestorage.googleapis.com/v0/b/android-app-5b365.appspot.com/o/MainPictures%2Fcontainers.png?alt=media&token=1dd3a151-58b4-4106-96be-b3287708e23c";
        containers.setClipToOutline(true);
        Glide.with(getContext()).load(url9).into(containers);

        ZoomInImageView dateTime = view.findViewById(R.id.dateTime);
        String url10 = "https://firebasestorage.googleapis.com/v0/b/android-app-5b365.appspot.com/o/MainPictures%2Fdate-time.png?alt=media&token=8b77ad37-3f41-418e-8987-f86200033e4d";
        dateTime.setClipToOutline(true);
        Glide.with(getContext()).load(url10).into(dateTime);

        ZoomInImageView materialDesign = view.findViewById(R.id.materialDesign);
        String url11 = "https://firebasestorage.googleapis.com/v0/b/android-app-5b365.appspot.com/o/MainPictures%2Fmaterial-design.jpg?alt=media&token=daa3fa22-5eb5-4cc8-99c0-a8a9391839ae";
        materialDesign.setClipToOutline(true);
        Glide.with(getContext()).load(url11).into(materialDesign);

        ZoomInImageView animation = view.findViewById(R.id.animation);
        String url12 = "https://firebasestorage.googleapis.com/v0/b/android-app-5b365.appspot.com/o/MainPictures%2FAnimation.png?alt=media&token=bedd9527-bea0-4155-abb6-f5c367a2532b";
        animation.setClipToOutline(true);
        Glide.with(getContext()).load(url12).into(animation);
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
        ZoomInImageView toast = view.findViewById(R.id.toast);
        toast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), ToastMain.class);
                startActivity(intent);

            }
        });
        ZoomInImageView intents = view.findViewById(R.id.intents);
        intents.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), IntentMain.class);
                startActivity(intent);
            }
        });
    }


}