package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.graphics.Color;

import android.support.v7.app.AppCompatActivity;

import android.os.Bundle;

import android.text.method.ScrollingMovementMethod;

import android.util.Log;

import android.view.View;

import android.widget.Button;

import android.widget.ImageView;

import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

import java.util.Collections;

import java.util.HashMap;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Random;

public class FactsGerman extends AppCompatActivity {

    ArrayList<String> facts;

    ImageView imageFacts;

    TextView textFacts;

    Button nextFact;

    Map<String,Integer> mapFacts;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_facts_german);
        getSupportActionBar().hide();


        imageFacts = (ImageView) findViewById(R.id.imageFact);

        textFacts = (TextView) findViewById(R.id.textFact);

        nextFact = (Button) findViewById(R.id.nextFact);

        //facts = new ArrayList<>();

        mapFacts = new LinkedHashMap<>();

        mapFacts.put("With 81 million people Germany has the largest population in the European Union. She is one of the most densely populated countries in the world.",R.drawable.german111);

        mapFacts.put("One third of the country is still covered in forests and woodlands.",R.drawable.german2);

        mapFacts.put("Germany is composed of sixteen states. The states have their own constitution and are largely autonomous in regard to their internal organization. At the municipal level, Germany is divided into 403 districts (Kreise), of which 301 are rural districts and 102 urban districts. Bavaria is the largest state.",R.drawable.german3);

        mapFacts.put("Germany is the EU’s largest economy – with a gross domestic product (GDP) of 3.73 trillion USD,  and lies fourth place in the world behind the US, China and Japan.",R.drawable.german4);

        mapFacts.put("Germany is one of the world’s largest car producers – selling 5.9 million cars in 2011. VW’s Golf is one of the best selling cars of all time: in 2012 it year it sold more than 430,000 Golfs around Europe (125,000 ahead of its nearest rival). In 2013, the top-selling car brands in Germany were Volkswagen, Mercedes. Audi and BMWds",R.drawable.german5);

        mapFacts.put("The first printed book was in German. Germany is one of the world’s leading book nations – publishing around 94,000 titles every year.",R.drawable.german6);

        mapFacts.put("Germany was the first country in the world to adopt Daylight saving time – DST, also known as summer time. This occured in 1916, in the midst of WWI.",R.drawable.german7);

        mapFacts.put("German is the most widely taught third language across the world.",R.drawable.german8);

        mapFacts.put("Donaudampfschifffahrtselektrizitätenhauptbetriebswerkbauunterbeamtengesellschaft is the longest word to be published. It is 79 letters long.",R.drawable.german9);

        mapFacts.put("College is free for everyone (even non-Germans).",R.drawable.german10);

        mapFacts.put("Beer is considered as a food in Bavaria officially. There are over 1,500 different beers in Germany. After the Irish, the Germans are those consume the most beer, making Germany the second largest consumer of Beer.",R.drawable.german11);

        mapFacts.put("To get ONE beer in Germany, you show your thumb. To show your first finger means that you want 2 beers: one with the thumb, and one with the finger.", R.drawable.german12);

        mapFacts.put("There are more football (soccer for the North Americans) fan clubs in Germany than anywhere else in the world.",R.drawable.german13 );

        mapFacts.put("The Christmas tree (Tannenbaum) tradition came from Germany.", R.drawable.german14);

        mapFacts.put("Germany has over 400 zoos, the most in the world.", R.drawable.german15);

        mapFacts.put("Most taxis in Germany are Mercedes.", R.drawable.german16);

        mapFacts.put("In Germany there’s no punishment for a prisoner who tries to escape from jail, because it is a basic human instinct to be free.", R.drawable.german17);

        mapFacts.put("Albert Einstein, the most recognized scientist in the world, was German and born in Ulm.\n", R.drawable.german18);

        mapFacts.put("Adidas was founded by the Bavarian, Adolf “Adi”Dassler. His other brother, Rudolf Dassler founded Puma.", R.drawable.german19);

        /*mapFacts.put("You might get a ‘fish’ stuck on your back on April Fool’s Day – if you’re in France on 1 April, don’t be surprised if children try to stick paper fish to your back and call you a ‘Poisson d’Avril’ (April Fish). This tradition is supposed to have started in the 16th century when King Charles XIV of France changed the calendar and those who continued to celebrate the end of the New Year at the end of March were ridiculed as fools.", R.drawable.frances21);

        mapFacts.put("The French eat around 30,000 tonnes of snails a year – but only about 1,000 tonnes of the classic French delicacy (served with garlic, parsley and butter) come from France; only some 100 registered snail farms existed in France in 2015.", R.drawable.frances22);

        mapFacts.put("Marcel Proust’s A la recherche du temps perdu holds the record as the world’s longest novel – his 13-volume masterpiece, translated as Remembrance of things past, is more than 3,000 pages long and has a cast of thousands and hundreds of interwoven plots strands. The first volume was published in 1913.", R.drawable.frances23);

        mapFacts.put("The world’s greatest cycle race, the Tour de France, has been around for more than 100 years – with the first event held on 1 July 1903. Every July, cyclists race some 3,200km (2,000 miles) primarily around France in a series of stages over 23 days, with the fastest cyclist at each stage wearing the famous yellow jersey.", R.drawable.frances24);

        mapFacts.put("The oldest recorded human voice is French – a 10-second fragment of the song Au Clair de la Lune was recorded by French inventor Edouard-Leon Scott de Martinville on paper on 9 April 1860. He used a ‘phonautograph’, which allowed sounds to be recorded visually. ",R.drawable.frances25);
        */

        nextFact.setOnClickListener(new View.OnClickListener() {

            @Override

            public void onClick(View view) {

                Random random = new Random();



                int color = Color.argb(255, random.nextInt(256), random.nextInt(256), random.nextInt(256));

                //String holder = facts.get(random.nextInt(facts.size()));

                textFacts.setMovementMethod(new ScrollingMovementMethod());

                int i = random.nextInt(mapFacts.size());

                Object[] keys = mapFacts.keySet().toArray();

                String text = (String) keys[i];

                int id = mapFacts.get (keys[i]);

                textFacts.setText(text);

                textFacts.setTextColor(color);

                Glide.with(getApplicationContext()).load(id).into(imageFacts);
            }



        });
    }
}
