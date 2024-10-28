package com.example.broadcastapp;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class AirplaneModeReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        if(intent.getAction()!=null &&
        intent.getAction().equals(Intent.ACTION_AIRPLANE_MODE_CHANGED)){
            boolean val=intent.getBooleanExtra("Value",false);
            String msg = val?"Airplane Mode Is On" : "Airplane Mode is Off";
            Toast.makeText(context, ""+msg, Toast.LENGTH_SHORT).show();

        }


    }
}
