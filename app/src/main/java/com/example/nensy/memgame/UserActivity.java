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

    private static final String USER = "user";

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
    }

    public void save(View view){
        SharedPreferences sp = getSharedPreferences(USER, Context.MODE_PRIVATE);

        EditText userNameLogin = (EditText) findViewById(R.id.editText);
        userNameLogin.clearFocus();
        String userName = userNameLogin.getText().toString();

        if (userName.isEmpty()){
            Toast toast = Toast.makeText(UserActivity.this, "Введіть свій нік! ", Toast.LENGTH_SHORT);
            toast.show();
        } else {
            if (userName.length() >= 15 ){
                Toast toast = Toast.makeText(UserActivity.this, "Введіть коротший нік", Toast.LENGTH_SHORT);
                toast.show();
            } else {

                SharedPreferences.Editor e = sp.edit();
                e.putString("userName", userName);
                e.commit();

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