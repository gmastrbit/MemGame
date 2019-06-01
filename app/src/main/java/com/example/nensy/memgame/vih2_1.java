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

public class vih2_1 extends AppCompatActivity {

    // змінна для підрахунку успішних спроб
    private int success = 0;

    // змінна для визначення назви файлу, де будуть зберігатися дані
    private static final String USER = "user";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // вибирається початковий layout
        setContentView(R.layout.vih2_1);

        // приховує статус бар:
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        // приховує ActionBar:
        getSupportActionBar().hide();
        // орієнтація екрана:
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            public void run() {
                setContentView(R.layout.vih2_2);
            }
        }, 1000);
    }

    // результат

    public void checkResult(){
        // отримання доступу до сховища даних
        SharedPreferences sp = getSharedPreferences(USER, Context.MODE_PRIVATE);
        if (success > -1 && success < 2){
            // записування результату гри
            SharedPreferences.Editor e = sp.edit();
            e.putString("rate5", "0");
            e.commit();
        } else if (success == 2) {
            // записування результату гри
            SharedPreferences.Editor e = sp.edit();
            e.putString("rate5", "5");
            e.commit();
        } else if (success == 3) {
            // записування результату гри
            SharedPreferences.Editor e = sp.edit();
            e.putString("rate5", "10");
            e.commit();
        }
    }

    // правильно

    public void go_vih2_3(View view) {
        // при правильній відповіді, змінна успіху збільшується
        success++;

        // відразу змінюється layout
        setContentView(R.layout.vih2_3);
    }

    public void go_vih2_4(View view) {
        // при правильній відповіді, змінна успіху збільшується
        success++;

        // відразу змінюється layout
        setContentView(R.layout.vih2_4);
    }

    public void go_vih2_s(View view) {
        // при правильній відповіді, змінна успіху збільшується
        success++;

        // перевіряємо результат
        checkResult();

        // очистка лічильників
        success = 0;

        Intent questionIntent = new Intent(vih2_1.this, vih3_1.class);
        startActivityForResult(questionIntent, 1);
        overridePendingTransition(R.anim.bottom_in, R.anim.top_out);
    }

    // не правильно

    public void error_vih_2_1_1(View view) {
        // при не вірній відповіді просто замінюється layout
        setContentView(R.layout.vih2_3);
    }

    public void error_vih_2_1_2(View view) {
        // при не вірній відповіді просто замінюється layout
        setContentView(R.layout.vih2_3);
    }

    public void error_vih_2_1_3(View view) {
        // при не вірній відповіді просто замінюється layout
        setContentView(R.layout.vih2_4);
    }

    public void error_vih_2_1_4(View view) {
        // при не вірній відповіді просто замінюється layout
        setContentView(R.layout.vih2_4);
    }

    public void error_vih_2_1_5(View view) {
        // при не вірній відповіді просто замінюється layout
        setContentView(R.layout.vih2_4);
    }

    public void error_vih_2_1_6(View view) {
        // перевіряємо результат
        checkResult();

        // очистка лічильників
        success = 0;

        Intent questionIntent = new Intent(vih2_1.this, vih3_1.class);
        startActivityForResult(questionIntent, 1);
        overridePendingTransition(R.anim.bottom_in, R.anim.top_out);
    }

    public void error_vih_2_1_7(View view) {
        // перевіряємо результат
        checkResult();

        // очистка лічильників
        success = 0;

        Intent questionIntent = new Intent(vih2_1.this, vih3_1.class);
        startActivityForResult(questionIntent, 1);
        overridePendingTransition(R.anim.bottom_in, R.anim.top_out);
    }

    public void error_vih_2_1_8(View view) {
        // перевіряємо результат
        checkResult();

        // очистка лічильників
        success = 0;

        Intent questionIntent = new Intent(vih2_1.this, vih3_1.class);
        startActivityForResult(questionIntent, 1);
        overridePendingTransition(R.anim.bottom_in, R.anim.top_out);
    }

    public void error_vih_2_1_9(View view) {
        // перевіряємо результат
        checkResult();

        // очистка лічильників
        success = 0;

        Intent questionIntent = new Intent(vih2_1.this, vih3_1.class);
        startActivityForResult(questionIntent, 1);
        overridePendingTransition(R.anim.bottom_in, R.anim.top_out);
    }

    // службові кнопки

    public void goHome_vih2_1(View view) {
        // очистка лічильників
        success = 0;

        Intent questionIntent = new Intent(vih2_1.this, MainActivity.class);
        startActivityForResult(questionIntent, 1);
        overridePendingTransition(R.anim.bottom_in, R.anim.top_out);
    }
}