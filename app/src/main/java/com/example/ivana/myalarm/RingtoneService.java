package com.example.ivana.myalarm;

import android.app.Service;
import android.content.Intent;
import android.media.Ringtone;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.IBinder;
import android.support.annotation.Nullable;
import android.util.Log;

import java.io.File;

/**
 * Created by ivana on 09.04.18..
 */

public class RingtoneService extends Service {

    private Ringtone ringtone;
    private Uri alarmUri;

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        // Log.e("msg", "ciaoo");

        String ringtonePath = MainActivity.getRingtonePath();

        if(!ringtonePath.isEmpty()) {
            ringtone = RingtoneManager.getRingtone(this, Uri.fromFile(new File(ringtonePath)));
        } else {
            alarmUri = RingtoneManager.getDefaultUri(RingtoneManager.TYPE_ALARM);
            ringtone = RingtoneManager.getRingtone(this, alarmUri);
        }
        ringtone.play();
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        ringtone.stop();
    }

}
