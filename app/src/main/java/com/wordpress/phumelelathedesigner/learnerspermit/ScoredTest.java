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

public class ScoredTest extends Fragment {
    private static final String Log_Tag = ScoredTest.class.getSimpleName();

    public ScoredTest() {
        // Required empty public constructor
    }

    public static ScoredTest newInstance() {
        ScoredTest fragment = new ScoredTest();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.i(Log_Tag, "Starting scored test.");
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.scored_test, container, false);
        return rootView;
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Button startButton = (Button) view.findViewById(R.id.scored_test_begin_button);
        startButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final NavController controller = Navigation.findNavController(v);
                controller.navigate(R.id.action_scoredTest_to_scoredTestTest);
            }
        });
    }
}