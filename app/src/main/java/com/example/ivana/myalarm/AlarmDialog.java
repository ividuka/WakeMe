package com.example.ivana.myalarm;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.media.Ringtone;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.WindowManager;
import android.view.WindowManager.LayoutParams;

/**
 * Created by ivana on 04.04.18..
 */

public class AlarmDialog extends DialogFragment {

    public AlarmDialog() {
    }

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {

        getActivity().getWindow().addFlags(LayoutParams.FLAG_TURN_SCREEN_ON | LayoutParams.FLAG_DISMISS_KEYGUARD);

        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());

        builder.setTitle("Alarm");

        builder.setMessage("Wakey wakey, sunshine");

        builder.setPositiveButton("OK", new OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                getActivity().finish();
            }
        });

        return builder.create();
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        getActivity().finish();
    }

}
