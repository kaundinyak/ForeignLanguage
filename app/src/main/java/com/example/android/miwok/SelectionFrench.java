package com.example.android.miwok;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.Button;
import android.widget.GridLayout;

public class SelectionFrench extends AppCompatActivity {

    GridLayout mainGrid;
    Button btnconjugate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selection_french);
        getSupportActionBar().hide();

        mainGrid = (GridLayout) findViewById(R.id.mainGrid);

        setSingleEvent(mainGrid);
        btnconjugate = (Button) findViewById(R.id.btnconjugate);

        btnconjugate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(SelectionFrench.this,Conjugate.class));
            }
        });
    }

    private void setSingleEvent(GridLayout mainGrid) {

        for (int i=0;i<mainGrid.getChildCount();i++)
        {
            CardView cardView = (CardView)mainGrid.getChildAt(i);
            final int finali = i;

            final int finalI = i;
            cardView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    if (finalI ==0)
                    {
                        startActivity(new Intent(SelectionFrench.this, MainActivity.class));
                    }
                    if(finalI==1)
                    {
                        startActivity(new Intent(SelectionFrench.this, FrenchFacts.class));
                    }
                    if (finalI ==2)
                    {
                        startActivity(new Intent(SelectionFrench.this, LoginQuiz.class));
                    }
                    if(finalI==3)
                    {
                        startActivity(new Intent(SelectionFrench.this, FrenchBooks.class));
                    }

                }
            });
        }
    }
}
