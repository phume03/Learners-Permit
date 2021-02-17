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
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import com.google.android.material.bottomsheet.BottomSheetBehavior;

import java.text.NumberFormat;
import java.util.List;
import java.util.Random;

import androidx.navigation.NavController;
import androidx.navigation.Navigation;

public class StackAdapterB extends BaseAdapter {
    private Context context;
    private List <StackCardB> stack_b_data;
    private Button nextButton;

    public StackAdapterB(Context context, List <StackCardB> stack, Button nextButton) {
        this.context = context;
        this.stack_b_data = stack;
        this.nextButton = nextButton;
    }

    @Override
    public int getCount() {
        return stack_b_data.size();
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
        Resources res = context.getResources();
        String resourceDescriptionName;
        int resourceDescriptionID;
        Random rand = new Random();
        String packageName = context.getPackageName();
        RadioButton radio;

        view = LayoutInflater.from(context).inflate(R.layout.stack_item_2, null);
        ImageView question_image = view.findViewById(R.id.question_image);
        TextView question_text = view.findViewById(R.id.question_text);
        StackCardB card = stack_b_data.get(position);
        if (card.isImageCard()) {
            question_image.setImageResource(card.getImage());
            question_image.setVisibility(View.VISIBLE);
            question_text.setVisibility(View.GONE);
        } else {
            question_text.setText(res.getString(card.getImage()));
            question_text.setVisibility(View.VISIBLE);
            question_image.setVisibility(View.GONE);
        }
        TextView correctAnswer = view.findViewById(R.id.question_right_answer);
        int correctAnswerIndex = (1 + rand.nextInt(5));
        int wrongAnswerIndex = 0;
        resourceDescriptionName = new String("choice").concat(Integer.toString(correctAnswerIndex));
        resourceDescriptionID = res.getIdentifier(resourceDescriptionName, "id", packageName);
        radio = view.findViewById(resourceDescriptionID);
        correctAnswer.setText(card.getText());
        correctAnswer.setVisibility(View.GONE);
        radio.setText(card.getText());

        String [] answers = card.getOtherText();

        for (int i=1; i<=5; i++) {
            if (i != correctAnswerIndex) {
                resourceDescriptionName = new String("choice").concat(Integer.toString(i));
                resourceDescriptionID = res.getIdentifier(resourceDescriptionName, "id", packageName);
                radio = view.findViewById(resourceDescriptionID);
                radio.setText(answers[wrongAnswerIndex]);
                wrongAnswerIndex++;
            } else {
                continue;
            }
        }

        RadioGroup selection = view.findViewById(R.id.choices);
        selection.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                nextButton.setEnabled(true);
            }
        });
        return view;
    }
}