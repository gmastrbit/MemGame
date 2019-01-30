package com.example.nensy.memgame;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;

public class col2_1 extends AppCompatActivity {
    // змінні для відслідковування успішних спроб і спроб взагалі
    private int success = 0;
    private int attempts1 = 0;
    private int attempts2 = 0;
    private int attempts3 = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.col2_1);

        // вибирається початковий layout
        setContentView(R.layout.col2_1);

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
                setContentView(R.layout.col2_2);
            }
        }, 1000);

    }

    // перевірка результату

    public void checkResult(){
        if (success > 0 && success < 3){
            ImageView imageView = (ImageView) findViewById(R.id.col2_star);
            imageView.setImageResource(R.drawable.rate1);
        } else if (success > 2 && success < 5) {
            ImageView imageView = (ImageView) findViewById(R.id.col2_star);
            imageView.setImageResource(R.drawable.rate2);
        } else if (success > 4 && success < 7) {
            ImageView imageView = (ImageView) findViewById(R.id.col2_star);
            imageView.setImageResource(R.drawable.rate3);
        }
    }

    // 1 завдання

    // вірно

    public void col4_1_1(View view) {
        // додаємо кількість загальних спроб
        success++;
        attempts1++;

        // вірна відповідь приховується, щоб полегшити гру
        // заміна зображення на картинці
        ImageView imageView1 = (ImageView) findViewById(R.id.col8);
        imageView1.setVisibility(View.INVISIBLE);

        // якщо було 3 спроби в незалежності від того, правильні вони чи ні, відбувається перехід на наступний layout через пів секунди
        if (attempts1 == 1){
            Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                public void run() {
                    // показується layout із завданням
                    setContentView(R.layout.col2_3);

                    // далі відразу через секунду показується layout, де треба вибрати правильний порядок
                    Handler handler = new Handler();
                    handler.postDelayed(new Runnable() {
                        public void run() {
                            setContentView(R.layout.col2_4);
                        }
                    }, 1000);
                }
            }, 500);
        }
    }

    // помилка

    public void ercol4_1_1(View view) {
        // додаємо кількість загальних спроб
        attempts1++;

        // не вірна відповідь не приховується, щоб полегшити гру

        // якщо було 3 спроби в незалежності від того, правильні вони чи ні, відбувається перехід на наступний layout через пів секунди
        if (attempts1 == 1){
            Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                public void run() {
                    // показується layout із завданням
                    setContentView(R.layout.col2_3);

                    // далі відразу через секунду показується layout, де треба вибрати правильний порядок
                    Handler handler = new Handler();
                    handler.postDelayed(new Runnable() {
                        public void run() {
                            setContentView(R.layout.col2_4);
                        }
                    }, 1000);
                }
            }, 500);
        }
    }


    // 2 завдання

    // вірно

    public void col4_2_1(View view) {
        // додаємо кількість загальних спроб
        success++;
        attempts2++;

        // вірна відповідь приховується, щоб полегшити гру
        // заміна зображення на картинці
        ImageView imageView1 = (ImageView) findViewById(R.id.co1);
        imageView1.setVisibility(View.INVISIBLE);

        // якщо було 3 спроби в незалежності від того, правильні вони чи ні, відбувається перехід на наступний layout через пів секунди
        if (attempts2 == 2){
            Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                public void run() {
                    // показується layout із завданням
                    setContentView(R.layout.col2_5);

                    // далі відразу через секунду показується layout, де треба вибрати правильний порядок
                    Handler handler = new Handler();
                    handler.postDelayed(new Runnable() {
                        public void run() {
                            setContentView(R.layout.col2_6);
                        }
                    }, 1000);
                }
            }, 500);
        }
    }

    public void col4_2_2(View view) {
        // додаємо кількість загальних спроб
        success++;
        attempts2++;

        // вірна відповідь приховується, щоб полегшити гру
        // заміна зображення на картинці
        ImageView imageView1 = (ImageView) findViewById(R.id.co8);
        imageView1.setVisibility(View.INVISIBLE);

        // якщо було 3 спроби в незалежності від того, правильні вони чи ні, відбувається перехід на наступний layout через пів секунди
        if (attempts2 == 2){
            Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                public void run() {
                    // показується layout із завданням
                    setContentView(R.layout.col2_5);

                    // далі відразу через секунду показується layout, де треба вибрати правильний порядок
                    Handler handler = new Handler();
                    handler.postDelayed(new Runnable() {
                        public void run() {
                            setContentView(R.layout.col2_6);
                        }
                    }, 1000);
                }
            }, 500);
        }
    }

    // помилка

    public void ercol4_2_1(View view) {
        // додаємо кількість загальних спроб
        attempts2++;

        // не вірна відповідь не приховується, щоб полегшити гру

        // якщо було 3 спроби в незалежності від того, правильні вони чи ні, відбувається перехід на наступний layout через пів секунди
        if (attempts2 == 2){
            Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                public void run() {
                    // показується layout із завданням
                    setContentView(R.layout.col2_5);

                    // далі відразу через секунду показується layout, де треба вибрати правильний порядок
                    Handler handler = new Handler();
                    handler.postDelayed(new Runnable() {
                        public void run() {
                            setContentView(R.layout.col2_6);
                        }
                    }, 1000);
                }
            }, 500);
        }
    }

    // 3 завдання

    // вірно

    public void col4_3_1(View view) {
        // додаємо кількість загальних спроб
        success++;
        attempts3++;

        // вірна відповідь приховується, щоб полегшити гру
        // заміна зображення на картинці
        ImageView imageView1 = (ImageView) findViewById(R.id.c2);
        imageView1.setVisibility(View.INVISIBLE);

        // якщо було 3 спроби в незалежності від того, правильні вони чи ні, відбувається перехід на наступний layout через пів секунди
        if (attempts3 == 3){
            Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                public void run() {
                    // показується layout із завданням
                    setContentView(R.layout.col2_s);
                    checkResult();
                }
            }, 500);
        }
    }

    public void col4_3_2(View view) {
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
                    setContentView(R.layout.col2_s);
                    checkResult();
                }
            }, 500);
        }
    }

    public void col4_3_3(View view) {
        // додаємо кількість загальних спроб
        success++;
        attempts3++;

        // вірна відповідь приховується, щоб полегшити гру
        // заміна зображення на картинці
        ImageView imageView1 = (ImageView) findViewById(R.id.c1);
        imageView1.setVisibility(View.INVISIBLE);

        // якщо було 3 спроби в незалежності від того, правильні вони чи ні, відбувається перехід на наступний layout через пів секунди
        if (attempts3 == 3){
            Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                public void run() {
                    // показується layout із завданням
                    setContentView(R.layout.col2_s);
                    checkResult();
                }
            }, 500);
        }
    }

    // помилка

    public void ercol4_3_1(View view) {
        // додаємо кількість загальних спроб
        attempts3++;

        // не вірна відповідь не приховується, щоб полегшити гру

        // якщо було 3 спроби в незалежності від того, правильні вони чи ні, відбувається перехід на наступний layout через пів секунди
        if (attempts3 == 3){
            Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                public void run() {
                    // показується layout із завданням
                    setContentView(R.layout.col2_s);
                    checkResult();
                }
            }, 500);
        }
    }

    // службові кнопки

    // перехід на головну activity
    public void goHome_col_2_1(View view) {
        success = 0;
        attempts1 = 0;
        attempts2 = 0;
        attempts3 = 0;

        Intent questionIntent = new Intent(col2_1.this, MainActivity.class);
        startActivityForResult(questionIntent, 1);
        overridePendingTransition(R.anim.bottom_in, R.anim.top_out);
    }

    // перехід до наступної гри
    public void go_col2_1(View view) {
       Intent questionIntent = new Intent(col2_1.this, col3_1.class);
       startActivityForResult(questionIntent, 1);
       overridePendingTransition(R.anim.bottom_in, R.anim.top_out);
    }

}
