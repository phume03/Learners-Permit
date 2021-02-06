package com.wordpress.phumelelathedesigner.learnerspermit;

import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.Toast;
import android.widget.VideoView;

import androidx.activity.OnBackPressedCallback;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

/**
 * An example full-screen activity that shows and hides the system UI (i.e.
 * status bar and navigation/system bar) with user interaction.
 */
public class splash_game_logo extends Fragment {
    private static final String Log_Tag = splash_game_logo.class.getSimpleName();
    private static final int SPLASH_SCREEN_TIMEOUT_MILLIS = 15000;
    private VideoView signsVideo;
    private ImageView appLogo;

    public splash_game_logo() {
        // required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        OnBackPressedCallback callback = new OnBackPressedCallback(true) {
            @Override
            public void handleOnBackPressed() {
                System.exit(0);
            }
        };
        requireActivity().getOnBackPressedDispatcher().addCallback(this, callback);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Log.i(Log_Tag, "App logo splash screen");
        final View rootView = (View) inflater.inflate(R.layout.splash_game_logo, container, false);
        requireActivity().getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        // requireActivity.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        signsVideo = (VideoView) rootView.findViewById(R.id.game_logo_video);
        signsVideo.setZOrderMediaOverlay(true);
        signsVideo.setVideoURI(getMedia());
        signsVideo.requestFocus();
        signsVideo.setZOrderOnTop(false);
        return rootView;
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        signsVideo.start();
        signsVideo.setOnErrorListener(new MediaPlayer.OnErrorListener() {
            @Override
            public boolean onError(MediaPlayer mp, int what, int extra) {
                Toast.makeText(requireActivity().getApplicationContext(),"An error occurred while playing game logo video.", Toast.LENGTH_LONG).show();
                return false;
            }
        });
        signsVideo.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            final Animation fadeIn = AnimationUtils.loadAnimation(requireActivity().getApplicationContext(),R.anim.fade_in);
            final Animation fadeOut = AnimationUtils.loadAnimation(requireActivity().getApplicationContext(),R.anim.fade_out);

            @Override
            public void onCompletion(MediaPlayer mp) {
                // Switch out video with logo
                signsVideo.setVisibility(View.GONE);
                signsVideo.startAnimation(fadeOut);

                appLogo = (ImageView) view.findViewById(R.id.game_logo);
                appLogo.setVisibility(View.VISIBLE);
                appLogo.startAnimation(fadeIn);
            }
        });

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Bundle data = new Bundle();
                data.putBoolean("Alpha", Boolean.TRUE);
                data.putString("Beta", "NONE");
                NavController controller = (NavController) Navigation.findNavController(view);
                controller.navigate(R.id.action_splash_game_logo_to_languageChoice, data);
            }
        }, SPLASH_SCREEN_TIMEOUT_MILLIS);
    }

    @Override
    public void onResume() {
        super.onResume();
    }

    @Override
    public void onPause() {
        super.onPause();
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
    }

    private Uri getMedia() {
        return Uri.parse("android.resource://"+requireActivity().getPackageName()+"/"+R.raw.signs);
    }
}