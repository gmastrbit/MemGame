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

public class wor3_1 extends AppCompatActivity {

    private int success = 0;

    private static final String USER = "user";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // вибирається початковий layout
        setContentView(R.layout.wor3_1);

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
                setContentView(R.layout.wor3_2);
            }
        }, 1000);
    }

    // перевірка результату

    public void checkResult(){

        SharedPreferences sp = getSharedPreferences(USER, Context.MODE_PRIVATE);

        if (success > 2 && success < 5){

            SharedPreferences.Editor e = sp.edit();
            e.putString("rate18", "0");
            e.commit();

        } else if (success > 4 && success < 9) {

            SharedPreferences.Editor e = sp.edit();
            e.putString("rate18", "5");
            e.commit();

        } else if (success > 8 && success < 13) {

            SharedPreferences.Editor e = sp.edit();
            e.putString("rate18", "10");
            e.commit();
        }

        String rate16 = sp.getString("rate16", "0");
        String rate17 = sp.getString("rate17", "0");
        String rate18 = sp.getString("rate18", "0");

        int tempRate16 = Integer.parseInt(rate16);
        int tempRate17 = Integer.parseInt(rate17);
        int tempRate18 = Integer.parseInt(rate18);

        int sum = tempRate16 + tempRate17 + tempRate18;

        if (sum == 0 || sum < 11) {
            ImageView imageView = (ImageView) findViewById(R.id.wor1_star);
            imageView.setImageResource(R.drawable.rate1);
        } else if (sum > 10 && sum < 21){
            ImageView imageView = (ImageView) findViewById(R.id.wor1_star);
            imageView.setImageResource(R.drawable.rate2);
        } else if (sum > 19 && sum < 31){
            ImageView imageView = (ImageView) findViewById(R.id.wor1_star);
            imageView.setImageResource(R.drawable.rate3);
        }
    }

    // 1 завдання, перевірка

    public void check_wor_3_1(View view) {

        // отримуємо доступ до editText
        EditText wor1 = (EditText) findViewById(R.id.w1);
        EditText wor2 = (EditText) findViewById(R.id.w2);
        EditText wor3 = (EditText) findViewById(R.id.w3);

        String word1 = wor1.getText().toString();
        String word2 = wor2.getText().toString();
        String word3 = wor3.getText().toString();

        // перевірка на вірність слів
        if (word1.equals("квітка")) {
            success++;
            wor1.setTextColor(Color.parseColor("#00ff00"));
        } else {
            success--;
            wor1.setTextColor(Color.parseColor("#ff0000"));
        }

        if (word2.equals("сад")) {
            success++;
            wor2.setTextColor(Color.parseColor("#00ff00"));
        } else {
            success--;
            wor2.setTextColor(Color.parseColor("#ff0000"));
        }

        if (word3.equals("дерево")) {
            success++;
            wor3.setTextColor(Color.parseColor("#00ff00"));
        } else {
            success--;
            wor3.setTextColor(Color.parseColor("#ff0000"));
        }

        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            public void run() {
                setContentView(R.layout.wor3_3);

                Handler handler = new Handler();
                handler.postDelayed(new Runnable() {
                    public void run() {
                        setContentView(R.layout.wor3_4);
                    }
                }, 1000);
            }
        }, 500);

    }

    // 2 завдання, перевірка

    public void check_wor_3_2(View view) {

        // отримуємо доступ до editText
        EditText wor4 = (EditText) findViewById(R.id.w4);
        EditText wor5 = (EditText) findViewById(R.id.w5);
        EditText wor6 = (EditText) findViewById(R.id.w6);
        EditText wor7 = (EditText) findViewById(R.id.w7);

        String word4 = wor4.getText().toString();
        String word5 = wor5.getText().toString();
        String word6 = wor6.getText().toString();
        String word7 = wor7.getText().toString();

        // перевірка на вірність слів
        if (word4.equals("аптека")) {
            success++;
            wor4.setTextColor(Color.parseColor("#00ff00"));
        } else {
            success--;
            wor4.setTextColor(Color.parseColor("#ff0000"));
        }

        if (word5.equals("магазин")) {
            success++;
            wor5.setTextColor(Color.parseColor("#00ff00"));
        } else {
            success--;
            wor5.setTextColor(Color.parseColor("#ff0000"));
        }

        if (word6.equals("одяг")) {
            success++;
            wor6.setTextColor(Color.parseColor("#00ff00"));
        } else {
            success--;
            wor6.setTextColor(Color.parseColor("#ff0000"));
        }

        if (word7.equals("взуття")) {
            success++;
            wor7.setTextColor(Color.parseColor("#00ff00"));
        } else {
            success--;
            wor7.setTextColor(Color.parseColor("#ff0000"));
        }

        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            public void run() {
                setContentView(R.layout.wor3_5);

                Handler handler = new Handler();
                handler.postDelayed(new Runnable() {
                    public void run() {
                        setContentView(R.layout.wor3_6);
                    }
                }, 1000);
            }
        }, 500);
    }


    // 3 завдання, перевірка

    public void check_wor_3_3(View view) {

        // отримуємо доступ до editText
        EditText wor8 = (EditText) findViewById(R.id.w8);
        EditText wor9 = (EditText) findViewById(R.id.w9);
        EditText wor10 = (EditText) findViewById(R.id.w10);
        EditText wor11 = (EditText) findViewById(R.id.w11);
        EditText wor12 = (EditText) findViewById(R.id.w12);

        String word8 = wor8.getText().toString();
        String word9 = wor9.getText().toString();
        String word10 = wor10.getText().toString();
        String word11 = wor11.getText().toString();
        String word12 = wor12.getText().toString();

        // перевірка на вірність слів
        if (word8.equals("футбол")) {
            success++;
            wor8.setTextColor(Color.parseColor("#00ff00"));
        } else {
            success--;
            wor8.setTextColor(Color.parseColor("#ff0000"));
        }

        if (word9.equals("волейбол")) {
            success++;
            wor9.setTextColor(Color.parseColor("#00ff00"));
        } else {
            success--;
            wor9.setTextColor(Color.parseColor("#ff0000"));
        }

        if (word10.equals("гол")) {
            success++;
            wor10.setTextColor(Color.parseColor("#00ff00"));
        } else {
            success--;
            wor10.setTextColor(Color.parseColor("#ff0000"));
        }

        if (word11.equals("рибалка")) {
            success++;
            wor11.setTextColor(Color.parseColor("#00ff00"));
        } else {
            success--;
            wor11.setTextColor(Color.parseColor("#ff0000"));
        }

        if (word12.equals("стадіон")) {
            success++;
            wor12.setTextColor(Color.parseColor("#00ff00"));
        } else {
            success--;
            wor12.setTextColor(Color.parseColor("#ff0000"));
        }

        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            public void run() {
                setContentView(R.layout.wor3_s);
                checkResult();
                success = 0;
            }
        }, 500);
    }

    // службові кнопки

    // перехід на головну activity
    public void goHome_wor3_1_1(View view) {
        success = 0;

        Intent questionIntent = new Intent(wor3_1.this, MainActivity.class);
        startActivityForResult(questionIntent, 1);
        overridePendingTransition(R.anim.bottom_in, R.anim.top_out);
    }

    public void go_list_wor3_1(View view) {
        success = 0;
        Intent questionIntent = new Intent(wor3_1.this, ListActivity.class);
        startActivityForResult(questionIntent, 1);
        overridePendingTransition(R.anim.bottom_in, R.anim.top_out);
    }

}
