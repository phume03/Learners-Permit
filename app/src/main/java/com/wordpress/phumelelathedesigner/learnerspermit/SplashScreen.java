package com.wordpress.phumelelathedesigner.learnerspermit;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Handler;
import android.os.Bundle;
import android.util.Log;
import android.view.WindowManager;
import android.widget.MediaController;
import android.widget.Toast;
import android.widget.VideoView;
import androidx.appcompat.app.AppCompatActivity;

public class SplashScreen extends AppCompatActivity {
    private static final String Log_Tag = SplashScreen.class.getSimpleName();
    private static final int SPLASH_SCREEN_TIMEOUT = 9000;
    private VideoView logoVideo, driveVideo;
    private MediaController mediaControls;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash_screen);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        Log.i(Log_Tag, "Running splash screen");
        logoVideo = (VideoView) findViewById(R.id.presents);
        logoVideo.setZOrderMediaOverlay(true);
        logoVideo.setVideoURI(getMedia());
        logoVideo.requestFocus();
        logoVideo.setZOrderOnTop(false);
        logoVideo.start();
        logoVideo.setOnErrorListener(new MediaPlayer.OnErrorListener() {
            @Override
            public boolean onError(MediaPlayer mp, int what, int extra) {
                Toast.makeText(getApplicationContext(),"An error occurred while playing intro logo video.", Toast.LENGTH_LONG).show();
                return false;
            }
        });

        logoVideo.setOnCompletionListener(new Runnable() {
            public void run() {
                driveVideo.start();
            }
        });

        /**
        new Handler().postDelayed(new Runnable() {
            public void run() {
                Intent Handle_Activity_Switch = new Intent(SplashScreen.this, MainActivity.class);
                startActivity(Handle_Activity_Switch);
                finish();
            }
        }, SPLASH_SCREEN_TIMEOUT);**/
    }

    private Uri getMedia() {
        return Uri.parse("android.resource://"+getPackageName()+"/"+R.raw.intro_logo);
    }
}