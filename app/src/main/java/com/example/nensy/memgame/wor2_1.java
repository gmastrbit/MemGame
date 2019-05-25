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
import android.widget.EditText;
import android.widget.ImageView;

public class wor2_1 extends AppCompatActivity {

    private int success = 0;

    private static final String USER = "user";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // вибирається початковий layout
        setContentView(R.layout.wor2_1);

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
                setContentView(R.layout.wor2_2);
            }
        }, 1000);
    }

    // перевірка результату

    public void checkResult(){
        if (success > 2 && success < 5){
            ImageView imageView = (ImageView) findViewById(R.id.wor1_star);
            imageView.setImageResource(R.drawable.rate1);

            SharedPreferences sp = getSharedPreferences(USER, Context.MODE_PRIVATE);
            SharedPreferences.Editor e = sp.edit();
            e.putString("rate17", "0");
            e.commit();

        } else if (success > 4 && success < 9) {
            ImageView imageView = (ImageView) findViewById(R.id.wor1_star);
            imageView.setImageResource(R.drawable.rate2);

            SharedPreferences sp = getSharedPreferences(USER, Context.MODE_PRIVATE);
            SharedPreferences.Editor e = sp.edit();
            e.putString("rate17", "5");
            e.commit();

        } else if (success > 8 && success < 13) {
            ImageView imageView = (ImageView) findViewById(R.id.wor1_star);
            imageView.setImageResource(R.drawable.rate3);

            SharedPreferences sp = getSharedPreferences(USER, Context.MODE_PRIVATE);
            SharedPreferences.Editor e = sp.edit();
            e.putString("rate17", "10");
            e.commit();

        }
    }

    // 1 завдання, перевірка

    public void check_wor_2_1(View view) {

        // отримуємо доступ до editText
        EditText wor1 = (EditText) findViewById(R.id.wo1);
        EditText wor2 = (EditText) findViewById(R.id.wo2);
        EditText wor3 = (EditText) findViewById(R.id.wo3);

        String word1 = wor1.getText().toString();
        String word2 = wor2.getText().toString();
        String word3 = wor3.getText().toString();

        // перевірка на вірність слів
        if (word1.equals("дорога")) {
            success++;
            wor1.setTextColor(Color.parseColor("#00ff00"));
        } else {
            wor1.setTextColor(Color.parseColor("#ff0000"));
        }

        if (word2.equals("будинок")) {
            success++;
            wor2.setTextColor(Color.parseColor("#00ff00"));
        } else {
            wor2.setTextColor(Color.parseColor("#ff0000"));
        }

        if (word3.equals("телевізор")) {
            success++;
            wor3.setTextColor(Color.parseColor("#00ff00"));
        } else {
            wor3.setTextColor(Color.parseColor("#ff0000"));
        }

        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            public void run() {
                setContentView(R.layout.wor2_3);

                Handler handler = new Handler();
                handler.postDelayed(new Runnable() {
                    public void run() {
                        setContentView(R.layout.wor2_4);
                    }
                }, 1000);
            }
        }, 500);

    }

    // 2 завдання, перевірка

    public void check_wor_2_2(View view) {

        // отримуємо доступ до editText
        EditText wor4 = (EditText) findViewById(R.id.wo4);
        EditText wor5 = (EditText) findViewById(R.id.wo5);
        EditText wor6 = (EditText) findViewById(R.id.wo6);
        EditText wor7 = (EditText) findViewById(R.id.wo7);

        String word4 = wor4.getText().toString();
        String word5 = wor5.getText().toString();
        String word6 = wor6.getText().toString();
        String word7 = wor7.getText().toString();

        // перевірка на вірність слів
        if (word4.equals("автомобіль")) {
            success++;
            wor4.setTextColor(Color.parseColor("#00ff00"));
        } else {
            wor4.setTextColor(Color.parseColor("#ff0000"));
        }

        if (word5.equals("пісок")) {
            success++;
            wor5.setTextColor(Color.parseColor("#00ff00"));
        } else {
            wor5.setTextColor(Color.parseColor("#ff0000"));
        }

        if (word6.equals("море")) {
            success++;
            wor6.setTextColor(Color.parseColor("#00ff00"));
        } else {
            wor6.setTextColor(Color.parseColor("#ff0000"));
        }

        if (word7.equals("скло")) {
            success++;
            wor7.setTextColor(Color.parseColor("#00ff00"));
        } else {
            wor7.setTextColor(Color.parseColor("#ff0000"));
        }

        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            public void run() {
                setContentView(R.layout.wor2_5);

                Handler handler = new Handler();
                handler.postDelayed(new Runnable() {
                    public void run() {
                        setContentView(R.layout.wor2_6);
                    }
                }, 1000);
            }
        }, 500);
    }

    // 3 завдання, перевірка

    public void check_wor_2_3(View view) {

        // отримуємо доступ до editText
        EditText wor8 = (EditText) findViewById(R.id.wo8);
        EditText wor9 = (EditText) findViewById(R.id.wo9);
        EditText wor10 = (EditText) findViewById(R.id.wo10);
        EditText wor11 = (EditText) findViewById(R.id.wo11);
        EditText wor12 = (EditText) findViewById(R.id.wo12);

        String word8 = wor8.getText().toString();
        String word9 = wor9.getText().toString();
        String word10 = wor10.getText().toString();
        String word11 = wor11.getText().toString();
        String word12 = wor12.getText().toString();

        // перевірка на вірність слів
        if (word8.equals("ліжко")) {
            success++;
            wor8.setTextColor(Color.parseColor("#00ff00"));
        } else {
            wor8.setTextColor(Color.parseColor("#ff0000"));
        }

        if (word9.equals("сонце")) {
            success++;
            wor9.setTextColor(Color.parseColor("#00ff00"));
        } else {
            wor9.setTextColor(Color.parseColor("#ff0000"));
        }

        if (word10.equals("робота")) {
            success++;
            wor10.setTextColor(Color.parseColor("#00ff00"));
        } else {
            wor10.setTextColor(Color.parseColor("#ff0000"));
        }

        if (word11.equals("слово")) {
            success++;
            wor11.setTextColor(Color.parseColor("#00ff00"));
        } else {
            wor11.setTextColor(Color.parseColor("#ff0000"));
        }

        if (word12.equals("крісло")) {
            success++;
            wor12.setTextColor(Color.parseColor("#00ff00"));
        } else {
            wor12.setTextColor(Color.parseColor("#ff0000"));
        }

        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            public void run() {
                setContentView(R.layout.wor2_s);
                checkResult();
            }
        }, 500);
    }

    // службові кнопки

    // перехід на головну activity
    public void goHome_wor2_1_1(View view) {
        success = 0;

        Intent questionIntent = new Intent(wor2_1.this, MainActivity.class);
        startActivityForResult(questionIntent, 1);
        overridePendingTransition(R.anim.bottom_in, R.anim.top_out);
    }

    // перехід до наступної гри
    public void go_wor2_1(View view) {
        Intent questionIntent = new Intent(wor2_1.this, wor3_1.class);
        startActivityForResult(questionIntent, 1);
        overridePendingTransition(R.anim.bottom_in, R.anim.top_out);
    }
}
