package com.wordpress.phumelelathedesigner.learnerspermit;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import androidx.activity.OnBackPressedCallback;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class MainMenu extends Fragment {
    private static final String Log_Tag = MainMenu.class.getSimpleName();

    public MainMenu() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        OnBackPressedCallback callback = new OnBackPressedCallback(true) {
            @Override
            public void handleOnBackPressed() {
                AlertDialog confirmExit = new AlertDialog.Builder(getActivity())
                        .setMessage(getString(R.string.app_exit_alert_message))
                        .setTitle(getString(R.string.app_exit_alert_title))
                        .setPositiveButton(getString(R.string.app_exit_alert_confirm), new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                System.exit(0);
                            }
                        }).setNegativeButton(getString(R.string.app_exit_alert_decline), new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                // dismiss
                            }
                        }).create();
                confirmExit.show();
            }
        };
        requireActivity().getOnBackPressedDispatcher().addCallback(this, callback);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Log.i(Log_Tag,"Inflate the layout for main menu fragment");
        return inflater.inflate(R.layout.main_menu, container, false);
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        final Button study = (Button) view.findViewById(R.id.learn);
        final Button test = (Button) view.findViewById(R.id.test_cards);
        final Button exam = (Button) view.findViewById(R.id.scored_test);
        final Button settings = (Button) view.findViewById(R.id.settings);
        final NavController controller = Navigation.findNavController(view);

        study.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                controller.navigate(R.id.action_mainMenu_to_learnSigns);
            }
        });
        test.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                controller.navigate(R.id.action_mainMenu_to_testCards);
            }
        });
        exam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                controller.navigate(R.id.action_mainMenu_to_scoredTest);
            }
        });
        settings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                controller.navigate(R.id.action_mainMenu_to_settings2);
            }
        });
    }
}