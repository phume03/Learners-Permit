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
import android.widget.Toast;
import android.widget.VideoView;

import androidx.activity.OnBackPressedCallback;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import static android.media.MediaPlayer.OnCompletionListener;
import static android.media.MediaPlayer.OnErrorListener;

/**
 * An example full-screen activity and has no user-interaction.
 */
public class splash_company_logo extends Fragment {
    private static final String Log_Tag = splash_company_logo.class.getSimpleName();
    private static final int SPLASH_SCREEN_TIMEOUT_MILLIS = 7990;
    private VideoView logoVideo;

    public splash_company_logo() {
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

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Log.i(Log_Tag, "New Breed Designs splash screen");
        final View rootView = inflater.inflate(R.layout.splash_company_logo, container, false);
        requireActivity().getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        //requireActivity().setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        logoVideo = (VideoView) rootView.findViewById(R.id.presents);
        logoVideo.setZOrderMediaOverlay(true);
        logoVideo.setVideoURI(getMedia());
        logoVideo.requestFocus();
        logoVideo.setZOrderOnTop(false);
        return rootView;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        logoVideo.start();
        logoVideo.setOnErrorListener(new OnErrorListener() {
            @Override
            public boolean onError(MediaPlayer mp, int what, int extra) {
                Toast.makeText(requireActivity().getApplicationContext(),"An error occurred while playing intro logo video.", Toast.LENGTH_LONG).show();
                Log.i(Log_Tag, "An error occurred while playing intro logo video.");
                return false;
            }
        });

        final Animation fadeOut = AnimationUtils.loadAnimation(requireActivity().getApplicationContext(),R.anim.fade_out);
        logoVideo.setOnCompletionListener(new OnCompletionListener() {


            @Override
            public void onCompletion(MediaPlayer mp) {
                logoVideo.setVisibility(View.GONE);
                logoVideo.setAnimation(fadeOut);
            }
        });

        new Handler().postDelayed(new Runnable() {
            public void run() {
                NavController controller = (NavController) Navigation.findNavController(view);
                controller.navigate(R.id.action_splash_company_logo_to_splash_game_logo);
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
        return Uri.parse("android.resource://"+requireActivity().getPackageName()+"/"+R.raw.intro_logo);
    }
}