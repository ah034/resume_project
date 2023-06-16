package com.example.movie1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.MediaController;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.VideoView;

public class MainActivity2 extends AppCompatActivity {

    private MediaPlayer mp;
    private MediaController mc;
    private VideoView videoView;
    private ImageView playbutton;
    private TextView currentTimer;
    private TextView durationTimer;
    private ProgressBar currentProgress;
    private ProgressBar bufferprogress;
    private boolean isPlaying;
    private int current=0;
    private int duration=0;
    private boolean isFullScreen=false;
    private TextView mov_title,description;

    public void run_movie(Uri videouri,String title) {
        Toast.makeText(MainActivity2.this, "ENJOY WATCHING " + title + "!!", Toast.LENGTH_SHORT).show();
        videoView.setVideoURI(videouri);
        videoView.requestFocus();
        videoView.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
            @Override
            public void onPrepared(MediaPlayer mp) {
                videoView.start();
            }
        });
    }
    private void setFullScreen(boolean fullScreen) {
        if (fullScreen) {
            // Enter fullscreen
            setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
            RelativeLayout.LayoutParams params = new RelativeLayout.LayoutParams(
                    RelativeLayout.LayoutParams.MATCH_PARENT,
                    RelativeLayout.LayoutParams.MATCH_PARENT);
            videoView.setLayoutParams(params);
            isFullScreen = true;
        } else {
            // Exit fullscreen
            setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
            RelativeLayout.LayoutParams params = new RelativeLayout.LayoutParams(
                    RelativeLayout.LayoutParams.MATCH_PARENT,
                    RelativeLayout.LayoutParams.WRAP_CONTENT);
            videoView.setLayoutParams(params);
            isFullScreen = false;
        }
    }

    public void onBackPressed() {
        if (isFullScreen) {
            // Exit fullscreen when back button is pressed
            setFullScreen(false);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        videoView=findViewById(R.id.videoView);
        mc=new MediaController(this);
        videoView.setMediaController(mc);
        mc.setAnchorView(videoView);
        Intent intent=getIntent();

        String url=intent.getStringExtra("url");
        String title=intent.getStringExtra("title");
        Uri videouri = Uri.parse(url);

        run_movie(videouri,title);
    }
}