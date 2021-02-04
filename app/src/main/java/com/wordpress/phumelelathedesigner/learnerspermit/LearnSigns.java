package com.wordpress.phumelelathedesigner.learnerspermit;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class LearnSigns extends AppCompatActivity {
    private ListView listview;
    private List<String> rulesSignsCategoriesTitles;
    private static final String Log_Tag = LearnSigns.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_learn_signs);
        Log.i(Log_Tag, "Displaying rules and signs list.");
        listview = findViewById(R.id.rules_signs_categories);
        rulesSignsCategoriesTitles = new ArrayList<>();
        rulesSignsCategoriesTitles.add(getString(R.string.rules_of_the_road));
        rulesSignsCategoriesTitles.add(getString(R.string.regulatory_signs));
        rulesSignsCategoriesTitles.add(getString(R.string.warning_signs));
        rulesSignsCategoriesTitles.add(getString(R.string.guide_or_information_signs));
        rulesSignsCategoriesTitles.add(getString(R.string.road_markings));
        rulesSignsCategoriesTitles.add(getString(R.string.road_signals));

        ArrayAdapter <String> adapter = new ArrayAdapter<>(this, R.layout.support_spinner_simple_spinner_dropdown_item, rulesSignsCategoriesTitles);
        listview.setAdapter(adapter);
        listview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

    }
}