package com.example.android.miwok;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import static com.example.android.miwok.R.layout.german_month_item;
import static com.example.android.miwok.R.layout.month_item;
import static com.example.android.miwok.R.layout.spanish_month_item;
import static com.example.android.miwok.R.layout.spanish_week_item;
import static com.example.android.miwok.R.layout.week_item;

/**
 * Created by KASIBHATLA on 08-Nov-17.
 */

public class MonthsGermanAdapter extends ArrayAdapter<WordGerman> {

    public MonthsGermanAdapter(Activity context, ArrayList<WordGerman> words) {

        // Here, we initialize the ArrayAdapter's internal storage for the context and the list.

        // the second argument is used when the ArrayAdapter is populating a single TextView.

        // Because this is a custom adapter for two TextViews and an ImageView, the adapter is not

        // going to use this second argument, so it can be any value. Here, we used 0.

        super(context, 0, words);

    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        // Check if the existing view is being reused, otherwise inflate the view

        View listItemView = convertView;

        if(listItemView == null) {

            listItemView = LayoutInflater.from(getContext()).inflate(

                    german_month_item, parent, false);

        }



        // Get the {@link AndroidFlavor} object located at this position in the list

        WordGerman currentWord = getItem(position);



        // Find the TextView in the list_item.xml layout with the ID version_name

        TextView monthTextView = (TextView) listItemView.findViewById(R.id.month_text_view);

        // Get the version name from the current AndroidFlavor object and

        // set this text on the name TextView

        monthTextView.setText(currentWord.getmGermanTranslation());



        // Find the TextView in the list_item.xml layout with the ID version_number

        TextView defaultMonthTextView = (TextView) listItemView.findViewById(R.id.default_month_text_view);

        // Get the version number from the current AndroidFlavor object and

        // set this text on the number TextView

        defaultMonthTextView.setText(currentWord.getmDefaultTranslation());



        // Find the ImageView in the list_item.xml layout with the ID list_item_icon



        return listItemView;

    }
}
