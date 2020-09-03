package com.example.covid19_ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.drawable.RoundedBitmapDrawable;
import androidx.core.graphics.drawable.RoundedBitmapDrawableFactory;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.widget.ImageView;

public class prfile extends AppCompatActivity {
    ImageView profileImg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prfile);
        //profile img
        profileImg = findViewById(R.id.profile_img);
        convertProfileImg();
    }

    public void convertProfileImg() {
        Bitmap bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.profile);
        RoundedBitmapDrawable roundedBitmap = RoundedBitmapDrawableFactory.create(getResources(), bitmap);
        roundedBitmap.setCircular(true);
        profileImg.setImageDrawable(roundedBitmap);
    }

}
