package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class NumbersActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers3);

        ArrayList<WordGerman> words = new ArrayList<WordGerman>();

        words.add(new WordGerman("One","Eine", R.drawable.number_one));
        words.add(new WordGerman("Two","Zwei", R.drawable.number_two));
        words.add(new WordGerman("Three","Drei", R.drawable.number_three));
        words.add(new WordGerman("Four","Vier", R.drawable.number_four));
        words.add(new WordGerman("Five","Fünf", R.drawable.number_five));
        words.add(new WordGerman("Six","Sechs", R.drawable.number_six));
        words.add(new WordGerman("Seven","Sieben", R.drawable.number_seven));
        words.add(new WordGerman("Eight","Acht", R.drawable.number_eight));
        words.add(new WordGerman("Nine","Neun", R.drawable.number_nine));
        words.add(new WordGerman("Ten","Zehn", R.drawable.number_ten));

        // Create an {@link ArrayAdapter}, whose data source is a list of Strings. The

        // adapter knows how to create layouts for each item in the list, using the

        // simple_list_item_1.xml layout resource defined in the Android framework.

        // This list item layout contains a single {@link TextView}, which the adapter will set to

        // display a single word.
        NumberGermanAdapter adapter = new NumberGermanAdapter(this, words);

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
