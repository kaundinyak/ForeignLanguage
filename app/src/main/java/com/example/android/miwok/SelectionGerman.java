package com.example.android.miwok;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.GridLayout;

public class SelectionGerman extends AppCompatActivity {

    GridLayout mainGrid;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selection_german);
        getSupportActionBar().hide();

        mainGrid = (GridLayout) findViewById(R.id.mainGrid);

        setSingleEvent(mainGrid);

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
                        startActivity(new Intent(SelectionGerman.this, MainActivityGerman.class));
                    }
                    if(finalI==1)
                    {
                        startActivity(new Intent(SelectionGerman.this, FactsGerman.class));
                    }
                    if (finalI ==2)
                    {
                        startActivity(new Intent(SelectionGerman.this, FactsGerman.class));
                    }
                    if(finalI==3)
                    {
                        startActivity(new Intent(SelectionGerman.this, FactsGerman.class));
                    }

                }
            });
        }
    }
}
