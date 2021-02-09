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

public class RoadMarkings extends Fragment {
    private GridView signs;
    private List<Map<String, Integer>> signsData;
    private static final String Log_Tag = RoadMarkings.class.getSimpleName();
    private final static String [] signs_key = new String[] {Log_Tag};
    private int [] signs_views = new int[]{R.id.signs_image};

    public RoadMarkings() {
        // Required empty public constructor
    }

    public static RoadMarkings newInstance() {
        RoadMarkings fragment = new RoadMarkings();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.i(Log_Tag, "Displaying road marking signs.");
        signsData = new ArrayList<Map<String, Integer>>();
        Map<String, Integer> RoadMarkingEntry = new HashMap<String, Integer>();
        RoadMarkingEntry.put(Log_Tag, R.drawable.sign_158);
        signsData.add(RoadMarkingEntry);
        RoadMarkingEntry = new HashMap<String, Integer>();
        RoadMarkingEntry.put(Log_Tag, R.drawable.sign_159);
        signsData.add(RoadMarkingEntry);
        RoadMarkingEntry = new HashMap<String, Integer>();
        RoadMarkingEntry.put(Log_Tag, R.drawable.sign_160);
        signsData.add(RoadMarkingEntry);
        RoadMarkingEntry = new HashMap<String, Integer>();
        RoadMarkingEntry.put(Log_Tag, R.drawable.sign_161);
        signsData.add(RoadMarkingEntry);
        RoadMarkingEntry = new HashMap<String, Integer>();
        RoadMarkingEntry.put(Log_Tag, R.drawable.sign_162);
        signsData.add(RoadMarkingEntry);
        RoadMarkingEntry = new HashMap<String, Integer>();
        RoadMarkingEntry.put(Log_Tag, R.drawable.sign_163);
        signsData.add(RoadMarkingEntry);
        RoadMarkingEntry = new HashMap<String, Integer>();
        RoadMarkingEntry.put(Log_Tag, R.drawable.sign_164);
        signsData.add(RoadMarkingEntry);
        RoadMarkingEntry = new HashMap<String, Integer>();
        RoadMarkingEntry.put(Log_Tag, R.drawable.sign_165);
        signsData.add(RoadMarkingEntry);
        RoadMarkingEntry = new HashMap<String, Integer>();
        RoadMarkingEntry.put(Log_Tag, R.drawable.sign_166);
        signsData.add(RoadMarkingEntry);
        RoadMarkingEntry = new HashMap<String, Integer>();
        RoadMarkingEntry.put(Log_Tag, R.drawable.sign_167);
        signsData.add(RoadMarkingEntry);
        RoadMarkingEntry = new HashMap<String, Integer>();
        RoadMarkingEntry.put(Log_Tag, R.drawable.sign_168);
        signsData.add(RoadMarkingEntry);
        RoadMarkingEntry = new HashMap<String, Integer>();
        RoadMarkingEntry.put(Log_Tag, R.drawable.sign_169);
        signsData.add(RoadMarkingEntry);
        RoadMarkingEntry = new HashMap<String, Integer>();
        RoadMarkingEntry.put(Log_Tag, R.drawable.sign_170);
        signsData.add(RoadMarkingEntry);
        RoadMarkingEntry = new HashMap<String, Integer>();
        RoadMarkingEntry.put(Log_Tag, R.drawable.sign_171);
        signsData.add(RoadMarkingEntry);
        RoadMarkingEntry = new HashMap<String, Integer>();
        RoadMarkingEntry.put(Log_Tag, R.drawable.sign_172);
        signsData.add(RoadMarkingEntry);
        RoadMarkingEntry = new HashMap<String, Integer>();
        RoadMarkingEntry.put(Log_Tag, R.drawable.sign_173);
        signsData.add(RoadMarkingEntry);
        RoadMarkingEntry = new HashMap<String, Integer>();
        RoadMarkingEntry.put(Log_Tag, R.drawable.sign_174);
        signsData.add(RoadMarkingEntry);
        RoadMarkingEntry = new HashMap<String, Integer>();
        RoadMarkingEntry.put(Log_Tag, R.drawable.sign_175);
        signsData.add(RoadMarkingEntry);
        RoadMarkingEntry = new HashMap<String, Integer>();
        RoadMarkingEntry.put(Log_Tag, R.drawable.sign_176);
        signsData.add(RoadMarkingEntry);
        RoadMarkingEntry = new HashMap<String, Integer>();
        RoadMarkingEntry.put(Log_Tag, R.drawable.sign_177);
        signsData.add(RoadMarkingEntry);
        RoadMarkingEntry = new HashMap<String, Integer>();
        RoadMarkingEntry.put(Log_Tag, R.drawable.sign_178);
        signsData.add(RoadMarkingEntry);
        RoadMarkingEntry = new HashMap<String, Integer>();
        RoadMarkingEntry.put(Log_Tag, R.drawable.sign_179);
        signsData.add(RoadMarkingEntry);
        RoadMarkingEntry = new HashMap<String, Integer>();
        RoadMarkingEntry.put(Log_Tag, R.drawable.sign_180);
        signsData.add(RoadMarkingEntry);
        RoadMarkingEntry = new HashMap<String, Integer>();
        RoadMarkingEntry.put(Log_Tag, R.drawable.sign_181);
        signsData.add(RoadMarkingEntry);
        RoadMarkingEntry = new HashMap<String, Integer>();
        RoadMarkingEntry.put(Log_Tag, R.drawable.sign_182);
        signsData.add(RoadMarkingEntry);
        RoadMarkingEntry = new HashMap<String, Integer>();
        RoadMarkingEntry.put(Log_Tag, R.drawable.sign_183);
        signsData.add(RoadMarkingEntry);
        RoadMarkingEntry = new HashMap<String, Integer>();
        RoadMarkingEntry.put(Log_Tag, R.drawable.sign_184);
        signsData.add(RoadMarkingEntry);
        RoadMarkingEntry = new HashMap<String, Integer>();
        RoadMarkingEntry.put(Log_Tag, R.drawable.sign_185);
        signsData.add(RoadMarkingEntry);
        RoadMarkingEntry = new HashMap<String, Integer>();
        RoadMarkingEntry.put(Log_Tag, R.drawable.sign_186);
        signsData.add(RoadMarkingEntry);
        RoadMarkingEntry = new HashMap<String, Integer>();
        RoadMarkingEntry.put(Log_Tag, R.drawable.sign_187);
        signsData.add(RoadMarkingEntry);
        RoadMarkingEntry = new HashMap<String, Integer>();
        RoadMarkingEntry.put(Log_Tag, R.drawable.sign_188);
        signsData.add(RoadMarkingEntry);
        RoadMarkingEntry = new HashMap<String, Integer>();
        RoadMarkingEntry.put(Log_Tag, R.drawable.sign_189);
        signsData.add(RoadMarkingEntry);
        RoadMarkingEntry = new HashMap<String, Integer>();
        RoadMarkingEntry.put(Log_Tag, R.drawable.sign_190);
        signsData.add(RoadMarkingEntry);
        RoadMarkingEntry = new HashMap<String, Integer>();
        RoadMarkingEntry.put(Log_Tag, R.drawable.sign_191);
        signsData.add(RoadMarkingEntry);
        RoadMarkingEntry = new HashMap<String, Integer>();
        RoadMarkingEntry.put(Log_Tag, R.drawable.sign_192);
        signsData.add(RoadMarkingEntry);
        RoadMarkingEntry = new HashMap<String, Integer>();
        RoadMarkingEntry.put(Log_Tag, R.drawable.sign_193);
        signsData.add(RoadMarkingEntry);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = (View) inflater.inflate(R.layout.learn_signs_road_markings, container, false);
        signs = (GridView) rootView.findViewById(R.id.ls_rm_grid_view);
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