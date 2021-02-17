package com.wordpress.phumelelathedesigner.learnerspermit;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import java.util.Locale;
import androidx.activity.OnBackPressedCallback;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.fragment.NavHostFragment;
import androidx.preference.Preference;
import androidx.preference.PreferenceManager;

public class Settings extends Fragment {
    private static final String Log_Tag = Settings.class.getSimpleName();
    private static SharedPreferences mPrefs;
    private static final String CHOSEN_LANGUAGE = "STUDY_LANGUAGE";
    private String mStudyLang;
    private Resources res;

    public Settings() {
        // Required empty public constructor
    }

    public static Settings newInstance() {
        Settings fragment = new Settings();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.i(Log_Tag, "Starting settings window");
        res = getResources();
        mPrefs = PreferenceManager.getDefaultSharedPreferences(requireActivity().getApplicationContext());
        if (mPrefs != null) {
            String defaultLang = res.getStringArray(R.array.language_values)[0];
            mStudyLang = mPrefs.getString(CHOSEN_LANGUAGE, defaultLang);
        }

        OnBackPressedCallback callback = new OnBackPressedCallback(true) {
            @Override
            public void handleOnBackPressed() {
                AlertDialog confirmExit = new AlertDialog.Builder(getActivity())
                        .setMessage(getString(R.string.app_settings_alert_message))
                        .setTitle(getString(R.string.app_settings_alert_title))
                        .setPositiveButton(getString(R.string.app_settings_alert_confirm), new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                saveAndExit();
                            }
                        }).setNegativeButton(getString(R.string.app_settings_alert_decline), new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                discardAndExit();
                            }
                        }).create();
                confirmExit.show();
            }
        };
        requireActivity().getOnBackPressedDispatcher().addCallback(this, callback);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.settings, container, false);
        RadioButton option1 = rootView.findViewById(R.id.languageRadioButton1);
        option1.setText(res.getStringArray(R.array.language_entries)[0]);
        option1.setChecked(false);
        RadioButton option2 = rootView.findViewById(R.id.languageRadioButton2);
        option2.setText(res.getStringArray(R.array.language_entries)[1]);
        option2.setChecked(false);
        if (mStudyLang.equals(res.getStringArray(R.array.language_values)[0])) {
            option1.setChecked(true);
            //option2.setChecked(false);
        } else if (mStudyLang.equals(res.getStringArray(R.array.language_values)[1])) {
            //option1.setChecked(false);
            option2.setChecked(true);
        } else {
            // Choosing to quit and inform
            Log.w(Log_Tag, "Language settings found null values for language choices");
            System.exit(0);
        }

        Button discard = rootView.findViewById(R.id.settings_discard);
        Button save = rootView.findViewById(R.id.settings_save);
        discard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                discardAndExit();
            }
        });
        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                RadioGroup radioGroup = rootView.findViewById(R.id.language_options);
                switch (radioGroup.getCheckedRadioButtonId()) {
                    case R.id.languageRadioButton1:
                        mStudyLang = res.getStringArray(R.array.language_values)[0];
                        break;
                    case R.id.languageRadioButton2:
                        mStudyLang = res.getStringArray(R.array.language_values)[1];
                        break;
                    default:
                        break;
                }
                saveAndExit();
            }
        });
        return rootView;
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

    }

    private void saveAndExit() {
        if (!mStudyLang.equals("")) {
            DisplayMetrics dm = res.getDisplayMetrics();
            Configuration config = res.getConfiguration();
            String [] values = res.getStringArray(R.array.language_values);
            Locale localeX;

            if (mStudyLang.equals(values[0])) {
                localeX = new Locale("en","US");
            } else if (mStudyLang.equals(values[1])) {
                localeX = new Locale("ss","SZ");
            } else {
                Log.w(Log_Tag, "Settings did not find a selection for language, so saving default locale");
                localeX = Locale.getDefault();
            }
            config.locale = localeX;
            res.updateConfiguration(config, dm);
            // recreate();

            SharedPreferences.Editor init = mPrefs.edit();
            init.putString(CHOSEN_LANGUAGE, mStudyLang);
            init.apply();

        } else {
            Log.w(Log_Tag, "If the language is not set -- there is an error! Please check the application logic.");
            System.exit(0);
        }
        exitScreen();
        return;
    }

    private void discardAndExit() {
        exitScreen();
        return;
    }

    private void exitScreen() {
        NavController controller = NavHostFragment.findNavController(requireParentFragment());
        controller.navigate(R.id.action_settings2_to_mainMenu);
        return;
    }
}

