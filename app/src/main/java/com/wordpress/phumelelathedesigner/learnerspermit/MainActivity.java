package com.wordpress.phumelelathedesigner.learnerspermit;

import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.util.Log;

import java.util.Locale;

import androidx.appcompat.app.AppCompatActivity;
import androidx.preference.PreferenceManager;

public class MainActivity extends AppCompatActivity {
    private static final String Log_Tag = MainActivity.class.getSimpleName();
/*    private static SharedPreferences mPrefs;
    private static final String FIRST_RUN = "APP_FIRST_RUN";
    private static final String CHOSEN_LANGUAGE = "STUDY_LANGUAGE";
    private Boolean mFirstRun;
    private String mStudyLang;*/

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i(Log_Tag, "Starting main activity window");
        /*mPrefs = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
        SharedPreferences.Editor init = mPrefs.edit();
        mFirstRun = mPrefs.getBoolean(FIRST_RUN, true);
        mStudyLang = mPrefs.getString(CHOSEN_LANGUAGE, "");
        init.putBoolean(FIRST_RUN, mFirstRun);
        init.putString(CHOSEN_LANGUAGE, mStudyLang);

        if (!mStudyLang.equals("")) {
            Resources res = getResources();
            Locale localeX = new Locale(mStudyLang);
            Locale.setDefault(localeX);
            DisplayMetrics dm = res.getDisplayMetrics();
            Configuration config = res.getConfiguration();
            config.locale = localeX;
            res.updateConfiguration(config, dm);
        }*/
    }
}