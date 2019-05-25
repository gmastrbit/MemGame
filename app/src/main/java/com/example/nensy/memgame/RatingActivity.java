package com.example.nensy.memgame;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.WindowManager;
import android.widget.TextView;

public class RatingActivity extends AppCompatActivity {

    private static final String USER = "user";
    public static final String APP_PREFERENCES = "mysettings";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rating);

        // приховує статус бар:
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        // приховує ActionBar:
        getSupportActionBar().hide();
        // орієнтація екрана:
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        // початок формування рейтингу
        SharedPreferences sp = getSharedPreferences(USER, Context.MODE_PRIVATE);

        String nick = sp.getString("userName", "");

        String rate1 = sp.getString("rate1", "0");
        String rate2 = sp.getString("rate2", "0");
        String rate3 = sp.getString("rate3", "0");

        String rate4 = sp.getString("rate4", "0");
        String rate5 = sp.getString("rate5", "0");
        String rate6 = sp.getString("rate6", "0");

        String rate7 = sp.getString("rate7", "0");
        String rate8 = sp.getString("rate8", "0");
        String rate9 = sp.getString("rate9", "0");

        String rate10 = sp.getString("rate10", "0");
        String rate11 = sp.getString("rate11", "0");
        String rate12 = sp.getString("rate12", "0");

        String rate13 = sp.getString("rate13", "0");
        String rate14 = sp.getString("rate14", "0");
        String rate15 = sp.getString("rate15", "0");

        String rate16 = sp.getString("rate16", "0");
        String rate17 = sp.getString("rate17", "0");
        String rate18 = sp.getString("rate18", "0");

        int tempRate1 = Integer.parseInt(rate1);
        int tempRate2 = Integer.parseInt(rate2);
        int tempRate3 = Integer.parseInt(rate3);

        int tempRate4 = Integer.parseInt(rate4);
        int tempRate5 = Integer.parseInt(rate5);
        int tempRate6 = Integer.parseInt(rate6);

        int tempRate7 = Integer.parseInt(rate7);
        int tempRate8 = Integer.parseInt(rate8);
        int tempRate9 = Integer.parseInt(rate9);

        int tempRate10 = Integer.parseInt(rate10);
        int tempRate11 = Integer.parseInt(rate11);
        int tempRate12 = Integer.parseInt(rate12);

        int tempRate13 = Integer.parseInt(rate13);
        int tempRate14 = Integer.parseInt(rate14);
        int tempRate15 = Integer.parseInt(rate15);

        int tempRate16 = Integer.parseInt(rate16);
        int tempRate17 = Integer.parseInt(rate17);
        int tempRate18 = Integer.parseInt(rate18);

        int tempRateGame1 = tempRate1 + tempRate2 + tempRate3;
        int tempRateGame2 = tempRate4 + tempRate5 + tempRate6;
        int tempRateGame3 = tempRate7 + tempRate8 + tempRate9;
        int tempRateGame4 = tempRate10 + tempRate11 + tempRate12;
        int tempRateGame5 = tempRate13 + tempRate14 + tempRate15;
        int tempRateGame6 = tempRate16 + tempRate17 + tempRate18;

        String game1 = Integer.toString(tempRateGame1);
        String game2 = Integer.toString(tempRateGame2);
        String game3 = Integer.toString(tempRateGame3);
        String game4 = Integer.toString(tempRateGame4);
        String game5 = Integer.toString(tempRateGame5);
        String game6 = Integer.toString(tempRateGame6);

        String result = nick + " — " + game1 + " / " + game2 + " / " + game3 + " / " + game4 + " / " + game5 + " / " + game6;

        TextView textView = (TextView) findViewById(R.id.textView24);
        textView.setText(result);

        SharedPreferences sp2 = getSharedPreferences(APP_PREFERENCES, Context.MODE_PRIVATE);
        String oldData = sp2.getString("oldData", "");

        TextView textView2 = (TextView) findViewById(R.id.textView27);
        textView2.setText("    " + oldData);


    }

}
