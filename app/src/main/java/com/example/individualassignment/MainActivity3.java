package com.example.individualassignment;

import android.content.Intent;
import android.graphics.Color;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity3 extends AppCompatActivity {

    private CountDownTimer timer;
    private TextView textView;
    private Button NextButton;
    private Button restartButton;
    private Button b5,b6,b7,b8,b9,b10,b11,b12,b13;
    boolean[] glow = {false, false, false, false, false, false, false, false, false};
    private int numClick;
    private int total = 9;
    Button[] buttons = new Button[9];
    private Button HomeButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        textView = findViewById(R.id.textView);
        NextButton = findViewById(R.id.NextButton);
        NextButton.setVisibility(View.INVISIBLE);
        restartButton = findViewById(R.id.restartButton);
        restartButton.setVisibility(View.INVISIBLE);
        HomeButton = findViewById(R.id.HomeButton);
        HomeButton.setVisibility(View.INVISIBLE);

        buttons[0] = findViewById(R.id.b5);
        buttons[1] = findViewById(R.id.b6);
        buttons[2] = findViewById(R.id.b7);
        buttons[3] = findViewById(R.id.b8);
        buttons[4] = findViewById(R.id.b9);
        buttons[5] = findViewById(R.id.b10);
        buttons[6] = findViewById(R.id.b11);
        buttons[7] = findViewById(R.id.b12);
        buttons[8] = findViewById(R.id.b13);

        Random rand = new Random();
        int count = 0;
        while (count < 4) {
            int index = rand.nextInt(buttons.length);
            if (!glow[index]) {
                glow[index] = true;
                if (!buttons[index].isSelected()) {
                    buttons[index].setBackgroundColor(Color.YELLOW);
                }
                count++;
            }
        }




        startTimer();


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
                        Intent i = new Intent(MainActivity3.this, MainActivity4.class);
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
                        Intent intent = new Intent(MainActivity3.this, MainActivity3.class);
                        startActivity(intent);
                    }
                });

                HomeButton.setVisibility(View.VISIBLE);
                HomeButton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent i = new Intent(MainActivity3.this, MainActivity.class);
                        startActivity(i);
                    }
                });
            }
        }.start();
    }
}