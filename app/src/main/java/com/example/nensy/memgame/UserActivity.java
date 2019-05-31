package com.example.nensy.memgame;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.EditText;
import android.widget.Toast;

public class UserActivity extends AppCompatActivity {

    // змінні для визначення назви файлів, де будуть зберігатися дані
    private static final String USER = "user";
    public static final String APP_PREFERENCES = "mysettings";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // вибирається початковий layout
        setContentView(R.layout.activity_user);

        // приховує статус бар:
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        // приховує ActionBar:
        getSupportActionBar().hide();
        // орієнтація екрана:
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        // збереження попередніх данних

        // отримання доступу до сховища даних
        SharedPreferences sp = getSharedPreferences(USER, Context.MODE_PRIVATE);

        if (sp.getString("userName", "none") != "none"){
            // отримання ніку попереднього користувача
            String nick = sp.getString("userName", "none");

            // отримання рейтингу попереднього користувача за:

            // 1 гра (1, 2 і 3 завдання)
            String rate1 = sp.getString("rate1", "0");
            String rate2 = sp.getString("rate2", "0");
            String rate3 = sp.getString("rate3", "0");

            // 2 гра (1, 2 і 3 завдання)
            String rate4 = sp.getString("rate4", "0");
            String rate5 = sp.getString("rate5", "0");
            String rate6 = sp.getString("rate6", "0");

            // 3 гра (1, 2 і 3 завдання)
            String rate7 = sp.getString("rate7", "0");
            String rate8 = sp.getString("rate8", "0");
            String rate9 = sp.getString("rate9", "0");

            // 4 гра (1, 2 і 3 завдання)
            String rate10 = sp.getString("rate10", "0");
            String rate11 = sp.getString("rate11", "0");
            String rate12 = sp.getString("rate12", "0");

            // 5 гра (1, 2 і 3 завдання)
            String rate13 = sp.getString("rate13", "0");
            String rate14 = sp.getString("rate14", "0");
            String rate15 = sp.getString("rate15", "0");

            // 5 гра (1, 2 і 3 завдання)
            String rate16 = sp.getString("rate16", "0");
            String rate17 = sp.getString("rate17", "0");
            String rate18 = sp.getString("rate18", "0");

            // отримуємо дані рейтинга в змінні

            // 1 гра (1, 2 і 3 завдання)
            int tempRate1 = Integer.parseInt(rate1);
            int tempRate2 = Integer.parseInt(rate2);
            int tempRate3 = Integer.parseInt(rate3);

            // 2 гра (1, 2 і 3 завдання)
            int tempRate4 = Integer.parseInt(rate4);
            int tempRate5 = Integer.parseInt(rate5);
            int tempRate6 = Integer.parseInt(rate6);

            // 3 гра (1, 2 і 3 завдання)
            int tempRate7 = Integer.parseInt(rate7);
            int tempRate8 = Integer.parseInt(rate8);
            int tempRate9 = Integer.parseInt(rate9);

            // 4 гра (1, 2 і 3 завдання)
            int tempRate10 = Integer.parseInt(rate10);
            int tempRate11 = Integer.parseInt(rate11);
            int tempRate12 = Integer.parseInt(rate12);

            // 5 гра (1, 2 і 3 завдання)
            int tempRate13 = Integer.parseInt(rate13);
            int tempRate14 = Integer.parseInt(rate14);
            int tempRate15 = Integer.parseInt(rate15);

            // 6 гра (1, 2 і 3 завдання)
            int tempRate16 = Integer.parseInt(rate16);
            int tempRate17 = Integer.parseInt(rate17);
            int tempRate18 = Integer.parseInt(rate18);

            // отримуємо суми рейтингів за всі завдання і формуємо рейтинг
            int tempRateGame1 = tempRate1 + tempRate2 + tempRate3;
            int tempRateGame2 = tempRate4 + tempRate5 + tempRate6;
            int tempRateGame3 = tempRate7 + tempRate8 + tempRate9;
            int tempRateGame4 = tempRate10 + tempRate11 + tempRate12;
            int tempRateGame5 = tempRate13 + tempRate14 + tempRate15;
            int tempRateGame6 = tempRate16 + tempRate17 + tempRate18;

            // формуємо текстові змінні для виведення рейтингу
            String game1 = Integer.toString(tempRateGame1);
            String game2 = Integer.toString(tempRateGame2);
            String game3 = Integer.toString(tempRateGame3);
            String game4 = Integer.toString(tempRateGame4);
            String game5 = Integer.toString(tempRateGame5);
            String game6 = Integer.toString(tempRateGame6);

            // формування результатів рейтингу
            String result;
            result = nick + " — " + game1 + " / " + game2 + " / " + game3 + " / " + game4 + " / " + game5 + " / " + game6 + "\n";

            // дописування до попередніх даних інформацію про попереднього користувача
            SharedPreferences sp2 = getSharedPreferences(APP_PREFERENCES, Context.MODE_PRIVATE);
            SharedPreferences.Editor e = sp2.edit();
            String myResult = sp2.getString("oldData", "");
            myResult = myResult + result;
            e.putString("oldData", myResult);
            e.commit();
        }

        // обнулення всіх попередніх даних

        // отримання доступу до сховища даних
        SharedPreferences sp3 = getSharedPreferences(USER, Context.MODE_PRIVATE);
        SharedPreferences.Editor e1 = sp3.edit();

        e1.putString("rate1", "0");
        e1.putString("rate2", "0");
        e1.putString("rate3", "0");
        e1.putString("rate4", "0");
        e1.putString("rate5", "0");
        e1.putString("rate6", "0");
        e1.putString("rate7", "0");
        e1.putString("rate8", "0");
        e1.putString("rate9", "0");
        e1.putString("rate10", "0");
        e1.putString("rate11", "0");
        e1.putString("rate12", "0");
        e1.putString("rate13", "0");
        e1.putString("rate14", "0");
        e1.putString("rate15", "0");
        e1.putString("rate16", "0");
        e1.putString("rate17", "0");
        e1.putString("rate18", "0");
        e1.commit();
    }

    // збереження нового користувача
    public void save(View view){
        // збереження нового користувача
        SharedPreferences sp = getSharedPreferences(USER, Context.MODE_PRIVATE);

        // отримання введених даних
        EditText userNameLogin = (EditText) findViewById(R.id.editText);
        userNameLogin.clearFocus();
        String userName = userNameLogin.getText().toString();

        // перевірка введених даних
        if (userName.isEmpty()){
            Toast toast = Toast.makeText(UserActivity.this, "Введіть свій нік! ", Toast.LENGTH_SHORT);
            toast.show();
        } else {
            if (userName.length() >= 15 ){
                Toast toast = Toast.makeText(UserActivity.this, "Введіть коротший нік", Toast.LENGTH_SHORT);
                toast.show();
            } else {
                // збереження нового користувача
                SharedPreferences.Editor e = sp.edit();
                e.putString("userName", userName);
                e.commit();

                // виведення повідомлення про результат
                Toast toast = Toast.makeText(UserActivity.this, "Нік " + userName + " збережено!", Toast.LENGTH_SHORT);
                toast.show();

                // перехід на список ігор з анімацією:
                Intent questionIntent = new Intent(UserActivity.this, MainActivity.class);
                startActivityForResult(questionIntent, 1);
                overridePendingTransition(R.anim.right_in, R.anim.left_out);
            }
        }
    }
}