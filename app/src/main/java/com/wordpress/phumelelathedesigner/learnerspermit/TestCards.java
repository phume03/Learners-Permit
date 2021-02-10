package com.wordpress.phumelelathedesigner.learnerspermit;

import android.os.Bundle;
import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class TestCards extends Fragment {
    private ListView listOfRulesAndSignsCategories;
    private List<String> titlesOfCategories;
    private static final String Log_Tag = TestCards.class.getSimpleName();

    public TestCards() {
        // Required empty public constructor
    }

    public static TestCards newInstance() {
        TestCards fragment = new TestCards();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.i(Log_Tag, "Starting card test.");
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.test_cards, container, false);
        return rootView;
    }
}