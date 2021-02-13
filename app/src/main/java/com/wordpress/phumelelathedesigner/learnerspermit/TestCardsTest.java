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
import android.widget.Toast;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class TestCardsTest extends Fragment {
    private static final String TEST_TYPE_LABEL="TEST_TYPE";
    private static final String TEST_TYPE="test";
    private static final String regulatory_signs = "regsCheckBox";
    private static final String warning_signs = "wsCheckBox";
    private static final String guide_or_information_signs = "goisCheckBox";
    private static final String road_markings = "rmCheckBox";
    private static final String road_signals = "rsCheckBox";
    private static final String rules_of_the_road = "rotrCheckBox";
    private Boolean regsChecked;
    private Boolean wsChecked;
    private Boolean goisChecked;
    private Boolean rmChecked;
    private Boolean rsChecked;
    private Boolean rotrChecked;
    private AdapterViewFlipper cardStack;
    private List <StackCard> stack;
    private static final String Log_Tag = TestCardsTest.class.getSimpleName();
    private int progress;
    private static final int maxCards = 10;
    private Resources res;
    private String packageName;
    private NumberFormat nf;
    private Random rand;

    public TestCardsTest() {
        // Required empty public constructor
    }

    public static TestCardsTest newInstance() {
        TestCardsTest fragment = new TestCardsTest();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.i(Log_Tag, "Starting the test.");
        stack = new ArrayList <StackCard>();
        rand = new Random();
        res  = getResources();
        packageName = getActivity().getPackageName();
        nf = NumberFormat.getInstance();
        nf.setMinimumIntegerDigits(3);
        final Bundle data = getArguments();
        int num_rs = 0;
        int num_rm = 0;
        int num_gois = 0;
        int num_ws = 0;
        int num_regs = 0;
        int num_rotr = 0;
        if (data != null) {
            rsChecked = data.getBoolean(road_signals);
            rmChecked = data.getBoolean(road_markings);
            goisChecked = data.getBoolean(guide_or_information_signs);
            wsChecked = data.getBoolean(warning_signs);
            regsChecked = data.getBoolean(regulatory_signs);
            rotrChecked = data.getBoolean(rules_of_the_road);

            if (rsChecked && !rmChecked && !goisChecked && !wsChecked && !regsChecked && !rotrChecked) {
                num_rs = maxCards;
            } else if (!rsChecked && rmChecked && !goisChecked && !wsChecked && !regsChecked && !rotrChecked) {
                num_rm = maxCards;
            } else if (!rsChecked && !rmChecked && goisChecked && !wsChecked && !regsChecked && !rotrChecked) {
                num_gois = maxCards;
            } else if (!rsChecked && !rmChecked && !goisChecked && wsChecked && !regsChecked && !rotrChecked) {
                num_ws = maxCards;
            } else if (!rsChecked && !rmChecked && !goisChecked && !wsChecked && regsChecked && !rotrChecked) {
                num_regs = maxCards;
            } else if (!rsChecked && !rmChecked && !goisChecked && !wsChecked && !regsChecked && rotrChecked) {
                num_rotr = maxCards;
            } else if (rsChecked && !rmChecked && goisChecked && !wsChecked && !regsChecked && !rotrChecked) {
                num_rs = rand.nextInt(11);
                num_gois = 10 - num_rs;
            } else if (!rsChecked && !rmChecked && goisChecked && wsChecked && !regsChecked && !rotrChecked) {
                num_ws = rand.nextInt(11);
                num_gois = 10 - num_ws;
            } else if (!rsChecked && rmChecked && goisChecked && !wsChecked && !regsChecked && !rotrChecked) {
                num_rm = rand.nextInt(11);
                num_gois = 10 - num_rm;
            } else if (rsChecked && !rmChecked && !goisChecked && wsChecked && !regsChecked && !rotrChecked) {
                num_rs = rand.nextInt(11);
                num_ws = 10 - num_rs;
            } else if (!rsChecked && !rmChecked && !goisChecked && wsChecked && !regsChecked && rotrChecked) {
                num_rotr = rand.nextInt(11);
                num_ws = 10 - num_rotr;
            } else if (!rsChecked && rmChecked && !goisChecked && wsChecked && !regsChecked && !rotrChecked) {
                num_rm = rand.nextInt(11);
                num_ws = 10 - num_rm;
            } else if (rsChecked && !rmChecked && !goisChecked && !wsChecked && regsChecked && !rotrChecked) {
                num_rs = rand.nextInt(11);
                num_regs = 10 - num_rs;
            } else if (rsChecked && !rmChecked && !goisChecked && !wsChecked && !regsChecked && rotrChecked) {
                num_rs = rand.nextInt(11);
                num_rotr = 10 - num_rs;
            } else if (!rsChecked && rmChecked && !goisChecked && !wsChecked && !regsChecked && rotrChecked) {
                num_rm = rand.nextInt(11);
                num_rotr = 10 - num_rm;
            } else if (rsChecked && rmChecked && !goisChecked && !wsChecked && !regsChecked && !rotrChecked) {
                num_rs = rand.nextInt(11);
                num_rm = 10 - num_rs;
            } else if (!rsChecked && rmChecked && !goisChecked && !wsChecked && regsChecked && !rotrChecked) {
                num_regs = rand.nextInt(11);
                num_rm = 10 - num_regs;
            } else if (!rsChecked && !rmChecked && goisChecked && !wsChecked && regsChecked && !rotrChecked) {
                num_regs = rand.nextInt(11);
                num_gois = 10 - num_regs;
            } else if (!rsChecked && !rmChecked && goisChecked && !wsChecked && !regsChecked && rotrChecked) {
                num_rotr = rand.nextInt(11);
                num_gois = 10 - num_rotr;
            } else if (!rsChecked && !rmChecked && !goisChecked && wsChecked && regsChecked && !rotrChecked) {
                num_regs = rand.nextInt(11);
                num_ws = 10 - num_regs;
            } else if (!rsChecked && !rmChecked && !goisChecked && !wsChecked && regsChecked && rotrChecked) {
                num_regs = rand.nextInt(11);
                num_rotr = 10 - num_regs;
            } else if (rsChecked && rmChecked && goisChecked && !wsChecked && !regsChecked && !rotrChecked) {
                num_rs = rand.nextInt(11);
                num_rm = rand.nextInt(11 - num_rs ) ;
                num_gois = 10 - (num_rs + num_rm);
            } else if (rsChecked && rmChecked && !goisChecked && wsChecked && !regsChecked && !rotrChecked) {
                num_rs = rand.nextInt(11);
                num_rm = rand.nextInt(11 - num_rs ) ;
                num_ws = 10 - (num_rs + num_rm);
            } else if (rsChecked && rmChecked && !goisChecked && !wsChecked && regsChecked && !rotrChecked) {
                num_rs = rand.nextInt(11);
                num_rm = rand.nextInt(11 - num_rs ) ;
                num_regs = 10 - (num_rs + num_rm);
            } else if (rsChecked && rmChecked && !goisChecked && !wsChecked && !regsChecked && rotrChecked) {
                num_rs = rand.nextInt(11);
                num_rm = rand.nextInt(11 - num_rs ) ;
                num_rotr = 10 - (num_rs + num_rm);
            } else if (rsChecked && !rmChecked && goisChecked && wsChecked && !regsChecked && !rotrChecked) {
                num_rs = rand.nextInt(11);
                num_ws = rand.nextInt(11 - num_rs ) ;
                num_gois = 10 - (num_rs + num_ws);
            } else if (rsChecked && !rmChecked && goisChecked && !wsChecked && regsChecked && !rotrChecked) {
                num_rs = rand.nextInt(11);
                num_regs = rand.nextInt(11 - num_rs ) ;
                num_gois = 10 - (num_rs + num_regs);
            } else if (rsChecked && !rmChecked && goisChecked && !wsChecked && !regsChecked && rotrChecked) {
                num_rs = rand.nextInt(11);
                num_rotr = rand.nextInt(11 - num_rs ) ;
                num_gois = 10 - (num_rs + num_rotr);
            } else if (!rsChecked && rmChecked && goisChecked && wsChecked && !regsChecked && !rotrChecked) {
                num_ws = rand.nextInt(11);
                num_rm = rand.nextInt(11 - num_ws ) ;
                num_gois = 10 - (num_ws + num_rm);
            } else if (!rsChecked && rmChecked && goisChecked && !wsChecked && regsChecked && !rotrChecked) {
                num_regs = rand.nextInt(11);
                num_rm = rand.nextInt(11 - num_regs ) ;
                num_gois = 10 - (num_regs + num_rm);
            } else if (!rsChecked && rmChecked && goisChecked && !wsChecked && !regsChecked && rotrChecked) {
                num_rotr = rand.nextInt(11);
                num_rm = rand.nextInt(11 - num_rotr ) ;
                num_gois = 10 - (num_rotr + num_rm);
            } else if (rsChecked && !rmChecked && !goisChecked && wsChecked && regsChecked && !rotrChecked) {
                num_rs = rand.nextInt(11);
                num_ws = rand.nextInt(11 - num_rs ) ;
                num_regs = 10 - (num_rs + num_ws);
            } else if (rsChecked && !rmChecked && !goisChecked && wsChecked && !regsChecked && rotrChecked) {
                num_rs = rand.nextInt(11);
                num_ws = rand.nextInt(11 - num_rs ) ;
                num_rotr = 10 - (num_rs + num_ws);
            } else if (rsChecked && !rmChecked && !goisChecked && !wsChecked && regsChecked && rotrChecked) {
                num_rs = rand.nextInt(11);
                num_regs = rand.nextInt(11 - num_rs ) ;
                num_rotr = 10 - (num_rs + num_regs);
            } else if (!rsChecked && rmChecked && !goisChecked && wsChecked && regsChecked && !rotrChecked) {
                num_ws = rand.nextInt(11);
                num_rm = rand.nextInt(11 - num_ws ) ;
                num_regs = 10 - (num_ws + num_rm);
            } else if (!rsChecked && rmChecked && !goisChecked && wsChecked && !regsChecked && rotrChecked) {
                num_ws = rand.nextInt(11);
                num_rm = rand.nextInt(11 - num_ws ) ;
                num_rotr = 10 - (num_ws + num_rm);
            } else if (!rsChecked && rmChecked && !goisChecked && !wsChecked && regsChecked && rotrChecked) {
                num_regs = rand.nextInt(11);
                num_rm = rand.nextInt(11 - num_regs ) ;
                num_rotr = 10 - (num_regs + num_rm);
            } else if (!rsChecked && !rmChecked && goisChecked && wsChecked && regsChecked && !rotrChecked) {
                num_ws = rand.nextInt(11);
                num_regs = rand.nextInt(11 - num_ws ) ;
                num_gois = 10 - (num_ws + num_regs);
            } else if (!rsChecked && !rmChecked && goisChecked && wsChecked && !regsChecked && rotrChecked) {
                num_ws = rand.nextInt(11);
                num_rotr = rand.nextInt(11 - num_ws ) ;
                num_gois = 10 - (num_ws + num_rotr);
            } else if (!rsChecked && !rmChecked && goisChecked && !wsChecked && regsChecked && rotrChecked) {
                num_regs = rand.nextInt(11);
                num_rotr = rand.nextInt(11 - num_regs ) ;
                num_gois = 10 - (num_regs + num_rotr);
            } else if (!rsChecked && !rmChecked && !goisChecked && wsChecked && regsChecked && rotrChecked) {
                num_ws = rand.nextInt(11);
                num_regs = rand.nextInt(11 - num_ws ) ;
                num_rotr = 10 - (num_ws + num_regs);
            } else if (rsChecked && rmChecked && goisChecked && wsChecked && !regsChecked && !rotrChecked) {
                num_rs = rand.nextInt(11);
                num_rm = rand.nextInt(11 - num_rs ) ;
                num_gois = rand.nextInt(11 - ( num_rs + num_rm ) );
                num_ws = 10 - (num_rs + num_rm + num_gois);
            } else if (rsChecked && rmChecked && goisChecked && !wsChecked && regsChecked && !rotrChecked) {
                num_rs = rand.nextInt(11);
                num_rm = rand.nextInt(11 - num_rs ) ;
                num_gois = rand.nextInt(11 - ( num_rs + num_rm ) );
                num_regs = 10 - (num_rs + num_rm + num_gois);
            } else if (rsChecked && rmChecked && goisChecked && !wsChecked && !regsChecked && rotrChecked) {
                num_rs = rand.nextInt(11);
                num_rm = rand.nextInt(11 - num_rs ) ;
                num_gois = rand.nextInt(11 - ( num_rs + num_rm ) );
                num_rotr = 10 - (num_rs + num_rm + num_gois);
            } else if (!rsChecked && rmChecked && goisChecked && wsChecked && regsChecked && !rotrChecked) {
                num_regs = rand.nextInt(11);
                num_rm = rand.nextInt(11 - num_regs ) ;
                num_gois = rand.nextInt(11 - ( num_regs + num_rm ) );
                num_ws = 10 - (num_regs + num_rm + num_gois);
            } else if (!rsChecked && rmChecked && goisChecked && wsChecked && !regsChecked && rotrChecked) {
                num_rotr = rand.nextInt(11);
                num_rm = rand.nextInt(11 - num_rotr ) ;
                num_gois = rand.nextInt(11 - ( num_rotr + num_rm ) );
                num_ws = 10 - (num_rotr + num_rm + num_gois);
            } else if (rsChecked && !rmChecked && goisChecked && wsChecked && regsChecked && !rotrChecked) {
                num_rs = rand.nextInt(11);
                num_regs = rand.nextInt(11 - num_rs ) ;
                num_gois = rand.nextInt(11 - ( num_rs + num_regs ) );
                num_ws = 10 - (num_rs + num_regs + num_gois);
            } else if (rsChecked && !rmChecked && goisChecked && wsChecked && !regsChecked && rotrChecked) {
                num_rs = rand.nextInt(11);
                num_rotr = rand.nextInt(11 - num_rs ) ;
                num_gois = rand.nextInt(11 - ( num_rs + num_rotr ) );
                num_ws = 10 - (num_rs + num_rotr + num_gois);
            } else if (rsChecked && rmChecked && !goisChecked && wsChecked && regsChecked && !rotrChecked) {
                num_rs = rand.nextInt(11);
                num_rm = rand.nextInt(11 - num_rs ) ;
                num_regs = rand.nextInt(11 - ( num_rs + num_rm ) );
                num_ws = 10 - (num_rs + num_rm + num_regs);
            } else if (rsChecked && rmChecked && !goisChecked && wsChecked && !regsChecked && rotrChecked) {
                num_rs = rand.nextInt(11);
                num_rm = rand.nextInt(11 - num_rs ) ;
                num_rotr = rand.nextInt(11 - ( num_rs + num_rm ) );
                num_ws = 10 - (num_rs + num_rm + num_rotr);
            } else if (!rsChecked && !rmChecked && goisChecked && wsChecked && regsChecked && rotrChecked) {
                num_regs = rand.nextInt(11);
                num_rotr = rand.nextInt(11 - num_regs ) ;
                num_gois = rand.nextInt(11 - ( num_regs + num_rotr ) );
                num_ws = 10 - (num_regs + num_rotr + num_gois);
            } else if (!rsChecked && rmChecked && !goisChecked && wsChecked && regsChecked && rotrChecked) {
                num_regs = rand.nextInt(11);
                num_rm = rand.nextInt(11 - num_regs ) ;
                num_rotr = rand.nextInt(11 - ( num_regs + num_rm ) );
                num_ws = 10 - (num_regs + num_rm + num_rotr);
            } else if (rsChecked && rmChecked && !goisChecked && !wsChecked && regsChecked && rotrChecked) {
                num_rs = rand.nextInt(11);
                num_rm = rand.nextInt(11 - num_rs ) ;
                num_regs = rand.nextInt(11 - ( num_rs + num_rm ) );
                num_rotr = 10 - (num_rs + num_rm + num_regs);
            } else if (rsChecked && !rmChecked && goisChecked && !wsChecked && regsChecked && rotrChecked) {
                num_rs = rand.nextInt(11);
                num_gois = rand.nextInt(11 - num_rs ) ;
                num_regs = rand.nextInt(11 - ( num_rs + num_gois ) );
                num_rotr = 10 - (num_rs + num_gois + num_regs);
            } else if (rsChecked && !rmChecked && !goisChecked && wsChecked && regsChecked && rotrChecked) {
                num_rs = rand.nextInt(11);
                num_ws = rand.nextInt(11 - num_rs ) ;
                num_regs = rand.nextInt(11 - ( num_rs + num_ws ) );
                num_rotr = 10 - (num_rs + num_ws + num_regs);
            } else if (!rsChecked && rmChecked && goisChecked && !wsChecked && regsChecked && rotrChecked) {
                num_gois = rand.nextInt(11);
                num_rm = rand.nextInt(11 - num_gois ) ;
                num_regs = rand.nextInt(11 - ( num_gois + num_rm ) );
                num_rotr = 10 - (num_gois + num_rm + num_regs);
            } else if (rsChecked && rmChecked && goisChecked && wsChecked && regsChecked && !rotrChecked) {
                num_rs = rand.nextInt(11);
                num_rm = rand.nextInt(11 - num_rs ) ;
                num_gois = rand.nextInt(11 - ( num_rs + num_rm ) );
                num_ws = rand.nextInt(11 - ( num_rs + num_rm + num_gois ) );
                num_regs = 10 - (num_rs + num_rm + num_gois + num_ws);
            } else if (rsChecked && rmChecked && goisChecked && wsChecked && !regsChecked && rotrChecked) {
                num_rs = rand.nextInt(11);
                num_rm = rand.nextInt(11 - num_rs ) ;
                num_gois = rand.nextInt(11 - ( num_rs + num_rm ) );
                num_ws = rand.nextInt(11 - ( num_rs + num_rm + num_gois ) );
                num_rotr = 10 - (num_rs + num_rm + num_gois + num_ws);
            } else if (rsChecked && rmChecked && goisChecked && !wsChecked && regsChecked && rotrChecked) {
                num_rs = rand.nextInt(11);
                num_rm = rand.nextInt(11 - num_rs ) ;
                num_gois = rand.nextInt(11 - ( num_rs + num_rm ) );
                num_rotr = rand.nextInt(11 - ( num_rs + num_rm + num_gois ) );
                num_regs = 10 - (num_rs + num_rm + num_gois + num_rotr);
            } else if (rsChecked && rmChecked && !goisChecked && wsChecked && regsChecked && rotrChecked) {
                num_rs = rand.nextInt(11);
                num_rm = rand.nextInt(11 - num_rs ) ;
                num_rotr = rand.nextInt(11 - ( num_rs + num_rm ) );
                num_ws = rand.nextInt(11 - ( num_rs + num_rm + num_rotr ) );
                num_regs = 10 - (num_rs + num_rm + num_rotr + num_ws);
            } else if (rsChecked && !rmChecked && goisChecked && wsChecked && regsChecked && rotrChecked) {
                num_rs = rand.nextInt(11);
                num_rotr = rand.nextInt(11 - num_rs ) ;
                num_gois = rand.nextInt(11 - ( num_rs + num_rotr ) );
                num_ws = rand.nextInt(11 - ( num_rs + num_rotr + num_gois ) );
                num_regs = 10 - (num_rs + num_rotr + num_gois + num_ws);
            } else if (!rsChecked && rmChecked && goisChecked && wsChecked && regsChecked && rotrChecked) {
                num_rotr = rand.nextInt(11);
                num_rm = rand.nextInt(11 - num_rotr ) ;
                num_gois = rand.nextInt(11 - ( num_rotr + num_rm ) );
                num_ws = rand.nextInt(11 - ( num_rotr + num_rm + num_gois ) );
                num_regs = 10 - (num_rotr + num_rm + num_gois + num_ws);
            } else {
                num_rs = rand.nextInt(11);
                num_rm = rand.nextInt(11 - num_rs ) ;
                num_gois = rand.nextInt(11 - ( num_rs + num_rm ) );
                num_ws = rand.nextInt(11 - ( num_rs + num_rm + num_gois ) );
                num_regs = rand.nextInt(11 - ( num_rs + num_rm + num_gois + num_ws ) );
                num_rotr = 10 - ( num_rs + num_rm + num_gois + num_ws + num_regs );
            }
        }

        int cardnum;
        StackCard card;
        String resourceName;
        String resourceDescriptionName;
        Integer resourceNameID;
        Integer resourceDescriptionID;
        for ( ;num_rs>0; num_rs--) {
            cardnum = (194 + rand.nextInt(14));
            resourceName = new String("sign_").concat(nf.format(cardnum));
            resourceDescriptionName = new String("road_signals_").concat(nf.format(cardnum));
            resourceNameID = res.getIdentifier(resourceName, "drawable", packageName);
            resourceDescriptionID = res.getIdentifier(resourceDescriptionName, "string", packageName);
            card = new StackCard(resourceNameID,getString(resourceDescriptionID), true);
            stack.add(card);
        }

        for (;num_rm>0;num_rm--) {
            cardnum = (158 + rand.nextInt(36));
            resourceName = new String("sign_").concat(nf.format(cardnum));
            resourceDescriptionName = new String("road_markings_").concat(nf.format(cardnum));
            resourceNameID = res.getIdentifier(resourceName, "drawable", packageName);
            resourceDescriptionID = res.getIdentifier(resourceDescriptionName, "string", packageName);
            card = new StackCard(resourceNameID,getString(resourceDescriptionID), true);
            stack.add(card);
        }

        for (;num_gois>0;num_gois--) {
            cardnum = (86 + rand.nextInt(72));
            resourceName = new String("sign_").concat(nf.format(cardnum));
            resourceDescriptionName = new String("guide_or_information_signs_").concat(nf.format(cardnum));
            resourceNameID = res.getIdentifier(resourceName, "drawable", packageName);
            resourceDescriptionID = res.getIdentifier(resourceDescriptionName, "string", packageName);
            card = new StackCard(resourceNameID,getString(resourceDescriptionID), true);
            stack.add(card);
        }

        for (;num_ws>0;num_ws--) {
            cardnum = (35 + rand.nextInt(51));
            resourceName = new String("sign_").concat(nf.format(cardnum));
            resourceDescriptionName = new String("warning_signs_").concat(nf.format(cardnum));
            resourceNameID = res.getIdentifier(resourceName, "drawable", packageName);
            resourceDescriptionID = res.getIdentifier(resourceDescriptionName, "string", packageName);
            card = new StackCard(resourceNameID,getString(resourceDescriptionID), true);
            stack.add(card);
        }

        for (;num_regs>0;num_regs--) {
            cardnum = (1 + rand.nextInt(34));
            resourceName = new String("sign_").concat(nf.format(cardnum));
            resourceDescriptionName = new String("regulatory_signs_").concat(nf.format(cardnum));
            resourceNameID = res.getIdentifier(resourceName, "drawable", packageName);
            resourceDescriptionID = res.getIdentifier(resourceDescriptionName, "string", packageName);
            card = new StackCard(resourceNameID,getString(resourceDescriptionID), true);
            stack.add(card);
        }

        nf = NumberFormat.getInstance();
        nf.setMinimumIntegerDigits(2);
        for (;num_rotr>0;num_rotr--) {
            cardnum = (1 + rand.nextInt(65));
            resourceName = new String("rules_of_the_road_").concat(nf.format(cardnum)).concat("_Q");
            resourceDescriptionName = new String("rules_of_the_road_").concat(nf.format(cardnum)).concat("_A");
            resourceNameID = res.getIdentifier(resourceName, "string", packageName);
            resourceDescriptionID = res.getIdentifier(resourceDescriptionName, "string", packageName);
            card = new StackCard(resourceNameID,res.getString(resourceDescriptionID), false);
            stack.add(card);
        }

        OnBackPressedCallback callback = new OnBackPressedCallback(true) {
            @Override
            public void handleOnBackPressed() {
                Toast.makeText(requireContext(), R.string.back_navigation_attempt, Toast.LENGTH_SHORT).show();
            }
        };
        requireActivity().getOnBackPressedDispatcher().addCallback(this, callback);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.testcards_test, container, false);
        cardStack = rootView.findViewById(R.id.card_stack);
        ProgressBar testProgress = rootView.findViewById(R.id.progress_bar_tct);
        progress = 1;
        testProgress.setMax(maxCards);
        testProgress.setProgress(progress);
        Button nextButton = rootView.findViewById(R.id.controls_linearlayout_next);
        Button previousButton = rootView.findViewById(R.id.controls_linearlayout_previous);
        StackAdapter stackAdapter = new StackAdapter(requireContext(), stack);
        cardStack.setAdapter(stackAdapter);

        if (progress<=1) {
            previousButton.setEnabled(false);
        }
        if (progress>=maxCards) {
            nextButton.setText(R.string.controls_linearlayout_next_button_done);
        }
        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cardStack.showNext();
                if (progress==1) {
                    previousButton.setEnabled(true);
                }
                if (progress<maxCards) {
                    progress++;
                    testProgress.setProgress(progress);
                    if (progress >= maxCards) {
                        nextButton.setText(R.string.controls_linearlayout_next_button_done);
                    }
                } else {
                    // navigate done
                    Bundle data = new Bundle();
                    data.putString(TEST_TYPE_LABEL, TEST_TYPE);
                    final NavController controller = Navigation.findNavController(v);
                    controller.navigate(R.id.action_testCardsTest_to_done, data);
                }
            }
        });
        previousButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cardStack.showPrevious();
                if (progress>=maxCards) {
                    nextButton.setText(R.string.controls_linearlayout_next_button);
                }
                if (progress>1) {
                    progress--;
                    testProgress.setProgress(progress);
                    if (progress <= 1) {
                        previousButton.setEnabled(false);
                    }
                }
            }
        });
        return rootView;
    }
}
