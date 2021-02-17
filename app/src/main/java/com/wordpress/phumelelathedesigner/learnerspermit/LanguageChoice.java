package com.wordpress.phumelelathedesigner.learnerspermit;

import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import androidx.activity.OnBackPressedCallback;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.preference.PreferenceManager;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.Toast;

import java.util.Locale;

public class LanguageChoice extends Fragment {
    private static final String Log_Tag = LanguageChoice.class.getSimpleName();
    private static SharedPreferences mPrefs;
    private static final String FIRST_RUN = "APP_FIRST_RUN";
    private static final String CHOSEN_LANGUAGE = "STUDY_LANGUAGE";
    private Boolean mFirstRun;
    private String mStudyLang;
    private Resources res;

    public LanguageChoice() {
        // Required empty public constructor
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
        Log.i(Log_Tag, "App language choice screen");
        final View rootView = (View) inflater.inflate(R.layout.language_choice, container, false);
        requireActivity().getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        // requireActivity.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        return rootView;
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        res = getResources();
        mFirstRun = false;
        String [] langs = res.getStringArray(R.array.language_values);
        final Button english_choice = (Button) view.findViewById(R.id.language_english);
        final Button siswati_choice = (Button) view.findViewById(R.id.language_siswati);
        english_choice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mStudyLang = langs[0];
                languageChoice(v);
            }
        });

        siswati_choice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mStudyLang = langs[1];
                languageChoice(v);
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
        if (!mStudyLang.equals("")) {
            DisplayMetrics dm = res.getDisplayMetrics();
            Configuration config = res.getConfiguration();
            String [] values = res.getStringArray(R.array.language_values);
            Locale localeX;
            System.out.print("Language Setting: "+mStudyLang);
            if (mStudyLang.equals(values[0])) {
                localeX = new Locale("en","US");
            } else if (mStudyLang.equals(values[1])) {
                localeX = new Locale("ss","SZ");
            } else {
                localeX = Locale.getDefault();
            }
            config.locale = localeX;
            res.updateConfiguration(config, dm);

            mPrefs = PreferenceManager.getDefaultSharedPreferences(requireActivity().getApplicationContext());
            SharedPreferences.Editor init;
            if (mPrefs == null) {
                mPrefs = requireActivity().getSharedPreferences(requireActivity().getPackageName(), requireActivity().MODE_PRIVATE);
            }
            init = mPrefs.edit();
            init.putBoolean(FIRST_RUN, mFirstRun);
            init.putString(CHOSEN_LANGUAGE, mStudyLang);
            init.apply();
            //recreate();
            NavController controller = (NavController) Navigation.findNavController(view);
            controller.navigate(R.id.action_languageChoice_to_mainMenu);
        } else {
            Toast.makeText(requireContext(), res.getString(R.string.language_choice_navigation_error), Toast.LENGTH_SHORT).show();
        }
        return;
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        Log.i(Log_Tag, "Configurations were changed -- presumably language configs");
    }
}