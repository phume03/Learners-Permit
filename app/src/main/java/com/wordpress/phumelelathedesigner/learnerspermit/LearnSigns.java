package com.wordpress.phumelelathedesigner.learnerspermit;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link LearnSigns#newInstance} factory method to
 * create an instance of this fragment.
 */
public class LearnSigns extends Fragment {
    private ListView listOfRulesAndSignsCategories;
    private List <String> titlesOfCategories;
    private static final String Log_Tag = LearnSigns.class.getSimpleName();

    public LearnSigns() {
        // Required empty public constructor
    }

    public static LearnSigns newInstance() {
        LearnSigns fragment = new LearnSigns();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.i(Log_Tag, "Displaying rules and signs list.");
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = (View) inflater.inflate(R.layout.learn_signs, container, false);
        listOfRulesAndSignsCategories = rootView.findViewById(R.id.road_rules_signs_categories);
        titlesOfCategories = new ArrayList<String>();

        titlesOfCategories.add(getString(R.string.rules_of_the_road));
        titlesOfCategories.add(getString(R.string.regulatory_signs));
        titlesOfCategories.add(getString(R.string.warning_signs));
        titlesOfCategories.add(getString(R.string.guide_or_information_signs));
        titlesOfCategories.add(getString(R.string.road_markings));
        titlesOfCategories.add(getString(R.string.road_signals));
        ArrayAdapter <String> titlesAdapter = new ArrayAdapter<String>(this, android.R.layout.list_item, titlesOfCategories);
        listOfRulesAndSignsCategories.setAdapter(titlesAdapter);

        listViewA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        listViewB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        return rootView;
    }
}