package com.wordpress.phumelelathedesigner.learnerspermit;

import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.util.Log;
import android.widget.Toast;

import java.util.Locale;

import androidx.appcompat.app.AppCompatActivity;
import androidx.preference.PreferenceManager;

public class MainActivity extends AppCompatActivity {
    private static final String Log_Tag = MainActivity.class.getSimpleName();
    private static SharedPreferences mPrefs;
    private static final String FIRST_RUN = "APP_FIRST_RUN";
    private static final String CHOSEN_LANGUAGE = "STUDY_LANGUAGE";
    private Boolean mFirstRun;
    private String mStudyLang;
    private Resources res;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i(Log_Tag, "Starting main activity window");
        res = getResources();
        mPrefs = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
        if (mPrefs != null) {
            SharedPreferences.Editor init = mPrefs.edit();
            mFirstRun = mPrefs.getBoolean(FIRST_RUN, true);
            String defaultLang = res.getStringArray(R.array.language_values)[0];
            mStudyLang = mPrefs.getString(CHOSEN_LANGUAGE, defaultLang);
            init.putBoolean(FIRST_RUN, mFirstRun);
            init.putString(CHOSEN_LANGUAGE, mStudyLang);
            init.apply();
        } else {
            mPrefs = getSharedPreferences(getPackageName(), MODE_PRIVATE);
            SharedPreferences.Editor init = mPrefs.edit();
            mFirstRun = true;
            mStudyLang = res.getStringArray(R.array.language_values)[0];
            init.putBoolean(FIRST_RUN, mFirstRun);
            init.putString(CHOSEN_LANGUAGE, mStudyLang);
            init.apply();
        }

        if (!mStudyLang.equals("") && mStudyLang != null) {
            DisplayMetrics dm = res.getDisplayMetrics();
            Configuration config = res.getConfiguration();
            String [] values = res.getStringArray(R.array.language_values);
            Locale localeX;

            if (mStudyLang.equals(values[0])) {
                localeX = new Locale("en","US");
            } else if (mStudyLang.equals(values[1])) {
                localeX = new Locale("ss","SZ");
            } else {
                localeX = Locale.getDefault();
            }
            config.locale = localeX;
            res.updateConfiguration(config, dm);
            //recreate();
        } else {
            // Will automatically run splash with first run forcing language choice
            if (!mFirstRun) {
                Log.w(Log_Tag, "If the language is not set and this is NOT the first run -- there is an error! Please check the application logic.");
                System.exit(0);
            }
        }
    }
	
    @Override
    public void onConfigurationChanged(Configuration newConfig) {
      super.onConfigurationChanged(newConfig);
        Log.i(Log_Tag, "Configurations were changed -- presumably language configs");
    }
}