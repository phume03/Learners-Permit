package com.wordpress.phumelelathedesigner.learnerspermit;

import android.os.Bundle;

import androidx.activity.OnBackPressedCallback;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.Button;

/**
 * A simple {@link Fragment} subclass.
 * create an instance of this fragment.
 */
public class LanguageChoice extends Fragment {
    private static final String Log_Tag = LanguageChoice.class.getSimpleName();
    private static final String FIRST_RUN = "APP_FIRST_RUN";
    private static final String CHOSEN_LANGUAGE = "STUDY_LANGUAGE";
    private Boolean mFirstRun;
    private String mStudyLang;

    public LanguageChoice() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mFirstRun = getArguments().getBoolean("ALPHA");
            mStudyLang = getArguments().getString("BETA");
            getArguments().clear();
            Bundle data = new Bundle();
            data.putBoolean(FIRST_RUN, mFirstRun);
            data.putString(CHOSEN_LANGUAGE, mStudyLang);
            setArguments(data);
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
        Log.i(Log_Tag, "App language choice screen");
        final View rootView = (View) inflater.inflate(R.layout.language_choice, container, false);
        requireActivity().getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        // requireActivity.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        return rootView;
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        final Button english_choice = (Button) view.findViewById(R.id.language_english);
        final Button siswati_choice = (Button) view.findViewById(R.id.language_siswati);
        english_choice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mStudyLang = new String("ENGLISH");
                languageChoice(view);
            }
        });

        siswati_choice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mStudyLang = new String("SISWATI");
                languageChoice(view);
            }
        });
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

    private void languageChoice(View view) {
        if (getArguments() != null) {
            Bundle data = getArguments();
            data.putBoolean(FIRST_RUN, mFirstRun);
            data.putString(CHOSEN_LANGUAGE, mStudyLang);
            setArguments(data);
            NavController controller = (NavController) Navigation.findNavController(view);
            controller.navigate(R.id.action_languageChoice_to_mainMenu, data);
        }
    }
}