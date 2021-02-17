package com.wordpress.phumelelathedesigner.learnerspermit;

import android.content.res.Resources;
import android.os.Bundle;
import androidx.activity.OnBackPressedCallback;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterViewFlipper;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ScoredTestTest extends Fragment {
    private static final String TEST_TYPE_LABEL="TEST_TYPE";
    private static final String TEST_SCORE_LABEL="TEST_SCORE";
    private static final String TEST_TYPE="exam";
    private Double mTEST_SCORE;
    private AdapterViewFlipper questionStack;
    private List <StackCardB> questions;
    private int progress;
    private static final int maxQuestions = 30;
    private Resources res;
    private String packageName;
    private static final String Log_Tag = ScoredTestTest.class.getSimpleName();
    private static final int maxCategoryCards = 5;
    private static final int num_rs = maxCategoryCards;
    private static final int num_rm = maxCategoryCards;
    private static final int num_gois = maxCategoryCards;
    private static final int num_ws = maxCategoryCards;
    private static final int num_regs = maxCategoryCards;
    private static final int num_rotr = maxCategoryCards;
    private static final int maxCards = (num_rs + num_rm + num_gois + num_ws + num_regs + num_rotr);
    private Random rand;
    private NumberFormat nf;
    private RadioGroup selection;
    private ProgressBar testProgress;
    private Button nextButton;
    private View rootView;

    public ScoredTestTest() {
        // Required empty public constructor
    }

    public static ScoredTestTest newInstance() {
        ScoredTestTest fragment = new ScoredTestTest();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.i(Log_Tag, "Starting the scored test.");
        mTEST_SCORE = new Double(0);
        rand = new Random();
        res  = getResources();
        packageName = getActivity().getPackageName();
        nf = NumberFormat.getInstance();
        nf.setMinimumIntegerDigits(3);
        questions = new ArrayList <StackCardB>();
        int cardnum;
        StackCardB card;
        String [] genericResponses;
        String resourceName;
        String resourceDescriptionName;
        Integer resourceNameID;
        Integer resourceDescriptionID;
        for (int a=0 ;a<num_rs; a++) {
            cardnum = (194 + rand.nextInt(14));
            genericResponses = getGenericResponses(cardnum);
            resourceName = new String("sign_").concat(nf.format(cardnum));
            resourceDescriptionName = new String("road_signals_").concat(nf.format(cardnum));
            resourceNameID = res.getIdentifier(resourceName, "drawable", packageName);
            resourceDescriptionID = res.getIdentifier(resourceDescriptionName, "string", packageName);
            card = new StackCardB(resourceNameID,getString(resourceDescriptionID), genericResponses, true);
            questions.add(card);
        }

        for (int b=0; b<num_rm;b++) {
            cardnum = (158 + rand.nextInt(36));
            genericResponses = getGenericResponses(cardnum);
            resourceName = new String("sign_").concat(nf.format(cardnum));
            resourceDescriptionName = new String("road_markings_").concat(nf.format(cardnum));
            resourceNameID = res.getIdentifier(resourceName, "drawable", packageName);
            resourceDescriptionID = res.getIdentifier(resourceDescriptionName, "string", packageName);
            card = new StackCardB(resourceNameID,getString(resourceDescriptionID), genericResponses, true);
            questions.add(card);
        }

        for (int c=0;c<num_gois;c++) {
            cardnum = (86 + rand.nextInt(72));
            genericResponses = getGenericResponses(cardnum);
            resourceName = new String("sign_").concat(nf.format(cardnum));
            resourceDescriptionName = new String("guide_or_information_signs_").concat(nf.format(cardnum));
            resourceNameID = res.getIdentifier(resourceName, "drawable", packageName);
            resourceDescriptionID = res.getIdentifier(resourceDescriptionName, "string", packageName);
            card = new StackCardB(resourceNameID,getString(resourceDescriptionID), genericResponses, true);
            questions.add(card);
        }

        for (int d=0;d<num_ws;d++) {
            cardnum = (35 + rand.nextInt(51));
            genericResponses = getGenericResponses(cardnum);
            resourceName = new String("sign_").concat(nf.format(cardnum));
            resourceDescriptionName = new String("warning_signs_").concat(nf.format(cardnum));
            resourceNameID = res.getIdentifier(resourceName, "drawable", packageName);
            resourceDescriptionID = res.getIdentifier(resourceDescriptionName, "string", packageName);
            card = new StackCardB(resourceNameID,getString(resourceDescriptionID), genericResponses, true);
            questions.add(card);
        }

        for (int e=0;e<num_regs;e++) {
            cardnum = (1 + rand.nextInt(34));
            genericResponses = getGenericResponses(cardnum);
            resourceName = new String("sign_").concat(nf.format(cardnum));
            resourceDescriptionName = new String("regulatory_signs_").concat(nf.format(cardnum));
            resourceNameID = res.getIdentifier(resourceName, "drawable", packageName);
            resourceDescriptionID = res.getIdentifier(resourceDescriptionName, "string", packageName);
            card = new StackCardB(resourceNameID,getString(resourceDescriptionID), genericResponses, true);
            questions.add(card);
        }

        nf = NumberFormat.getInstance();
        nf.setMinimumIntegerDigits(2);
        for (int f=0;f<num_rotr;f++) {
            cardnum = (1 + rand.nextInt(65));
            genericResponses = getRulesGenericResponses(cardnum);
            resourceName = new String("rules_of_the_road_").concat(nf.format(cardnum)).concat("_Q");
            resourceDescriptionName = new String("rules_of_the_road_").concat(nf.format(cardnum)).concat("_A");
            resourceNameID = res.getIdentifier(resourceName, "string", packageName);
            resourceDescriptionID = res.getIdentifier(resourceDescriptionName, "string", packageName);
            card = new StackCardB(resourceNameID,res.getString(resourceDescriptionID), genericResponses, false);
            questions.add(card);
        }

        OnBackPressedCallback callback = new OnBackPressedCallback(true) {
            @Override
            public void handleOnBackPressed() {
                Toast.makeText(requireContext(), R.string.back_navigation_attempt_exam, Toast.LENGTH_SHORT).show();
            }
        };
        requireActivity().getOnBackPressedDispatcher().addCallback(this, callback);
    }

    private String[] getGenericResponses(int card_number) {
        nf = NumberFormat.getInstance();
        nf.setMinimumIntegerDigits(3);
        String [] genericResponses = new String [maxCategoryCards-1];
        String resourceDescriptionName;
        int resourceDescriptionID;
        int response = 0;
        int j = 0;
        while (j < maxCategoryCards - 1) {
            response = (1 + rand.nextInt(207));
            if (response != card_number) {
                if (response >= 1 && response <= 34) {
                    resourceDescriptionName = new String("regulatory_signs_").concat(nf.format(response));
                    resourceDescriptionID = res.getIdentifier(resourceDescriptionName, "string", packageName);
                } else if (response >= 35 && response <= 85) {
                    resourceDescriptionName = new String("warning_signs_").concat(nf.format(response));
                    resourceDescriptionID = res.getIdentifier(resourceDescriptionName, "string", packageName);
                } else if (response >= 86 && response <= 157) {
                    resourceDescriptionName = new String("guide_or_information_signs_").concat(nf.format(response));
                    resourceDescriptionID = res.getIdentifier(resourceDescriptionName, "string", packageName);
                } else if (response >= 158 && response <= 193) {
                    resourceDescriptionName = new String("road_markings_").concat(nf.format(response));
                    resourceDescriptionID = res.getIdentifier(resourceDescriptionName, "string", packageName);
                } else { // if (response >= 194 && response <= 207) {
                    resourceDescriptionName = new String("road_signals_").concat(nf.format(response));
                    resourceDescriptionID = res.getIdentifier(resourceDescriptionName, "string", packageName);
                }
                genericResponses[j] = res.getString(resourceDescriptionID);
                j++;
            }
        }
        return genericResponses;
    }

    private String[] getRulesGenericResponses(int card_number) {
        nf = NumberFormat.getInstance();
        nf.setMinimumIntegerDigits(2);
        String [] genericResponses = new String [maxCategoryCards-1];
        String resourceDescriptionName;
        int resourceDescriptionID;
        int response = 0;
        int j = 0;
        while (j < maxCategoryCards - 1) {
            response = (1 + rand.nextInt(65));
            if (response != card_number) {
                resourceDescriptionName = new String("rules_of_the_road_").concat(nf.format(response)).concat("_A");
                resourceDescriptionID = res.getIdentifier(resourceDescriptionName, "string", packageName);
                genericResponses[j] = res.getString(resourceDescriptionID);
                j++;
            }
        }
        return genericResponses;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        rootView = inflater.inflate(R.layout.scoredtest_test, container, false);
        questionStack = rootView.findViewById(R.id.question_stack);
        testProgress = rootView.findViewById(R.id.progress_bar_stt);
        progress = 1;
        testProgress.setMax(maxCards);
        testProgress.setProgress(progress);
        nextButton = rootView.findViewById(R.id.st_controls_linearlayout_next);
        StackAdapterB stackAdapter = new StackAdapterB(requireContext(), questions, nextButton);
        questionStack.setAdapter(stackAdapter);
        if (progress>=maxCards) {
            nextButton.setText(R.string.st_controls_linearlayout_submit_button);
        }
        nextButton.setEnabled(false);
        return rootView;
    }

    @Override
    public void onViewCreated(View view, Bundle savedStateInstance){
        super.onViewCreated(view, savedStateInstance);
        selection = rootView.findViewById(R.id.choices);
        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Integer response_ = selection.getCheckedRadioButtonId();
                RadioButton radio_ = rootView.findViewById(response_);
                TextView answer_ = rootView.findViewById(R.id.question_right_answer);
                CharSequence radioText_ = radio_.getText();
                CharSequence answerText_ = answer_.getText();
                mTEST_SCORE += mark(radioText_.toString(), answerText_.toString());
                if (progress < maxCards) {
                    progress++;
                    testProgress.setProgress(progress);
                    if (progress >= maxCards) {
                        nextButton.setText(R.string.st_controls_linearlayout_submit_button);
                    }
                    nextButton.setEnabled(false);
                    questionStack.showNext();
                    selection = rootView.findViewById(R.id.choices);
                } else {
                    // navigate done
                    Bundle data = new Bundle();
                    mTEST_SCORE = ((mTEST_SCORE / maxCards) * 100);
                    data.putString(TEST_TYPE_LABEL, TEST_TYPE);
                    data.putDouble(TEST_SCORE_LABEL, mTEST_SCORE);
                    final NavController controller = Navigation.findNavController(v);
                    controller.navigate(R.id.action_scoredTestTest_to_done, data);
                }
            }
        });
    }

    private Double mark(String radioText, String answerText) {
        Double score;
        if (radioText.toString().equals(answerText.toString())) {
            score = new Double(1);
        } else {
            score = new Double(0);
        }
        return score;
    }
}