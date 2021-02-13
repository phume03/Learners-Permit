package com.wordpress.phumelelathedesigner.learnerspermit;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class ViewSign extends Fragment {
    private static final String IMAGE_ID = "IMAGE_RESOURCE_ID";
    private static final String IMAGE_DESC = "IMAGE_TEXT_RESOURCE_ID";

    // TODO: Rename and change types of parameters
    private int mImageID;
    private String mImageDesc;

    public ViewSign() {
        // Required empty public constructor
    }

    public static ViewSign newInstance() {
        ViewSign fragment = new ViewSign();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mImageID = getArguments().getInt(IMAGE_ID);
            mImageDesc = getArguments().getString(IMAGE_DESC);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.learn_signs_view_sign, container, false);
        ImageView image = rootView.findViewById(R.id.signs_image);
        TextView title = rootView.findViewById(R.id.signs_image_title);
        image.setImageResource(mImageID);
        title.setText(mImageDesc);
        return rootView;
    }
}