package com.example.android.miwok;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LanguageChooser extends AppCompatActivity {

    Button frenchBtn;
    Button spanishBtn;
    Button germanBtn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_language_chooser);

        frenchBtn = (Button) findViewById(R.id.frenchBtn);
        spanishBtn = (Button) findViewById(R.id.spanishBtn);
        germanBtn = (Button) findViewById(R.id.germanBtn);

        frenchBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(LanguageChooser.this,SelectionFrench.class));
            }
        });

        spanishBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(LanguageChooser.this,SelectionSpanish.class));
            }
        });

        germanBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(LanguageChooser.this,SelectionGerman.class));
            }
        });
    }
}
