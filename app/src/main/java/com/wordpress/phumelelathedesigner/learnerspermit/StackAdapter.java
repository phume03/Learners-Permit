package com.wordpress.phumelelathedesigner.learnerspermit;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.material.bottomsheet.BottomSheetBehavior;

import java.util.List;

import androidx.navigation.NavController;
import androidx.navigation.Navigation;

public class StackAdapter extends BaseAdapter {
    private Context context;
    private List <StackCard> stack_data;

    public StackAdapter(Context context, List <StackCard> stack) {
        this.context = context;
        this.stack_data = stack;
    }

    @Override
    public int getCount() {
        return stack_data.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View view, ViewGroup parent) {
        view = LayoutInflater.from(context).inflate(R.layout.stack_item, null);
        ImageView question_image = view.findViewById(R.id.stack_question_image);
        TextView question_text = view.findViewById(R.id.stack_question_text);
        StackCard card = stack_data.get(position);
        if (card.isImageCard()) {
            question_image.setImageResource(card.getImage());
            question_image.setVisibility(View.VISIBLE);
            question_text.setVisibility(View.GONE);
        } else {
	        Resources res = context.getResources();
            question_text.setText(res.getString(card.getImage()));
            question_text.setVisibility(View.VISIBLE);
            question_image.setVisibility(View.GONE);
        }
        TextView title = view.findViewById(R.id.test_card_answer);
        title.setText(card.getText());
        View answerSheet = view.findViewById(R.id.answer_sheet);
        BottomSheetBehavior answerSheetToggle = BottomSheetBehavior.from(answerSheet);
        answerSheetToggle.setState(BottomSheetBehavior.STATE_HIDDEN);
        view.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if (answerSheetToggle.getState() == BottomSheetBehavior.STATE_HIDDEN) {
                    answerSheetToggle.setState(BottomSheetBehavior.STATE_EXPANDED);
                } else {
                    answerSheetToggle.setState(BottomSheetBehavior.STATE_HIDDEN);
                }
                return false;
            }
        });
        return view;
    }
}
