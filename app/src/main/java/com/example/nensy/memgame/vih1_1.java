package com.example.nensy.memgame;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;

public class vih1_1 extends AppCompatActivity {

    // змінна для підрахунку успішних спроб
    private int success = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // вибирається початковий layout
        setContentView(R.layout.vih1_1);

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
                setContentView(R.layout.vih1_2);
            }
        }, 1000);
    }

    // метод для перевірки результату

    public void checkResult(){
        if (success > 0 && success < 2){
            ImageView imageView = (ImageView) findViewById(R.id.vih11);
            imageView.setImageResource(R.drawable.rate1);
        } else if (success == 2) {
            ImageView imageView = (ImageView) findViewById(R.id.vih11);
            imageView.setImageResource(R.drawable.rate2);
        } else if (success == 3) {
            ImageView imageView = (ImageView) findViewById(R.id.vih11);
            imageView.setImageResource(R.drawable.rate3);
        }
    }

    // правильно

    public void go_vih1_3(View view) {
        // при правильній відповіді, змінна успіху збільшується
        success++;
        // відразу змінюється layout
        setContentView(R.layout.vih1_3);
    }

    public void go_vih1_4(View view) {
        success++;
        setContentView(R.layout.vih1_4);
    }

    public void go_vih1_s(View view) {
        success++;
        setContentView(R.layout.vih1_s);
        checkResult();
    }

    // не правильно

    public void error1_1(View view) {
        // при не вірній відповіді просто замінюється layout
        setContentView(R.layout.vih1_3);
    }

    public void error2_1(View view) {
        setContentView(R.layout.vih1_4);
    }

    public void error2_2(View view) {
        setContentView(R.layout.vih1_4);
    }

    public void error3_1(View view) {
        setContentView(R.layout.vih1_s);
        // в останній грі змінюється layout і відбувається перевірка результату
        checkResult();
    }

    public void error3_2(View view) {
        setContentView(R.layout.vih1_s);
        // в останній грі змінюється layout і відбувається перевірка результату
        checkResult();
    }

    public void error3_3(View view) {
        setContentView(R.layout.vih1_s);
        // в останній грі змінюється layout і відбувається перевірка результату
        checkResult();
    }

    // службові кнопки

    // перехід до наступної гри
    public void go_list_vih2_1(View view) {
        Intent questionIntent = new Intent(vih1_1.this, vih2_1.class);
        startActivityForResult(questionIntent, 1);
        overridePendingTransition(R.anim.bottom_in, R.anim.top_out);
    }

    // перехід на головну activity
    public void goHome_vih1_1(View view) {
        success = 0;

        Intent questionIntent = new Intent(vih1_1.this, MainActivity.class);
        startActivityForResult(questionIntent, 1);
        overridePendingTransition(R.anim.bottom_in, R.anim.top_out);
    }
}
