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

public class cardAdapter extends RecyclerView.Adapter<cardAdapter.CardViewHolder> {
    private ArrayList<card> cards;
    private Context context;


    public cardAdapter(ArrayList<card> cards, Context context) {
        this.cards = cards;
        this.context = context;
    }

    public class CardViewHolder extends RecyclerView.ViewHolder {
        ImageView cardImg;
        TextView cardTitel;

        public CardViewHolder(@NonNull View itemView) {
            super(itemView);
        }

        public void setImageView(int settingImage) {
            cardImg = itemView.findViewById(R.id.holder_img);
            cardImg.setImageResource(settingImage);

        }


        public void setName(String settingName) {
            cardTitel = itemView.findViewById(R.id.text_holder2);
            cardTitel.setText(settingName);
        }
    }

    @NonNull
    @Override
    public CardViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new CardViewHolder(
                LayoutInflater.from(parent.getContext()).inflate(R.layout.custom_rv, null, false)
        );

    }

    @Override
    public void onBindViewHolder(@NonNull CardViewHolder holder, int position) {

        int settingImage = cards.get(position).getImg();
        holder.setImageView(settingImage);

        String settingName = cards.get(position).getName();
        holder.setName(settingName);


    }

    @Override
    public int getItemCount() {
        return cards.size();
    }


}
