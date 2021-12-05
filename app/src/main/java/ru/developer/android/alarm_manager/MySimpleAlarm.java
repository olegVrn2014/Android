package ru.developer.android.alarm_manager;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.widget.Toast;

import ru.developer.android.R;

public class MySimpleAlarm extends BroadcastReceiver {
        MediaPlayer mp;
        @Override
        public void onReceive(Context context, Intent intent) {
                mp=MediaPlayer.create(context, R.raw.audio);
                mp.start();
                Toast.makeText(context, "..БУДИЛЬНИК..", Toast.LENGTH_LONG).show();
        }
}
