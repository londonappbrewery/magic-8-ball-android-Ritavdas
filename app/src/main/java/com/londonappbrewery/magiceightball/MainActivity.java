package com.londonappbrewery.magiceightball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button AskButton;
        AskButton =(Button) findViewById(R.id.askButton);
        final ImageView imageBall = (ImageView) findViewById(R.id.imageBall);
        final int[] questionArray ={
          R.drawable.ball1,
          R.drawable.ball2,
          R.drawable.ball3,
          R.drawable.ball4,
          R.drawable.ball5,
        };

        AskButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("magic-ball","Lets test your luck");
                Random randomLuckGen = new Random();
                int number = randomLuckGen.nextInt(5);
                imageBall.setImageResource(questionArray[number]);
                Log.d("Gamble","So the result is :" + number);
            }
        });
    }
}
