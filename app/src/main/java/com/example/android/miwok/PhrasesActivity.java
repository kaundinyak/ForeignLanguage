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

public class PhrasesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phrases);

        ArrayList<Word> words = new ArrayList<Word>();

        words.add(new Word("Hi!","Salut!"));
        words.add(new Word("Good Morning","Bonjour!"));
        words.add(new Word("How are you?","Comment allez-vous?"));
        words.add(new Word("I'm Fine, Thankyou!","Je vais bien, merci! "));
        words.add(new Word("Good night","Bonne nuit! "));
        words.add(new Word("Can i help you ?","Puis-je vous aider? "));
        words.add(new Word("What's your name?","Comment vous appelez-vous "));
        words.add(new Word("My name is...","Je m'appelle …"));
        words.add(new Word("Mr.../ Mrs.…/ Miss…","Monsieur./Madame./Mademoiselle"));
        words.add(new Word("How old are you?","Quel âge avez-vous?"));

        // Create an {@link ArrayAdapter}, whose data source is a list of Strings. The

        // adapter knows how to create layouts for each item in the list, using the

        // simple_list_item_1.xml layout resource defined in the Android framework.

        // This list item layout contains a single {@link TextView}, which the adapter will set to

        // display a single word.
        PhrasesAdapter adapter = new PhrasesAdapter(this, words);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.

        // There should be a {@link ListView} with the view ID called list, which is declared in the

        // activity_numbers.xml layout file.
        ListView listView = (ListView) findViewById(R.id.phrase);


        // Make the {@link ListView} use the {@link ArrayAdapter} we created above, so that the

        // {@link ListView} will display list items for each word in the list of words.

        // Do this by calling the setAdapter method on the {@link ListView} object and pass in

        // 1 argument, which is the {@link ArrayAdapter} with the variable name itemsAdapter.
        listView.setAdapter(adapter);

    }
}


