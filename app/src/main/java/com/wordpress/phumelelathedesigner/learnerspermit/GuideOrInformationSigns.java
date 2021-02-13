package com.wordpress.phumelelathedesigner.learnerspermit;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;

import java.util.ArrayList;
import java.util.List;

import androidx.fragment.app.Fragment;

public class GuideOrInformationSigns extends Fragment {
    private GridView signs;
    private List<Card> signsCardsData;
    private static final String Log_Tag = GuideOrInformationSigns.class.getSimpleName();

    public GuideOrInformationSigns() {
        // Required empty public constructor
    }

    public static GuideOrInformationSigns newInstance() {
        GuideOrInformationSigns fragment = new GuideOrInformationSigns();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.i(Log_Tag, "Displaying guide or information signs.");
        signsCardsData = new ArrayList<Card>();
        Card GOISEntry = new Card(R.drawable.sign_086, getString(R.string.guide_or_information_signs_086));
        signsCardsData.add(GOISEntry);
        GOISEntry = new Card(R.drawable.sign_087, getString(R.string.guide_or_information_signs_087));
        signsCardsData.add(GOISEntry);
        GOISEntry = new Card(R.drawable.sign_088, getString(R.string.guide_or_information_signs_088));
        signsCardsData.add(GOISEntry);
        GOISEntry = new Card(R.drawable.sign_089, getString(R.string.guide_or_information_signs_089));
        signsCardsData.add(GOISEntry);
        GOISEntry = new Card(R.drawable.sign_090, getString(R.string.guide_or_information_signs_090));
        signsCardsData.add(GOISEntry);
        GOISEntry = new Card(R.drawable.sign_091, getString(R.string.guide_or_information_signs_091));
        signsCardsData.add(GOISEntry);
        GOISEntry = new Card(R.drawable.sign_092, getString(R.string.guide_or_information_signs_092));
        signsCardsData.add(GOISEntry);
        GOISEntry = new Card(R.drawable.sign_093, getString(R.string.guide_or_information_signs_093));
        signsCardsData.add(GOISEntry);
        GOISEntry = new Card(R.drawable.sign_094, getString(R.string.guide_or_information_signs_094));
        signsCardsData.add(GOISEntry);
        GOISEntry = new Card(R.drawable.sign_095, getString(R.string.guide_or_information_signs_095));
        signsCardsData.add(GOISEntry);
        GOISEntry = new Card(R.drawable.sign_096, getString(R.string.guide_or_information_signs_096));
        signsCardsData.add(GOISEntry);
        GOISEntry = new Card(R.drawable.sign_097, getString(R.string.guide_or_information_signs_097));
        signsCardsData.add(GOISEntry);
        GOISEntry = new Card(R.drawable.sign_098, getString(R.string.guide_or_information_signs_098));
        signsCardsData.add(GOISEntry);
        GOISEntry = new Card(R.drawable.sign_099, getString(R.string.guide_or_information_signs_099));
        signsCardsData.add(GOISEntry);
        GOISEntry = new Card(R.drawable.sign_100, getString(R.string.guide_or_information_signs_100));
        signsCardsData.add(GOISEntry);
        GOISEntry = new Card(R.drawable.sign_101, getString(R.string.guide_or_information_signs_101));
        signsCardsData.add(GOISEntry);
        GOISEntry = new Card(R.drawable.sign_102, getString(R.string.guide_or_information_signs_102));
        signsCardsData.add(GOISEntry);
        GOISEntry = new Card(R.drawable.sign_103, getString(R.string.guide_or_information_signs_103));
        signsCardsData.add(GOISEntry);
        GOISEntry = new Card(R.drawable.sign_104, getString(R.string.guide_or_information_signs_104));
        signsCardsData.add(GOISEntry);
        GOISEntry = new Card(R.drawable.sign_105, getString(R.string.guide_or_information_signs_105));
        signsCardsData.add(GOISEntry);
        GOISEntry = new Card(R.drawable.sign_106, getString(R.string.guide_or_information_signs_106));
        signsCardsData.add(GOISEntry);
        GOISEntry = new Card(R.drawable.sign_107, getString(R.string.guide_or_information_signs_107));
        signsCardsData.add(GOISEntry);
        GOISEntry = new Card(R.drawable.sign_108, getString(R.string.guide_or_information_signs_108));
        signsCardsData.add(GOISEntry);
        GOISEntry = new Card(R.drawable.sign_109, getString(R.string.guide_or_information_signs_109));
        signsCardsData.add(GOISEntry);
        GOISEntry = new Card(R.drawable.sign_110, getString(R.string.guide_or_information_signs_110));
        signsCardsData.add(GOISEntry);
        GOISEntry = new Card(R.drawable.sign_111, getString(R.string.guide_or_information_signs_111));
        signsCardsData.add(GOISEntry);
        GOISEntry = new Card(R.drawable.sign_112, getString(R.string.guide_or_information_signs_112));
        signsCardsData.add(GOISEntry);
        GOISEntry = new Card(R.drawable.sign_113, getString(R.string.guide_or_information_signs_113));
        signsCardsData.add(GOISEntry);
        GOISEntry = new Card(R.drawable.sign_114, getString(R.string.guide_or_information_signs_114));
        signsCardsData.add(GOISEntry);
        GOISEntry = new Card(R.drawable.sign_115, getString(R.string.guide_or_information_signs_115));
        signsCardsData.add(GOISEntry);
        GOISEntry = new Card(R.drawable.sign_116, getString(R.string.guide_or_information_signs_116));
        signsCardsData.add(GOISEntry);
        GOISEntry = new Card(R.drawable.sign_117, getString(R.string.guide_or_information_signs_117));
        signsCardsData.add(GOISEntry);
        GOISEntry = new Card(R.drawable.sign_118, getString(R.string.guide_or_information_signs_118));
        signsCardsData.add(GOISEntry);
        GOISEntry = new Card(R.drawable.sign_119, getString(R.string.guide_or_information_signs_119));
        signsCardsData.add(GOISEntry);
        GOISEntry = new Card(R.drawable.sign_120, getString(R.string.guide_or_information_signs_120));
        signsCardsData.add(GOISEntry);
        GOISEntry = new Card(R.drawable.sign_121, getString(R.string.guide_or_information_signs_121));
        signsCardsData.add(GOISEntry);
        GOISEntry = new Card(R.drawable.sign_122, getString(R.string.guide_or_information_signs_122));
        signsCardsData.add(GOISEntry);
        GOISEntry = new Card(R.drawable.sign_123, getString(R.string.guide_or_information_signs_123));
        signsCardsData.add(GOISEntry);
        GOISEntry = new Card(R.drawable.sign_124, getString(R.string.guide_or_information_signs_124));
        signsCardsData.add(GOISEntry);
        GOISEntry = new Card(R.drawable.sign_125, getString(R.string.guide_or_information_signs_125));
        signsCardsData.add(GOISEntry);
        GOISEntry = new Card(R.drawable.sign_126, getString(R.string.guide_or_information_signs_126));
        signsCardsData.add(GOISEntry);
        GOISEntry = new Card(R.drawable.sign_127, getString(R.string.guide_or_information_signs_127));
        signsCardsData.add(GOISEntry);
        GOISEntry = new Card(R.drawable.sign_128, getString(R.string.guide_or_information_signs_128));
        signsCardsData.add(GOISEntry);
        GOISEntry = new Card(R.drawable.sign_129, getString(R.string.guide_or_information_signs_129));
        signsCardsData.add(GOISEntry);
        GOISEntry = new Card(R.drawable.sign_130, getString(R.string.guide_or_information_signs_130));
        signsCardsData.add(GOISEntry);
        GOISEntry = new Card(R.drawable.sign_131, getString(R.string.guide_or_information_signs_131));
        signsCardsData.add(GOISEntry);
        GOISEntry = new Card(R.drawable.sign_132, getString(R.string.guide_or_information_signs_132));
        signsCardsData.add(GOISEntry);
        GOISEntry = new Card(R.drawable.sign_133, getString(R.string.guide_or_information_signs_133));
        signsCardsData.add(GOISEntry);
        GOISEntry = new Card(R.drawable.sign_134, getString(R.string.guide_or_information_signs_134));
        signsCardsData.add(GOISEntry);
        GOISEntry = new Card(R.drawable.sign_135, getString(R.string.guide_or_information_signs_135));
        signsCardsData.add(GOISEntry);
        GOISEntry = new Card(R.drawable.sign_136, getString(R.string.guide_or_information_signs_136));
        signsCardsData.add(GOISEntry);
        GOISEntry = new Card(R.drawable.sign_137, getString(R.string.guide_or_information_signs_137));
        signsCardsData.add(GOISEntry);
        GOISEntry = new Card(R.drawable.sign_138, getString(R.string.guide_or_information_signs_138));
        signsCardsData.add(GOISEntry);
        GOISEntry = new Card(R.drawable.sign_139, getString(R.string.guide_or_information_signs_139));
        signsCardsData.add(GOISEntry);
        GOISEntry = new Card(R.drawable.sign_140, getString(R.string.guide_or_information_signs_140));
        signsCardsData.add(GOISEntry);
        GOISEntry = new Card(R.drawable.sign_141, getString(R.string.guide_or_information_signs_141));
        signsCardsData.add(GOISEntry);
        GOISEntry = new Card(R.drawable.sign_142, getString(R.string.guide_or_information_signs_142));
        signsCardsData.add(GOISEntry);
        GOISEntry = new Card(R.drawable.sign_143, getString(R.string.guide_or_information_signs_143));
        signsCardsData.add(GOISEntry);
        GOISEntry = new Card(R.drawable.sign_144, getString(R.string.guide_or_information_signs_144));
        signsCardsData.add(GOISEntry);
        GOISEntry = new Card(R.drawable.sign_145, getString(R.string.guide_or_information_signs_145));
        signsCardsData.add(GOISEntry);
        GOISEntry = new Card(R.drawable.sign_146, getString(R.string.guide_or_information_signs_146));
        signsCardsData.add(GOISEntry);
        GOISEntry = new Card(R.drawable.sign_147, getString(R.string.guide_or_information_signs_147));
        signsCardsData.add(GOISEntry);
        GOISEntry = new Card(R.drawable.sign_148, getString(R.string.guide_or_information_signs_148));
        signsCardsData.add(GOISEntry);
        GOISEntry = new Card(R.drawable.sign_149, getString(R.string.guide_or_information_signs_149));
        signsCardsData.add(GOISEntry);
        GOISEntry = new Card(R.drawable.sign_150, getString(R.string.guide_or_information_signs_150));
        signsCardsData.add(GOISEntry);
        GOISEntry = new Card(R.drawable.sign_151, getString(R.string.guide_or_information_signs_151));
        signsCardsData.add(GOISEntry);
        GOISEntry = new Card(R.drawable.sign_152, getString(R.string.guide_or_information_signs_152));
        signsCardsData.add(GOISEntry);
        GOISEntry = new Card(R.drawable.sign_153, getString(R.string.guide_or_information_signs_153));
        signsCardsData.add(GOISEntry);
        GOISEntry = new Card(R.drawable.sign_154, getString(R.string.guide_or_information_signs_154));
        signsCardsData.add(GOISEntry);
        GOISEntry = new Card(R.drawable.sign_155, getString(R.string.guide_or_information_signs_155));
        signsCardsData.add(GOISEntry);
        GOISEntry = new Card(R.drawable.sign_156, getString(R.string.guide_or_information_signs_156));
        signsCardsData.add(GOISEntry);
        GOISEntry = new Card(R.drawable.sign_157, getString(R.string.guide_or_information_signs_157));
        signsCardsData.add(GOISEntry);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = (View) inflater.inflate(R.layout.learn_signs_guide_or_information_signs, container, false);
        signs = (GridView) rootView.findViewById(R.id.ls_gois_grid_view);
        signs.setNumColumns(3);
        CardAdapter signsAdapter = new CardAdapter(requireContext(), signsCardsData);
        signs.setAdapter(signsAdapter);
        return rootView;
    }
}