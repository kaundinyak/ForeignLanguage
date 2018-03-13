package com.example.android.miwok;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.ArrayList;

public class MonthsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_months);

       final ArrayList<Word> words = new ArrayList<Word>();

        words.add(new Word("January","Janvier"));
        words.add(new Word("February","Février"));
        words.add(new Word("March","Mars"));
        words.add(new Word("April","Avril"));
        words.add(new Word("May","Mai"));
        words.add(new Word("June","Juin"));
        words.add(new Word("July","Juillet"));
        words.add(new Word("August","Août"));
        words.add(new Word("September","Septembre"));
        words.add(new Word("October","Octobre"));
        words.add(new Word("November","Novembre"));
        words.add(new Word("December","Décembre"));

        // Create an {@link ArrayAdapter}, whose data source is a list of Strings. The

        // adapter knows how to create layouts for each item in the list, using the

        // simple_list_item_1.xml layout resource defined in the Android framework.

        // This list item layout contains a single {@link TextView}, which the adapter will set to

        // display a single word.
        MonthAdapter adapter = new MonthAdapter(this, words);

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


