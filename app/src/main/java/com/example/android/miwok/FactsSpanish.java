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

public class FactsSpanish extends AppCompatActivity {

    ArrayList<String> facts;

    ImageView imageFacts;

    TextView textFacts;

    Button nextFact;

    Map<String,Integer> mapFacts;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_facts_spanish);



        imageFacts = (ImageView) findViewById(R.id.imageFact);

        textFacts = (TextView) findViewById(R.id.textFact);

        nextFact = (Button) findViewById(R.id.nextFact);

        //facts = new ArrayList<>();

        mapFacts = new LinkedHashMap<>();

        mapFacts.put("The Kingdom of Spain, as it’s officially known, is the second largest country in the EU – with an area of 505,955 square kilometres, Spain covers about 85 percent of the Iberian Peninsula, which it shares with Portugal.",R.drawable.spain1 );

        mapFacts.put("Spanish is the second most widely spoken language in the world – with more than 406 million people worldwide speaking Spanish, it comes only after Chinese. Back home, while Castilian Spanish is the official language, in Catalonia, the Basque country and Galicia, the regional languages of Catalan, Basque and Galician all have official status.",R.drawable.spain2);

        mapFacts.put("Nudity is legal in Spain – some say all the better to enjoy the country’s mainly Mediterranean-temperate climate with its hot dry summers, mild, rainy winters and more than 3,000 hours of sunlight a year. Spain also had the youngest marrying age in Europe before it changed the legal age from 14 to 16 years in 2015.",R.drawable.spain3);

        mapFacts.put("Spain has the fourth highest life expectancy of all the OECD countries – with a life expectancy of 82 years, it comes after Switzerland, Italy and Japan, and ranks 15th in the world. Spanish women live longer than men: 85 compared to 79 years. ",R.drawable.spain4);

        mapFacts.put("The United Nations projects that Spain will be the world’s oldest country by 2050 – with 40 percent of the population aged over 60. ",R.drawable.spain5);

        mapFacts.put("Spain is a constitutional monarchy – former king Juan Carlos I came to the throne after the right-wing dictator General Franco died in 1975. Once one of Europe’s most beloved monarchs, Juan Carlos fell from favour in recent years and abdicated in favour of his son, King Felipe VI, in 2014. ",R.drawable.spain6);

        mapFacts.put("There is only one tax inspector for every 1,928 taxpayers – compared to one per 729 people in France. So while Spain’s economy ranked 13th in the world, with a GDP of 1,356 billion USD (EUR 989 billion) in the 2013 Centre for Economic Research (Cebr) World Economic League Table, the Spanish Inland Revenue says a quarter of the GDP comes from the ‘black’ economy. ",R.drawable.spain7);

        mapFacts.put("In 2015, Spain has the second highest unemployment rate in Europe  – and third highest among the OECD countries at 24.2 percent, only slightly behind Greece and South Africa, and high above the OECD average of 7.3 percent (2014). Youth unemployment is even worse: around half of 15 to 24 year-olds who could be working are unemployed. ",R.drawable.spain8);

        mapFacts.put("Only half of all adults aged 15–64 have the equivalent of a high school degree – the OECD average is almost three-quarters. Younger people are staying on at school longer than the previous generation though, as 65 percent of 25–34-year-olds gain the qualification.",R.drawable.spain9);

        mapFacts.put("The next time you use a stapler, thank the Spanish – the first known stapler was made in the 18th century in the Basque country for the French King Louis XV – and every single staple was engraved with the royal emblem. Spain has also given the world the mop and bucket (1956), the forerunner of the modern cigarette (17th century) and the astronaut’s space suit (1935).",R.drawable.spain10);

        mapFacts.put("Spain produces over half of the world’s olive oil – more than some 1.5 million tons, and almost all of it comes from the southern region of Andalusia. It’s also the third largest wine producer after France and Italy, making 3.3 million tonnes (metric tons) in 2013.",R.drawable.spain11);

        mapFacts.put("Spain was the first country in the world where wind power was the greatest source of electricity. Red Eléctrica de España (REE), operators of Spain’s electricity system, revealed that in 2013 wind turbines generated over just under 54,000 gigawatt hours of electricity – a fifth of the nation’s usage.", R.drawable.spain122);

        mapFacts.put("There's no tooth fairy in Spain – when Spanish children lose a tooth, they put it under their pillow and a small mouse called Ratoncito Pérez comes to collect it and leaves a small gift or money in its place.",R.drawable.spain13 );

        /*mapFacts.put("Paris Gare du Nord is Europe's busiest railway station – and by far, with some 190 million passengers passing through each year. Inaugurated in 1846, it it also one of the world's oldest stations.", R.drawable.frances15);

        mapFacts.put("French wines can reach astronommical prices – in 2014, Sotheby’s sold a 114-bottle lot of DCR Romanee-Conti wines in Hong Kong for more than EUR 1.45m to an anonymous Asia-based buyer, a world record for a single wine lot. That works out to about EUR 1,619 per standard glass. ", R.drawable.frances16);

        mapFacts.put("The French invented the metric system, the decimalised way of counting and weighing, in 1793 – the original prototype kilo, Le Grand K, is a cylinder made in the 1880s out of platinum and iridium and about the size of a plum, and was the only object known to scientists to have a mass of exactly 1kg. ", R.drawable.frances17);

        mapFacts.put("French gastronomy was awarded UNESCO World Heritage Status in 2010 – when it was added to the list of ‘intangible cultural heritage of humanity’. Experts described the importance of French gastronomy as ‘a social custom aimed at celebrating the most important moments in the lives of individuals and groups'.", R.drawable.frances18);

        mapFacts.put("France has produced some of the world’s most influential writers and thinkers – Descartes and Pascal in the 17th century, Voltaire in the 18th, Baudelaire and Flaubert in the 19th and Sartre and Camus in the 20th. To date, France has won more Noble Prizes for Literature (15) than any other country.\n", R.drawable.frances19);

        mapFacts.put("France produces nearly a billion tons of cheese a year in around 1,200 different varieties – in France it's an ancient art: goats cheese dates back to at least 500AD, the blue-veined Roquefort was mentioned in records of an ancient monastery in Conques as early as 1070, and hard farm cheeses like Emmental started to appear in the 13th century.", R.drawable.frances20);

        mapFacts.put("You might get a ‘fish’ stuck on your back on April Fool’s Day – if you’re in France on 1 April, don’t be surprised if children try to stick paper fish to your back and call you a ‘Poisson d’Avril’ (April Fish). This tradition is supposed to have started in the 16th century when King Charles XIV of France changed the calendar and those who continued to celebrate the end of the New Year at the end of March were ridiculed as fools.", R.drawable.frances21);

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
