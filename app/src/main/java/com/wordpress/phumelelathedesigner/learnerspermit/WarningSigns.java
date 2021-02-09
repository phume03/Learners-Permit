package com.wordpress.phumelelathedesigner.learnerspermit;

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

public class WarningSigns extends Fragment {
    private GridView signs;
    private List<Map<String, Integer>> signsData;
    private static final String Log_Tag = WarningSigns.class.getSimpleName();
    private final static String [] signs_key = new String[] {Log_Tag};
    private int [] signs_views = new int[]{R.id.signs_image};

    public WarningSigns() {
        // Required empty public constructor
    }

    public static WarningSigns newInstance() {
        WarningSigns fragment = new WarningSigns();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.i(Log_Tag, "Displaying warning signs.");
        signsData = new ArrayList<Map<String, Integer>>();
        Map<String, Integer> WarningEntry = new HashMap<>();
        WarningEntry.put(Log_Tag, R.drawable.sign_035);
        signsData.add(WarningEntry);

        WarningEntry = new HashMap<>();
        WarningEntry.put(Log_Tag, R.drawable.sign_036);
        signsData.add(WarningEntry);

        WarningEntry = new HashMap<>();
        WarningEntry.put(Log_Tag, R.drawable.sign_037);
        signsData.add(WarningEntry);

        WarningEntry = new HashMap<>();
        WarningEntry.put(Log_Tag, R.drawable.sign_038);
        signsData.add(WarningEntry);

        WarningEntry = new HashMap<>();
        WarningEntry.put(Log_Tag, R.drawable.sign_039);
        signsData.add(WarningEntry);

        WarningEntry = new HashMap<>();
        WarningEntry.put(Log_Tag, R.drawable.sign_040);
        signsData.add(WarningEntry);

        WarningEntry = new HashMap<>();
        WarningEntry.put(Log_Tag, R.drawable.sign_041);
        signsData.add(WarningEntry);

        WarningEntry = new HashMap<>();
        WarningEntry.put(Log_Tag, R.drawable.sign_042);
        signsData.add(WarningEntry);

        WarningEntry = new HashMap<>();
        WarningEntry.put(Log_Tag, R.drawable.sign_043);
        signsData.add(WarningEntry);

        WarningEntry = new HashMap<>();
        WarningEntry.put(Log_Tag, R.drawable.sign_044);
        signsData.add(WarningEntry);

        WarningEntry = new HashMap<>();
        WarningEntry.put(Log_Tag, R.drawable.sign_045);
        signsData.add(WarningEntry);

        WarningEntry = new HashMap<>();
        WarningEntry.put(Log_Tag, R.drawable.sign_046);
        signsData.add(WarningEntry);

        WarningEntry = new HashMap<>();
        WarningEntry.put(Log_Tag, R.drawable.sign_047);
        signsData.add(WarningEntry);

        WarningEntry = new HashMap<>();
        WarningEntry.put(Log_Tag, R.drawable.sign_048);
        signsData.add(WarningEntry);

        WarningEntry = new HashMap<>();
        WarningEntry.put(Log_Tag, R.drawable.sign_049);
        signsData.add(WarningEntry);

        WarningEntry = new HashMap<>();
        WarningEntry.put(Log_Tag, R.drawable.sign_050);
        signsData.add(WarningEntry);

        WarningEntry = new HashMap<>();
        WarningEntry.put(Log_Tag, R.drawable.sign_051);
        signsData.add(WarningEntry);

        WarningEntry = new HashMap<>();
        WarningEntry.put(Log_Tag, R.drawable.sign_052);
        signsData.add(WarningEntry);

        WarningEntry = new HashMap<>();
        WarningEntry.put(Log_Tag, R.drawable.sign_053);
        signsData.add(WarningEntry);

        WarningEntry = new HashMap<>();
        WarningEntry.put(Log_Tag, R.drawable.sign_054);
        signsData.add(WarningEntry);

        WarningEntry = new HashMap<>();
        WarningEntry.put(Log_Tag, R.drawable.sign_055);
        signsData.add(WarningEntry);

        WarningEntry = new HashMap<>();
        WarningEntry.put(Log_Tag, R.drawable.sign_056);
        signsData.add(WarningEntry);

        WarningEntry = new HashMap<>();
        WarningEntry.put(Log_Tag, R.drawable.sign_057);
        signsData.add(WarningEntry);

        WarningEntry = new HashMap<>();
        WarningEntry.put(Log_Tag, R.drawable.sign_058);
        signsData.add(WarningEntry);

        WarningEntry = new HashMap<>();
        WarningEntry.put(Log_Tag, R.drawable.sign_059);
        signsData.add(WarningEntry);

        WarningEntry = new HashMap<>();
        WarningEntry.put(Log_Tag, R.drawable.sign_060);
        signsData.add(WarningEntry);

        WarningEntry = new HashMap<>();
        WarningEntry.put(Log_Tag, R.drawable.sign_061);
        signsData.add(WarningEntry);

        WarningEntry = new HashMap<>();
        WarningEntry.put(Log_Tag, R.drawable.sign_062);
        signsData.add(WarningEntry);

        WarningEntry = new HashMap<>();
        WarningEntry.put(Log_Tag, R.drawable.sign_063);
        signsData.add(WarningEntry);

        WarningEntry = new HashMap<>();
        WarningEntry.put(Log_Tag, R.drawable.sign_064);
        signsData.add(WarningEntry);

        WarningEntry = new HashMap<>();
        WarningEntry.put(Log_Tag, R.drawable.sign_065);
        signsData.add(WarningEntry);

        WarningEntry = new HashMap<>();
        WarningEntry.put(Log_Tag, R.drawable.sign_066);
        signsData.add(WarningEntry);

        WarningEntry = new HashMap<>();
        WarningEntry.put(Log_Tag, R.drawable.sign_067);
        signsData.add(WarningEntry);

        WarningEntry = new HashMap<>();
        WarningEntry.put(Log_Tag, R.drawable.sign_068);
        signsData.add(WarningEntry);

        WarningEntry = new HashMap<>();
        WarningEntry.put(Log_Tag, R.drawable.sign_069);
        signsData.add(WarningEntry);

        WarningEntry = new HashMap<>();
        WarningEntry.put(Log_Tag, R.drawable.sign_070);
        signsData.add(WarningEntry);

        WarningEntry = new HashMap<>();
        WarningEntry.put(Log_Tag, R.drawable.sign_071);
        signsData.add(WarningEntry);

        WarningEntry = new HashMap<>();
        WarningEntry.put(Log_Tag, R.drawable.sign_072);
        signsData.add(WarningEntry);

        WarningEntry = new HashMap<>();
        WarningEntry.put(Log_Tag, R.drawable.sign_073);
        signsData.add(WarningEntry);

        WarningEntry = new HashMap<>();
        WarningEntry.put(Log_Tag, R.drawable.sign_074);
        signsData.add(WarningEntry);

        WarningEntry = new HashMap<>();
        WarningEntry.put(Log_Tag, R.drawable.sign_075);
        signsData.add(WarningEntry);

        WarningEntry = new HashMap<>();
        WarningEntry.put(Log_Tag, R.drawable.sign_076);
        signsData.add(WarningEntry);

        WarningEntry = new HashMap<>();
        WarningEntry.put(Log_Tag, R.drawable.sign_077);
        signsData.add(WarningEntry);

        WarningEntry = new HashMap<>();
        WarningEntry.put(Log_Tag, R.drawable.sign_078);
        signsData.add(WarningEntry);

        WarningEntry = new HashMap<>();
        WarningEntry.put(Log_Tag, R.drawable.sign_079);
        signsData.add(WarningEntry);

        WarningEntry = new HashMap<>();
        WarningEntry.put(Log_Tag, R.drawable.sign_080);
        signsData.add(WarningEntry);

        WarningEntry = new HashMap<>();
        WarningEntry.put(Log_Tag, R.drawable.sign_081);
        signsData.add(WarningEntry);

        WarningEntry = new HashMap<>();
        WarningEntry.put(Log_Tag, R.drawable.sign_082);
        signsData.add(WarningEntry);

        WarningEntry = new HashMap<>();
        WarningEntry.put(Log_Tag, R.drawable.sign_083);
        signsData.add(WarningEntry);

        WarningEntry = new HashMap<>();
        WarningEntry.put(Log_Tag, R.drawable.sign_084);
        signsData.add(WarningEntry);

        WarningEntry = new HashMap<>();
        WarningEntry.put(Log_Tag, R.drawable.sign_085);
        signsData.add(WarningEntry);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = (View) inflater.inflate(R.layout.learn_signs_warning_signs, container, false);
        signs = (GridView) rootView.findViewById(R.id.ls_ws_grid_view);
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