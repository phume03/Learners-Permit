package com.wordpress.phumelelathedesigner.learnerspermit;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.util.Log;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import java.util.ArrayList;
import java.util.List;

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
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = (View) inflater.inflate(R.layout.learn_signs, container, false);
        listOfRulesAndSignsCategories = rootView.findViewById(R.id.list_view_title);
        titlesOfCategories = new ArrayList<String>();
        titlesOfCategories.add(getString(R.string.regulatory_signs));
        titlesOfCategories.add(getString(R.string.warning_signs));
        titlesOfCategories.add(getString(R.string.guide_or_information_signs));
        titlesOfCategories.add(getString(R.string.road_markings));
        titlesOfCategories.add(getString(R.string.road_signals));
        titlesOfCategories.add(getString(R.string.rules_of_the_road));
        ArrayAdapter<String> titlesAdapter = new ArrayAdapter<String> (requireContext(), R.layout.list_item, titlesOfCategories);
        listOfRulesAndSignsCategories.setAdapter(titlesAdapter);
        return rootView;
    }

    @Override
    public void onViewCreated(View view, Bundle savedStateInstance) {
        super.onViewCreated(view, savedStateInstance);
        AdapterView.OnItemClickListener messageClickedHandler = new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                final NavController controller = (NavController) Navigation.findNavController(view);
                switch(position) {
                    case 0:
                        controller.navigate(R.id.action_learnSigns_to_regulatorySigns);
                        break;
                    case 1:
                        controller.navigate(R.id.action_learnSigns_to_warningSigns);
                        break;
                    case 2:
                        controller.navigate(R.id.action_learnSigns_to_guideOrInformationSigns);
                        break;
                    case 3:
                        controller.navigate(R.id.action_learnSigns_to_roadMarkings);
                        break;
                    case 4:
                        controller.navigate(R.id.action_learnSigns_to_roadSignals);
                        break;
                    case 5:
                        controller.navigate(R.id.action_learnSigns_to_rulesOfTheRoad);
                        break;
                    default:
                        break;
                }
            }
        };
        listOfRulesAndSignsCategories.setOnItemClickListener(messageClickedHandler);

    }
}