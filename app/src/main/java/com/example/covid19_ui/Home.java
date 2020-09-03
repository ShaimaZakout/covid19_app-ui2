package com.example.covid19_ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.drawable.RoundedBitmapDrawable;
import androidx.core.graphics.drawable.RoundedBitmapDrawableFactory;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.Adapter;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

import java.util.ArrayList;

public class Home extends AppCompatActivity {
    ImageView profileImg, goToStatistic;
    RecyclerView rv, rv2;
    ArrayList<card> cards;
    ArrayList<card2> cards2;
    Context context = Home.this;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        //profile img
        profileImg = findViewById(R.id.profile_img);
        convertProfileImg();
        profileImg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(context, prfile.class));

            }
        });

        //rv card1 data
        int[] imges = {R.drawable.a10, R.drawable.a4, R.drawable.a6, R.drawable.a9};
        String[] titel = {getString(R.string.rv_home_text1), getString(R.string.rv_home_text2), getString(R.string.rv_home_text3), getString(R.string.rv_home_text4)};
        //rv card1 data
        int[] imgesCard2 = {R.drawable.rv1, R.drawable.rv2, R.drawable.rv3, R.drawable.rv4};
        String[] titelCard2 = {getString(R.string.rv2_home_text1), getString(R.string.rv2_home_text2), getString(R.string.rv2_home_text3), getString(R.string.rv2_home_text4)};
        String[] subTitelCard2 = {getString(R.string.rv2_home_subtext1), getString(R.string.rv2_home_subtext2), getString(R.string.rv2_home_subtext3), getString(R.string.rv2_home_subtext4)};

        rv = findViewById(R.id.rv);
        rv2 = findViewById(R.id.rv2);
        cards = new ArrayList<>();
        cards2 = new ArrayList<>();

        for (int i = 0; i < imges.length; i++) {
            cards.add(new card(imgesCard2[i], titel[i]));

        }
        for (int i = 0; i < imgesCard2.length; i++) {
            cards2.add(new card2(imges[i], titelCard2[i], subTitelCard2[i]));

        }
        mackeRecView(rv, new cardAdapter(cards, context));
        mackeRecView(rv2, new card2Adapter(cards2, context));

        // go To Statistic Activity
        goToStatistic = findViewById(R.id.go_to_Statistic);
        goToStatistic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(context, Statistic.class));

            }
        });


        //navacation bar


    }


    public void convertProfileImg() {
        Bitmap bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.profile);
        RoundedBitmapDrawable roundedBitmap = RoundedBitmapDrawableFactory.create(getResources(), bitmap);
        roundedBitmap.setCircular(true);
        profileImg.setImageDrawable(roundedBitmap);
    }

    public void mackeRecView(RecyclerView rv, Adapter adapter) {
        rv.setAdapter(adapter);
        rv.setLayoutManager(new LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false));
    }



}
