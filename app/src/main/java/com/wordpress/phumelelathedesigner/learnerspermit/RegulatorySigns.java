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
    private List<Map<String, Integer>> signsData;
    private static final String Log_Tag = RegulatorySigns.class.getSimpleName();
    private final static String [] signs_key = new String[] {Log_Tag};
    private int [] signs_views = new int[]{R.id.signs_image};

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
        signsData = new ArrayList<Map<String, Integer>>();
        Map<String, Integer> RegulatorySignEntry = new HashMap<String, Integer>();
        RegulatorySignEntry.put(Log_Tag, R.drawable.sign_001);
        signsData.add(RegulatorySignEntry);
        RegulatorySignEntry = new HashMap<String, Integer>();
        RegulatorySignEntry.put(Log_Tag, R.drawable.sign_002);
        signsData.add(RegulatorySignEntry);
        RegulatorySignEntry = new HashMap<String, Integer>();
        RegulatorySignEntry.put(Log_Tag, R.drawable.sign_003);
        signsData.add(RegulatorySignEntry);
        RegulatorySignEntry = new HashMap<String, Integer>();
        RegulatorySignEntry.put(Log_Tag, R.drawable.sign_004);
        signsData.add(RegulatorySignEntry);
        RegulatorySignEntry = new HashMap<String, Integer>();
        RegulatorySignEntry.put(Log_Tag, R.drawable.sign_005);
        signsData.add(RegulatorySignEntry);
        RegulatorySignEntry = new HashMap<String, Integer>();
        RegulatorySignEntry.put(Log_Tag, R.drawable.sign_006);
        signsData.add(RegulatorySignEntry);
        RegulatorySignEntry = new HashMap<String, Integer>();
        RegulatorySignEntry.put(Log_Tag, R.drawable.sign_007);
        signsData.add(RegulatorySignEntry);
        RegulatorySignEntry = new HashMap<String, Integer>();
        RegulatorySignEntry.put(Log_Tag, R.drawable.sign_008);
        signsData.add(RegulatorySignEntry);
        RegulatorySignEntry = new HashMap<String, Integer>();
        RegulatorySignEntry.put(Log_Tag, R.drawable.sign_009);
        signsData.add(RegulatorySignEntry);
        RegulatorySignEntry = new HashMap<String, Integer>();
        RegulatorySignEntry.put(Log_Tag, R.drawable.sign_010);
        signsData.add(RegulatorySignEntry);
        RegulatorySignEntry = new HashMap<String, Integer>();
        RegulatorySignEntry.put(Log_Tag, R.drawable.sign_011);
        signsData.add(RegulatorySignEntry);
        RegulatorySignEntry = new HashMap<String, Integer>();
        RegulatorySignEntry.put(Log_Tag, R.drawable.sign_012);
        signsData.add(RegulatorySignEntry);
        RegulatorySignEntry = new HashMap<String, Integer>();
        RegulatorySignEntry.put(Log_Tag, R.drawable.sign_013);
        signsData.add(RegulatorySignEntry);
        RegulatorySignEntry = new HashMap<String, Integer>();
        RegulatorySignEntry.put(Log_Tag, R.drawable.sign_014);
        signsData.add(RegulatorySignEntry);
        RegulatorySignEntry = new HashMap<String, Integer>();
        RegulatorySignEntry.put(Log_Tag, R.drawable.sign_015);
        signsData.add(RegulatorySignEntry);
        RegulatorySignEntry = new HashMap<String, Integer>();
        RegulatorySignEntry.put(Log_Tag, R.drawable.sign_016);
        signsData.add(RegulatorySignEntry);
        RegulatorySignEntry = new HashMap<String, Integer>();
        RegulatorySignEntry.put(Log_Tag, R.drawable.sign_017);
        signsData.add(RegulatorySignEntry);
        RegulatorySignEntry = new HashMap<String, Integer>();
        RegulatorySignEntry.put(Log_Tag, R.drawable.sign_018);
        signsData.add(RegulatorySignEntry);
        RegulatorySignEntry = new HashMap<String, Integer>();
        RegulatorySignEntry.put(Log_Tag, R.drawable.sign_019);
        signsData.add(RegulatorySignEntry);
        RegulatorySignEntry = new HashMap<String, Integer>();
        RegulatorySignEntry.put(Log_Tag, R.drawable.sign_020);
        signsData.add(RegulatorySignEntry);
        RegulatorySignEntry = new HashMap<String, Integer>();
        RegulatorySignEntry.put(Log_Tag, R.drawable.sign_021);
        signsData.add(RegulatorySignEntry);
        RegulatorySignEntry = new HashMap<String, Integer>();
        RegulatorySignEntry.put(Log_Tag, R.drawable.sign_022);
        signsData.add(RegulatorySignEntry);
        RegulatorySignEntry = new HashMap<String, Integer>();
        RegulatorySignEntry.put(Log_Tag, R.drawable.sign_023);
        signsData.add(RegulatorySignEntry);
        RegulatorySignEntry = new HashMap<String, Integer>();
        RegulatorySignEntry.put(Log_Tag, R.drawable.sign_024);
        signsData.add(RegulatorySignEntry);
        RegulatorySignEntry = new HashMap<String, Integer>();
        RegulatorySignEntry.put(Log_Tag, R.drawable.sign_025);
        signsData.add(RegulatorySignEntry);
        RegulatorySignEntry = new HashMap<String, Integer>();
        RegulatorySignEntry.put(Log_Tag, R.drawable.sign_026);
        signsData.add(RegulatorySignEntry);
        RegulatorySignEntry = new HashMap<String, Integer>();
        RegulatorySignEntry.put(Log_Tag, R.drawable.sign_027);
        signsData.add(RegulatorySignEntry);
        RegulatorySignEntry = new HashMap<String, Integer>();
        RegulatorySignEntry.put(Log_Tag, R.drawable.sign_028);
        signsData.add(RegulatorySignEntry);
        RegulatorySignEntry = new HashMap<String, Integer>();
        RegulatorySignEntry.put(Log_Tag, R.drawable.sign_029);
        signsData.add(RegulatorySignEntry);
        RegulatorySignEntry = new HashMap<String, Integer>();
        RegulatorySignEntry.put(Log_Tag, R.drawable.sign_030);
        signsData.add(RegulatorySignEntry);
        RegulatorySignEntry = new HashMap<String, Integer>();
        RegulatorySignEntry.put(Log_Tag, R.drawable.sign_031);
        signsData.add(RegulatorySignEntry);
        RegulatorySignEntry = new HashMap<String, Integer>();
        RegulatorySignEntry.put(Log_Tag, R.drawable.sign_032);
        signsData.add(RegulatorySignEntry);
        RegulatorySignEntry = new HashMap<String, Integer>();
        RegulatorySignEntry.put(Log_Tag, R.drawable.sign_033);
        signsData.add(RegulatorySignEntry);
        RegulatorySignEntry = new HashMap<String, Integer>();
        RegulatorySignEntry.put(Log_Tag, R.drawable.sign_034);
        signsData.add(RegulatorySignEntry);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = (View) inflater.inflate(R.layout.learn_signs_regulatory_signs, container, false);
        signs = (GridView) rootView.findViewById(R.id.ls_rs_grid_view);
        SimpleAdapter signsAdapter = new SimpleAdapter(requireContext(), signsData, R.layout.grid_item, signs_key, signs_views);
        SimpleAdapter.ViewBinder binder = new SimpleAdapter.ViewBinder() {
            @Override
            public boolean setViewValue(View view, Object data, String textRepresentation) {
                return false;
            }
        };
        signsAdapter.setViewBinder(binder);
        signs.setAdapter(signsAdapter);
        return rootView;
    }
}