package com.example.nensy.memgame;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.graphics.Color;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.EditText;
import android.widget.ImageView;

public class num2_1 extends AppCompatActivity {

    private int success = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // вибирається початковий layout
        setContentView(R.layout.num2_1);

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
                setContentView(R.layout.num2_2);
            }
        }, 1000);
    }

    // перевірка результату

    public void checkResult(){
        if (success > 2 && success < 5){
            ImageView imageView = (ImageView) findViewById(R.id.num2_star);
            imageView.setImageResource(R.drawable.rate1);
        } else if (success > 4 && success < 9) {
            ImageView imageView = (ImageView) findViewById(R.id.num2_star);
            imageView.setImageResource(R.drawable.rate2);
        } else if (success > 8 && success < 13) {
            ImageView imageView = (ImageView) findViewById(R.id.num2_star);
            imageView.setImageResource(R.drawable.rate3);
        }
    }

    // 1 завдання, перевірка

    public void check_num_2_1(View view) {

        // отримуємо доступ до editText
        EditText num1 = (EditText) findViewById(R.id.nu1);
        EditText num2 = (EditText) findViewById(R.id.nu2);
        EditText num3 = (EditText) findViewById(R.id.nu3);

        String numb1 = num1.getText().toString();
        String numb2 = num2.getText().toString();
        String numb3 = num3.getText().toString();

        // перевірка на вірність слів
        if (numb1.equals("9")) {
            success++;
            num1.setTextColor(Color.parseColor("#00ff00"));
        } else {
            num1.setTextColor(Color.parseColor("#ff0000"));
        }

        if (numb2.equals("2")) {
            success++;
            num2.setTextColor(Color.parseColor("#00ff00"));
        } else {
            num2.setTextColor(Color.parseColor("#ff0000"));
        }

        if (numb3.equals("4")) {
            success++;
            num3.setTextColor(Color.parseColor("#00ff00"));
        } else {
            num3.setTextColor(Color.parseColor("#ff0000"));
        }

        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            public void run() {
                setContentView(R.layout.num2_3);

                Handler handler = new Handler();
                handler.postDelayed(new Runnable() {
                    public void run() {
                        setContentView(R.layout.num2_4);
                    }
                }, 1000);
            }
        }, 500);
    }

       // 2 завдання, перевірка

    public void check_num_2_2(View view) {

        // отримуємо доступ до editText
        EditText num4 = (EditText) findViewById(R.id.nu4);
        EditText num5 = (EditText) findViewById(R.id.nu5);
        EditText num6 = (EditText) findViewById(R.id.nu6);

        String numb4 = num4.getText().toString();
        String numb5 = num5.getText().toString();
        String numb6 = num6.getText().toString();

        // перевірка на вірність слів
        if (numb4.equals("6")) {
            success++;
            num4.setTextColor(Color.parseColor("#00ff00"));
        } else {
            num4.setTextColor(Color.parseColor("#ff0000"));
        }

        if (numb5.equals("7")) {
            success++;
            num5.setTextColor(Color.parseColor("#00ff00"));
        } else {
            num5.setTextColor(Color.parseColor("#ff0000"));
        }

        if (numb6.equals("3")) {
            success++;
            num6.setTextColor(Color.parseColor("#00ff00"));
        } else {
            num6.setTextColor(Color.parseColor("#ff0000"));
        }

        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            public void run() {
                setContentView(R.layout.num2_5);

                Handler handler = new Handler();
                handler.postDelayed(new Runnable() {
                    public void run() {
                        setContentView(R.layout.num2_6);
                    }
                }, 1000);
            }
        }, 500);
    }

    // 3 завдання, перевірка

    public void check_num_2_3(View view) {

        // отримуємо доступ до editText
        EditText num7 = (EditText) findViewById(R.id.nu7);
        EditText num8 = (EditText) findViewById(R.id.nu8);
        EditText num9 = (EditText) findViewById(R.id.nu9);

        String numb7 = num7.getText().toString();
        String numb8 = num8.getText().toString();
        String numb9 = num9.getText().toString();

        // перевірка на вірність слів
        if (numb7.equals("7")) {
            success++;
            num7.setTextColor(Color.parseColor("#00ff00"));
        } else {
            num7.setTextColor(Color.parseColor("#ff0000"));
        }

        if (numb8.equals("2")) {
            success++;
            num8.setTextColor(Color.parseColor("#00ff00"));
        } else {
            num8.setTextColor(Color.parseColor("#ff0000"));
        }

        if (numb9.equals("4")) {
            success++;
            num9.setTextColor(Color.parseColor("#00ff00"));
        } else {
            num9.setTextColor(Color.parseColor("#ff0000"));
        }

        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            public void run() {
                setContentView(R.layout.num2_s);
                checkResult();
            }
        }, 500);
    }

    // службові кнопки

    // перехід на головну activity

    public void goHome_num2_1_1(View view) {
        success = 0;

        Intent questionIntent = new Intent(num2_1.this, MainActivity.class);
        startActivityForResult(questionIntent, 1);
        overridePendingTransition(R.anim.bottom_in, R.anim.top_out);
    }

    // перехід до наступної гри
    public void go_num3_1(View view) {
         Intent questionIntent = new Intent(num2_1.this, num3_1.class);
         startActivityForResult(questionIntent, 1);
         overridePendingTransition(R.anim.bottom_in, R.anim.top_out);
    }
}
