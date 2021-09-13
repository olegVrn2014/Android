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
import ru.developer.android.android.MainAndroid;
import ru.developer.android.animations.MainAnimations;
import ru.developer.android.containers.MainContainers;
import ru.developer.android.dateTime.MainDateTime;
import ru.developer.android.intents.IntentMain;
import ru.developer.android.layouts.MainLayouts;
import ru.developer.android.material_design.MaterialDesignMain;
import ru.developer.android.menu.MainMenu;
import ru.developer.android.multimedia.MainMultimedia;
import ru.developer.android.resource.MainResource;
import ru.developer.android.styles_themes.MainStyles;
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
        String url = "https://firebasestorage.googleapis.com/v0/b/android-app-5b365.appspot.com/o/MainPictures%2F1.jpg?alt=media&token=7fe71372-6c7c-45c2-8e2d-944719a72bd9";
        android.setClipToOutline(true);
        Glide.with(getContext()).load(url).into(android);

        ZoomInImageView layouts = view.findViewById(R.id.layouts);
        String url2 = "https://firebasestorage.googleapis.com/v0/b/android-app-5b365.appspot.com/o/MainPictures%2F2.jpg?alt=media&token=31fee454-e1e1-4308-8949-97d866647d7c";
        layouts.setClipToOutline(true);
        Glide.with(getContext()).load(url2).into(layouts);

        ZoomInImageView widgets = view.findViewById(R.id.widgets);
        String url5 = "https://firebasestorage.googleapis.com/v0/b/android-app-5b365.appspot.com/o/MainPictures%2F5.jpg?alt=media&token=50fef772-63ec-4786-ab71-cfaea4b91c79";
        widgets.setClipToOutline(true);
        Glide.with(getContext()).load(url5).into(widgets);

        ZoomInImageView resources = view.findViewById(R.id.resources);
        String url3 = "https://firebasestorage.googleapis.com/v0/b/android-app-5b365.appspot.com/o/MainPictures%2F3.jpg?alt=media&token=61a4348b-4079-47f3-a0f7-2e9309938387";
        resources.setClipToOutline(true);
        Glide.with(getContext()).load(url3).into(resources);

        ZoomInImageView stylesThemes = view.findViewById(R.id.styles_themes);
        String url4 = "https://firebasestorage.googleapis.com/v0/b/android-app-5b365.appspot.com/o/MainPictures%2F4.jpg?alt=media&token=d338a58c-f885-4ad9-b9fb-0575d56075ef";
        stylesThemes.setClipToOutline(true);
        Glide.with(getContext()).load(url4).into(stylesThemes);

        ZoomInImageView toast = view.findViewById(R.id.toast);
        String url6 = "https://firebasestorage.googleapis.com/v0/b/android-app-5b365.appspot.com/o/MainPictures%2F6.jpg?alt=media&token=01baa1d2-f37f-4707-8284-9bed6c49f777";
        toast.setClipToOutline(true);
        Glide.with(getContext()).load(url6).into(toast);

        ZoomInImageView intents = view.findViewById(R.id.intents);
        String url7 = "https://firebasestorage.googleapis.com/v0/b/android-app-5b365.appspot.com/o/MainPictures%2F7.jpg?alt=media&token=d004b7cc-f907-48ab-a3cd-dc42d7cb1b4b";
        intents.setClipToOutline(true);
        Glide.with(getContext()).load(url7).into(intents);

        ZoomInImageView menu = view.findViewById(R.id.menu);
        String url8 = "https://firebasestorage.googleapis.com/v0/b/android-app-5b365.appspot.com/o/MainPictures%2F8.jpg?alt=media&token=6cf47e39-27ba-40fd-a504-35bbee62c4d3";
        menu.setClipToOutline(true);
        Glide.with(getContext()).load(url8).into(menu);

        ZoomInImageView containers = view.findViewById(R.id.containers);
        String url9 = "https://firebasestorage.googleapis.com/v0/b/android-app-5b365.appspot.com/o/MainPictures%2F9%20containers.jpg?alt=media&token=1d315d0c-051a-438b-b9ee-63cc60a14a82";
        containers.setClipToOutline(true);
        Glide.with(getContext()).load(url9).into(containers);

        ZoomInImageView dateTime = view.findViewById(R.id.dateTime);
        String url10 = "https://firebasestorage.googleapis.com/v0/b/android-app-5b365.appspot.com/o/MainPictures%2F10%20data-time.jpg?alt=media&token=98b6be44-3c90-4d23-a7e4-e661db01e991";
        dateTime.setClipToOutline(true);
        Glide.with(getContext()).load(url10).into(dateTime);

        ZoomInImageView materialDesign = view.findViewById(R.id.materialDesign);
        String url11 = "https://firebasestorage.googleapis.com/v0/b/android-app-5b365.appspot.com/o/MainPictures%2F11%20material-design.jpg?alt=media&token=d1cf5551-68dd-40c7-b7c3-4f0b38fe08da";
        materialDesign.setClipToOutline(true);
        Glide.with(getContext()).load(url11).into(materialDesign);

        ZoomInImageView animation = view.findViewById(R.id.animation);
        String url12 = "https://firebasestorage.googleapis.com/v0/b/android-app-5b365.appspot.com/o/MainPictures%2F12%20anim.jpg?alt=media&token=678bf7cd-23cb-4e90-b2bd-19498e4990f2";
        animation.setClipToOutline(true);
        Glide.with(getContext()).load(url12).into(animation);

        ZoomInImageView multi = view.findViewById(R.id.multi_media);
        String url13 = "https://firebasestorage.googleapis.com/v0/b/android-app-5b365.appspot.com/o/MainPictures%2Fnew%20icons%2F13-multimed.jpg?alt=media&token=3f2d20d8-3ad1-445b-9d61-d266aa8b7765";
        multi.setClipToOutline(true);
        Glide.with(getContext()).load(url13).into(multi);

        ZoomInImageView camera = view.findViewById(R.id.camera_sensor);
        String url14 = "https://firebasestorage.googleapis.com/v0/b/android-app-5b365.appspot.com/o/MainPictures%2Fnew%20icons%2F14-camera.jpg?alt=media&token=96acba29-0a5e-4fe6-ad80-22c8932ee6c8";
        camera.setClipToOutline(true);
        Glide.with(getContext()).load(url14).into(camera);

        ZoomInImageView fragment = view.findViewById(R.id.fragment);
        String url15 = "https://firebasestorage.googleapis.com/v0/b/android-app-5b365.appspot.com/o/MainPictures%2Fnew%20icons%2F15-frahment.jpg?alt=media&token=e3354988-5a15-43f6-aa7f-a76275697451";
        fragment.setClipToOutline(true);
        Glide.with(getContext()).load(url15).into(fragment);

        ZoomInImageView service = view.findViewById(R.id.service);
        String url16 = "https://firebasestorage.googleapis.com/v0/b/android-app-5b365.appspot.com/o/MainPictures%2Fnew%20icons%2F16-service.jpg?alt=media&token=38cbb827-ae7a-4100-a269-f8c58027e4f3";
        service.setClipToOutline(true);
        Glide.with(getContext()).load(url16).into(service);

        ZoomInImageView alarm = view.findViewById(R.id.alarm);
        String url17 = "https://firebasestorage.googleapis.com/v0/b/android-app-5b365.appspot.com/o/MainPictures%2Fnew%20icons%2F17-alarm.jpg?alt=media&token=42eb3631-a5ab-4652-ae2c-4ea8ba5577f6";
        alarm.setClipToOutline(true);
        Glide.with(getContext()).load(url17).into(alarm);

        ZoomInImageView telephony = view.findViewById(R.id.telephony);
        String url18 = "https://firebasestorage.googleapis.com/v0/b/android-app-5b365.appspot.com/o/MainPictures%2Fnew%20icons%2F18-telephony.jpg?alt=media&token=6c1381d5-ab31-4ed9-b2a4-62de368f40ed";
        telephony.setClipToOutline(true);
        Glide.with(getContext()).load(url18).into(telephony);

        ZoomInImageView google_map = view.findViewById(R.id.google_map);
        String url19 = "https://firebasestorage.googleapis.com/v0/b/android-app-5b365.appspot.com/o/MainPictures%2Fnew%20icons%2F19-google-mao.jpg?alt=media&token=8bf4cc23-6183-4394-a26b-cddaf596c709";
        google_map.setClipToOutline(true);
        Glide.with(getContext()).load(url19).into(google_map);

        ZoomInImageView wifi = view.findViewById(R.id.wifi);
        String url20 = "https://firebasestorage.googleapis.com/v0/b/android-app-5b365.appspot.com/o/MainPictures%2Fnew%20icons%2F20-wifi.jpg?alt=media&token=0bd4551b-e64b-4f80-939e-6d0722bb0eb7";
        wifi.setClipToOutline(true);
        Glide.with(getContext()).load(url20).into(wifi);

        ZoomInImageView notifications = view.findViewById(R.id.notifications);
        String url21 = "https://firebasestorage.googleapis.com/v0/b/android-app-5b365.appspot.com/o/MainPictures%2Fnew%20icons%2F21-notif.jpg?alt=media&token=909180d1-4928-4394-bdcf-6abb68a2d56e";
        notifications.setClipToOutline(true);
        Glide.with(getContext()).load(url21).into(notifications);

        ZoomInImageView data_storage = view.findViewById(R.id.data_storage);
        String url22 = "https://firebasestorage.googleapis.com/v0/b/android-app-5b365.appspot.com/o/MainPictures%2Fnew%20icons%2F22-data-storage.jpg?alt=media&token=d6d956e1-9751-4549-9663-23c2c6a44f02";
        data_storage.setClipToOutline(true);
        Glide.with(getContext()).load(url22).into(data_storage);

        ZoomInImageView json_parsing = view.findViewById(R.id.json_parsing);
        String url23 = "https://firebasestorage.googleapis.com/v0/b/android-app-5b365.appspot.com/o/MainPictures%2Fnew%20icons%2F23-json.jpg?alt=media&token=6283137d-471f-4fab-b7c2-c730ec49ac51";
        json_parsing.setClipToOutline(true);
        Glide.with(getContext()).load(url23).into(json_parsing);

        ZoomInImageView xml_parsing = view.findViewById(R.id.xml_parsing);
        String url24 = "https://firebasestorage.googleapis.com/v0/b/android-app-5b365.appspot.com/o/MainPictures%2Fnew%20icons%2F24-xml.jpg?alt=media&token=0cb1b32d-b4db-4738-bb1a-db638a2020a4";
        xml_parsing.setClipToOutline(true);
        Glide.with(getContext()).load(url24).into(xml_parsing);

        ZoomInImageView broadcast = view.findViewById(R.id.broadcast);
        String url25 = "https://firebasestorage.googleapis.com/v0/b/android-app-5b365.appspot.com/o/MainPictures%2Fnew%20icons%2F25-broadcast.jpg?alt=media&token=d9fa7944-3a94-4c01-9b56-634177424297";
        broadcast.setClipToOutline(true);
        Glide.with(getContext()).load(url25).into(broadcast);

        ZoomInImageView sql = view.findViewById(R.id.sql);
        String url26 = "https://firebasestorage.googleapis.com/v0/b/android-app-5b365.appspot.com/o/MainPictures%2Fnew%20icons%2F26-sql.jpg?alt=media&token=287509b6-e839-4294-b817-a233207689d1";
        sql.setClipToOutline(true);
        Glide.with(getContext()).load(url26).into(sql);

        ZoomInImageView pro = view.findViewById(R.id.pro);
        String url27 = "https://firebasestorage.googleapis.com/v0/b/android-app-5b365.appspot.com/o/MainPictures%2Fnew%20icons%2F27-pro.jpg?alt=media&token=9597e866-e08a-40fa-8881-51e8f2f6fbb8";
        pro.setClipToOutline(true);
        Glide.with(getContext()).load(url27).into(pro);

    }

    private void ZoomImage(View view) {

        ZoomInImageView android = view.findViewById(R.id.android);
        android.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), MainAndroid.class);
                startActivity(intent);
            }
        });

        ZoomInImageView layouts = view.findViewById(R.id.layouts);
        layouts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(),MainLayouts.class);
                startActivity(intent);
            }
        });

        ZoomInImageView resource = view.findViewById(R.id.resources);
        resource.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), MainResource.class);
                startActivity(intent);
            }
        });

        ZoomInImageView menu = view.findViewById(R.id.menu);
        menu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), MainMenu.class);
                startActivity(intent);
            }
        });

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

        ZoomInImageView styles = view.findViewById(R.id.styles_themes);
        styles.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), MainStyles.class);
                startActivity(intent);
            }
        });

        ZoomInImageView containers = view.findViewById(R.id.containers);
        containers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), MainContainers.class);
                startActivity(intent);
            }
        });

        ZoomInImageView dateTime = view.findViewById(R.id.dateTime);
        dateTime.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), MainDateTime.class);
                startActivity(intent);
            }
        });

        ZoomInImageView material_design = view.findViewById(R.id.materialDesign);
        material_design.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), MaterialDesignMain.class);
                startActivity(intent);
            }
        });

        ZoomInImageView animation = view.findViewById(R.id.animation);
        animation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), MainAnimations.class);
                startActivity(intent);
            }
        });

        ZoomInImageView multimedia = view.findViewById(R.id.multi_media);
        multimedia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), MainMultimedia.class);
                startActivity(intent);
            }
        });
    }


}