package com.gt.appthemes;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SelectTheme extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Themes.Color(this);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_themes);
        Themes.BG(this, findViewById(R.id.activityThemes));

        // TextView theme buttons
        TextView tv0 = findViewById(R.id.blueTheme);
        tv0.setOnClickListener(v -> blueTheme());
        Themes.textColor(this, tv0);

        TextView tv1 = findViewById(R.id.redTheme);
        tv1.setOnClickListener(v -> redTheme());
        Themes.textColor(this, tv1);

        TextView tv2 = findViewById(R.id.blackTheme);
        tv2.setOnClickListener(v -> blackTheme());
        Themes.textColor(this, tv2);

        TextView tv3 = findViewById(R.id.yellowTheme);
        tv3.setOnClickListener(v -> yellowTheme());
        Themes.textColor(this, tv3);

        TextView tv4 = findViewById(R.id.orangeTheme);
        tv4.setOnClickListener(v -> orangeTheme());
        Themes.textColor(this, tv4);

        TextView tv5 = findViewById(R.id.pinkTheme);
        tv5.setOnClickListener(v -> pinkTheme());
        Themes.textColor(this, tv5);

        TextView tv6 = findViewById(R.id.purpleTheme);
        tv6.setOnClickListener(v -> purpleTheme());
        Themes.textColor(this, tv6);

        TextView tv7 = findViewById(R.id.greenTheme);
        tv7.setOnClickListener(v -> greenTheme());
        Themes.textColor(this, tv7);

        TextView tv8 = findViewById(R.id.greyTheme);
        tv8.setOnClickListener(v -> greyTheme());
        Themes.textColor(this, tv8);

        TextView tv9 = findViewById(R.id.darkBG);
        tv9.setOnClickListener(v -> darkBG());
        Themes.textColor(this, tv9);

        TextView tv10 = findViewById(R.id.greyBG);
        tv10.setOnClickListener(v -> greyBG());
        Themes.textColor(this, tv10);

        TextView tv11 = findViewById(R.id.blackBG);
        tv11.setOnClickListener(v -> blackBG());
        Themes.textColor(this, tv11);

        TextView tv12 = findViewById(R.id.whiteBG);
        tv12.setOnClickListener(v -> whiteBG());
        Themes.textColor(this, tv12);

        Themes.textColor(this, findViewById(R.id.colorsTextView));
        Themes.textColor(this, findViewById(R.id.bgTextView));
    }

    public void redTheme() {
        Themes.redTheme(this);
        recreateActivity();
    }

    public void blueTheme() {
        Themes.blueTheme(this);
        recreateActivity();
    }

    public void blackTheme() {
        Themes.blackTheme(this);
        recreateActivity();
    }

    public void yellowTheme() {
        Themes.yellowTheme(this);
        recreateActivity();
    }

    public void orangeTheme() {
        Themes.orangeTheme(this);
        recreateActivity();
    }

    public void pinkTheme() {
        Themes.pinkTheme(this);
        recreateActivity();
    }

    public void purpleTheme() {
        Themes.purpleTheme(this);
        recreateActivity();
    }

    public void greenTheme() {
        Themes.greenTheme(this);
        recreateActivity();
    }

    public void greyTheme() {
        Themes.greyTheme(this);
        recreateActivity();
    }

    public void darkBG() {
        Themes.darkBG(this);
        recreateActivity();
    }

    public void greyBG() {
        Themes.greyBG(this);
        recreateActivity();
    }

    public void blackBG() {
        Themes.blackBG(this);
        recreateActivity();
    }

    public void whiteBG() {
        Themes.whiteBG(this);
        recreateActivity();
    }

    private void recreateActivity() {
        Intent intent = getIntent();
        finish();
        startActivity(intent);
        overridePendingTransition(0, 0);
    }
}
