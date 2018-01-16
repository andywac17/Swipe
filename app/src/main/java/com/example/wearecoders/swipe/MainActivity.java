package com.example.wearecoders.swipe;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.wearecoders.swipe.Adapter.CardAdapter;
import com.example.wearecoders.swipe.Model.Model;
import com.huxq17.swipecardsview.BaseCardAdapter;
import com.huxq17.swipecardsview.SwipeCardsView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private SwipeCardsView swipeCardsView;
    private List<Model> modelList = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        swipeCardsView=(SwipeCardsView)findViewById(R.id.swipeCardView);
        swipeCardsView.retainLastCard(false);
        swipeCardsView.enableSwipe(true);
        getData();
    }

    private void getData() {
        modelList.add(new Model("Ashpreet","28-01-1988","male","interested in female","India","160003","Lorem Ipsum  of the prhastext ever since an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letras"));
        modelList.add(new Model("Kapil","28-01-1988","male","interested in female","India","160003","Lorem Ipsum  of the prhastext ever since an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letras"));
        modelList.add(new Model("Sharan","28-01-1988","male","interested in female","India","160003","Lorem Ipsum  of the prhastext ever since an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letras"));
        modelList.add(new Model("Sonali","28-01-1988","male","interested in female","India","160003","Lorem Ipsum  of the prhastext ever since an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letras"));
        modelList.add(new Model("Raveena","28-01-1988","male","interested in female","India","160003","Lorem Ipsum  of the prhastext ever since an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letras"));
        modelList.add(new Model("Abhilasha","28-01-1988","male","interested in female","India","160003","Lorem Ipsum  of the prhastext ever since an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letras"));
        modelList.add(new Model("Aman","28-01-1988","male","interested in female","India","160003","Lorem Ipsum  of the prhastext ever since an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letras"));
        modelList.add(new Model("Anush","28-01-1988","male","interested in female","India","160003","Lorem Ipsum  of the prhastext ever since an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letras"));
        modelList.add(new Model("Sandeep","28-01-1988","male","interested in female","India","160003","Lorem Ipsum  of the prhastext ever since an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letras"));
        modelList.add(new Model("ABC","28-01-1988","male","interested in female","India","160003","Lorem Ipsum  of the prhastext ever since an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letras"));
        modelList.add(new Model("XYZ","28-01-1988","male","interested in female","India","160003","Lorem Ipsum  of the prhastext ever since an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letras"));

        CardAdapter cardAdapter = new CardAdapter(modelList,this);
        swipeCardsView.setAdapter(cardAdapter);

    }
}
