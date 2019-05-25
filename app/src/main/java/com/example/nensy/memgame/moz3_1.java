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
import android.widget.ImageView;

public class moz3_1 extends AppCompatActivity {

    private int success = 0;
    private int attempts1 = 0;
    private int attempts2 = 0;
    private int attempts3 = 0;

    private static final String USER = "user";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.moz3_1);

        // приховує статус бар:
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        // приховує ActionBar:
        getSupportActionBar().hide();
        // орієнтація екрана:
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            public void run() {
                setContentView(R.layout.moz3_2);
            }
        }, 500);
    }

    // 1 завдання

    // помилки

    public void error3_1_1(View view) {
        attempts1++;

        Button button1;
        button1 = (Button)findViewById(R.id.button64);
        button1.setBackgroundColor(Color.parseColor("#bf1818"));

        if (attempts1 == 3){
            Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                public void run() {
                    setContentView(R.layout.moz3_3);

                    Handler handler = new Handler();
                    handler.postDelayed(new Runnable() {
                        public void run() {
                            setContentView(R.layout.moz3_4);
                        }
                    }, 500);
                }
            }, 350);
        }
    }

    public void error3_1_2(View view) {
        attempts1++;

        Button button1;
        button1 = (Button)findViewById(R.id.button65);
        button1.setBackgroundColor(Color.parseColor("#bf1818"));

        if (attempts1 == 3){
            Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                public void run() {
                    setContentView(R.layout.moz3_3);

                    Handler handler = new Handler();
                    handler.postDelayed(new Runnable() {
                        public void run() {
                            setContentView(R.layout.moz3_4);
                        }
                    }, 500);
                }
            }, 350);
        }
    }

    public void error3_1_3(View view) {
        attempts1++;

        Button button1;
        button1 = (Button)findViewById(R.id.button66);
        button1.setBackgroundColor(Color.parseColor("#bf1818"));

        if (attempts1 == 3){
            Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                public void run() {
                    setContentView(R.layout.moz3_3);

                    Handler handler = new Handler();
                    handler.postDelayed(new Runnable() {
                        public void run() {
                            setContentView(R.layout.moz3_4);
                        }
                    }, 500);
                }
            }, 350);
        }
    }

    public void error3_1_4(View view) {
        attempts1++;

        Button button1;
        button1 = (Button)findViewById(R.id.button68);
        button1.setBackgroundColor(Color.parseColor("#bf1818"));

        if (attempts1 == 3){
            Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                public void run() {
                    setContentView(R.layout.moz3_3);

                    Handler handler = new Handler();
                    handler.postDelayed(new Runnable() {
                        public void run() {
                            setContentView(R.layout.moz3_4);
                        }
                    }, 500);
                }
            }, 350);
        }
    }

    public void error3_1_5(View view) {
        attempts1++;

        Button button1;
        button1 = (Button)findViewById(R.id.button69);
        button1.setBackgroundColor(Color.parseColor("#bf1818"));

        if (attempts1 == 3){
            Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                public void run() {
                    setContentView(R.layout.moz3_3);

                    Handler handler = new Handler();
                    handler.postDelayed(new Runnable() {
                        public void run() {
                            setContentView(R.layout.moz3_4);
                        }
                    }, 500);
                }
            }, 350);
        }
    }

    public void error3_1_6(View view) {
        attempts1++;

        Button button1;
        button1 = (Button)findViewById(R.id.button70);
        button1.setBackgroundColor(Color.parseColor("#bf1818"));

        if (attempts1 == 3){
            Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                public void run() {
                    setContentView(R.layout.moz3_3);

                    Handler handler = new Handler();
                    handler.postDelayed(new Runnable() {
                        public void run() {
                            setContentView(R.layout.moz3_4);
                        }
                    }, 500);
                }
            }, 350);
        }
    }

    // успіх

    public void success3_1_1(View view){
        // зміна кольору кнопки
        Button button1;
        button1 = (Button)findViewById(R.id.button63);
        button1.setBackgroundColor(Color.parseColor("#3F51B5"));

        attempts1++;
        success++;

        if (attempts1 == 3){
            Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                public void run() {
                    setContentView(R.layout.moz3_3);

                    Handler handler = new Handler();
                    handler.postDelayed(new Runnable() {
                        public void run() {
                            setContentView(R.layout.moz3_4);
                        }
                    }, 500);
                }
            }, 350);
        }
    }

    public void success3_1_2(View view){
        // зміна кольору кнопки
        Button button1;
        button1 = (Button)findViewById(R.id.button67);
        button1.setBackgroundColor(Color.parseColor("#3F51B5"));

        attempts1++;
        success++;

        if (attempts1 == 3){
            Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                public void run() {
                    setContentView(R.layout.moz3_3);

                    Handler handler = new Handler();
                    handler.postDelayed(new Runnable() {
                        public void run() {
                            setContentView(R.layout.moz3_4);
                        }
                    }, 500);
                }
            }, 350);
        }
    }

    public void success3_1_3(View view){
        // зміна кольору кнопки
        Button button1;
        button1 = (Button)findViewById(R.id.button71);
        button1.setBackgroundColor(Color.parseColor("#3F51B5"));

        attempts1++;
        success++;

        if (attempts1 == 3){
            Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                public void run() {
                    setContentView(R.layout.moz3_3);

                    Handler handler = new Handler();
                    handler.postDelayed(new Runnable() {
                        public void run() {
                            setContentView(R.layout.moz3_4);
                        }
                    }, 500);
                }
            }, 350);
        }
    }

    // 2 завдання

    // помилки

    public void error3_2_1(View view) {
        attempts2++;

        Button button1;
        button1 = (Button)findViewById(R.id.button72);
        button1.setBackgroundColor(Color.parseColor("#bf1818"));

        if (attempts2 == 3){
            Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                public void run() {
                    setContentView(R.layout.moz3_5);

                    Handler handler = new Handler();
                    handler.postDelayed(new Runnable() {
                        public void run() {
                            setContentView(R.layout.moz3_6);
                        }
                    }, 500);
                }
            }, 350);
        }
    }

    public void error3_2_2(View view) {
        attempts2++;

        Button button1;
        button1 = (Button)findViewById(R.id.button73);
        button1.setBackgroundColor(Color.parseColor("#bf1818"));

        if (attempts2 == 3){
            Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                public void run() {
                    setContentView(R.layout.moz3_5);

                    Handler handler = new Handler();
                    handler.postDelayed(new Runnable() {
                        public void run() {
                            setContentView(R.layout.moz3_6);
                        }
                    }, 500);
                }
            }, 350);
        }
    }

    public void error3_2_3(View view) {
        attempts2++;

        Button button1;
        button1 = (Button)findViewById(R.id.button75);
        button1.setBackgroundColor(Color.parseColor("#bf1818"));

        if (attempts2 == 3){
            Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                public void run() {
                    setContentView(R.layout.moz3_5);

                    Handler handler = new Handler();
                    handler.postDelayed(new Runnable() {
                        public void run() {
                            setContentView(R.layout.moz3_6);
                        }
                    }, 500);
                }
            }, 350);
        }
    }

    public void error3_2_4(View view) {
        attempts2++;

        Button button1;
        button1 = (Button)findViewById(R.id.button77);
        button1.setBackgroundColor(Color.parseColor("#bf1818"));

        if (attempts2 == 3){
            Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                public void run() {
                    setContentView(R.layout.moz3_5);

                    Handler handler = new Handler();
                    handler.postDelayed(new Runnable() {
                        public void run() {
                            setContentView(R.layout.moz3_6);
                        }
                    }, 500);
                }
            }, 350);
        }
    }

    public void error3_2_5(View view) {
        attempts2++;

        Button button1;
        button1 = (Button)findViewById(R.id.button78);
        button1.setBackgroundColor(Color.parseColor("#bf1818"));

        if (attempts2 == 3){
            Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                public void run() {
                    setContentView(R.layout.moz3_5);

                    Handler handler = new Handler();
                    handler.postDelayed(new Runnable() {
                        public void run() {
                            setContentView(R.layout.moz3_6);
                        }
                    }, 500);
                }
            }, 350);
        }
    }

    public void error3_2_6(View view) {
        attempts2++;

        Button button1;
        button1 = (Button)findViewById(R.id.button79);
        button1.setBackgroundColor(Color.parseColor("#bf1818"));

        if (attempts2 == 3){
            Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                public void run() {
                    setContentView(R.layout.moz3_5);

                    Handler handler = new Handler();
                    handler.postDelayed(new Runnable() {
                        public void run() {
                            setContentView(R.layout.moz3_6);
                        }
                    }, 500);
                }
            }, 350);
        }
    }

    // успіх

    public void success3_2_1(View view){
        // зміна кольору кнопки
        Button button1;
        button1 = (Button)findViewById(R.id.button74);
        button1.setBackgroundColor(Color.parseColor("#3F51B5"));

        attempts2++;
        success++;

        if (attempts2 == 3){
            Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                public void run() {
                    setContentView(R.layout.moz3_5);

                    Handler handler = new Handler();
                    handler.postDelayed(new Runnable() {
                        public void run() {
                            setContentView(R.layout.moz3_6);
                        }
                    }, 500);
                }
            }, 350);
        }
    }

    public void success3_2_2(View view){
        // зміна кольору кнопки
        Button button1;
        button1 = (Button)findViewById(R.id.button76);
        button1.setBackgroundColor(Color.parseColor("#3F51B5"));

        attempts2++;
        success++;

        if (attempts2 == 3){
            Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                public void run() {
                    setContentView(R.layout.moz3_5);

                    Handler handler = new Handler();
                    handler.postDelayed(new Runnable() {
                        public void run() {
                            setContentView(R.layout.moz3_6);
                        }
                    }, 500);
                }
            }, 350);
        }
    }

    public void success3_2_3(View view){
        // зміна кольору кнопки
        Button button1;
        button1 = (Button)findViewById(R.id.button80);
        button1.setBackgroundColor(Color.parseColor("#3F51B5"));

        attempts2++;
        success++;

        if (attempts2 == 3){
            Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                public void run() {
                    setContentView(R.layout.moz3_5);

                    Handler handler = new Handler();
                    handler.postDelayed(new Runnable() {
                        public void run() {
                            setContentView(R.layout.moz3_6);
                        }
                    }, 500);
                }
            }, 350);
        }
    }

    // 3 завдання

    // результат

    public void checkResult(){

        SharedPreferences sp = getSharedPreferences(USER, Context.MODE_PRIVATE);

        if (success > -1 && success < 4){

            SharedPreferences.Editor e = sp.edit();
            e.putString("rate3", "0");
            e.commit();

        } else if (success > 3 && success < 7) {

            SharedPreferences.Editor e = sp.edit();
            e.putString("rate3", "5");
            e.commit();

        } else if (success > 6 && success < 10) {

            SharedPreferences.Editor e = sp.edit();
            e.putString("rate3", "10");
            e.commit();

        }

        String rate1 = sp.getString("rate1", "0");
        String rate2 = sp.getString("rate2", "0");
        String rate3 = sp.getString("rate3", "0");

        int tempRate1 = Integer.parseInt(rate1);
        int tempRate2 = Integer.parseInt(rate2);
        int tempRate3 = Integer.parseInt(rate3);

        int sum = tempRate1 + tempRate2 + tempRate3;

        if (sum == 0 || sum < 11) {
            ImageView imageView = (ImageView) findViewById(R.id.imageZirka2);
            imageView.setImageResource(R.drawable.rate1);
        } else if (sum > 10 && sum < 21){
            ImageView imageView = (ImageView) findViewById(R.id.imageZirka2);
            imageView.setImageResource(R.drawable.rate2);
        } else if (sum > 19 && sum < 31){
            ImageView imageView = (ImageView) findViewById(R.id.imageZirka2);
            imageView.setImageResource(R.drawable.rate3);
        }
    }

    // помилки

    public void error3_3_1(View view) {
        attempts3++;

        Button button1;
        button1 = (Button)findViewById(R.id.button81);
        button1.setBackgroundColor(Color.parseColor("#bf1818"));

        if (attempts3 == 3){
            Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                public void run() {
                    setContentView(R.layout.moz3_s);
                    checkResult();
                }
            }, 350);
        }
    }

    public void error3_3_2(View view) {
        attempts3++;

        Button button1;
        button1 = (Button)findViewById(R.id.button82);
        button1.setBackgroundColor(Color.parseColor("#bf1818"));

        if (attempts3 == 3){
            Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                public void run() {
                    setContentView(R.layout.moz3_s);
                    checkResult();
                }
            }, 350);
        }
    }

    public void error3_3_3(View view) {
        attempts3++;

        Button button1;
        button1 = (Button)findViewById(R.id.button85);
        button1.setBackgroundColor(Color.parseColor("#bf1818"));

        if (attempts3 == 3){
            Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                public void run() {
                    setContentView(R.layout.moz3_s);
                    checkResult();
                }
            }, 350);
        }
    }

    public void error3_3_4(View view) {
        attempts3++;

        Button button1;
        button1 = (Button)findViewById(R.id.button86);
        button1.setBackgroundColor(Color.parseColor("#bf1818"));

        if (attempts3 == 3){
            Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                public void run() {
                    setContentView(R.layout.moz3_s);
                    checkResult();
                }
            }, 350);
        }
    }

    public void error3_3_5(View view) {
        attempts3++;

        Button button1;
        button1 = (Button)findViewById(R.id.button87);
        button1.setBackgroundColor(Color.parseColor("#bf1818"));

        if (attempts3 == 3){
            Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                public void run() {
                    setContentView(R.layout.moz3_s);
                    checkResult();
                }
            }, 350);
        }
    }

    public void error3_3_6(View view) {
        attempts3++;

        Button button1;
        button1 = (Button)findViewById(R.id.button89);
        button1.setBackgroundColor(Color.parseColor("#bf1818"));

        if (attempts3 == 3){
            Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                public void run() {
                    setContentView(R.layout.moz3_s);
                    checkResult();
                }
            }, 350);
        }
    }

    // успіх

    public void success3_3_1(View view){
        // зміна кольору кнопки
        Button button1;
        button1 = (Button)findViewById(R.id.button83);
        button1.setBackgroundColor(Color.parseColor("#3F51B5"));

        attempts3++;
        success++;

        if (attempts3 == 3){
            Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                public void run() {
                    setContentView(R.layout.moz3_s);
                    checkResult();
                }
            }, 350);
        }
    }

    public void success3_3_2(View view){
        // зміна кольору кнопки
        Button button1;
        button1 = (Button)findViewById(R.id.button84);
        button1.setBackgroundColor(Color.parseColor("#3F51B5"));

        attempts3++;
        success++;

        if (attempts3 == 3){
            Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                public void run() {
                    setContentView(R.layout.moz3_s);
                    checkResult();
                }
            }, 350);
        }
    }

    public void success3_3_3(View view){
        // зміна кольору кнопки
        Button button1;
        button1 = (Button)findViewById(R.id.button88);
        button1.setBackgroundColor(Color.parseColor("#3F51B5"));

        attempts3++;
        success++;

        if (attempts3 == 3){
            Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                public void run() {
                    setContentView(R.layout.moz3_s);
                    checkResult();
                }
            }, 350);
        }
    }

    // службові кнопки

    public void goHome3_1(View view) {
        success = 0;
        attempts1 = 0;
        attempts2 = 0;
        attempts3 = 0;

        Intent questionIntent = new Intent(moz3_1.this, MainActivity.class);
        startActivityForResult(questionIntent, 1);
        overridePendingTransition(R.anim.bottom_in, R.anim.top_out);
    }

    public void go_list_moz3_1(View view) {
        Intent questionIntent = new Intent(moz3_1.this, ListActivity.class);
        startActivityForResult(questionIntent, 1);
        overridePendingTransition(R.anim.bottom_in, R.anim.top_out);
    }
}
