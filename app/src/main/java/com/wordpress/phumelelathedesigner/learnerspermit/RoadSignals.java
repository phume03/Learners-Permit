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

public class RoadSignals extends Fragment {
    private GridView signs;
    private List<Map<String, Integer>> signsData;
    private static final String Log_Tag = RoadSignals.class.getSimpleName();
    private final static String [] signs_key = new String[] {Log_Tag};
    private int [] signs_views = new int[]{R.id.signs_image};

    public RoadSignals() {
        // Required empty public constructor
    }

    public static RoadSignals newInstance() {
        RoadSignals fragment = new RoadSignals();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.i(Log_Tag, "Displaying road signal signs.");
        signsData = new ArrayList<Map<String, Integer>>();
        Map<String, Integer> RoadSignalsEntry = new HashMap<String, Integer>();
        RoadSignalsEntry.put(Log_Tag, R.drawable.sign_194);
        signsData.add(RoadSignalsEntry);
        RoadSignalsEntry = new HashMap<String, Integer>();
        RoadSignalsEntry.put(Log_Tag, R.drawable.sign_195);
        signsData.add(RoadSignalsEntry);
        RoadSignalsEntry = new HashMap<String, Integer>();
        RoadSignalsEntry.put(Log_Tag, R.drawable.sign_196);
        signsData.add(RoadSignalsEntry);
        RoadSignalsEntry = new HashMap<String, Integer>();
        RoadSignalsEntry.put(Log_Tag, R.drawable.sign_197);
        signsData.add(RoadSignalsEntry);
        RoadSignalsEntry = new HashMap<String, Integer>();
        RoadSignalsEntry.put(Log_Tag, R.drawable.sign_198);
        signsData.add(RoadSignalsEntry);
        RoadSignalsEntry = new HashMap<String, Integer>();
        RoadSignalsEntry.put(Log_Tag, R.drawable.sign_199);
        signsData.add(RoadSignalsEntry);
        RoadSignalsEntry = new HashMap<String, Integer>();
        RoadSignalsEntry.put(Log_Tag, R.drawable.sign_200);
        signsData.add(RoadSignalsEntry);
        RoadSignalsEntry = new HashMap<String, Integer>();
        RoadSignalsEntry.put(Log_Tag, R.drawable.sign_201);
        signsData.add(RoadSignalsEntry);
        RoadSignalsEntry = new HashMap<String, Integer>();
        RoadSignalsEntry.put(Log_Tag, R.drawable.sign_202);
        signsData.add(RoadSignalsEntry);
        RoadSignalsEntry = new HashMap<String, Integer>();
        RoadSignalsEntry.put(Log_Tag, R.drawable.sign_203);
        signsData.add(RoadSignalsEntry);
        RoadSignalsEntry = new HashMap<String, Integer>();
        RoadSignalsEntry.put(Log_Tag, R.drawable.sign_204);
        signsData.add(RoadSignalsEntry);
        RoadSignalsEntry = new HashMap<String, Integer>();
        RoadSignalsEntry.put(Log_Tag, R.drawable.sign_205);
        signsData.add(RoadSignalsEntry);
        RoadSignalsEntry = new HashMap<String, Integer>();
        RoadSignalsEntry.put(Log_Tag, R.drawable.sign_206);
        signsData.add(RoadSignalsEntry);
        RoadSignalsEntry = new HashMap<String, Integer>();
        RoadSignalsEntry.put(Log_Tag, R.drawable.sign_207);
        signsData.add(RoadSignalsEntry);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = (View) inflater.inflate(R.layout.learn_signs_road_signals, container, false);
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