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

public class MainActivity4 extends AppCompatActivity {
    private CountDownTimer timer;
    private TextView textView;
    private TextView textView2;
    private Button NextButton;
    private Button restartButton;
    private Button HomeButton;
    private boolean bt1, bt2, bt3, bt4, bt5, bt6, bt7, bt8, bt9, bt10, bt11, bt12, bt13, bt14, bt15, bt16;
    private Button b1, b2, b3, b4, b5, b6, b7, b8, b9, b10, b11, b12, b13, b14, b15, b16;
    private int numClick;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        textView = findViewById(R.id.textView);
        textView2 = findViewById(R.id.textView2);
        NextButton = findViewById(R.id.NextButton);
        NextButton.setVisibility(View.INVISIBLE);
        restartButton = findViewById(R.id.restartButton);
        restartButton.setVisibility(View.INVISIBLE);
        HomeButton = findViewById(R.id.HomeButton);
        HomeButton.setVisibility(View.INVISIBLE);
        b1 = findViewById(R.id.b14);
        b2 = findViewById(R.id.b15);
        b3 = findViewById(R.id.b16);
        b4 = findViewById(R.id.b17);
        b5 = findViewById(R.id.b18);
        b6 = findViewById(R.id.b19);
        b7 = findViewById(R.id.b20);
        b8 = findViewById(R.id.b21);
        b9 = findViewById(R.id.b22);
        b10 = findViewById(R.id.b23);
        b11 = findViewById(R.id.b24);
        b12 = findViewById(R.id.b25);
        b13 = findViewById(R.id.b26);
        b14 = findViewById(R.id.b27);
        b15 = findViewById(R.id.b28);
        b16 = findViewById(R.id.b29);

        startTimer();
        randomNumber();
    }

    private void randomNumber() {
        for(int i=1; i < 17; i++){
            Random random = new Random();
            int randomNum = random.nextInt(17);

            if (!bt1){
                if (randomNum == 1){
                    b1.setBackgroundColor(Color.YELLOW);
                    b1.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            b1.setBackgroundColor(Color.YELLOW);
                            bt1 = true;
                            numClick++;
                            textView2.setText("SCORES:" + numClick);

                        }
                    });
                }
            }

            if (!bt2){
                if (randomNum == 2) {
                    b2.setBackgroundColor(Color.YELLOW);
                    b2.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            b2.setBackgroundColor(Color.YELLOW);
                            bt2 = true;
                            numClick++;
                            textView2.setText("SCORES:" + numClick);

                        }
                    });
                }
            }

            if (!bt3){
                if (randomNum == 3){
                    b1.setBackgroundColor(Color.YELLOW);
                    b1.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            b3.setBackgroundColor(Color.YELLOW);
                            bt3 = true;
                            numClick++;
                            textView2.setText("SCORES:" + numClick);

                        }
                    });
                }
            }

            if (!bt4){
                if (randomNum == 4){
                    b4.setBackgroundColor(Color.YELLOW);
                    b4.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            b4.setBackgroundColor(Color.YELLOW);
                            bt4 = true;
                            numClick++;
                            textView2.setText("SCORES:" + numClick);

                        }
                    });
                }
            }
            if (!bt5){
                if (randomNum == 5){
                    b5.setBackgroundColor(Color.YELLOW);
                    b5.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            b5.setBackgroundColor(Color.YELLOW);
                            bt5 = true;
                            numClick++;
                            textView2.setText("SCORES:" + numClick);

                        }
                    });
                }
            }

            if (!bt6){
                if (randomNum == 6) {
                    b6.setBackgroundColor(Color.YELLOW);
                    b6.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            b6.setBackgroundColor(Color.YELLOW);
                            bt6 = true;
                            numClick++;
                            textView2.setText("SCORES:" + numClick);

                        }
                    });
                }
            }

            if (!bt7){
                if (randomNum == 7){
                    b7.setBackgroundColor(Color.YELLOW);
                    b7.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            b7.setBackgroundColor(Color.YELLOW);
                            bt7 = true;
                            numClick++;
                            textView2.setText("SCORES:" + numClick);

                        }
                    });
                }
            }

            if (!bt8){
                if (randomNum == 8){
                    b8.setBackgroundColor(Color.YELLOW);
                    b8.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            b8.setBackgroundColor(Color.YELLOW);
                            bt8 = true;
                            numClick++;
                            textView2.setText("SCORES:" + numClick);

                        }
                    });
                }
            }
            if (!bt9){
                if (randomNum == 9){
                    b9.setBackgroundColor(Color.YELLOW);
                    b9.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            b9.setBackgroundColor(Color.YELLOW);
                            bt9 = true;
                            numClick++;
                            textView2.setText("SCORES:" + numClick);

                        }
                    });
                }
            }

            if (!bt10){
                if (randomNum == 10) {
                    b10.setBackgroundColor(Color.YELLOW);
                    b10.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            b10.setBackgroundColor(Color.YELLOW);
                            bt10 = true;
                            numClick++;
                            textView2.setText("SCORES:" + numClick);

                        }
                    });
                }
            }

            if (!bt11){
                if (randomNum == 11){
                    b11.setBackgroundColor(Color.YELLOW);
                    b11.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            b11.setBackgroundColor(Color.YELLOW);
                            bt11 = true;
                            numClick++;
                            textView2.setText("SCORES:" + numClick);

                        }
                    });
                }
            }

            if (!bt12){
                if (randomNum == 12){
                    b12.setBackgroundColor(Color.YELLOW);
                    b12.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            b12.setBackgroundColor(Color.YELLOW);
                            bt12 = true;
                            numClick++;
                            textView2.setText("SCORES:" + numClick);

                        }
                    });
                }
            }
            if (!bt13){
                if (randomNum == 13){
                    b13.setBackgroundColor(Color.YELLOW);
                    b13.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            b13.setBackgroundColor(Color.YELLOW);
                            bt13 = true;
                            numClick++;
                            textView2.setText("SCORES:" + numClick);

                        }
                    });
                }
            }

            if (!bt14){
                if (randomNum == 14) {
                    b14.setBackgroundColor(Color.YELLOW);
                    b14.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            b14.setBackgroundColor(Color.YELLOW);
                            bt14 = true;
                            numClick++;
                            textView2.setText("SCORES:" + numClick);

                        }
                    });
                }
            }

            if (!bt15){
                if (randomNum == 15){
                    b15.setBackgroundColor(Color.YELLOW);
                    b15.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            b15.setBackgroundColor(Color.YELLOW);
                            bt15 = true;
                            numClick++;
                            textView2.setText("SCORES:" + numClick);

                        }
                    });
                }
            }

            if (!bt16){
                if (randomNum == 16){
                    b16.setBackgroundColor(Color.YELLOW);
                    b16.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            b16.setBackgroundColor(Color.YELLOW);
                            bt16 = true;
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
                        Intent i = new Intent(MainActivity4.this, MainActivity5.class);
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
                        Intent intent = new Intent(MainActivity4.this, MainActivity4.class);
                        startActivity(intent);
                    }
                });

                HomeButton.setVisibility(View.VISIBLE);
                HomeButton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent i = new Intent(MainActivity4.this, MainActivity.class);
                        startActivity(i);
                    }
                });
            }
        }.start();
    }
}