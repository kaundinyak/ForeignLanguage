package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.ArrayList;

public class ColorsActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_colors2);

        ArrayList<WordSpanish> words = new ArrayList<WordSpanish>();

        words.add(new WordSpanish("Red","Rojo", R.drawable.color_red));
        words.add(new WordSpanish("Black","Negro", R.drawable.color_black));
        words.add(new WordSpanish("White","Blanco", R.drawable.color_white));

        words.add(new WordSpanish("Green","Verde", R.drawable.color_green));

        words.add(new WordSpanish("Yellow","Amarillo", R.drawable.color_mustard_yellow));
        words.add(new WordSpanish("Brown","Marrón", R.drawable.color_brown));

        words.add(new WordSpanish("Gray","Gris", R.drawable.color_gray));



        // Create an {@link ArrayAdapter}, whose data source is a list of Strings. The

        // adapter knows how to create layouts for each item in the list, using the

        // simple_list_item_1.xml layout resource defined in the Android framework.

        // This list item layout contains a single {@link TextView}, which the adapter will set to

        // display a single word.
        ColorSpanishAdapter adapter = new ColorSpanishAdapter(this, words);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.

        // There should be a {@link ListView} with the view ID called list, which is declared in the

        // activity_numbers.xml layout file.
        ListView listView = (ListView) findViewById(R.id.colors);


        // Make the {@link ListView} use the {@link ArrayAdapter} we created above, so that the

        // {@link ListView} will display list items for each word in the list of words.

        // Do this by calling the setAdapter method on the {@link ListView} object and pass in

        // 1 argument, which is the {@link ArrayAdapter} with the variable name itemsAdapter.
        listView.setAdapter(adapter);

    }
}


