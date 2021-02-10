package com.wordpress.phumelelathedesigner.learnerspermit;

import android.database.DataSetObserver;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RegulatorySigns extends Fragment {
    private GridView signs;
    private List<Card> signsCardsData;
    private static final String Log_Tag = RegulatorySigns.class.getSimpleName();

    public RegulatorySigns() {
        // Required empty public constructor
    }

    public static RegulatorySigns newInstance() {
        RegulatorySigns fragment = new RegulatorySigns();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.i(Log_Tag, "Displaying regulatory signs.");
        signsCardsData = new ArrayList<Card>();
        Card RegulatorySignEntry = new Card(R.drawable.sign_001, getString(R.string.regulatory_signs_001));
        signsCardsData.add(RegulatorySignEntry);
        RegulatorySignEntry = new Card(R.drawable.sign_002, getString(R.string.regulatory_signs_002));
        signsCardsData.add(RegulatorySignEntry);
        RegulatorySignEntry = new Card(R.drawable.sign_003, getString(R.string.regulatory_signs_003));
        signsCardsData.add(RegulatorySignEntry);
        RegulatorySignEntry = new Card(R.drawable.sign_004, getString(R.string.regulatory_signs_004));
        signsCardsData.add(RegulatorySignEntry);
        RegulatorySignEntry = new Card(R.drawable.sign_005, getString(R.string.regulatory_signs_005));
        signsCardsData.add(RegulatorySignEntry);
        RegulatorySignEntry = new Card(R.drawable.sign_006, getString(R.string.regulatory_signs_006));
        signsCardsData.add(RegulatorySignEntry);
        RegulatorySignEntry = new Card(R.drawable.sign_007, getString(R.string.regulatory_signs_007));
        signsCardsData.add(RegulatorySignEntry);
        RegulatorySignEntry = new Card(R.drawable.sign_008, getString(R.string.regulatory_signs_008));
        signsCardsData.add(RegulatorySignEntry);
        RegulatorySignEntry = new Card(R.drawable.sign_009, getString(R.string.regulatory_signs_009));
        signsCardsData.add(RegulatorySignEntry);
        RegulatorySignEntry = new Card(R.drawable.sign_010, getString(R.string.regulatory_signs_010));
        signsCardsData.add(RegulatorySignEntry);
        RegulatorySignEntry = new Card(R.drawable.sign_011, getString(R.string.regulatory_signs_011));
        signsCardsData.add(RegulatorySignEntry);
        RegulatorySignEntry = new Card(R.drawable.sign_012, getString(R.string.regulatory_signs_012));
        signsCardsData.add(RegulatorySignEntry);
        RegulatorySignEntry = new Card(R.drawable.sign_013, getString(R.string.regulatory_signs_013));
        signsCardsData.add(RegulatorySignEntry);
        RegulatorySignEntry = new Card(R.drawable.sign_014, getString(R.string.regulatory_signs_014));
        signsCardsData.add(RegulatorySignEntry);
        RegulatorySignEntry = new Card(R.drawable.sign_015, getString(R.string.regulatory_signs_015));
        signsCardsData.add(RegulatorySignEntry);
        RegulatorySignEntry = new Card(R.drawable.sign_016, getString(R.string.regulatory_signs_016));
        signsCardsData.add(RegulatorySignEntry);
        RegulatorySignEntry = new Card(R.drawable.sign_017, getString(R.string.regulatory_signs_017));
        signsCardsData.add(RegulatorySignEntry);
        RegulatorySignEntry = new Card(R.drawable.sign_018, getString(R.string.regulatory_signs_018));
        signsCardsData.add(RegulatorySignEntry);
        RegulatorySignEntry = new Card(R.drawable.sign_019, getString(R.string.regulatory_signs_019));
        signsCardsData.add(RegulatorySignEntry);
        RegulatorySignEntry = new Card(R.drawable.sign_020, getString(R.string.regulatory_signs_020));
        signsCardsData.add(RegulatorySignEntry);
        RegulatorySignEntry = new Card(R.drawable.sign_021, getString(R.string.regulatory_signs_021));
        signsCardsData.add(RegulatorySignEntry);
        RegulatorySignEntry = new Card(R.drawable.sign_022, getString(R.string.regulatory_signs_022));
        signsCardsData.add(RegulatorySignEntry);
        RegulatorySignEntry = new Card(R.drawable.sign_023, getString(R.string.regulatory_signs_023));
        signsCardsData.add(RegulatorySignEntry);
        RegulatorySignEntry = new Card(R.drawable.sign_024, getString(R.string.regulatory_signs_024));
        signsCardsData.add(RegulatorySignEntry);
        RegulatorySignEntry = new Card(R.drawable.sign_025, getString(R.string.regulatory_signs_025));
        signsCardsData.add(RegulatorySignEntry);
        RegulatorySignEntry = new Card(R.drawable.sign_026, getString(R.string.regulatory_signs_026));
        signsCardsData.add(RegulatorySignEntry);
        RegulatorySignEntry = new Card(R.drawable.sign_027, getString(R.string.regulatory_signs_027));
        signsCardsData.add(RegulatorySignEntry);
        RegulatorySignEntry = new Card(R.drawable.sign_028, getString(R.string.regulatory_signs_028));
        signsCardsData.add(RegulatorySignEntry);
        RegulatorySignEntry = new Card(R.drawable.sign_029, getString(R.string.regulatory_signs_029));
        signsCardsData.add(RegulatorySignEntry);
        RegulatorySignEntry = new Card(R.drawable.sign_030, getString(R.string.regulatory_signs_030));
        signsCardsData.add(RegulatorySignEntry);
        RegulatorySignEntry = new Card(R.drawable.sign_031, getString(R.string.regulatory_signs_031));
        signsCardsData.add(RegulatorySignEntry);
        RegulatorySignEntry = new Card(R.drawable.sign_032, getString(R.string.regulatory_signs_032));
        signsCardsData.add(RegulatorySignEntry);
        RegulatorySignEntry = new Card(R.drawable.sign_033, getString(R.string.regulatory_signs_033));
        signsCardsData.add(RegulatorySignEntry);
        RegulatorySignEntry = new Card(R.drawable.sign_034, getString(R.string.regulatory_signs_034));
        signsCardsData.add(RegulatorySignEntry);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = (View) inflater.inflate(R.layout.learn_signs_regulatory_signs, container, false);
        signs = (GridView) rootView.findViewById(R.id.ls_rs_grid_view);
        signs.setNumColumns(3);
        ExtendedBaseAdapter signsAdapter = new ExtendedBaseAdapter(requireContext(), signsCardsData);
        signs.setAdapter(signsAdapter);
        return rootView;
    }
}