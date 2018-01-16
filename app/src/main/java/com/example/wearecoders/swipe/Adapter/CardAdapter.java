package com.example.wearecoders.swipe.Adapter;

import android.content.Context;
import android.view.View;
import android.widget.TextView;

import com.example.wearecoders.swipe.Model.Model;
import com.example.wearecoders.swipe.R;
import com.huxq17.swipecardsview.BaseCardAdapter;

import java.util.List;

/**
 * Created by We Are Coders on 1/16/2018.
 */
public class CardAdapter extends BaseCardAdapter {
    private List<Model> modelList;
    private Context context;

    public CardAdapter(List<Model> modelList, Context context) {
        this.modelList = modelList;
        this.context = context;
    }

    @Override
    public int getCount() {
        return modelList.size();
    }

    @Override
    public int getCardLayoutId() {
        return R.layout.card_item;
    }

    @Override
    public void onBindData(int position, View cardview) {
        if(modelList == null || modelList.size()==0){
            return;
        }
        TextView name=(TextView)cardview.findViewById(R.id.name);
        TextView DOB=(TextView)cardview.findViewById(R.id.DOB);
        TextView gender=(TextView)cardview.findViewById(R.id.gender);
        TextView interest=(TextView)cardview.findViewById(R.id.interest);
        TextView country=(TextView)cardview.findViewById(R.id.country);
        TextView pincode=(TextView)cardview.findViewById(R.id.pincode);
        TextView description=(TextView)cardview.findViewById(R.id.description);
        Model model=modelList.get(position);
        name.setText(model.getName());
        DOB.setText(model.getDOB());
        gender.setText(model.getGender());
        interest.setText(model.getInterest());
        country.setText(model.getCountry());
        pincode.setText(model.getPincode());
        description.setText(model.getDescription());

    }
}
