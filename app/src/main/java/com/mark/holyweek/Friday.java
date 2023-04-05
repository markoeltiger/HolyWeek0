package com.mark.holyweek;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Friday extends AppCompatActivity {
    private MediaPlayer mediaplayer;
    Button playbtn,pausebtn,zoomin,zoomout;
    TextView text1,text2;
    int textsize=30;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_friday);
        mediaplayer= MediaPlayer.create(this,R.raw.fri);
        playbtn=(Button)findViewById(R.id.play);
        pausebtn=(Button)findViewById(R.id.pause);
        zoomin=(Button)findViewById(R.id.zoomin);
        zoomout=(Button)findViewById(R.id.zoomout);
        text1=(TextView)findViewById(R.id.text1);
        text2=(TextView)findViewById(R.id.text2);
        zoomin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textsize++;
                text1.setTextSize(textsize);
                text2.setTextSize(textsize);
            }
        });
        zoomout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textsize--;
                text1.setTextSize(textsize);
                text2.setTextSize(textsize);
            }
        });
        playbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaplayer.start();
                mediaplayer.setLooping(true);
            }
        });
        pausebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaplayer.stop();
            }
        });
    }
}

