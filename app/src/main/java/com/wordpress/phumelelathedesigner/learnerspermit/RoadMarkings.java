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
    private List<Card> signsCardsData;
    private static final String Log_Tag = RoadMarkings.class.getSimpleName();

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
        signsCardsData = new ArrayList<Card>();
        Card RoadMarkingEntry = new Card(R.drawable.sign_158, getString(R.string.road_markings_158));
        signsCardsData.add(RoadMarkingEntry);
        RoadMarkingEntry = new Card(R.drawable.sign_159, getString(R.string.road_markings_159));
        signsCardsData.add(RoadMarkingEntry);
        RoadMarkingEntry = new Card(R.drawable.sign_160, getString(R.string.road_markings_160));
        signsCardsData.add(RoadMarkingEntry);
        RoadMarkingEntry = new Card(R.drawable.sign_161, getString(R.string.road_markings_161));
        signsCardsData.add(RoadMarkingEntry);
        RoadMarkingEntry = new Card(R.drawable.sign_162, getString(R.string.road_markings_162));
        signsCardsData.add(RoadMarkingEntry);
        RoadMarkingEntry = new Card(R.drawable.sign_163, getString(R.string.road_markings_163));
        signsCardsData.add(RoadMarkingEntry);
        RoadMarkingEntry = new Card(R.drawable.sign_164, getString(R.string.road_markings_164));
        signsCardsData.add(RoadMarkingEntry);
        RoadMarkingEntry = new Card(R.drawable.sign_165, getString(R.string.road_markings_165));
        signsCardsData.add(RoadMarkingEntry);
        RoadMarkingEntry = new Card(R.drawable.sign_166, getString(R.string.road_markings_166));
        signsCardsData.add(RoadMarkingEntry);
        RoadMarkingEntry = new Card(R.drawable.sign_167, getString(R.string.road_markings_167));
        signsCardsData.add(RoadMarkingEntry);
        RoadMarkingEntry = new Card(R.drawable.sign_168, getString(R.string.road_markings_168));
        signsCardsData.add(RoadMarkingEntry);
        RoadMarkingEntry = new Card(R.drawable.sign_169, getString(R.string.road_markings_169));
        signsCardsData.add(RoadMarkingEntry);
        RoadMarkingEntry = new Card(R.drawable.sign_170, getString(R.string.road_markings_170));
        signsCardsData.add(RoadMarkingEntry);
        RoadMarkingEntry = new Card(R.drawable.sign_171, getString(R.string.road_markings_171));
        signsCardsData.add(RoadMarkingEntry);
        RoadMarkingEntry = new Card(R.drawable.sign_172, getString(R.string.road_markings_172));
        signsCardsData.add(RoadMarkingEntry);
        RoadMarkingEntry = new Card(R.drawable.sign_173, getString(R.string.road_markings_173));
        signsCardsData.add(RoadMarkingEntry);
        RoadMarkingEntry = new Card(R.drawable.sign_174, getString(R.string.road_markings_174));
        signsCardsData.add(RoadMarkingEntry);
        RoadMarkingEntry = new Card(R.drawable.sign_175, getString(R.string.road_markings_175));
        signsCardsData.add(RoadMarkingEntry);
        RoadMarkingEntry = new Card(R.drawable.sign_176, getString(R.string.road_markings_176));
        signsCardsData.add(RoadMarkingEntry);
        RoadMarkingEntry = new Card(R.drawable.sign_177, getString(R.string.road_markings_177));
        signsCardsData.add(RoadMarkingEntry);
        RoadMarkingEntry = new Card(R.drawable.sign_178, getString(R.string.road_markings_178));
        signsCardsData.add(RoadMarkingEntry);
        RoadMarkingEntry = new Card(R.drawable.sign_179, getString(R.string.road_markings_179));
        signsCardsData.add(RoadMarkingEntry);
        RoadMarkingEntry = new Card(R.drawable.sign_180, getString(R.string.road_markings_180));
        signsCardsData.add(RoadMarkingEntry);
        RoadMarkingEntry = new Card(R.drawable.sign_181, getString(R.string.road_markings_181));
        signsCardsData.add(RoadMarkingEntry);
        RoadMarkingEntry = new Card(R.drawable.sign_182, getString(R.string.road_markings_182));
        signsCardsData.add(RoadMarkingEntry);
        RoadMarkingEntry = new Card(R.drawable.sign_183, getString(R.string.road_markings_183));
        signsCardsData.add(RoadMarkingEntry);
        RoadMarkingEntry = new Card(R.drawable.sign_184, getString(R.string.road_markings_184));
        signsCardsData.add(RoadMarkingEntry);
        RoadMarkingEntry = new Card(R.drawable.sign_185, getString(R.string.road_markings_185));
        signsCardsData.add(RoadMarkingEntry);
        RoadMarkingEntry = new Card(R.drawable.sign_186, getString(R.string.road_markings_186));
        signsCardsData.add(RoadMarkingEntry);
        RoadMarkingEntry = new Card(R.drawable.sign_187, getString(R.string.road_markings_187));
        signsCardsData.add(RoadMarkingEntry);
        RoadMarkingEntry = new Card(R.drawable.sign_188, getString(R.string.road_markings_188));
        signsCardsData.add(RoadMarkingEntry);
        RoadMarkingEntry = new Card(R.drawable.sign_189, getString(R.string.road_markings_189));
        signsCardsData.add(RoadMarkingEntry);
        RoadMarkingEntry = new Card(R.drawable.sign_190, getString(R.string.road_markings_190));
        signsCardsData.add(RoadMarkingEntry);
        RoadMarkingEntry = new Card(R.drawable.sign_191, getString(R.string.road_markings_191));
        signsCardsData.add(RoadMarkingEntry);
        RoadMarkingEntry = new Card(R.drawable.sign_192, getString(R.string.road_markings_192));
        signsCardsData.add(RoadMarkingEntry);
        RoadMarkingEntry = new Card(R.drawable.sign_193, getString(R.string.road_markings_193));
        signsCardsData.add(RoadMarkingEntry);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = (View) inflater.inflate(R.layout.learn_signs_road_markings, container, false);
        signs = (GridView) rootView.findViewById(R.id.ls_rm_grid_view);
        signs.setNumColumns(3);
        ExtendedBaseAdapter signsAdapter = new ExtendedBaseAdapter(requireContext(), signsCardsData);
        signs.setAdapter(signsAdapter);

        return rootView;
    }
}