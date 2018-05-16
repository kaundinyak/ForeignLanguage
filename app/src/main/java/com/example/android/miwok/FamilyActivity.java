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

public class FamilyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_family);

       final ArrayList<Word> words = new ArrayList<Word>();

        words.add(new Word("Father","Un père", R.drawable.family_father,R.raw.num_one));
        words.add(new Word("Mother","Une mère", R.drawable.family_mother,R.raw.num_one));
        words.add(new Word("Grand Mother","Grand Mère", R.drawable.family_grandmother,R.raw.num_one));
        words.add(new Word("Grand Father","Grand Père", R.drawable.family_grandfather,R.raw.num_one));
        words.add(new Word("Son","Un Fils", R.drawable.family_son,R.raw.num_one));
        words.add(new Word("Daughter","Une Fille", R.drawable.family_daughter,R.raw.num_one));
        words.add(new Word("Older Brother","Frère Aîné", R.drawable.family_older_brother,R.raw.num_one));
        words.add(new Word("Older Sister","Soeur Aînée", R.drawable.family_older_sister,R.raw.num_one));
        words.add(new Word("Younger Sister","Jeune soeur", R.drawable.family_younger_sister,R.raw.num_one));
        words.add(new Word("Younger Brother","Frère cadet", R.drawable.family_younger_brother,R.raw.num_nine));


        // Create an {@link ArrayAdapter}, whose data source is a list of Strings. The

        // adapter knows how to create layouts for each item in the list, using the

        // simple_list_item_1.xml layout resource defined in the Android framework.

        // This list item layout contains a single {@link TextView}, which the adapter will set to

        // display a single word.
        FamilyAdapter adapter = new FamilyAdapter(this, words);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.

        // There should be a {@link ListView} with the view ID called list, which is declared in the

        // activity_numbers.xml layout file.
        ListView listView = (ListView) findViewById(R.id.family);


        // Make the {@link ListView} use the {@link ArrayAdapter} we created above, so that the

        // {@link ListView} will display list items for each word in the list of words.

        // Do this by calling the setAdapter method on the {@link ListView} object and pass in

        // 1 argument, which is the {@link ArrayAdapter} with the variable name itemsAdapter.
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Word word = words.get(position);
                MediaPlayer mMediaPlayer = MediaPlayer.create(FamilyActivity.this, word.getAudioResourceId());
                mMediaPlayer.start();
            }
        });

    }
}


