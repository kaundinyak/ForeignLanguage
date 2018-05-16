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

public class MonthsActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_months2);

        ArrayList<WordSpanish> words = new ArrayList<WordSpanish>();

        words.add(new WordSpanish("January","Enero"));
        words.add(new WordSpanish("February","Febrero"));
        words.add(new WordSpanish("March","Marzo"));
        words.add(new WordSpanish("April","Abril"));
        words.add(new WordSpanish("May","Mayo "));
        words.add(new WordSpanish("June","Junio "));
        words.add(new WordSpanish("July","Julio "));
        words.add(new WordSpanish("August","Agosto "));
        words.add(new WordSpanish("September","Setiembre "));
        words.add(new WordSpanish("October","Octubre "));
        words.add(new WordSpanish("November","Noviembre "));
        words.add(new WordSpanish("December","Diciembre "));

        // Create an {@link ArrayAdapter}, whose data source is a list of Strings. The

        // adapter knows how to create layouts for each item in the list, using the

        // simple_list_item_1.xml layout resource defined in the Android framework.

        // This list item layout contains a single {@link TextView}, which the adapter will set to

        // display a single word.
        MonthsSpanishAdapter adapter = new MonthsSpanishAdapter(this,words);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.

        // There should be a {@link ListView} with the view ID called list, which is declared in the

        // activity_numbers.xml layout file.
        ListView listView = (ListView) findViewById(R.id.month);


        // Make the {@link ListView} use the {@link ArrayAdapter} we created above, so that the

        // {@link ListView} will display list items for each word in the list of words.

        // Do this by calling the setAdapter method on the {@link ListView} object and pass in

        // 1 argument, which is the {@link ArrayAdapter} with the variable name itemsAdapter.
        listView.setAdapter(adapter);

    }
}


