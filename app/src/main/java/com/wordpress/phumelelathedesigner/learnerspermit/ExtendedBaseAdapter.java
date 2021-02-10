package com.wordpress.phumelelathedesigner.learnerspermit;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import androidx.fragment.app.FragmentManager;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

public class ExtendedBaseAdapter extends BaseAdapter {
    Context context;
    List<Card> cardList;
    private static final String IMAGE_ID = "IMAGE_RESOURCE_ID";
    private static final String IMAGE_DESC = "IMAGE_TEXT_RESOURCE_ID";

    public ExtendedBaseAdapter(Context context, List<Card> cardList) {
        this.context = context;
        this.cardList = cardList;
    }

    @Override
    public int getCount() {
        return cardList.size();
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
        View cardview = LayoutInflater.from(context).inflate(R.layout.grid_card, parent, false);
        ImageView image = cardview.findViewById(R.id.signs_image);
        TextView title = cardview.findViewById(R.id.signs_image_title);
        image.setImageResource(cardList.get(position).getImage());
        title.setText(cardList.get(position).getTitleTag());
        cardview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                NavController controller = Navigation.findNavController(v);
                Bundle data = new Bundle();
                data.putInt(IMAGE_ID, cardList.get(position).getImage());
                data.putString(IMAGE_DESC, cardList.get(position).getTitleTag());
                controller.navigate(R.id.action_global_viewSign, data);
            }
        });
        return cardview;
    }
}
