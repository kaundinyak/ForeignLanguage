/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.android.miwok;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ViewFlipper;

import static android.net.Uri.*;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    ViewFlipper viewFlipper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);

        viewFlipper = (ViewFlipper) this.findViewById(R.id.viewFlipper);
        viewFlipper.setOnClickListener(this);



        // Fine the View that shows Numbers category
        TextView numbers = (TextView)findViewById(R.id.numbers);

        //set a ClickListener on that View
        numbers.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this,NumbersActivity.class);
                startActivity(i);
            }


    });
        TextView family = (TextView)findViewById(R.id.family);

        family.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent i = new Intent(MainActivity.this,FamilyActivity.class);
            startActivity(i);
        }
    });

        TextView colors = (TextView)findViewById(R.id.colors);

        colors.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this,ColorsActivity.class);
                startActivity(i);
            }
        });

        TextView phrases = (TextView)findViewById(R.id.phrases);

        phrases.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this,PhrasesActivity.class);
                startActivity(i);
            }
        });

        TextView weeks = (TextView)findViewById(R.id.weeks);

        weeks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this,WeeksActivity.class);
                startActivity(i);
            }
        });

        TextView months = (TextView)findViewById(R.id.months);

        months.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this,MonthsActivity.class);
                startActivity(i);
            }
        });
    }

    public void openWebpage(View view) {
        Uri uri= Uri.parse("https://en.wikipedia.org/wiki/France");
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);

    }

    public void onClick(View v) {
        viewFlipper.startFlipping();
        viewFlipper.setFlipInterval(1000);
    }


}
