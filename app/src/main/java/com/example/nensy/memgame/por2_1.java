package com.example.nensy.memgame;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ActivityInfo;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;

public class por2_1 extends AppCompatActivity {

    private int success = 0;
    private int success1 = 0;
    private int success2 = 0;
    private int success3 = 0;

    private static final String USER = "user";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.por2_1);

        // приховує статус бар:
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        // приховує ActionBar:
        getSupportActionBar().hide();
        // орієнтація екрана:
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            public void run() {
                setContentView(R.layout.por2_2);
            }
        }, 1000);
    }

    // результат

    public void checkResult(){
        success = success1 + success2 + success3;

        if (success > -1 && success < 5){
//            ImageView imageView = (ImageView) findViewById(R.id.po13);
//            imageView.setImageResource(R.drawable.rate1);

            SharedPreferences sp = getSharedPreferences(USER, Context.MODE_PRIVATE);
            SharedPreferences.Editor e = sp.edit();
            e.putString("rate8", "0");
            e.commit();

        } else if (success > 4 && success < 9) {
//            ImageView imageView = (ImageView) findViewById(R.id.po13);
//            imageView.setImageResource(R.drawable.rate2);

            SharedPreferences sp = getSharedPreferences(USER, Context.MODE_PRIVATE);
            SharedPreferences.Editor e = sp.edit();
            e.putString("rate8", "5");
            e.commit();

        } else if (success > 8 && success < 13) {
//            ImageView imageView = (ImageView) findViewById(R.id.po13);
//            imageView.setImageResource(R.drawable.rate3);

            SharedPreferences sp = getSharedPreferences(USER, Context.MODE_PRIVATE);
            SharedPreferences.Editor e = sp.edit();
            e.putString("rate8", "10");
            e.commit();

        }
    }

    public void por2_1_1(View view) {
        if (success1 == 0) {
            success1++;

            ImageView imageView1 = (ImageView) findViewById(R.id.po1);
            imageView1.setImageResource(R.drawable.one);
        } else {
            Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                public void run() {
                    setContentView(R.layout.por2_3);

                    Handler handler = new Handler();
                    handler.postDelayed(new Runnable() {
                        public void run() {
                            setContentView(R.layout.por2_4);
                        }
                    }, 1000);
                }
            }, 500);
        }
    }

    public void por2_1_2(View view) {
        if (success1 == 1) {
            success1++;

            ImageView imageView2 = (ImageView) findViewById(R.id.po3);
            imageView2.setImageResource(R.drawable.two);
        } else {
            Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                public void run() {
                    setContentView(R.layout.por2_3);

                    Handler handler = new Handler();
                    handler.postDelayed(new Runnable() {
                        public void run() {
                            setContentView(R.layout.por2_4);
                        }
                    }, 1000);
                }
            }, 500);
        }
    }

    public void por2_1_3(View view) {
        if (success1 == 2) {
            success1++;

            ImageView imageView3 = (ImageView) findViewById(R.id.po2);
            imageView3.setImageResource(R.drawable.four);

            Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                public void run() {
                    setContentView(R.layout.por2_3);

                    Handler handler = new Handler();
                    handler.postDelayed(new Runnable() {
                        public void run() {
                            setContentView(R.layout.por2_4);
                        }
                    }, 1000);
                }
            }, 500);
        } else {
            Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                public void run() {
                    setContentView(R.layout.por2_3);

                    Handler handler = new Handler();
                    handler.postDelayed(new Runnable() {
                        public void run() {
                            setContentView(R.layout.por2_4);
                        }
                    }, 1000);
                }
            }, 500);
        }
    }

    // успіх і невдача для 2 завдання гри

    public void por2_2_1(View view) {
        if (success2 == 0) {
            success2++;

            ImageView imageView4 = (ImageView) findViewById(R.id.po7);
            imageView4.setImageResource(R.drawable.three);
        } else {
            Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                public void run() {
                    setContentView(R.layout.por2_5);

                    Handler handler = new Handler();
                    handler.postDelayed(new Runnable() {
                        public void run() {
                            setContentView(R.layout.por2_6);
                        }
                    }, 1000);
                }
            }, 500);
        }
    }


    public void por2_2_2(View view) {
        if (success2 == 1) {
            success2++;

            ImageView imageView5 = (ImageView) findViewById(R.id.po4);
            imageView5.setImageResource(R.drawable.five);
        } else {
            Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                public void run() {
                    setContentView(R.layout.por2_5);

                    Handler handler = new Handler();
                    handler.postDelayed(new Runnable() {
                        public void run() {
                            setContentView(R.layout.por2_6);
                        }
                    }, 1000);
                }
            }, 500);
        }
    }

    public void por2_2_3(View view) {
        if (success2 == 2) {
            success2++;

            ImageView imageView6 = (ImageView) findViewById(R.id.po5);
            imageView6.setImageResource(R.drawable.seven);
        } else {
            Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                public void run() {
                    setContentView(R.layout.por2_5);

                    Handler handler = new Handler();
                    handler.postDelayed(new Runnable() {
                        public void run() {
                            setContentView(R.layout.por2_6);
                        }
                    }, 1000);
                }
            }, 500);
        }
    }

    public void por2_2_4(View view) {
        if (success2 == 3) {
            success2++;

            ImageView imageView7 = (ImageView) findViewById(R.id.po6);
            imageView7.setImageResource(R.drawable.nine);

            Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                public void run() {
                    setContentView(R.layout.por2_5);

                    Handler handler = new Handler();
                    handler.postDelayed(new Runnable() {
                        public void run() {
                            setContentView(R.layout.por2_6);
                        }
                    }, 1000);
                }
            }, 500);
        } else {
            Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                public void run() {
                    setContentView(R.layout.por2_5);

                    Handler handler = new Handler();
                    handler.postDelayed(new Runnable() {
                        public void run() {
                            setContentView(R.layout.por2_6);
                        }
                    }, 1000);
                }
            }, 500);
        }
    }

    // успіх і невдача для 3 завдання гри

    public void por2_3_1(View view) {
        if (success3 == 0) {
            success3++;

            ImageView imageView8 = (ImageView) findViewById(R.id.po12);
            imageView8.setImageResource(R.drawable.one);
        } else {
            Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                public void run() {
//                    setContentView(R.layout.por2_s);
                    checkResult();

                    Intent questionIntent = new Intent(por2_1.this, por3_1.class);
                    startActivityForResult(questionIntent, 1);
                    overridePendingTransition(R.anim.bottom_in, R.anim.top_out);
                }
            }, 500);
        }
    }

    public void por2_3_2(View view) {
        if (success3 == 1) {
            success3++;

            ImageView imageView9 = (ImageView) findViewById(R.id.po8);
            imageView9.setImageResource(R.drawable.three);
        } else {
            Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                public void run() {
//                    setContentView(R.layout.por2_s);
                    checkResult();

                    Intent questionIntent = new Intent(por2_1.this, por3_1.class);
                    startActivityForResult(questionIntent, 1);
                    overridePendingTransition(R.anim.bottom_in, R.anim.top_out);
                }
            }, 500);
        }
    }

    public void por2_3_3(View view) {
        if (success3 == 2) {
            success3++;

            ImageView imageView10 = (ImageView) findViewById(R.id.po9);
            imageView10.setImageResource(R.drawable.six);
        } else {
            Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                public void run() {
//                    setContentView(R.layout.por2_s);
                    checkResult();

                    Intent questionIntent = new Intent(por2_1.this, por3_1.class);
                    startActivityForResult(questionIntent, 1);
                    overridePendingTransition(R.anim.bottom_in, R.anim.top_out);
                }
            }, 500);
        }
    }

    public void por2_3_4(View view) {
        if (success3 == 3) {
            success3++;

            ImageView imageView11 = (ImageView) findViewById(R.id.po11);
            imageView11.setImageResource(R.drawable.eight);
        } else {
            Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                public void run() {
//                    setContentView(R.layout.por2_s);
                    checkResult();

                    Intent questionIntent = new Intent(por2_1.this, por3_1.class);
                    startActivityForResult(questionIntent, 1);
                    overridePendingTransition(R.anim.bottom_in, R.anim.top_out);
                }
            }, 500);
        }
    }

    public void por2_3_5(View view) {
        if (success3 == 4) {
            success3++;

            ImageView imageView12 = (ImageView) findViewById(R.id.po10);
            imageView12.setImageResource(R.drawable.ten);

            Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                public void run() {
//                    setContentView(R.layout.por2_s);
                    checkResult();

                    Intent questionIntent = new Intent(por2_1.this, por3_1.class);
                    startActivityForResult(questionIntent, 1);
                    overridePendingTransition(R.anim.bottom_in, R.anim.top_out);
                }
            }, 500);
        } else {
            Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                public void run() {
//                    setContentView(R.layout.por2_s);
                    checkResult();

                    Intent questionIntent = new Intent(por2_1.this, por3_1.class);
                    startActivityForResult(questionIntent, 1);
                    overridePendingTransition(R.anim.bottom_in, R.anim.top_out);
                }
            }, 500);
        }
    }

    // службові кнопки

    public void goHome_por_2_1(View view) {
        success = 0;
        success1 = 0;
        success2 = 0;
        success3 = 0;

        Intent questionIntent = new Intent(por2_1.this, MainActivity.class);
        startActivityForResult(questionIntent, 1);
        overridePendingTransition(R.anim.bottom_in, R.anim.top_out);
    }

    public void go_por3_1(View view) {
        Intent questionIntent = new Intent(por2_1.this, por3_1.class);
        startActivityForResult(questionIntent, 1);
        overridePendingTransition(R.anim.bottom_in, R.anim.top_out);
    }

}
