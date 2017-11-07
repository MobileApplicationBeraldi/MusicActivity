//This solution dosen't work correctly
//Exit (back button) and launching the activity again allows
//to play the song twice


package com.example.roberto.musicactivity;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    MediaPlayer player = null;
    Boolean running=false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void start(View view) {
        if (!running) {
            player = MediaPlayer.create(this,R.raw.braincandy);
            player.start();
            running=true;
        }

        }

    public void stop(View view) {
        if (running) {
            player.stop();
            running=false;
        }
    }
}
