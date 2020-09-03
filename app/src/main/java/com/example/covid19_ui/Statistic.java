package com.example.covid19_ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.drawable.RoundedBitmapDrawable;
import androidx.core.graphics.drawable.RoundedBitmapDrawableFactory;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Statistic extends AppCompatActivity {
    ImageView profileImg;
    Context context=Statistic.this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_statistic);
        //profile img
        profileImg = findViewById(R.id.profile_img);
        convertProfileImg();
        profileImg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(context, prfile.class));

            }
        });
    }

    public void convertProfileImg() {
        Bitmap bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.profile);
        RoundedBitmapDrawable roundedBitmap = RoundedBitmapDrawableFactory.create(getResources(), bitmap);
        roundedBitmap.setCircular(true);
        profileImg.setImageDrawable(roundedBitmap);
    }

}
