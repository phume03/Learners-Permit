package com.wordpress.phumelelathedesigner.learnerspermit;

import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.util.DisplayMetrics;
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

import java.util.Locale;

import androidx.activity.OnBackPressedCallback;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.fragment.NavHostFragment;
import androidx.preference.PreferenceManager;

/**
 * An example full-screen activity that shows and hides the system UI (i.e.
 * status bar and navigation/system bar) with user interaction.
 */
public class splash_game_logo extends Fragment {
    private static final String Log_Tag = splash_game_logo.class.getSimpleName();
    private static final int SPLASH_SCREEN_TIMEOUT_MILLIS = 14000;
    private VideoView signsVideo;
    private ImageView appLogo;
    private static SharedPreferences mPrefs;
    private static final String FIRST_RUN = "APP_FIRST_RUN";
    private Boolean mFirstRun;
    private Resources res;

    public splash_game_logo() {
        // required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        res = getResources();
        mPrefs = PreferenceManager.getDefaultSharedPreferences(requireActivity().getApplicationContext());
        if (mPrefs != null) {
            mFirstRun = mPrefs.getBoolean(FIRST_RUN, true);
        } else {
            // Now choosing to exit with zero status
            System.exit(0);
        }

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
                if (mFirstRun == true) {
                    chooseLanguage(view);
                } else {
                    mainMenu(view);
                }
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

    private void chooseLanguage(View v) {
        Log.i(Log_Tag,"Force user to choose a language");
        final NavController controller = (NavController) Navigation.findNavController(v);
        controller.navigate(R.id.action_splash_game_logo_to_languageChoice);
    }

    private void mainMenu(View v) {
        Log.i(Log_Tag, "Transition to main menu for subsequent runs");
        final NavController controller = (NavController) Navigation.findNavController(v);
        controller.navigate(R.id.action_global_mainMenu2);
    }
}