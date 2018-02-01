package com.example.android.miwok;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SelectionScreen extends AppCompatActivity{

    Button mQuiz;
    Button mFacts;
    Button mLearn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selection_screen);


        mFacts = (Button) findViewById(R.id.factsBtn);
        mLearn = (Button) findViewById(R.id.learnBtn);
        mQuiz = (Button) findViewById(R.id.quizBtn);

            mLearn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(new Intent(SelectionScreen.this, MainActivity.class));
                }
            });

        mFacts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(SelectionScreen.this, Facts.class));
            }
        });

        mQuiz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(SelectionScreen.this, Quiz.class));
            }
        });
        }



}
