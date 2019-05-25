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

public class col3_1 extends AppCompatActivity {
    // змінні для відслідковування успішних спроб і спроб взагалі
    private int success = 0;
    private int attempts1 = 0;
    private int attempts2 = 0;
    private int attempts3 = 0;

    private static final String USER = "user";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // вибирається початковий layout
        setContentView(R.layout.col3_1);

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
                setContentView(R.layout.col3_2);
            }
        }, 1000);
    }

    // перевірка результату

    public void checkResult(){

        SharedPreferences sp = getSharedPreferences(USER, Context.MODE_PRIVATE);

        if (success > 0 && success < 3){

            SharedPreferences.Editor e = sp.edit();
            e.putString("rate12", "0");
            e.commit();

        } else if (success > 2 && success < 5) {

            SharedPreferences.Editor e = sp.edit();
            e.putString("rate12", "5");
            e.commit();

        } else if (success > 4 && success < 7) {

            SharedPreferences.Editor e = sp.edit();
            e.putString("rate12", "10");
            e.commit();
        }

        String rate10 = sp.getString("rate10", "0");
        String rate11 = sp.getString("rate11", "0");
        String rate12 = sp.getString("rate12", "0");

        int tempRate10 = Integer.parseInt(rate10);
        int tempRate11 = Integer.parseInt(rate11);
        int tempRate12 = Integer.parseInt(rate12);

        int sum = tempRate10 + tempRate11 + tempRate12;

        if (sum == 0 || sum < 11) {
            ImageView imageView = (ImageView) findViewById(R.id.col3_star);
            imageView.setImageResource(R.drawable.rate1);
        } else if (sum > 10 && sum < 21){
            ImageView imageView = (ImageView) findViewById(R.id.col3_star);
            imageView.setImageResource(R.drawable.rate2);
        } else if (sum > 19 && sum < 31){
            ImageView imageView = (ImageView) findViewById(R.id.col3_star);
            imageView.setImageResource(R.drawable.rate3);
        }
    }

    // 1 завдання

    // вірно

    public void co4_1_1(View view) {
        // додаємо кількість загальних спроб
        success++;
        attempts1++;

        // вірна відповідь приховується, щоб полегшити гру
        // заміна зображення на картинці
        ImageView imageView1 = (ImageView) findViewById(R.id.col6);
        imageView1.setVisibility(View.INVISIBLE);

        // якщо було 3 спроби в незалежності від того, правильні вони чи ні, відбувається перехід на наступний layout через пів секунди
        if (attempts1 == 1){
            Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                public void run() {
                    // показується layout із завданням
                    setContentView(R.layout.col3_3);

                    // далі відразу через секунду показується layout, де треба вибрати правильний порядок
                    Handler handler = new Handler();
                    handler.postDelayed(new Runnable() {
                        public void run() {
                            setContentView(R.layout.col3_4);
                        }
                    }, 1000);
                }
            }, 500);
        }
    }

    // помилка

    public void erco4_1_1(View view) {
        // додаємо кількість загальних спроб
        attempts1++;

        // не вірна відповідь не приховується, щоб полегшити гру

        // якщо було 3 спроби в незалежності від того, правильні вони чи ні, відбувається перехід на наступний layout через пів секунди
        if (attempts1 == 1){
            Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                public void run() {
                    // показується layout із завданням
                    setContentView(R.layout.col3_3);

                    // далі відразу через секунду показується layout, де треба вибрати правильний порядок
                    Handler handler = new Handler();
                    handler.postDelayed(new Runnable() {
                        public void run() {
                            setContentView(R.layout.col3_4);
                        }
                    }, 1000);
                }
            }, 500);
        }
    }

    // 2 завдання

    // вірно

    public void co4_2_1(View view) {
        // додаємо кількість загальних спроб
        success++;
        attempts2++;

        // вірна відповідь приховується, щоб полегшити гру
        // заміна зображення на картинці
        ImageView imageView1 = (ImageView) findViewById(R.id.co3);
        imageView1.setVisibility(View.INVISIBLE);

        // якщо було 3 спроби в незалежності від того, правильні вони чи ні, відбувається перехід на наступний layout через пів секунди
        if (attempts2 == 2){
            Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                public void run() {
                    // показується layout із завданням
                    setContentView(R.layout.col3_5);

                    // далі відразу через секунду показується layout, де треба вибрати правильний порядок
                    Handler handler = new Handler();
                    handler.postDelayed(new Runnable() {
                        public void run() {
                            setContentView(R.layout.col3_6);
                        }
                    }, 1000);
                }
            }, 500);
        }
    }

    public void co4_2_2(View view) {
        // додаємо кількість загальних спроб
        success++;
        attempts2++;

        // вірна відповідь приховується, щоб полегшити гру
        // заміна зображення на картинці
        ImageView imageView1 = (ImageView) findViewById(R.id.co5);
        imageView1.setVisibility(View.INVISIBLE);

        // якщо було 3 спроби в незалежності від того, правильні вони чи ні, відбувається перехід на наступний layout через пів секунди
        if (attempts2 == 2){
            Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                public void run() {
                    // показується layout із завданням
                    setContentView(R.layout.col3_5);

                    // далі відразу через секунду показується layout, де треба вибрати правильний порядок
                    Handler handler = new Handler();
                    handler.postDelayed(new Runnable() {
                        public void run() {
                            setContentView(R.layout.col3_6);
                        }
                    }, 1000);
                }
            }, 500);
        }
    }

    // помилка

    public void erco4_2_1(View view) {
        // додаємо кількість загальних спроб
        attempts2++;

        // не вірна відповідь не приховується, щоб полегшити гру

        // якщо було 3 спроби в незалежності від того, правильні вони чи ні, відбувається перехід на наступний layout через пів секунди
        if (attempts2 == 2){
            Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                public void run() {
                    // показується layout із завданням
                    setContentView(R.layout.col3_5);

                    // далі відразу через секунду показується layout, де треба вибрати правильний порядок
                    Handler handler = new Handler();
                    handler.postDelayed(new Runnable() {
                        public void run() {
                            setContentView(R.layout.col3_6);
                        }
                    }, 1000);
                }
            }, 500);
        }
    }

    // 3 завдання

    // вірно

    public void co4_3_1(View view) {
        // додаємо кількість загальних спроб
        success++;
        attempts3++;

        // вірна відповідь приховується, щоб полегшити гру
        // заміна зображення на картинці
        ImageView imageView1 = (ImageView) findViewById(R.id.c9);
        imageView1.setVisibility(View.INVISIBLE);

        // якщо було 3 спроби в незалежності від того, правильні вони чи ні, відбувається перехід на наступний layout через пів секунди
        if (attempts3 == 3){
            Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                public void run() {
                    // показується layout із завданням
                    setContentView(R.layout.col3_s);
                    checkResult();
                }
            }, 500);
        }
    }

    public void co4_3_2(View view) {
        // додаємо кількість загальних спроб
        success++;
        attempts3++;

        // вірна відповідь приховується, щоб полегшити гру
        // заміна зображення на картинці
        ImageView imageView1 = (ImageView) findViewById(R.id.c3);
        imageView1.setVisibility(View.INVISIBLE);

        // якщо було 3 спроби в незалежності від того, правильні вони чи ні, відбувається перехід на наступний layout через пів секунди
        if (attempts3 == 3){
            Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                public void run() {
                    // показується layout із завданням
                    setContentView(R.layout.col3_s);
                    checkResult();
                }
            }, 500);
        }
    }

    public void co4_3_3(View view) {
        // додаємо кількість загальних спроб
        success++;
        attempts3++;

        // вірна відповідь приховується, щоб полегшити гру
        // заміна зображення на картинці
        ImageView imageView1 = (ImageView) findViewById(R.id.c4);
        imageView1.setVisibility(View.INVISIBLE);

        // якщо було 3 спроби в незалежності від того, правильні вони чи ні, відбувається перехід на наступний layout через пів секунди
        if (attempts3 == 3){
            Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                public void run() {
                    // показується layout із завданням
                    setContentView(R.layout.col3_s);
                    checkResult();
                }
            }, 500);
        }
    }

    // помилка

    public void erco4_3_1(View view) {
        // додаємо кількість загальних спроб
        attempts3++;

        // не вірна відповідь не приховується, щоб полегшити гру

        // якщо було 3 спроби в незалежності від того, правильні вони чи ні, відбувається перехід на наступний layout через пів секунди
        if (attempts3 == 3){
            Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                public void run() {
                    // показується layout із завданням
                    setContentView(R.layout.col3_s);
                    checkResult();
                }
            }, 500);
        }
    }

    // службові кнопки

    // перехід на головну activity
    public void goHome_col_3_1(View view) {
        success = 0;
        attempts1 = 0;
        attempts2 = 0;
        attempts3 = 0;

        Intent questionIntent = new Intent(col3_1.this, MainActivity.class);
        startActivityForResult(questionIntent, 1);
        overridePendingTransition(R.anim.bottom_in, R.anim.top_out);
    }
    public void go_list_col3_1(View view) {
        Intent questionIntent = new Intent(col3_1.this, ListActivity.class);
        startActivityForResult(questionIntent, 1);
        overridePendingTransition(R.anim.bottom_in, R.anim.top_out);
    }
}
