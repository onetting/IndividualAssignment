package com.example.individualassignment;

import android.content.Intent;
import android.graphics.Color;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class MainActivity2 extends AppCompatActivity {

    private CountDownTimer timer;
    private TextView textView, textView2;
    private Button NextButton;
    private Button restartButton;
    private Button b1, b2, b3, b4, b5, b6, b7, b8, b9, b10, b11, b12, b13, b14, b15, b16, b17, b18, b19, b20, b21, b22, b23, b24, b25, b26, b27, b28,
    b29, b30, b31, b32, b33, b34, b35, b36;
    private boolean btn1, btn2, btn3, btn4;
    private int numClick;
    private int total = 4;
    private Button HomeButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        textView = findViewById(R.id.textView);
        textView2 = findViewById(R.id.textView2);
        NextButton = findViewById(R.id.NextButton);
        NextButton.setVisibility(View.INVISIBLE);
        restartButton = findViewById(R.id.restartButton);
        restartButton.setVisibility(View.INVISIBLE);
        HomeButton = findViewById(R.id.HomeButton);
        HomeButton.setVisibility(View.INVISIBLE);
        b1 = findViewById(R.id.b1);
        b2 = findViewById(R.id.b2);
        b3 = findViewById(R.id.b3);
        b4 = findViewById(R.id.b4);

        startTimer();
        randomNumber();
    }

    private void randomNumber() {
        for(int i=1; i < 5; i++){
            Random random = new Random();
            int randomNum = random.nextInt(5-1) + 1;

            if (!btn1){
                if (randomNum == 1){
                    b1.setBackgroundColor(Color.YELLOW);
                    b1.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            b1.setBackgroundColor(Color.YELLOW);
                            btn1 = true;
                            numClick++;
                            textView2.setText("SCORES:" + numClick);

                        }
                    });
                }
            }

            if (!btn2){
                if (randomNum == 2) {
                    b2.setBackgroundColor(Color.YELLOW);
                    b2.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            b2.setBackgroundColor(Color.YELLOW);
                            btn2 = true;
                            numClick++;
                            textView2.setText("SCORES:" + numClick);

                        }
                    });
                }
            }

            if (!btn3){
                if (randomNum == 3){
                    b1.setBackgroundColor(Color.YELLOW);
                    b1.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            b3.setBackgroundColor(Color.YELLOW);
                            btn3 = true;
                            numClick++;
                            textView2.setText("SCORES:" + numClick);

                        }
                    });
                }
            }

            if (!btn4){
                if (randomNum == 4){
                    b4.setBackgroundColor(Color.YELLOW);
                    b4.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            b4.setBackgroundColor(Color.YELLOW);
                            btn4 = true;
                            numClick++;
                            textView2.setText("SCORES:" + numClick);

                        }
                    });
                }
            }
        }
    }



    private void startTimer() {
        timer = new CountDownTimer(6000, 1000) {
            @Override
            public void onTick(long countdown) {
                textView.setText("TIME: " + countdown / 1000);
            }

            @Override
            public void onFinish() {
                textView.setText("Times Up!");


                NextButton.setVisibility(View.VISIBLE);
                NextButton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent i = new Intent(MainActivity2.this, MainActivity3.class);
                        startActivity(i);
                    }
                });

                restartButton.setVisibility(View.VISIBLE);
                restartButton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        timer.cancel();
                        startTimer();
                        restartButton.setVisibility(View.INVISIBLE);
                        Intent intent = new Intent(MainActivity2.this, MainActivity2.class);
                        startActivity(intent);

                        //onCreate();
                    }
                });
                HomeButton.setVisibility(View.VISIBLE);
                HomeButton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent i = new Intent(MainActivity2.this, MainActivity.class);
                        startActivity(i);
                    }
                });
            }
        }.start();
    }
}