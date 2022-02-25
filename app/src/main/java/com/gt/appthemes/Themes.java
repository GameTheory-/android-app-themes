package com.gt.appthemes;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.view.View;
import android.widget.TextView;

public class Themes extends MainActivity {

    // SelectTheme
    static void redTheme(Context context) {
        setTheme("Color", 0, context);
    }

    static void blueTheme(Context context) {
        setTheme("Color", 1, context);
    }

    static void blackTheme(Context context) {
        setTheme("Color", 2, context);
    }

    static void yellowTheme(Context context) {
        setTheme("Color", 3, context);
    }

    static void orangeTheme(Context context) {
        setTheme("Color", 4, context);
    }

    static void pinkTheme(Context context) {
        setTheme("Color", 5, context);
    }

    static void purpleTheme(Context context) {
        setTheme("Color", 6, context);
    }

    static void greenTheme(Context context) {
        setTheme("Color", 7, context);
    }

    static void greyTheme(Context context) {
        setTheme("Color", 8, context);
    }

    // Backgrounds
    static void darkBG(Context context) {
        setTheme("BG", 0, context);
    }

    static void greyBG(Context context) {
        setTheme("BG", 1, context);
    }

    static void blackBG(Context context) {
        setTheme("BG", 2, context);
    }

    static void whiteBG(Context context) {
        setTheme("BG", 3, context);
    }

    static void Color(Context context) {
        int theme = getTheme("Color", context);
        switch (theme) {
            case 0:
                context.setTheme(R.style.RedTheme);
                break;
            case 1:
                context.setTheme(R.style.BlueTheme);
                break;
            case 2:
                context.setTheme(R.style.BlackTheme);
                break;
            case 3:
                context.setTheme(R.style.YellowTheme);
                break;
            case 4:
                context.setTheme(R.style.OrangeTheme);
                break;
            case 5:
                context.setTheme(R.style.PinkTheme);
                break;
            case 6:
                context.setTheme(R.style.PurpleTheme);
                break;
            case 7:
                context.setTheme(R.style.GreenTheme);
                break;
            case 8:
                context.setTheme(R.style.GreyTheme);
                break;
        }
    }

    static void textColor(Context context, TextView tv) {
        int bg = getBG("BG", context);
        if (bg == 3) {
            tv.setTextColor(Color.parseColor("#000000"));
        }
    }

    static void BG(Context context, View v) {
        int bg = getBG("BG", context);
        View view = v.getRootView();
        switch (bg) {
            case 0:
                view.setBackgroundColor(Color.parseColor("#303030"));
                break;
            case 1:
                view.setBackgroundColor(Color.parseColor("#757575"));
                break;
            case 2:
                view.setBackgroundColor(Color.parseColor("#000000"));
                break;
            case 3:
                view.setBackgroundColor(Color.parseColor("#EEEEEE"));
                break;
        }
    }

    public static void setTheme(String key, int value, Context context) {
        SharedPreferences preferences = context.getSharedPreferences("preferences", MODE_PRIVATE);
        SharedPreferences.Editor editor = preferences.edit();
        editor.putInt(key, value);
        editor.apply();
    }

    public static int getTheme(String key, Context context) {
        SharedPreferences preferences = context.getSharedPreferences("preferences", MODE_PRIVATE);
        return preferences.getInt(key, 1);
    }

    public static int getBG(String key, Context context) {
        SharedPreferences preferences = context.getSharedPreferences("preferences", MODE_PRIVATE);
        return preferences.getInt(key, 0);
    }

}
