package com.noor.audioplayer;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnPlay, btnPause, btnStop;

    MediaPlayer player;
    //initial playing set as false
    boolean playing=false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnPlay =(Button)findViewById(R.id.btnPlay);

        btnPause =(Button)findViewById(R.id.btnPause);

        btnStop =(Button)findViewById(R.id.btnStop);

        player=MediaPlayer.create(MainActivity.this,R.raw.audio);

        btnPlay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(!playing)
                {
                    player.start();
                    playing=true;
                }

            }
        });

        btnPause.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(playing)
                {
                    player.pause();
                    playing=false;
                }

            }
        });

        btnStop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(playing)
                {
                    player.stop();
                    playing=false;
                }

                MainActivity.this.finish();//for exit


            }
        });

    }
}
