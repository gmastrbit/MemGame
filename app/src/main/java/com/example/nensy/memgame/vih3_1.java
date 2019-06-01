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

public class vih3_1 extends AppCompatActivity {

    // змінна для відслідковування успішних спроб і спроб взагалі
    private int success = 0;

    // змінна для визначення назви файлу, де будуть зберігатися дані
    private static final String USER = "user";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // вибирається початковий layout
        setContentView(R.layout.vih3_1);

        // приховує статус бар:
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        // приховує ActionBar:
        getSupportActionBar().hide();
        // орієнтація екрана:
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            public void run() {
                setContentView(R.layout.vih3_2);
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
            e.putString("rate6", "0");
            e.commit();
        } else if (success == 2) {
            // записування результату гри
            SharedPreferences.Editor e = sp.edit();
            e.putString("rate6", "5");
            e.commit();
        } else if (success == 3) {
            // записування результату гри
            SharedPreferences.Editor e = sp.edit();
            e.putString("rate6", "10");
            e.commit();
        }

        // отримування даних про результат трьох ігор
        String rate4 = sp.getString("rate4", "0");
        String rate5 = sp.getString("rate5", "0");
        String rate6 = sp.getString("rate6", "0");

        // переведення результатів в цілочисельний тип
        int tempRate4 = Integer.parseInt(rate4);
        int tempRate5 = Integer.parseInt(rate5);
        int tempRate6 = Integer.parseInt(rate6);

        // сума всіх успішних відповідей
        int sum = tempRate4 + tempRate5 + tempRate6;

        if (sum == 0 || sum < 11) {
            ImageView imageView = (ImageView) findViewById(R.id.v19);
            imageView.setImageResource(R.drawable.rate1);
        } else if (sum > 10 && sum < 21){
            ImageView imageView = (ImageView) findViewById(R.id.v19);
            imageView.setImageResource(R.drawable.rate2);
        } else if (sum > 19 && sum < 31){
            ImageView imageView = (ImageView) findViewById(R.id.v19);
            imageView.setImageResource(R.drawable.rate3);
        }
    }

    // правильно

    public void go_vih3_3(View view) {
        // при правильній відповіді, змінна успіху збільшується
        success++;

        // відразу змінюється layout
        setContentView(R.layout.vih3_3);
    }

    public void go_vih3_4(View view) {
        // при правильній відповіді, змінна успіху збільшується
        success++;

        // відразу змінюється layout
        setContentView(R.layout.vih3_4);
    }

    public void go_vih3_s(View view) {
        // при правильній відповіді, змінна успіху збільшується
        success++;

        // відразу змінюється layout
        setContentView(R.layout.vih3_s);

        // перевіряємо результат
        checkResult();

        // очистка лічильників
        success = 0;
    }

    // не правильно

    public void error_vih_3_1_1(View view) {
        // при не вірній відповіді просто замінюється layout
        setContentView(R.layout.vih3_3);
    }

    public void error_vih_3_1_2(View view) {
        // при не вірній відповіді просто замінюється layout
        setContentView(R.layout.vih3_3);
    }

    public void error_vih_3_1_3(View view) {
        // при не вірній відповіді просто замінюється layout
        setContentView(R.layout.vih3_3);
    }

    public void error_vih_3_1_4(View view) {
        // при не вірній відповіді просто замінюється layout
        setContentView(R.layout.vih3_4);
    }

    public void error_vih_3_1_5(View view) {
        // при не вірній відповіді просто замінюється layout
        setContentView(R.layout.vih3_4);
    }

    public void error_vih_3_1_6(View view) {
        // при не вірній відповіді просто замінюється layout
        setContentView(R.layout.vih3_4);
    }

    public void error_vih_3_1_7(View view) {
        // при не вірній відповіді просто замінюється layout
        setContentView(R.layout.vih3_4);
    }

    public void error_vih_3_1_8(View view) {
        // при не вірній відповіді просто замінюється layout
        setContentView(R.layout.vih3_s);

        // перевіряємо результат
        checkResult();

        // очистка лічильників
        success = 0;
    }

    public void error_vih_3_1_9(View view) {
        // при не вірній відповіді просто замінюється layout
        setContentView(R.layout.vih3_s);

        // перевіряємо результат
        checkResult();

        // очистка лічильників
        success = 0;
    }

    public void error_vih_3_1_10(View view) {
        // при не вірній відповіді просто замінюється layout
        setContentView(R.layout.vih3_s);

        // перевіряємо результат
        checkResult();

        // очистка лічильників
        success = 0;
    }

    public void error_vih_3_1_11(View view) {
        // при не вірній відповіді просто замінюється layout
        setContentView(R.layout.vih3_s);

        // перевіряємо результат
        checkResult();

        // очистка лічильників
        success = 0;
    }

    public void error_vih_3_1_12(View view) {
        // при не вірній відповіді просто замінюється layout
        setContentView(R.layout.vih3_s);

        // перевіряємо результат
        checkResult();

        // очистка лічильників
        success = 0;
    }

    // службові кнопки

    // перехід на головну activity
    public void goHome_vih3_1(View view) {
        // очистка лічильників
        success = 0;

        // перехід на головну з анімацією
        Intent questionIntent = new Intent(vih3_1.this, MainActivity.class);
        startActivityForResult(questionIntent, 1);
        overridePendingTransition(R.anim.bottom_in, R.anim.top_out);
    }

    // перехід до списку ігор
    public void go_list_vih3_1(View view) {
        Intent questionIntent = new Intent(vih3_1.this, ListActivity.class);
        startActivityForResult(questionIntent, 1);
        overridePendingTransition(R.anim.bottom_in, R.anim.top_out);
    }
}
