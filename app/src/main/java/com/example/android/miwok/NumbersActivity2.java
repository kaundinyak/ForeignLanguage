package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class NumbersActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers2);

        ArrayList<WordSpanish> words = new ArrayList<WordSpanish>();

        words.add(new WordSpanish("One","Uno", R.drawable.number_one));
        words.add(new WordSpanish("Two","Dos", R.drawable.number_two));
        words.add(new WordSpanish("Three","Tres", R.drawable.number_three));
        words.add(new WordSpanish("Four","Cuatro", R.drawable.number_four));
        words.add(new WordSpanish("Five","Cinco", R.drawable.number_five));
        words.add(new WordSpanish("Six","Seis", R.drawable.number_six));
        words.add(new WordSpanish("Seven","Siete", R.drawable.number_seven));
        words.add(new WordSpanish("Eight","Ocho", R.drawable.number_eight));
        words.add(new WordSpanish("Nine","Nueve", R.drawable.number_nine));
        words.add(new WordSpanish("Ten","Diez", R.drawable.number_ten));

        // Create an {@link ArrayAdapter}, whose data source is a list of Strings. The

        // adapter knows how to create layouts for each item in the list, using the

        // simple_list_item_1.xml layout resource defined in the Android framework.

        // This list item layout contains a single {@link TextView}, which the adapter will set to

        // display a single word.
        NumberSpanishAdapter adapter = new NumberSpanishAdapter(this, words);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.

        // There should be a {@link ListView} with the view ID called list, which is declared in the

        // activity_numbers.xml layout file.
        ListView listView = (ListView) findViewById(R.id.list);


        // Make the {@link ListView} use the {@link ArrayAdapter} we created above, so that the

        // {@link ListView} will display list items for each word in the list of words.

        // Do this by calling the setAdapter method on the {@link ListView} object and pass in

        // 1 argument, which is the {@link ArrayAdapter} with the variable name itemsAdapter.
        listView.setAdapter(adapter);

    }
}
