package com.example.nensy.memgame;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.graphics.Color;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class moz2_1 extends AppCompatActivity {
    private int success = 0;

    private int attempts1 = 0;
    private int attempts2 = 0;
    private int attempts3 = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.moz2_1);

        // приховує статус бар:
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        // приховує ActionBar:
        getSupportActionBar().hide();
        // орієнтація екрана:
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            public void run() {
                setContentView(R.layout.moz2_2);
            }
        }, 1000);
    }

    // 1 завдання

    // помилки

    public void error2_1_1(View view) {
        attempts1++;

        Button button1;
        button1 = (Button)findViewById(R.id.button35);
        button1.setBackgroundColor(Color.parseColor("#bf1818"));

        if (attempts1 == 3){
            Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                public void run() {
                    setContentView(R.layout.moz2_3);

                    Handler handler = new Handler();
                    handler.postDelayed(new Runnable() {
                        public void run() {
                            setContentView(R.layout.moz2_4);
                        }
                    }, 1000);
                }
            }, 500);
        }
    }
    public void error2_1_2(View view) {
        attempts1++;

        Button button1;
        button1 = (Button)findViewById(R.id.button37);
        button1.setBackgroundColor(Color.parseColor("#bf1818"));

        if (attempts1 == 3){
            Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                public void run() {
                    setContentView(R.layout.moz2_3);

                    Handler handler = new Handler();
                    handler.postDelayed(new Runnable() {
                        public void run() {
                            setContentView(R.layout.moz2_4);
                        }
                    }, 1000);
                }
            }, 500);
        }
    }
    public void error2_1_3(View view) {
        attempts1++;

        Button button1;
        button1 = (Button)findViewById(R.id.button39);
        button1.setBackgroundColor(Color.parseColor("#bf1818"));

        if (attempts1 == 3){
            Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                public void run() {
                    setContentView(R.layout.moz2_3);

                    Handler handler = new Handler();
                    handler.postDelayed(new Runnable() {
                        public void run() {
                            setContentView(R.layout.moz2_4);
                        }
                    }, 1000);
                }
            }, 500);
        }
    }
    public void error2_1_4(View view) {
        attempts1++;

        Button button1;
        button1 = (Button)findViewById(R.id.button41);
        button1.setBackgroundColor(Color.parseColor("#bf1818"));

        if (attempts1 == 3){
            Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                public void run() {
                    setContentView(R.layout.moz2_3);

                    Handler handler = new Handler();
                    handler.postDelayed(new Runnable() {
                        public void run() {
                            setContentView(R.layout.moz2_4);
                        }
                    }, 1000);
                }
            }, 500);
        }
    }
    public void error2_1_5(View view) {
        attempts1++;

        Button button1;
        button1 = (Button)findViewById(R.id.button42);
        button1.setBackgroundColor(Color.parseColor("#bf1818"));

        if (attempts1 == 3){
            Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                public void run() {
                    setContentView(R.layout.moz2_3);

                    Handler handler = new Handler();
                    handler.postDelayed(new Runnable() {
                        public void run() {
                            setContentView(R.layout.moz2_4);
                        }
                    }, 1000);
                }
            }, 500);
        }
    }
    public void error2_1_6(View view) {
        attempts1++;

        Button button1;
        button1 = (Button)findViewById(R.id.button43);
        button1.setBackgroundColor(Color.parseColor("#bf1818"));

        if (attempts1 == 3){
            Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                public void run() {
                    setContentView(R.layout.moz2_3);

                    Handler handler = new Handler();
                    handler.postDelayed(new Runnable() {
                        public void run() {
                            setContentView(R.layout.moz2_4);
                        }
                    }, 1000);
                }
            }, 500);
        }
    }

    // успіх

    public void success2_1_1(View view){
        // зміна кольору кнопки
        Button button1;
        button1 = (Button)findViewById(R.id.button36);
        button1.setBackgroundColor(Color.parseColor("#3F51B5"));

        attempts1++;
        success++;

        if (attempts1 == 3){
            Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                public void run() {
                    setContentView(R.layout.moz2_3);

                    Handler handler = new Handler();
                    handler.postDelayed(new Runnable() {
                        public void run() {
                            setContentView(R.layout.moz2_4);
                        }
                    }, 1000);
                }
            }, 500);
        }
    }

    public void success2_1_2(View view){
        // зміна кольору кнопки
        Button button1;
        button1 = (Button)findViewById(R.id.button38);
        button1.setBackgroundColor(Color.parseColor("#3F51B5"));

        attempts1++;
        success++;

        if (attempts1 == 3){
            Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                public void run() {
                    setContentView(R.layout.moz2_3);

                    Handler handler = new Handler();
                    handler.postDelayed(new Runnable() {
                        public void run() {
                            setContentView(R.layout.moz2_4);
                        }
                    }, 1000);
                }
            }, 500);
        }
    }

    public void success2_1_3(View view){
        // зміна кольору кнопки
        Button button1;
        button1 = (Button)findViewById(R.id.button40);
        button1.setBackgroundColor(Color.parseColor("#3F51B5"));

        attempts1++;
        success++;

        if (attempts1 == 3){
            Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                public void run() {
                    setContentView(R.layout.moz2_3);

                    Handler handler = new Handler();
                    handler.postDelayed(new Runnable() {
                        public void run() {
                            setContentView(R.layout.moz2_4);
                        }
                    }, 1000);
                }
            }, 500);
        }
    }

    // 2 завдання

    // помилки

    public void error2_2_1(View view) {
        attempts2++;

        Button button1;
        button1 = (Button)findViewById(R.id.button44);
        button1.setBackgroundColor(Color.parseColor("#bf1818"));

        if (attempts2 == 3){
            Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                public void run() {
                    setContentView(R.layout.moz2_5);

                    Handler handler = new Handler();
                    handler.postDelayed(new Runnable() {
                        public void run() {
                            setContentView(R.layout.moz2_6);
                        }
                    }, 1000);
                }
            }, 500);
        }
    }

    public void error2_2_2(View view) {
        attempts2++;

        Button button1;
        button1 = (Button)findViewById(R.id.button45);
        button1.setBackgroundColor(Color.parseColor("#bf1818"));

        if (attempts2 == 3){
            Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                public void run() {
                    setContentView(R.layout.moz2_5);

                    Handler handler = new Handler();
                    handler.postDelayed(new Runnable() {
                        public void run() {
                            setContentView(R.layout.moz2_6);
                        }
                    }, 1000);
                }
            }, 500);
        }
    }

    public void error2_2_3(View view) {
        attempts2++;

        Button button1;
        button1 = (Button)findViewById(R.id.button46);
        button1.setBackgroundColor(Color.parseColor("#bf1818"));

        if (attempts2 == 3){
            Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                public void run() {
                    setContentView(R.layout.moz2_5);

                    Handler handler = new Handler();
                    handler.postDelayed(new Runnable() {
                        public void run() {
                            setContentView(R.layout.moz2_6);
                        }
                    }, 1000);
                }
            }, 500);
        }
    }

    public void error2_2_4(View view) {
        attempts2++;

        Button button1;
        button1 = (Button)findViewById(R.id.button48);
        button1.setBackgroundColor(Color.parseColor("#bf1818"));

        if (attempts2 == 3){
            Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                public void run() {
                    setContentView(R.layout.moz2_5);

                    Handler handler = new Handler();
                    handler.postDelayed(new Runnable() {
                        public void run() {
                            setContentView(R.layout.moz2_6);
                        }
                    }, 1000);
                }
            }, 500);
        }
    }
    public void error2_2_5(View view) {
        attempts2++;

        Button button1;
        button1 = (Button)findViewById(R.id.button50);
        button1.setBackgroundColor(Color.parseColor("#bf1818"));

        if (attempts2 == 3){
            Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                public void run() {
                    setContentView(R.layout.moz2_5);

                    Handler handler = new Handler();
                    handler.postDelayed(new Runnable() {
                        public void run() {
                            setContentView(R.layout.moz2_6);
                        }
                    }, 1000);
                }
            }, 500);
        }
    }

    public void error2_2_6(View view) {
        attempts2++;

        Button button1;
        button1 = (Button)findViewById(R.id.button51);
        button1.setBackgroundColor(Color.parseColor("#bf1818"));

        if (attempts2 == 3){
            Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                public void run() {
                    setContentView(R.layout.moz2_5);

                    Handler handler = new Handler();
                    handler.postDelayed(new Runnable() {
                        public void run() {
                            setContentView(R.layout.moz2_6);
                        }
                    }, 1000);
                }
            }, 500);
        }
    }

    // успіх

    public void success2_2_1(View view){
        // зміна кольору кнопки
        Button button1;
        button1 = (Button)findViewById(R.id.button47);
        button1.setBackgroundColor(Color.parseColor("#3F51B5"));

        attempts2++;
        success++;

        if (attempts2 == 3){
            Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                public void run() {
                    setContentView(R.layout.moz2_5);

                    Handler handler = new Handler();
                    handler.postDelayed(new Runnable() {
                        public void run() {
                            setContentView(R.layout.moz2_6);
                        }
                    }, 1000);
                }
            }, 500);
        }
    }

    public void success2_2_2(View view){
        // зміна кольору кнопки
        Button button1;
        button1 = (Button)findViewById(R.id.button49);
        button1.setBackgroundColor(Color.parseColor("#3F51B5"));

        attempts2++;
        success++;

        if (attempts2 == 3){
            Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                public void run() {
                    setContentView(R.layout.moz2_5);

                    Handler handler = new Handler();
                    handler.postDelayed(new Runnable() {
                        public void run() {
                            setContentView(R.layout.moz2_6);
                        }
                    }, 1000);
                }
            }, 500);
        }
    }

    public void success2_2_3(View view){
        // зміна кольору кнопки
        Button button1;
        button1 = (Button)findViewById(R.id.button52);
        button1.setBackgroundColor(Color.parseColor("#3F51B5"));

        attempts2++;
        success++;

        if (attempts2 == 3){
            Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                public void run() {
                    setContentView(R.layout.moz2_5);

                    Handler handler = new Handler();
                    handler.postDelayed(new Runnable() {
                        public void run() {
                            setContentView(R.layout.moz2_6);
                        }
                    }, 1000);
                }
            }, 500);
        }
    }

    // 3 завдання

    // помилки

    public void error2_3_1(View view) {
        attempts3++;

        Button button1;
        button1 = (Button)findViewById(R.id.button55);
        button1.setBackgroundColor(Color.parseColor("#bf1818"));

        if (attempts3 == 3){
            Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                public void run() {
                    setContentView(R.layout.moz2_s);
                    checkResult();
                }
            }, 500);
        }
    }

    public void error2_3_2(View view) {
        attempts3++;

        Button button1;
        button1 = (Button)findViewById(R.id.button57);
        button1.setBackgroundColor(Color.parseColor("#bf1818"));

        if (attempts3 == 3){
            Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                public void run() {
                    setContentView(R.layout.moz2_s);
                    checkResult();
                }
            }, 500);
        }
    }

    public void error2_3_3(View view) {
        attempts3++;

        Button button1;
        button1 = (Button)findViewById(R.id.button58);
        button1.setBackgroundColor(Color.parseColor("#bf1818"));

        if (attempts3 == 3){
            Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                public void run() {
                    setContentView(R.layout.moz2_s);
                    checkResult();
                }
            }, 500);
        }
    }

    public void error2_3_4(View view) {
        attempts3++;

        Button button1;
        button1 = (Button)findViewById(R.id.button59);
        button1.setBackgroundColor(Color.parseColor("#bf1818"));

        if (attempts3 == 3){
            Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                public void run() {
                    setContentView(R.layout.moz2_s);
                    checkResult();
                }
            }, 500);
        }
    }
    public void error2_3_5(View view) {
        attempts3++;

        Button button1;
        button1 = (Button)findViewById(R.id.button60);
        button1.setBackgroundColor(Color.parseColor("#bf1818"));

        if (attempts3 == 3){
            Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                public void run() {
                    setContentView(R.layout.moz2_s);
                    checkResult();
                }
            }, 500);
        }
    }
    public void error2_3_6(View view) {
        attempts3++;

        Button button1;
        button1 = (Button)findViewById(R.id.button61);
        button1.setBackgroundColor(Color.parseColor("#bf1818"));

        if (attempts3 == 3){
            Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                public void run() {
                    setContentView(R.layout.moz2_s);
                    checkResult();
                }
            }, 500);
        }
    }

    // результат

    public void checkResult(){
        if (success > -1 && success < 4){
            ImageView imageView = (ImageView) findViewById(R.id.imageZirka1);
            imageView.setImageResource(R.drawable.rate1);
        } else if (success > 3 && success < 9) {
            ImageView imageView = (ImageView) findViewById(R.id.imageZirka1);
            imageView.setImageResource(R.drawable.rate2);
        } else if (success == 9) {
            ImageView imageView = (ImageView) findViewById(R.id.imageZirka1);
            imageView.setImageResource(R.drawable.rate3);
        }
    }

    // успіх

    public void success2_3_1(View view){
        // зміна кольору кнопки
        Button button1;
        button1 = (Button)findViewById(R.id.button53);
        button1.setBackgroundColor(Color.parseColor("#3F51B5"));

        attempts3++;
        success++;

        if (attempts3 == 3){
            Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                public void run() {
                    setContentView(R.layout.moz2_s);
                    checkResult();
                }
            }, 500);
        }
    }

    public void success2_3_2(View view){
        // зміна кольору кнопки
        Button button1;
        button1 = (Button)findViewById(R.id.button54);
        button1.setBackgroundColor(Color.parseColor("#3F51B5"));

        attempts3++;
        success++;

        if (attempts3 == 3){
            Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                public void run() {
                    setContentView(R.layout.moz2_s);
                    checkResult();
                }
            }, 500);
        }
    }

    public void success2_3_3(View view){
        // зміна кольору кнопки
        Button button1;
        button1 = (Button)findViewById(R.id.button56);
        button1.setBackgroundColor(Color.parseColor("#3F51B5"));

        attempts3++;
        success++;

        if (attempts3 == 3){
            Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                public void run() {
                    setContentView(R.layout.moz2_s);
                    checkResult();
                }
            }, 500);
        }
    }

    // службові кнопки

    public void goHome2_1(View view) {
        success = 0;
        attempts1 = 0;
        attempts2 = 0;
        attempts3 = 0;

        Intent questionIntent = new Intent(moz2_1.this, MainActivity.class);
        startActivityForResult(questionIntent, 1);
        overridePendingTransition(R.anim.bottom_in, R.anim.top_out);
    }

    public void go_moz2_1(View view) {
        Toast toast = Toast.makeText(getApplicationContext(),
                "Поки що все", Toast.LENGTH_SHORT);
        toast.show();
    }
}