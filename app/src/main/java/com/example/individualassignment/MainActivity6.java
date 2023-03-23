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

public class MainActivity6 extends AppCompatActivity {

    private CountDownTimer timer;
    private TextView textView;
    private TextView textView2;
    private Button HomeButton;
    private Button restartButton;
    private Button b1, b2, b3, b4, b5, b6, b7, b8, b9, b10, b11, b12, b13, b14, b15, b16, b17, b18, b19, b20, b21, b22, b23, b24, b25,b26, b27, b28,
            b29, b30, b31, b32, b33, b34, b35, b36;
    private boolean bt1, bt2, bt3, bt4, bt5, bt6, bt7, bt8, bt9, bt10, bt11, bt12, bt13, bt14, bt15, bt16, bt17, bt18, bt19, bt20, bt21, bt22, bt23, bt24, bt25, bt26, bt27, bt28,
            bt29, bt30, bt31, bt32, bt33, bt34, bt35, bt36;
    private int numClick;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);

        textView = findViewById(R.id.textView);
        textView2 = findViewById(R.id.textView2);
        HomeButton = findViewById(R.id.HomeButton);
        HomeButton.setVisibility(View.INVISIBLE);
        restartButton = findViewById(R.id.restartButton);
        restartButton.setVisibility(View.INVISIBLE);
        b1 = findViewById(R.id.b1);
        b2 = findViewById(R.id.b2);
        b3 = findViewById(R.id.b3);
        b4 = findViewById(R.id.b4);
        b5 = findViewById(R.id.b5);
        b6 = findViewById(R.id.b6);
        b7 = findViewById(R.id.b7);
        b8 = findViewById(R.id.b8);
        b9 = findViewById(R.id.b9);
        b10 = findViewById(R.id.b10);
        b11 = findViewById(R.id.b11);
        b12 = findViewById(R.id.b12);
        b13 = findViewById(R.id.b13);
        b14 = findViewById(R.id.b14);
        b15 = findViewById(R.id.b15);
        b16 = findViewById(R.id.b16);
        b17 = findViewById(R.id.b17);
        b18 = findViewById(R.id.b18);
        b19 = findViewById(R.id.b19);
        b20 = findViewById(R.id.b20);
        b21 = findViewById(R.id.b21);
        b22 = findViewById(R.id.b22);
        b23 = findViewById(R.id.b23);
        b24 = findViewById(R.id.b24);
        b25 = findViewById(R.id.b25);
        b26 = findViewById(R.id.b26);
        b27 = findViewById(R.id.b27);
        b28 = findViewById(R.id.b28);
        b29 = findViewById(R.id.b29);
        b30 = findViewById(R.id.b30);
        b31 = findViewById(R.id.b31);
        b32 = findViewById(R.id.b32);
        b33 = findViewById(R.id.b33);
        b34 = findViewById(R.id.b34);
        b35 = findViewById(R.id.b35);
        b36 = findViewById(R.id.b36);


        startTimer();
        randomNumber();
    }

    private void randomNumber() {
        for (int i = 1; i < 37; i++) {
            Random random = new Random();
            int randomNum = random.nextInt(37);

            if (!bt1) {
                if (randomNum == 1) {
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

            if (!bt2) {
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

            if (!bt3) {
                if (randomNum == 3) {
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

            if (!bt4) {
                if (randomNum == 4) {
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
            if (!bt5) {
                if (randomNum == 5) {
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

            if (!bt6) {
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

            if (!bt7) {
                if (randomNum == 7) {
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

            if (!bt8) {
                if (randomNum == 8) {
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
            if (!bt9) {
                if (randomNum == 9) {
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

            if (!bt10) {
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

            if (!bt11) {
                if (randomNum == 11) {
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

            if (!bt12) {
                if (randomNum == 12) {
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
            if (!bt13) {
                if (randomNum == 13) {
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

            if (!bt14) {
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

            if (!bt15) {
                if (randomNum == 15) {
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

            if (!bt16) {
                if (randomNum == 16) {
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
            if (!bt17) {
                if (randomNum == 17) {
                    b17.setBackgroundColor(Color.YELLOW);
                    b17.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            b17.setBackgroundColor(Color.YELLOW);
                            bt17 = true;
                            numClick++;
                            textView2.setText("SCORES:" + numClick);

                        }
                    });
                }
            }
            if (!bt18) {
                if (randomNum == 18) {
                    b18.setBackgroundColor(Color.YELLOW);
                    b18.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            b18.setBackgroundColor(Color.YELLOW);
                            bt18 = true;
                            numClick++;
                            textView2.setText("SCORES:" + numClick);

                        }
                    });
                }
            }

            if (!bt19) {
                if (randomNum == 19) {
                    b19.setBackgroundColor(Color.YELLOW);
                    b19.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            b19.setBackgroundColor(Color.YELLOW);
                            bt19 = true;
                            numClick++;
                            textView2.setText("SCORES:" + numClick);

                        }
                    });
                }
            }

            if (!bt20) {
                if (randomNum == 20) {
                    b20.setBackgroundColor(Color.YELLOW);
                    b20.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            b20.setBackgroundColor(Color.YELLOW);
                            bt20 = true;
                            numClick++;
                            textView2.setText("SCORES:" + numClick);

                        }
                    });
                }
            }

            if (!bt21) {
                if (randomNum == 21) {
                    b21.setBackgroundColor(Color.YELLOW);
                    b21.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            b21.setBackgroundColor(Color.YELLOW);
                            bt21 = true;
                            numClick++;
                            textView2.setText("SCORES:" + numClick);

                        }
                    });
                }
            }
            if (!bt22) {
                if (randomNum == 22) {
                    b22.setBackgroundColor(Color.YELLOW);
                    b22.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            b22.setBackgroundColor(Color.YELLOW);
                            bt22 = true;
                            numClick++;
                            textView2.setText("SCORES:" + numClick);

                        }
                    });
                }
            }

            if (!bt23) {
                if (randomNum == 23) {
                    b23.setBackgroundColor(Color.YELLOW);
                    b23.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            b23.setBackgroundColor(Color.YELLOW);
                            bt23 = true;
                            numClick++;
                            textView2.setText("SCORES:" + numClick);

                        }
                    });
                }
            }

            if (!bt24) {
                if (randomNum == 24) {
                    b24.setBackgroundColor(Color.YELLOW);
                    b24.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            b24.setBackgroundColor(Color.YELLOW);
                            bt24 = true;
                            numClick++;
                            textView2.setText("SCORES:" + numClick);

                        }
                    });
                }
            }

            if (!bt25) {
                if (randomNum == 25) {
                    b25.setBackgroundColor(Color.YELLOW);
                    b25.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            b25.setBackgroundColor(Color.YELLOW);
                            bt25 = true;
                            numClick++;
                            textView2.setText("SCORES:" + numClick);

                        }
                    });
                }
            }
            if (!bt26) {
                if (randomNum == 26) {
                    b26.setBackgroundColor(Color.YELLOW);
                    b26.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            b26.setBackgroundColor(Color.YELLOW);
                            bt26 = true;
                            numClick++;
                            textView2.setText("SCORES:" + numClick);

                        }
                    });
                }
            }

            if (!bt27) {
                if (randomNum == 27) {
                    b27.setBackgroundColor(Color.YELLOW);
                    b27.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            b27.setBackgroundColor(Color.YELLOW);
                            bt27 = true;
                            numClick++;
                            textView2.setText("SCORES:" + numClick);

                        }
                    });
                }
            }

            if (!bt28) {
                if (randomNum == 28) {
                    b28.setBackgroundColor(Color.YELLOW);
                    b28.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            b28.setBackgroundColor(Color.YELLOW);
                            bt28 = true;
                            numClick++;
                            textView2.setText("SCORES:" + numClick);

                        }
                    });
                }
            }

            if (!bt29) {
                if (randomNum == 29) {
                    b29.setBackgroundColor(Color.YELLOW);
                    b29.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            b29.setBackgroundColor(Color.YELLOW);
                            bt29 = true;
                            numClick++;
                            textView2.setText("SCORES:" + numClick);

                        }
                    });
                }
            }
            if (!bt30) {
                if (randomNum == 30) {
                    b30.setBackgroundColor(Color.YELLOW);
                    b30.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            b30.setBackgroundColor(Color.YELLOW);
                            bt30 = true;
                            numClick++;
                            textView2.setText("SCORES:" + numClick);

                        }
                    });
                }
            }

            if (!bt31) {
                if (randomNum == 31) {
                    b31.setBackgroundColor(Color.YELLOW);
                    b31.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            b31.setBackgroundColor(Color.YELLOW);
                            bt31 = true;
                            numClick++;
                            textView2.setText("SCORES:" + numClick);

                        }
                    });
                }
            }

            if (!bt32) {
                if (randomNum == 32) {
                    b32.setBackgroundColor(Color.YELLOW);
                    b32.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            b32.setBackgroundColor(Color.YELLOW);
                            bt32 = true;
                            numClick++;
                            textView2.setText("SCORES:" + numClick);

                        }
                    });
                }
            }

            if (!bt33) {
                if (randomNum == 33) {
                    b33.setBackgroundColor(Color.YELLOW);
                    b33.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            b33.setBackgroundColor(Color.YELLOW);
                            bt33 = true;
                            numClick++;
                            textView2.setText("SCORES:" + numClick);

                        }
                    });
                }
            }
            if (!bt34) {
                if (randomNum == 34) {
                    b34.setBackgroundColor(Color.YELLOW);
                    b34.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            b34.setBackgroundColor(Color.YELLOW);
                            bt34 = true;
                            numClick++;
                            textView2.setText("SCORES:" + numClick);

                        }
                    });
                }
            }

            if (!bt35) {
                if (randomNum == 35) {
                    b35.setBackgroundColor(Color.YELLOW);
                    b35.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            b35.setBackgroundColor(Color.YELLOW);
                            bt35 = true;
                            numClick++;
                            textView2.setText("SCORES:" + numClick);

                        }
                    });
                }
            }

            if (!bt36) {
                if (randomNum == 36) {
                    b36.setBackgroundColor(Color.YELLOW);
                    b36.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            b36.setBackgroundColor(Color.YELLOW);
                            bt36 = true;
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

                HomeButton.setVisibility(View.VISIBLE);
                HomeButton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent i = new Intent(MainActivity6.this, MainActivity.class);
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
                        Intent intent = new Intent(MainActivity6.this, MainActivity6.class);
                        startActivity(intent);
                    }
                });
            }
        }.start();
    }
}