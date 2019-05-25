package com.example.nensy.memgame;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ActivityInfo;
import android.graphics.Color;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;

public class moz1_1 extends AppCompatActivity {

    // зміння для відслідковування успішних спроб і спроб взагалі
    private int success = 0;
    private int attempts1 = 0;
    private int attempts2 = 0;
    private int attempts3 = 0;

    private static final String USER = "user";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // вибирається початковий layout
        setContentView(R.layout.moz1_1);

        // приховує статус бар:
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        // приховує ActionBar:
        getSupportActionBar().hide();
        // орієнтація екрана:
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        // після відкриття activity через секунду початковий layout буде змінений на наступний
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            public void run() {
                setContentView(R.layout.moz1_2);
            }
        }, 1000);
    }

    // 1 завдання

    // помилки

    public void error1_1_1(View view) {
        // додаємо кількість загальних спроб
        attempts1++;

        // кнопка змінює фоновий колір на червоний, тому що відповідь не вірна
        Button button1;
        button1 = (Button)findViewById(R.id.button7);
        button1.setBackgroundColor(Color.parseColor("#bf1818"));

        // якщо було 3 спроби в незалежності від того, правильні вони чи ні, відбувається перехід на наступний layout через пів секунди
        if (attempts1 == 3){
            Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                public void run() {
                    // показується layout із завданням
                    setContentView(R.layout.moz1_3);

                    // далі відразу через секунду показується layout, де треба вибрати правильний порядок
                    Handler handler = new Handler();
                    handler.postDelayed(new Runnable() {
                        public void run() {
                            setContentView(R.layout.moz1_4);
                        }
                    }, 500);
                }
            }, 350);
        }
    }

    public void error1_1_2(View view) {
        attempts1++;

        Button button1;
        button1 = (Button)findViewById(R.id.button8);
        button1.setBackgroundColor(Color.parseColor("#bf1818"));

        if (attempts1 == 3){
            Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                public void run() {
                    setContentView(R.layout.moz1_3);

                    Handler handler = new Handler();
                    handler.postDelayed(new Runnable() {
                        public void run() {
                            setContentView(R.layout.moz1_4);
                        }
                    }, 500);
                }
            }, 350);
        }
    }

    public void error1_1_3(View view) {
        attempts1++;

        Button button1;
        button1 = (Button)findViewById(R.id.button9);
        button1.setBackgroundColor(Color.parseColor("#bf1818"));

        if (attempts1 == 3){
            Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                public void run() {
                    setContentView(R.layout.moz1_3);

                    Handler handler = new Handler();
                    handler.postDelayed(new Runnable() {
                        public void run() {
                            setContentView(R.layout.moz1_4);
                        }
                    }, 500);
                }
            }, 350);
        }
    }

    public void error1_1_4(View view) {
        attempts1++;

        Button button1;
        button1 = (Button)findViewById(R.id.button10);
        button1.setBackgroundColor(Color.parseColor("#bf1818"));

        if (attempts1 == 3){
            Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                public void run() {
                    setContentView(R.layout.moz1_3);

                    Handler handler = new Handler();
                    handler.postDelayed(new Runnable() {
                        public void run() {
                            setContentView(R.layout.moz1_4);
                        }
                    }, 500);
                }
            }, 350);
        }
    }

    public void error1_1_5(View view) {
        attempts1++;

        Button button1;
        button1 = (Button)findViewById(R.id.button13);
        button1.setBackgroundColor(Color.parseColor("#bf1818"));

        if (attempts1 == 3){
            Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                public void run() {
                    setContentView(R.layout.moz1_3);

                    Handler handler = new Handler();
                    handler.postDelayed(new Runnable() {
                        public void run() {
                            setContentView(R.layout.moz1_4);
                        }
                    }, 500);
                }
            }, 350);
        }
    }

    public void error1_1_6(View view) {
        attempts1++;

        Button button1;
        button1 = (Button)findViewById(R.id.button14);
        button1.setBackgroundColor(Color.parseColor("#bf1818"));

        if (attempts1 == 3){
            Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                public void run() {
                    setContentView(R.layout.moz1_3);

                    Handler handler = new Handler();
                    handler.postDelayed(new Runnable() {
                        public void run() {
                            setContentView(R.layout.moz1_4);
                        }
                    }, 500);
                }
            }, 350);
        }
    }

    // успіх

    public void success1_1_1(View view){
        // зміна кольору кнопки
        Button button1;
        button1 = (Button)findViewById(R.id.button11);
        button1.setBackgroundColor(Color.parseColor("#3F51B5"));

        attempts1++;
        success++;

        if (attempts1 == 3){
            Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                public void run() {
                    setContentView(R.layout.moz1_3);

                    Handler handler = new Handler();
                    handler.postDelayed(new Runnable() {
                        public void run() {
                            setContentView(R.layout.moz1_4);
                        }
                    }, 500);
                }
            }, 350);
        }
    }

    public void success1_1_2(View view){
        // зміна кольору кнопки
        Button button1;
        button1 = (Button)findViewById(R.id.button12);
        button1.setBackgroundColor(Color.parseColor("#3F51B5"));

        attempts1++;
        success++;

        if (attempts1 == 3){
            Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                public void run() {
                    setContentView(R.layout.moz1_3);

                    Handler handler = new Handler();
                    handler.postDelayed(new Runnable() {
                        public void run() {
                            setContentView(R.layout.moz1_4);
                        }
                    }, 500);
                }
            }, 350);
        }
    }

    public void success1_1_3(View view){
        // зміна кольору кнопки
        Button button1;
        button1 = (Button)findViewById(R.id.button15);
        button1.setBackgroundColor(Color.parseColor("#3F51B5"));

        attempts1++;
        success++;

        if (attempts1 == 3){
            Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                public void run() {
                    setContentView(R.layout.moz1_3);

                    Handler handler = new Handler();
                    handler.postDelayed(new Runnable() {
                        public void run() {
                            setContentView(R.layout.moz1_4);
                        }
                    }, 500);
                }
            }, 350);
        }
    }

    // 2 завдання

    // помилки

    public void error1_2_1(View view) {
        attempts2++;

        Button button1;
        button1 = (Button)findViewById(R.id.button17);
        button1.setBackgroundColor(Color.parseColor("#bf1818"));

        if (attempts2 == 3){
            Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                public void run() {
                    setContentView(R.layout.moz1_5);

                    Handler handler = new Handler();
                    handler.postDelayed(new Runnable() {
                        public void run() {
                            setContentView(R.layout.moz1_6);
                        }
                    }, 500);
                }
            }, 350);
        }
    }

    public void error1_2_2(View view) {
        attempts2++;

        Button button1;
        button1 = (Button)findViewById(R.id.button19);
        button1.setBackgroundColor(Color.parseColor("#bf1818"));

        if (attempts2 == 3){
            Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                public void run() {
                    setContentView(R.layout.moz1_5);

                    Handler handler = new Handler();
                    handler.postDelayed(new Runnable() {
                        public void run() {
                            setContentView(R.layout.moz1_6);
                        }
                    }, 500);
                }
            }, 350);
        }
    }

    public void error1_2_3(View view) {
        attempts2++;

        Button button1;
        button1 = (Button)findViewById(R.id.button20);
        button1.setBackgroundColor(Color.parseColor("#bf1818"));

        if (attempts2 == 3){
            Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                public void run() {
                    setContentView(R.layout.moz1_5);

                    Handler handler = new Handler();
                    handler.postDelayed(new Runnable() {
                        public void run() {
                            setContentView(R.layout.moz1_6);
                        }
                    }, 500);
                }
            }, 350);
        }
    }

    public void error1_2_4(View view) {
        attempts2++;

        Button button1;
        button1 = (Button)findViewById(R.id.button21);
        button1.setBackgroundColor(Color.parseColor("#bf1818"));

        if (attempts2 == 3){
            Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                public void run() {
                    setContentView(R.layout.moz1_5);

                    Handler handler = new Handler();
                    handler.postDelayed(new Runnable() {
                        public void run() {
                            setContentView(R.layout.moz1_6);
                        }
                    }, 500);
                }
            }, 350);
        }
    }

    public void error1_2_5(View view) {
        attempts2++;

        Button button1;
        button1 = (Button)findViewById(R.id.button23);
        button1.setBackgroundColor(Color.parseColor("#bf1818"));

        if (attempts2 == 3){
            Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                public void run() {
                    setContentView(R.layout.moz1_5);

                    Handler handler = new Handler();
                    handler.postDelayed(new Runnable() {
                        public void run() {
                            setContentView(R.layout.moz1_6);
                        }
                    }, 500);
                }
            }, 350);
        }
    }

    public void error1_2_6(View view) {
        attempts2++;

        Button button1;
        button1 = (Button)findViewById(R.id.button24);
        button1.setBackgroundColor(Color.parseColor("#bf1818"));

        if (attempts2 == 3){
            Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                public void run() {
                    setContentView(R.layout.moz1_5);

                    Handler handler = new Handler();
                    handler.postDelayed(new Runnable() {
                        public void run() {
                            setContentView(R.layout.moz1_6);
                        }
                    }, 500);
                }
            }, 350);
        }
    }

    // успіх

    public void success1_2_1(View view){
        // зміна кольору кнопки
        Button button1;
        button1 = (Button)findViewById(R.id.button16);
        button1.setBackgroundColor(Color.parseColor("#3F51B5"));

        attempts2++;
        success++;

        if (attempts2 == 3){
            Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                public void run() {
                    setContentView(R.layout.moz1_5);

                    Handler handler = new Handler();
                    handler.postDelayed(new Runnable() {
                        public void run() {
                            setContentView(R.layout.moz1_6);
                        }
                    }, 500);
                }
            }, 350);
        }
    }

    public void success1_2_2(View view){
        // зміна кольору кнопки
        Button button1;
        button1 = (Button)findViewById(R.id.button18);
        button1.setBackgroundColor(Color.parseColor("#3F51B5"));

        attempts2++;
        success++;

        if (attempts2 == 3){
            Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                public void run() {
                    setContentView(R.layout.moz1_5);

                    Handler handler = new Handler();
                    handler.postDelayed(new Runnable() {
                        public void run() {
                            setContentView(R.layout.moz1_6);
                        }
                    }, 500);
                }
            }, 350);
        }
    }

    public void success1_2_3(View view){
        // зміна кольору кнопки
        Button button1;
        button1 = (Button)findViewById(R.id.button22);
        button1.setBackgroundColor(Color.parseColor("#3F51B5"));

        attempts2++;
        success++;

        if (attempts2 == 3){
            Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                public void run() {
                    setContentView(R.layout.moz1_5);

                    Handler handler = new Handler();
                    handler.postDelayed(new Runnable() {
                        public void run() {
                            setContentView(R.layout.moz1_6);
                        }
                    }, 500);
                }
            }, 350);
        }
    }

    // 3 завдання

    // помилки

    public void error1_3_1(View view) {
        attempts3++;

        Button button1;
        button1 = (Button)findViewById(R.id.button25);
        button1.setBackgroundColor(Color.parseColor("#bf1818"));

        if (attempts3 == 3){
            Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                public void run() {
//                    setContentView(R.layout.moz1_s);
                    checkResult();

                    Intent questionIntent = new Intent(moz1_1.this, moz2_1.class);
                    startActivityForResult(questionIntent, 1);
                    overridePendingTransition(R.anim.bottom_in, R.anim.top_out);
                }
            }, 350);
        }
    }

    public void error1_3_2(View view) {
        attempts3++;

        Button button1;
        button1 = (Button)findViewById(R.id.button26);
        button1.setBackgroundColor(Color.parseColor("#bf1818"));

        if (attempts3 == 3){
            Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                public void run() {
//                    setContentView(R.layout.moz1_s);
                    checkResult();

                    Intent questionIntent = new Intent(moz1_1.this, moz2_1.class);
                    startActivityForResult(questionIntent, 1);
                    overridePendingTransition(R.anim.bottom_in, R.anim.top_out);
                }
            }, 350);
        }
    }

    public void error1_3_3(View view) {
        attempts3++;

        Button button1;
        button1 = (Button)findViewById(R.id.button27);
        button1.setBackgroundColor(Color.parseColor("#bf1818"));

        if (attempts3 == 3){
            Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                public void run() {
//                    setContentView(R.layout.moz1_s);
                    checkResult();

                    Intent questionIntent = new Intent(moz1_1.this, moz2_1.class);
                    startActivityForResult(questionIntent, 1);
                    overridePendingTransition(R.anim.bottom_in, R.anim.top_out);
                }
            }, 350);
        }
    }

    public void error1_3_4(View view) {
        attempts3++;

        Button button1;
        button1 = (Button)findViewById(R.id.button28);
        button1.setBackgroundColor(Color.parseColor("#bf1818"));

        if (attempts3 == 3){
            Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                public void run() {
//                    setContentView(R.layout.moz1_s);
                    checkResult();

                    Intent questionIntent = new Intent(moz1_1.this, moz2_1.class);
                    startActivityForResult(questionIntent, 1);
                    overridePendingTransition(R.anim.bottom_in, R.anim.top_out);
                }
            }, 350);
        }
    }

    public void error1_3_5(View view) {
        attempts3++;

        Button button1;
        button1 = (Button)findViewById(R.id.button29);
        button1.setBackgroundColor(Color.parseColor("#bf1818"));

        if (attempts3 == 3){
            Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                public void run() {
//                    setContentView(R.layout.moz1_s);
                    checkResult();

                    Intent questionIntent = new Intent(moz1_1.this, moz2_1.class);
                    startActivityForResult(questionIntent, 1);
                    overridePendingTransition(R.anim.bottom_in, R.anim.top_out);
                }
            }, 350);
        }
    }

    public void error1_3_6(View view) {
        attempts3++;

        Button button1;
        button1 = (Button)findViewById(R.id.button33);
        button1.setBackgroundColor(Color.parseColor("#bf1818"));

        if (attempts3 == 3){
            Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                public void run() {
//                    setContentView(R.layout.moz1_s);
                    checkResult();

                    Intent questionIntent = new Intent(moz1_1.this, moz2_1.class);
                    startActivityForResult(questionIntent, 1);
                    overridePendingTransition(R.anim.bottom_in, R.anim.top_out);
                }
            }, 350);
        }
    }

    // результат

    public void checkResult(){
        if (success > -1 && success < 4){
//            ImageView imageView = (ImageView) findViewById(R.id.imageView9);
//            imageView.setImageResource(R.drawable.rate1);

            SharedPreferences sp = getSharedPreferences(USER, Context.MODE_PRIVATE);
            SharedPreferences.Editor e = sp.edit();
            e.putString("rate1", "0");
            e.commit();

        } else if (success > 3 && success < 7) {
//            ImageView imageView = (ImageView) findViewById(R.id.imageView9);
//            imageView.setImageResource(R.drawable.rate2);

            SharedPreferences sp = getSharedPreferences(USER, Context.MODE_PRIVATE);
            SharedPreferences.Editor e = sp.edit();
            e.putString("rate1", "5");
            e.commit();

        } else if (success > 6 && success < 10) {
//            ImageView imageView = (ImageView) findViewById(R.id.imageView9);
//            imageView.setImageResource(R.drawable.rate3);

            SharedPreferences sp = getSharedPreferences(USER, Context.MODE_PRIVATE);
            SharedPreferences.Editor e = sp.edit();
            e.putString("rate1", "10");
            e.commit();
        }
    }

    public void success1_3_1(View view){
        // зміна кольору кнопки
        Button button1;
        button1 = (Button)findViewById(R.id.button31);
        button1.setBackgroundColor(Color.parseColor("#3F51B5"));

        attempts3++;
        success++;

        if (attempts3 == 3){
            Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                public void run() {
//                    setContentView(R.layout.moz1_s);
                    checkResult();

                    Intent questionIntent = new Intent(moz1_1.this, moz2_1.class);
                    startActivityForResult(questionIntent, 1);
                    overridePendingTransition(R.anim.bottom_in, R.anim.top_out);
                }
            }, 350);
        }
    }

    public void success1_3_2(View view){
        // зміна кольору кнопки
        Button button1;
        button1 = (Button)findViewById(R.id.button32);
        button1.setBackgroundColor(Color.parseColor("#3F51B5"));

        attempts3++;
        success++;

        if (attempts3 == 3){
            Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                public void run() {
//                    setContentView(R.layout.moz1_s);
                    checkResult();

                    Intent questionIntent = new Intent(moz1_1.this, moz2_1.class);
                    startActivityForResult(questionIntent, 1);
                    overridePendingTransition(R.anim.bottom_in, R.anim.top_out);
                }
            }, 350);
        }
    }

    public void success1_3_3(View view){
        // зміна кольору кнопки
        Button button1;
        button1 = (Button)findViewById(R.id.button30);
        button1.setBackgroundColor(Color.parseColor("#3F51B5"));

        attempts3++;
        success++;

        if (attempts3 == 3){
            Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                public void run() {
//                    setContentView(R.layout.moz1_s);
                    checkResult();

                    Intent questionIntent = new Intent(moz1_1.this, moz2_1.class);
                    startActivityForResult(questionIntent, 1);
                    overridePendingTransition(R.anim.bottom_in, R.anim.top_out);
                }
            }, 350);
        }
    }

    // службові кнопки

    // перехід на головну activity
    public void goHome1_1(View view) {
        success = 0;
        attempts1 = 0;
        attempts2 = 0;
        attempts3 = 0;

        Intent questionIntent = new Intent(moz1_1.this, MainActivity.class);
        startActivityForResult(questionIntent, 1);
        overridePendingTransition(R.anim.bottom_in, R.anim.top_out);
    }

    // перехід до наступної гри
    public void go_moz2_1(View view) {
        Intent questionIntent = new Intent(moz1_1.this, moz2_1.class);
        startActivityForResult(questionIntent, 1);
        overridePendingTransition(R.anim.bottom_in, R.anim.top_out);
    }
}