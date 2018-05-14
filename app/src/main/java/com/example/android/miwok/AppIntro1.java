package com.example.android.miwok;

import com.github.paolorotolo.appintro.AppIntro;
import android.content.Intent;
import android.graphics.Color;
import android.support.v4.app.Fragment;
import android.os.Bundle;

import com.github.paolorotolo.appintro.AppIntroFragment;

public class AppIntro1 extends AppIntro {

    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);

        getSupportActionBar().hide();

        addSlide(AppIntroFragment.newInstance("Foreign Language",

                "Learn Francais",

                R.drawable.franceflag,

                Color.parseColor("#FFC107")));



        addSlide(AppIntroFragment.newInstance("Foreign Language",

                "Learn Español",

                R.drawable.flagspain,

                Color.parseColor("#4fd7ff")));



        addSlide(AppIntroFragment.newInstance("Foreign Language",

                "Learn Deutsche",

                R.drawable.flaggermany,

                Color.parseColor("#795548")));

        addSlide(AppIntroFragment.newInstance("Foreign Languag",

                "Learn Facts",

                R.drawable.appfact,

                Color.parseColor("#FFC107")));

        addSlide(AppIntroFragment.newInstance("Foreign Language",

                "Give Quiz's",

                R.drawable.appquiz,

                Color.parseColor("#4fd7ff")));




        showStatusBar(false);

        setBarColor(Color.parseColor("#333639"));

        setSeparatorColor(Color.parseColor("#2196F3"));

    }

    @Override

    public void onDonePressed() {

        startActivity(new Intent(this, Googlesignin.class));

        finish();

    }



    @Override

    public void onSkipPressed(Fragment currentFragment) {

        startActivity(new Intent(this, Googlesignin.class));

        finish();

    }
}
