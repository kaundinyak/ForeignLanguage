package com.example.android.miwok;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.android.miwok.R;

/**
 * Created by KASIBHATLA on 02-Feb-18.
 */

public class Tab1Fragment extends Fragment {

    private static final String TAG = "Tab1Fragment";

    @Override
    @Nullable
    public View onCreateView(LayoutInflater inflater,@Nullable ViewGroup container,@Nullable Bundle savedInstanceState){

        View view = inflater.inflate(R.layout.tab1_fragment,container,false);
        return view;

    }
}
