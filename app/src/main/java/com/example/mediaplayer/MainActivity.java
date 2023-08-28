package com.example.mediaplayer;

import static com.example.mediaplayer.R.raw.abc;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button b;
    private MediaPlayer mp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b=findViewById(R.id.button);
        mp=new MediaPlayer();
        mp=MediaPlayer.create(MainActivity.this,R.raw.abc);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(mp.isPlaying())
                {
                    pauseMusic();
                }
                else
                {
                    playMusic();
                }

            }
        });


    }
    public void pauseMusic()
    {
        if(mp!=null)
        {
            mp.pause();
            b.setText("Play");
        }
    }

    public void playMusic()
    {
        if(mp!=null)
        {
            mp.start();
            b.setText("Pause");
        }
    }
}