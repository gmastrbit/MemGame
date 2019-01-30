package com.example.nensy.memgame;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;

public class ListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // вибирається початковий layout
        setContentView(R.layout.activity_list);

        // приховує статус бар:
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        // приховує ActionBar:
        getSupportActionBar().hide();
        // орієнтація екрана:
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
    }

    public void go_volume_1(View view){
        // перехід на першу гру першого розділа з анімацією
        Intent questionIntent = new Intent(ListActivity.this, moz1_1.class);
        startActivityForResult(questionIntent, 1);
        overridePendingTransition(R.anim.bottom_in, R.anim.top_out);
    }

    public void go_volume_2(View view){
        // перехід на першу гру другого розділа з анімацією
        Intent questionIntent = new Intent(ListActivity.this, vih1_1.class);
        startActivityForResult(questionIntent, 1);
        overridePendingTransition(R.anim.bottom_in, R.anim.top_out);
    }

    public void go_volume_3(View view){
        // перехід на першу гру третього розділа з анімацією
        Intent questionIntent = new Intent(ListActivity.this, por1_1.class);
        startActivityForResult(questionIntent, 1);
        overridePendingTransition(R.anim.bottom_in, R.anim.top_out);
    }

    public void go_volume_4(View view){
        // перехід на першу гру четвертого розділа з анімацією
        Intent questionIntent = new Intent(ListActivity.this, col1_1.class);
        startActivityForResult(questionIntent, 1);
        overridePendingTransition(R.anim.bottom_in, R.anim.top_out);
    }


}