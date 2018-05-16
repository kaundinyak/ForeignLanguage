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

public class FamilyActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_family3);

        ArrayList<WordGerman> words = new ArrayList<WordGerman>();

        words.add(new WordGerman("Father","Vater", R.drawable.family_father));
        words.add(new WordGerman("Mother","Mutter", R.drawable.family_mother));
        words.add(new WordGerman("Grand Mother","Großmutter", R.drawable.family_grandmother));
        words.add(new WordGerman("Grand Father","Großer Vater", R.drawable.family_grandfather));
        words.add(new WordGerman("Son","Sohn", R.drawable.family_son));
        words.add(new WordGerman("Daughter","Tochter", R.drawable.family_daughter));
        words.add(new WordGerman("Older Brother","Älterer Bruder", R.drawable.family_older_brother));
        words.add(new WordGerman("Older Sister","Ältere Schwester", R.drawable.family_older_sister));
        words.add(new WordGerman("Younger Sister","Jüngere Schwester", R.drawable.family_younger_sister));
        words.add(new WordGerman("Younger Brother","Jüngerer Bruder", R.drawable.family_younger_brother));


        // Create an {@link ArrayAdapter}, whose data source is a list of Strings. The

        // adapter knows how to create layouts for each item in the list, using the

        // simple_list_item_1.xml layout resource defined in the Android framework.

        // This list item layout contains a single {@link TextView}, which the adapter will set to

        // display a single word.
        FamilyGermanAdapter adapter = new FamilyGermanAdapter(this, words);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.

        // There should be a {@link ListView} with the view ID called list, which is declared in the

        // activity_numbers.xml layout file.
        ListView listView = (ListView) findViewById(R.id.family);


        // Make the {@link ListView} use the {@link ArrayAdapter} we created above, so that the

        // {@link ListView} will display list items for each word in the list of words.

        // Do this by calling the setAdapter method on the {@link ListView} object and pass in

        // 1 argument, which is the {@link ArrayAdapter} with the variable name itemsAdapter.
        listView.setAdapter(adapter);

    }
}


