package com.example.android.miwok;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

import static android.media.CamcorderProfile.get;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);

        final ArrayList<Word> words = new ArrayList<Word>();

        words.add(new Word("One","Un", R.drawable.number_one, R.raw.num_one));
        words.add(new Word("Two","Deux", R.drawable.number_two, R.raw.num_two));
        words.add(new Word("Three","Trois", R.drawable.number_three, R.raw.num_three));
        words.add(new Word("Four","Quatre", R.drawable.number_four, R.raw.num_four));
        words.add(new Word("Five","Cinq", R.drawable.number_five, R.raw.num_five));
        words.add(new Word("Six","Six", R.drawable.number_six, R.raw.num_six));
        words.add(new Word("Seven","Sept", R.drawable.number_seven, R.raw.num_seven));
        words.add(new Word("Eight","Huit", R.drawable.number_eight, R.raw.num_eight));
        words.add(new Word("Nine","Neuf", R.drawable.number_nine, R.raw.num_nine));
        words.add(new Word("Ten","Dix", R.drawable.number_ten, R.raw.num_ten));

        // Create an {@link ArrayAdapter}, whose data source is a list of Strings. The

        // adapter knows how to create layouts for each item in the list, using the

        // simple_list_item_1.xml layout resource defined in the Android framework.

        // This list item layout contains a single {@link TextView}, which the adapter will set to

        // display a single word.
        WordAdapter adapter = new WordAdapter(this, words);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.

        // There should be a {@link ListView} with the view ID called list, which is declared in the

        // activity_numbers.xml layout file.
        ListView listView = (ListView) findViewById(R.id.list);


        // Make the {@link ListView} use the {@link ArrayAdapter} we created above, so that the

        // {@link ListView} will display list items for each word in the list of words.

        // Do this by calling the setAdapter method on the {@link ListView} object and pass in

        // 1 argument, which is the {@link ArrayAdapter} with the variable name itemsAdapter.
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Word word = words.get(position);
                MediaPlayer mMediaPlayer = MediaPlayer.create(NumbersActivity.this, word.getAudioResourceId());
                mMediaPlayer.start();
            }
        });

    }
}
