package com.example.tiktaktoegame;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomGameActivity extends AppCompatActivity {
    ImageView image1;
    ImageView image2;
    ImageView image3;
    ImageView image4;
    ImageView image5;
    ImageView image6;
    ImageView image7;
    ImageView image8;
    ImageView image9;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_random_game);
        image1= findViewById(R.id.imageViewRandom1);
        image2= findViewById(R.id.imageViewRandom2);
        image3= findViewById(R.id.imageViewRandom3);
        image4= findViewById(R.id.imageViewRandom4);
        image5= findViewById(R.id.imageViewRandom5);
        image6= findViewById(R.id.imageViewRandomw6);
        image7= findViewById(R.id.imageViewRandom7);
        image8= findViewById(R.id.imageViewRandom8);
        image9= findViewById(R.id.imageViewRandom9);

    }
    @SuppressLint("UseCompatLoadingForDrawables")
    public void selectRandom(View view) {
        ImageView imgV = (ImageView) view;
        if (imgV.getContentDescription().equals(getString(R.string.empty))) {
            imgV.setImageDrawable(getDrawable(R.drawable.x));
            imgV.setContentDescription("x");

            boolean cont=false;
            do {
                Random random = new Random();
                int selectID = random.nextInt(9);

                if (selectID == 1 && image1.getContentDescription().equals(getString(R.string.empty))) {
                    image1.setImageDrawable(getDrawable(R.drawable.o));
                    image1.setContentDescription("o");
                    cont=true;
                } else if (selectID == 2 && image2.getContentDescription().equals(getString(R.string.empty))) {
                    image2.setImageDrawable(getDrawable(R.drawable.o));
                    image2.setContentDescription("o");
                    cont=true;

                } else if (selectID == 3 && image3.getContentDescription().equals(getString(R.string.empty))) {
                    image3.setImageDrawable(getDrawable(R.drawable.o));
                    image3.setContentDescription("o");
                    cont=true;

                } else if (selectID == 4 && image4.getContentDescription().equals(getString(R.string.empty))) {
                    image4.setImageDrawable(getDrawable(R.drawable.o));
                    image4.setContentDescription("o");
                    cont=true;

                } else if (selectID == 5 && image5.getContentDescription().equals(getString(R.string.empty))) {
                    image5.setImageDrawable(getDrawable(R.drawable.o));
                    image5.setContentDescription("o");
                    cont=true;

                } else if (selectID == 6 && image6.getContentDescription().equals(getString(R.string.empty))) {
                    image6.setImageDrawable(getDrawable(R.drawable.o));
                    image6.setContentDescription("o");
                    cont=true;

                } else if (selectID == 7 && image7.getContentDescription().equals(getString(R.string.empty))) {
                    image7.setImageDrawable(getDrawable(R.drawable.o));
                    image7.setContentDescription("o");
                    cont=true;

                } else if (selectID == 8 && image8.getContentDescription().equals(getString(R.string.empty))) {
                    image8.setImageDrawable(getDrawable(R.drawable.o));
                    image8.setContentDescription("o");
                    cont=true;

                } else if (selectID == 9 && image9.getContentDescription().equals(getString(R.string.empty))) {
                    image9.setImageDrawable(getDrawable(R.drawable.o));
                    image9.setContentDescription("o");
                    cont=true;

                } else if(!image1.getContentDescription().equals(getString(R.string.empty))&&!image2.getContentDescription().equals(getString(R.string.empty))&&
                        !image3.getContentDescription().equals(getString(R.string.empty))&& !image4.getContentDescription().equals(getString(R.string.empty))&&
                        !image5.getContentDescription().equals(getString(R.string.empty))&&!image6.getContentDescription().equals(getString(R.string.empty))&&
                        !image7.getContentDescription().equals(getString(R.string.empty))&&!image8.getContentDescription().equals(getString(R.string.empty))&&
                        !image9.getContentDescription().equals(getString(R.string.empty))) {
                    cont=true;
                }

            }while(!cont);


        }
        List<ImageView> listImageView = new ArrayList<>();
        listImageView.add(image1);
        listImageView.add(image2);
        listImageView.add(image3);
        listImageView.add(image4);
        listImageView.add(image5);
        listImageView.add(image6);
        listImageView.add(image7);
        listImageView.add(image8);
        listImageView.add(image9);

        Methods verifyWinner = new Methods();
        int returnedValue = verifyWinner.verifyWinner(listImageView);
        if (returnedValue == 1) {
            Toast.makeText(this, "X wins!", Toast.LENGTH_LONG).show();
            new Handler(Looper.getMainLooper()).postDelayed(this::clean, 2000);
        } else if (returnedValue == 2) {
            Toast.makeText(this, "Ball wins!", Toast.LENGTH_LONG).show();
            new Handler(Looper.getMainLooper()).postDelayed(this::clean, 2000);

        } else if (returnedValue == 3) {
            Toast.makeText(this, "Deal!", Toast.LENGTH_LONG).show();
            new Handler(Looper.getMainLooper()).postDelayed(this::clean, 3000);
        }
        listImageView.clear();
    }



    public void clean() {
        image1.setImageResource(0);
        image2.setImageResource(0);
        image3.setImageResource(0);
        image4.setImageResource(0);
        image5.setImageResource(0);
        image6.setImageResource(0);
        image7.setImageResource(0);
        image8.setImageResource(0);
        image9.setImageResource(0);


        image1.setContentDescription("empty");
        image2.setContentDescription("empty");
        image3.setContentDescription("empty");
        image4.setContentDescription("empty");
        image5.setContentDescription("empty");
        image6.setContentDescription("empty");
        image7.setContentDescription("empty");
        image8.setContentDescription("empty");
        image9.setContentDescription("empty");
    }
}