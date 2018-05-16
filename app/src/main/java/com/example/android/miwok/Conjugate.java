package com.example.android.miwok;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.GridLayout;

import com.example.android.miwok.FrenchConjugations.Aller;
import com.example.android.miwok.FrenchConjugations.Avoir;
import com.example.android.miwok.FrenchConjugations.Etre;
import com.example.android.miwok.FrenchConjugations.Finir;
import com.example.android.miwok.FrenchConjugations.Lire;
import com.example.android.miwok.FrenchConjugations.Parler;

public class Conjugate extends AppCompatActivity {


    GridLayout mainGrid;
    private WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_conjugate);
        getSupportActionBar().hide();


        mainGrid = (GridLayout) findViewById(R.id.mainGrid);
        setSingleEvent(mainGrid);
    }

    private void setSingleEvent(GridLayout mainGrid) {

        for (int i = 0; i < mainGrid.getChildCount(); i++) {
            CardView cardView = (CardView) mainGrid.getChildAt(i);
            final int finali = i;

            final int finalI = i;
            cardView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    if (finalI == 0) {
                        startActivity(new Intent(Conjugate.this, Avoir.class));
                    }
                    if (finalI == 1) {
                        startActivity(new Intent(Conjugate.this, Finir.class));
                    }
                    if (finalI == 2) {
                        startActivity(new Intent(Conjugate.this, Etre.class));
                    }
                    if (finalI == 3) {
                        startActivity(new Intent(Conjugate.this, Lire.class));
                    }
                    if (finalI == 4) {
                        startActivity(new Intent(Conjugate.this, Aller.class));
                    }
                    if (finalI == 5) {
                        startActivity(new Intent(Conjugate.this, Parler.class));
                    }


                }
            });

        }
    }
}
