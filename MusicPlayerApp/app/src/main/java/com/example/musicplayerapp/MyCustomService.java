package com.example.musicplayerapp;

import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.IBinder;
import android.provider.Settings;

import androidx.annotation.Nullable;

import java.security.Provider;

public class MyCustomService extends Service {
    //creating the instance of music player
    //to play music we need media player object
    MediaPlayer mediaPlayer;

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        //this will play the audio of default ringtone
        mediaPlayer = MediaPlayer.create(
                this,
                Settings.System.DEFAULT_RINGTONE_URI
        );
        //to continuously running the media player
        mediaPlayer.setLooping(true);
        //start the service
        mediaPlayer.start();

        return START_STICKY;
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        mediaPlayer.stop();
    }

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }
}
