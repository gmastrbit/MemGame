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

public class moz1_1 extends AppCompatActivity {

    private int success = 0;

    private int attempts1 = 0;
    private int attempts2 = 0;
    private int attempts3 = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.moz1_1);

        // приховує статус бар:
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        // приховує ActionBar:
        getSupportActionBar().hide();
        // орієнтація екрана:
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            public void run() {
                setContentView(R.layout.moz1_2);
            }
        }, 1000);
    }

    // 1 завдання

    public void error1(View view) {
        attempts1++;

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
                    }, 1000);
                }
            }, 500);
        }
    }

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
                    }, 1000);
                }
            }, 500);
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
                    }, 1000);
                }
            }, 500);
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
                    }, 1000);
                }
            }, 500);
        }
    }

    // 2 завдання

    public void error2(View view) {
        attempts2++;

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
                    }, 1000);
                }
            }, 500);
        }
    }

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
                    }, 1000);
                }
            }, 500);
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
                    }, 1000);
                }
            }, 500);
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
                    }, 1000);
                }
            }, 500);
        }
    }

    // 3 завдання

    public void checkResult(){
        if (success > -1 && success < 4){
            ImageView imageView = (ImageView) findViewById(R.id.imageView9);
            imageView.setImageResource(R.drawable.rate1);
        } else if (success > 3 && success < 9) {
            ImageView imageView = (ImageView) findViewById(R.id.imageView9);
            imageView.setImageResource(R.drawable.rate2);
        } else if (success == 9) {
            ImageView imageView = (ImageView) findViewById(R.id.imageView9);
            imageView.setImageResource(R.drawable.rate3);
        }
    }

    public void error3(View view) {
        attempts3++;

        if (attempts3 == 3){
            Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                public void run() {
                    setContentView(R.layout.moz1_s);
                    checkResult();
                }
            }, 500);
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
                    setContentView(R.layout.moz1_s);
                    checkResult();
                }
            }, 500);
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
                    setContentView(R.layout.moz1_s);
                    checkResult();
                }
            }, 500);
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
                    setContentView(R.layout.moz1_s);
                    checkResult();
                }
            }, 500);
        }
    }

    // службові кнопки

    public void goHome1_1(View view) {
        Intent questionIntent = new Intent(moz1_1.this, MainActivity.class);
        startActivityForResult(questionIntent, 1);
        overridePendingTransition(R.anim.bottom_in, R.anim.top_out);
    }

    public void go_moz2_1(View view) {
        Toast toast = Toast.makeText(getApplicationContext(),
                "Поки що все", Toast.LENGTH_SHORT);
        toast.show();
    }
}