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
    private List<Card> signsCardsData;
    private static final String Log_Tag = RoadSignals.class.getSimpleName();

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
        signsCardsData = new ArrayList<Card>();
        Card WarningEntry = new Card(R.drawable.sign_194, getString(R.string.road_signals_194));
        signsCardsData.add(WarningEntry);
        WarningEntry = new Card(R.drawable.sign_195, getString(R.string.road_signals_195));
        signsCardsData.add(WarningEntry);
        WarningEntry = new Card(R.drawable.sign_196, getString(R.string.road_signals_196));
        signsCardsData.add(WarningEntry);
        WarningEntry = new Card(R.drawable.sign_197, getString(R.string.road_signals_197));
        signsCardsData.add(WarningEntry);
        WarningEntry = new Card(R.drawable.sign_198, getString(R.string.road_signals_198));
        signsCardsData.add(WarningEntry);
        WarningEntry = new Card(R.drawable.sign_199, getString(R.string.road_signals_199));
        signsCardsData.add(WarningEntry);
        WarningEntry = new Card(R.drawable.sign_200, getString(R.string.road_signals_200));
        signsCardsData.add(WarningEntry);
        WarningEntry = new Card(R.drawable.sign_201, getString(R.string.road_signals_201));
        signsCardsData.add(WarningEntry);
        WarningEntry = new Card(R.drawable.sign_202, getString(R.string.road_signals_202));
        signsCardsData.add(WarningEntry);
        WarningEntry = new Card(R.drawable.sign_203, getString(R.string.road_signals_203));
        signsCardsData.add(WarningEntry);
        WarningEntry = new Card(R.drawable.sign_204, getString(R.string.road_signals_204));
        signsCardsData.add(WarningEntry);
        WarningEntry = new Card(R.drawable.sign_205, getString(R.string.road_signals_205));
        signsCardsData.add(WarningEntry);
        WarningEntry = new Card(R.drawable.sign_206, getString(R.string.road_signals_206));
        signsCardsData.add(WarningEntry);
        WarningEntry = new Card(R.drawable.sign_207, getString(R.string.road_signals_207));
        signsCardsData.add(WarningEntry);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = (View) inflater.inflate(R.layout.learn_signs_road_signals, container, false);
        signs = (GridView) rootView.findViewById(R.id.ls_rs_grid_view);
        signs.setNumColumns(3);
        ExtendedBaseAdapter signsAdapter = new ExtendedBaseAdapter(requireContext(), signsCardsData);
        signs.setAdapter(signsAdapter);
        return rootView;
    }
}