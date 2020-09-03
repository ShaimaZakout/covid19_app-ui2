package com.example.covid19_ui;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class card2Adapter extends RecyclerView.Adapter<card2Adapter.CardViewHolder> {
    private ArrayList<card2> cards;
    private Context context;


    public card2Adapter(ArrayList<card2> cards, Context context) {
        this.cards = cards;
        this.context = context;
    }

    public class CardViewHolder extends RecyclerView.ViewHolder {
        ImageView cardImg;
        TextView cardTitel, cardTitel2;

        public CardViewHolder(@NonNull View itemView) {
            super(itemView);
        }

        public void setImageView(int settingImage) {
            cardImg = itemView.findViewById(R.id.holder_img);
            cardImg.setImageResource(settingImage);

        }


        public void setName(String settingName) {
            cardTitel = itemView.findViewById(R.id.text_holder1);
            cardTitel.setText(settingName);
        }

        public void setName2(String settingName) {
            cardTitel2 = itemView.findViewById(R.id.text_holder2);
            cardTitel2.setText(settingName);
        }
    }

    @NonNull
    @Override
    public CardViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new CardViewHolder(
                LayoutInflater.from(parent.getContext()).inflate(R.layout.custom_rv2, null, false)
        );

    }

    @Override
    public void onBindViewHolder(@NonNull CardViewHolder holder, int position) {

        int settingImage = cards.get(position).getImg();
        holder.setImageView(settingImage);

        String settingName = cards.get(position).getName();
        holder.setName(settingName);
        String settingName2 = cards.get(position).getName2();
        holder.setName2(settingName2);


    }

    @Override
    public int getItemCount() {
        return cards.size();
    }


}
