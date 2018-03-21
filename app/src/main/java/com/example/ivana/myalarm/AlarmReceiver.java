package com.example.ivana.myalarm;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.media.Ringtone;
import android.media.RingtoneManager;
import android.widget.Toast;
import android.net.Uri;

/**
 * Created by ivana on 04.03.18..
 */

public class AlarmReceiver extends BroadcastReceiver {
    private Ringtone ringtone;

    @Override
    public void onReceive(Context context, Intent intent) {
        MainActivity.getTextView2().setText("It works!");        // change it to custom sound; received with intent?
        Uri alarmUri = RingtoneManager.getDefaultUri(RingtoneManager.TYPE_ALARM);
        if(ringtone == null) {
            ringtone = RingtoneManager.getRingtone(context, alarmUri);
        }
        ringtone.play();
    }

    public void setRingtone(Ringtone sound) {
        ringtone = sound;
    }
}
