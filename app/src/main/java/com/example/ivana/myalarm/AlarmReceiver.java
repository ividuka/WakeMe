package com.example.ivana.myalarm;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.media.Ringtone;
import android.media.RingtoneManager;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import android.net.Uri;

import java.io.File;

/**
 * Created by ivana on 04.03.18..
 */

public class AlarmReceiver extends BroadcastReceiver {
//    private Ringtone ringtone;
//    private Uri alarmUri;
//
//    @Override
//    public void onReceive(Context context, Intent intent) {
//        String ringtonePath = MainActivity.getRingtonePath();
//        if(!ringtonePath.isEmpty()) {
//            ringtone = RingtoneManager.getRingtone(context, Uri.fromFile(new File(ringtonePath)));
//        } else {
//            alarmUri = RingtoneManager.getDefaultUri(RingtoneManager.TYPE_ALARM);
//            ringtone = RingtoneManager.getRingtone(context, alarmUri);
//        }
//        ringtone.play();
//
//        Intent i = new Intent();
//        i.setClassName("com.example.ivana.myalarm", "com.example.ivana.myalarm.AlarmActivity");
//        i.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
//        i.putExtra("alarmUri", alarmUri.toString());
//        context.startActivity(i);
//    }

    @Override
    public void onReceive(Context context, Intent intent) {
        // Log.e("msg", "ciaoo");
        context.startService(new Intent(context, RingtoneService.class));

        Intent i = new Intent();
        i.setClassName("com.example.ivana.myalarm", "com.example.ivana.myalarm.AlarmActivity");
        i.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        context.startActivity(i);
    }

}
