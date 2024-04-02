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

public class DuoGameActivity extends AppCompatActivity {
    boolean xOrBall=true;
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
        setContentView(R.layout.activity_duo_game);
        image1= findViewById(R.id.imageView1);
        image2= findViewById(R.id.imageView2);
        image3= findViewById(R.id.imageView3);
        image4= findViewById(R.id.imageView4);
        image5= findViewById(R.id.imageView5);
        image6= findViewById(R.id.imageView6);
        image7= findViewById(R.id.imageView7);
        image8= findViewById(R.id.imageView8);
        image9= findViewById(R.id.imageView9);

    }
    @SuppressLint("UseCompatLoadingForDrawables")
    public void select(View view){
        ImageView imgV= (ImageView) view;
        if(imgV.getContentDescription().equals(getString(R.string.empty))) {
            if (xOrBall) {
                imgV.setImageDrawable(getDrawable(R.drawable.x));
                imgV.setContentDescription("x");
            } else {
                imgV.setImageDrawable(getDrawable(R.drawable.o));
                imgV.setContentDescription("o");
            }

            List<ImageView> listImageView= new ArrayList<>();
            listImageView.add(image1);
            listImageView.add(image2);
            listImageView.add(image3);
            listImageView.add(image4);
            listImageView.add(image5);
            listImageView.add(image6);
            listImageView.add(image7);
            listImageView.add(image8);
            listImageView.add(image9);

            Methods verifyWinner= new Methods();
            int returnedValue=verifyWinner.verifyWinner(listImageView);
            if(returnedValue==1) {
                Toast.makeText(this, "X wins!", Toast.LENGTH_LONG).show();
                new Handler(Looper.getMainLooper()).postDelayed(() -> {
                    clean();
                    xOrBall=true;

                }, 2000);
            }
            else if(returnedValue==2){
                Toast.makeText(this,"Ball wins!", Toast.LENGTH_LONG).show();
                new Handler(Looper.getMainLooper()).postDelayed(() -> {
                    clean();
                    xOrBall=true;
                }, 2000);

            } else if (returnedValue==3) {
                Toast.makeText(this,"Deal!", Toast.LENGTH_LONG).show();
                new Handler(Looper.getMainLooper()).postDelayed(() -> {
                    clean();
                    xOrBall=true;
                }, 3000);
            }
            listImageView.clear();
            xOrBall = !xOrBall;
        }

    }
    public void clean(){
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