package com.wordpress.phumelelathedesigner.learnerspermit;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.StackView;
import android.widget.Toast;

public class TestCards extends Fragment {
    private CheckBox regsCheckBox;
    private CheckBox wsCheckBox;
    private CheckBox goisCheckBox;
    private CheckBox rmCheckBox;
    private CheckBox rsCheckBox;
    private CheckBox rotrCheckBox;
    private static final String regulatory_signs = "regsCheckBox";
    private static final String warning_signs = "wsCheckBox";
    private static final String guide_or_information_signs = "goisCheckBox";
    private static final String road_markings = "rmCheckBox";
    private static final String road_signals = "rsCheckBox";
    private static final String rules_of_the_road = "rotrCheckBox";
    private Button randCardsButton;
    private static final String Log_Tag = TestCards.class.getSimpleName();

    public TestCards() {
        // Required empty public constructor
    }

    public static TestCards newInstance() {
        TestCards fragment = new TestCards();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.i(Log_Tag, "Starting card test.");
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.test_cards, container, false);
        regsCheckBox = (CheckBox) rootView.findViewById(R.id.test_cards_title_regs);
        wsCheckBox = (CheckBox) rootView.findViewById(R.id.test_cards_title_ws);
        goisCheckBox = (CheckBox) rootView.findViewById(R.id.test_cards_title_gois);
        rmCheckBox = (CheckBox) rootView.findViewById(R.id.test_cards_title_rm);
        rsCheckBox = (CheckBox) rootView.findViewById(R.id.test_cards_title_rs);
        rotrCheckBox = (CheckBox) rootView.findViewById(R.id.test_cards_title_rotr);
        randCardsButton = (Button) rootView.findViewById(R.id.random_cards_button);
        return rootView;
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        final NavController controller = Navigation.findNavController(view);
        randCardsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Bundle data = new Bundle();
                Boolean regsChecked = regsCheckBox.isChecked();
                Boolean wsChecked = wsCheckBox.isChecked();
                Boolean goisChecked = goisCheckBox.isChecked();
                Boolean rmChecked = rmCheckBox.isChecked();
                Boolean rsChecked = rsCheckBox.isChecked();
                Boolean rotrChecked = rotrCheckBox.isChecked();

                if (regsChecked || wsChecked || goisChecked || rmChecked || rsChecked || rotrChecked) {
                    data.putBoolean(regulatory_signs, regsChecked);
                    data.putBoolean(warning_signs, wsChecked);
                    data.putBoolean(guide_or_information_signs, goisChecked);
                    data.putBoolean(road_markings, rmChecked);
                    data.putBoolean(road_signals, rsChecked);
                    data.putBoolean(rules_of_the_road, rotrChecked);
                    controller.navigate(R.id.action_testCards_to_testCardsTest, data);
                } else {
                    Toast.makeText(requireContext(), R.string.start_test_navigation_error, Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}