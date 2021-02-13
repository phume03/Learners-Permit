package com.wordpress.phumelelathedesigner.learnerspermit;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;

import java.util.ArrayList;
import java.util.List;

public class WarningSigns extends Fragment {
    private GridView signs;
    private List<Card> signsCardsData;
    private static final String Log_Tag = WarningSigns.class.getSimpleName();

    public WarningSigns() {
        // Required empty public constructor
    }

    public static WarningSigns newInstance() {
        WarningSigns fragment = new WarningSigns();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.i(Log_Tag, "Displaying warning signs.");
        signsCardsData = new ArrayList<Card>();
        Card WarningEntry = new Card(R.drawable.sign_035, getString(R.string.warning_signs_035));
        signsCardsData.add(WarningEntry);
        WarningEntry = new Card(R.drawable.sign_036, getString(R.string.warning_signs_036));
        signsCardsData.add(WarningEntry);
        WarningEntry = new Card(R.drawable.sign_037, getString(R.string.warning_signs_037));
        signsCardsData.add(WarningEntry);
        WarningEntry = new Card(R.drawable.sign_038, getString(R.string.warning_signs_038));
        signsCardsData.add(WarningEntry);
        WarningEntry = new Card(R.drawable.sign_039, getString(R.string.warning_signs_039));
        signsCardsData.add(WarningEntry);
        WarningEntry = new Card(R.drawable.sign_040, getString(R.string.warning_signs_040));
        signsCardsData.add(WarningEntry);
        WarningEntry = new Card(R.drawable.sign_041, getString(R.string.warning_signs_041));
        signsCardsData.add(WarningEntry);
        WarningEntry = new Card(R.drawable.sign_042, getString(R.string.warning_signs_042));
        signsCardsData.add(WarningEntry);
        WarningEntry = new Card(R.drawable.sign_043, getString(R.string.warning_signs_043));
        signsCardsData.add(WarningEntry);
        WarningEntry = new Card(R.drawable.sign_044, getString(R.string.warning_signs_044));
        signsCardsData.add(WarningEntry);
        WarningEntry = new Card(R.drawable.sign_045, getString(R.string.warning_signs_045));
        signsCardsData.add(WarningEntry);
        WarningEntry = new Card(R.drawable.sign_046, getString(R.string.warning_signs_046));
        signsCardsData.add(WarningEntry);
        WarningEntry = new Card(R.drawable.sign_047, getString(R.string.warning_signs_047));
        signsCardsData.add(WarningEntry);
        WarningEntry = new Card(R.drawable.sign_048, getString(R.string.warning_signs_048));
        signsCardsData.add(WarningEntry);
        WarningEntry = new Card(R.drawable.sign_049, getString(R.string.warning_signs_049));
        signsCardsData.add(WarningEntry);
        WarningEntry = new Card(R.drawable.sign_050, getString(R.string.warning_signs_050));
        signsCardsData.add(WarningEntry);
        WarningEntry = new Card(R.drawable.sign_017, getString(R.string.warning_signs_051));
        signsCardsData.add(WarningEntry);
        WarningEntry = new Card(R.drawable.sign_052, getString(R.string.warning_signs_052));
        signsCardsData.add(WarningEntry);
        WarningEntry = new Card(R.drawable.sign_053, getString(R.string.warning_signs_053));
        signsCardsData.add(WarningEntry);
        WarningEntry = new Card(R.drawable.sign_054, getString(R.string.warning_signs_054));
        signsCardsData.add(WarningEntry);
        WarningEntry = new Card(R.drawable.sign_055, getString(R.string.warning_signs_055));
        signsCardsData.add(WarningEntry);
        WarningEntry = new Card(R.drawable.sign_056, getString(R.string.warning_signs_056));
        signsCardsData.add(WarningEntry);
        WarningEntry = new Card(R.drawable.sign_057, getString(R.string.warning_signs_057));
        signsCardsData.add(WarningEntry);
        WarningEntry = new Card(R.drawable.sign_058, getString(R.string.warning_signs_058));
        signsCardsData.add(WarningEntry);
        WarningEntry = new Card(R.drawable.sign_059, getString(R.string.warning_signs_059));
        signsCardsData.add(WarningEntry);
        WarningEntry = new Card(R.drawable.sign_060, getString(R.string.warning_signs_060));
        signsCardsData.add(WarningEntry);
        WarningEntry = new Card(R.drawable.sign_061, getString(R.string.warning_signs_061));
        signsCardsData.add(WarningEntry);
        WarningEntry = new Card(R.drawable.sign_062, getString(R.string.warning_signs_062));
        signsCardsData.add(WarningEntry);
        WarningEntry = new Card(R.drawable.sign_063, getString(R.string.warning_signs_063));
        signsCardsData.add(WarningEntry);
        WarningEntry = new Card(R.drawable.sign_064, getString(R.string.warning_signs_064));
        signsCardsData.add(WarningEntry);
        WarningEntry = new Card(R.drawable.sign_065, getString(R.string.warning_signs_065));
        signsCardsData.add(WarningEntry);
        WarningEntry = new Card(R.drawable.sign_066, getString(R.string.warning_signs_066));
        signsCardsData.add(WarningEntry);
        WarningEntry = new Card(R.drawable.sign_067, getString(R.string.warning_signs_067));
        signsCardsData.add(WarningEntry);
        WarningEntry = new Card(R.drawable.sign_068, getString(R.string.warning_signs_068));
        signsCardsData.add(WarningEntry);
        WarningEntry = new Card(R.drawable.sign_069, getString(R.string.warning_signs_069));
        signsCardsData.add(WarningEntry);
        WarningEntry = new Card(R.drawable.sign_070, getString(R.string.warning_signs_070));
        signsCardsData.add(WarningEntry);
        WarningEntry = new Card(R.drawable.sign_071, getString(R.string.warning_signs_071));
        signsCardsData.add(WarningEntry);
        WarningEntry = new Card(R.drawable.sign_072, getString(R.string.warning_signs_072));
        signsCardsData.add(WarningEntry);
        WarningEntry = new Card(R.drawable.sign_073, getString(R.string.warning_signs_073));
        signsCardsData.add(WarningEntry);
        WarningEntry = new Card(R.drawable.sign_074, getString(R.string.warning_signs_074));
        signsCardsData.add(WarningEntry);
        WarningEntry = new Card(R.drawable.sign_075, getString(R.string.warning_signs_075));
        signsCardsData.add(WarningEntry);
        WarningEntry = new Card(R.drawable.sign_076, getString(R.string.warning_signs_076));
        signsCardsData.add(WarningEntry);
        WarningEntry = new Card(R.drawable.sign_077, getString(R.string.warning_signs_077));
        signsCardsData.add(WarningEntry);
        WarningEntry = new Card(R.drawable.sign_078, getString(R.string.warning_signs_078));
        signsCardsData.add(WarningEntry);
        WarningEntry = new Card(R.drawable.sign_079, getString(R.string.warning_signs_079));
        signsCardsData.add(WarningEntry);
        WarningEntry = new Card(R.drawable.sign_080, getString(R.string.warning_signs_080));
        signsCardsData.add(WarningEntry);
        WarningEntry = new Card(R.drawable.sign_081, getString(R.string.warning_signs_081));
        signsCardsData.add(WarningEntry);
        WarningEntry = new Card(R.drawable.sign_082, getString(R.string.warning_signs_082));
        signsCardsData.add(WarningEntry);
        WarningEntry = new Card(R.drawable.sign_083, getString(R.string.warning_signs_083));
        signsCardsData.add(WarningEntry);
        WarningEntry = new Card(R.drawable.sign_084, getString(R.string.warning_signs_084));
        signsCardsData.add(WarningEntry);
        WarningEntry = new Card(R.drawable.sign_085, getString(R.string.warning_signs_085));
        signsCardsData.add(WarningEntry);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = (View) inflater.inflate(R.layout.learn_signs_warning_signs, container, false);
        signs = (GridView) rootView.findViewById(R.id.ls_ws_grid_view);
        signs.setNumColumns(3);
        CardAdapter signsAdapter = new CardAdapter(requireContext(), signsCardsData);
        signs.setAdapter(signsAdapter);

        return rootView;
    }
}