package com.wordpress.phumelelathedesigner.learnerspermit;

import android.os.Bundle;

import androidx.activity.OnBackPressedCallback;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.text.NumberFormat;

public class Done extends Fragment {
    private static final String TEST_TYPE_LABEL="TEST_TYPE";
    private static final String TEST_SCORE_LABEL="TEST_SCORE";
    private String mTEST_TYPE;
    private Double mTEST_SCORE;
    private static final String TEST_A="test";
    private static final String TEST_B="exam";
    private static final String Log_Tag = Done.class.getSimpleName();

    public Done() {
        // Required empty public constructor
    }

    public static Done newInstance() {
        Done fragment = new Done();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Bundle data = getArguments();
        if ( data != null) {
            mTEST_TYPE = data.getString(TEST_TYPE_LABEL);
            if (mTEST_TYPE.equals(TEST_B)) {
                mTEST_SCORE = data.getDouble(TEST_SCORE_LABEL);
            }
        }

        OnBackPressedCallback callback = new OnBackPressedCallback(true) {
            @Override
            public void handleOnBackPressed() {
                Toast.makeText(requireContext(), R.string.back_navigation_attempt_done, Toast.LENGTH_SHORT).show();
            }
        };
        requireActivity().getOnBackPressedDispatcher().addCallback(this, callback);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        NumberFormat nf = NumberFormat.getInstance();
        //nf.setMinimumIntegerDigits(3);
        nf.setMinimumFractionDigits(3);
        View rootView = inflater.inflate(R.layout.test_done, container, false);
        TextView complete_test_title = rootView.findViewById(R.id.done_title);
        TextView completed_test_message = rootView.findViewById(R.id.done_content);
        String title;
        String message;
        if (mTEST_TYPE  == TEST_A) {
            title = new String ("Congratulations! \nTest Complete.");
            message = new String("Well done, you have completed the test. I hope it has given you some confidence to take your learner\'s permit test. Otherwise, take the scored test to give yourself more of a challenge. Good luck!");
        } else if (mTEST_TYPE == TEST_B) {
            title = new String ("Congratulations! \nScored Test Complete.");
            if (mTEST_SCORE <=50) {
                message = new String("Well done, you have completed the scored test. Your score is " + nf.format(mTEST_SCORE) + "%. This is not so great. You should study again before you attempt to take an official test for your learner\'s permit. Take you time.");
            } else if (mTEST_SCORE > 50 && mTEST_SCORE <=70) {
                message = new String("Well done, you have completed the scored test. Your score is " + nf.format(mTEST_SCORE) + "%. This is alright. You should touch up thoroughly before you attempt to take an official test for your learner\'s permit. Good luck.");
            } else if (mTEST_SCORE > 70 && mTEST_SCORE <= 90) {
                message = new String("Well done, you have completed the scored test. Your score is " + nf.format(mTEST_SCORE) + "%. This is great. You might be ready to take the official test for your learner\'s permit. Good luck!");
            } else if (mTEST_SCORE > 90 && mTEST_SCORE <= 99) {
                message = new String("Well done, you have completed the scored test. Your score is " + nf.format(mTEST_SCORE) + "%. This is an outstanding score. You are ready to take the official learner\'s permit test. But you may wish to polish up. Good luck!");
            } else {
                message = new String("Well done, you completed the test and you scored a perfect score. Your score is" + nf.format(mTEST_SCORE) + "%. You are ready to take the official learner\'s permit test. Good luck!");
            }
        } else {
            title = new String ("Oops! Looks Like An Error Occurred.");
            message = new String("Well, I don't know how you got here. Navigate to the main menu to start again. If the problem persists, please contact the developer! \n\nemail: \tnbdswatigraphicapparel@outlook.com");
        }
        complete_test_title.setText(title);
        completed_test_message.setText(message);
        return rootView;
    }

    @Override
    public void onViewCreated(View view, Bundle savedBundleInstance) {
        super.onViewCreated(view, savedBundleInstance);
        Button toMenu = view.findViewById(R.id.done_button);
        toMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                NavController controller = (NavController) Navigation.findNavController(v);
                controller.navigate(R.id.action_done_to_mainMenu);
            }
        });
    }
}