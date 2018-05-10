package com.example.ivana.myalarm;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;

/**
 * Created by ivana on 04.04.18..
 */

public class AlarmActivity extends FragmentActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        AlarmDialog alert = new AlarmDialog();
        alert.show(this.getFragmentManager(), "AlarmDialog");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        stopService(new Intent(this, RingtoneService.class));
    }
}
