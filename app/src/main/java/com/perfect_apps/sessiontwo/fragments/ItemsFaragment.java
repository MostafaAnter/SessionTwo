package com.perfect_apps.sessiontwo.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.perfect_apps.sessiontwo.R;

/**
 * Created by mostafa_anter on 10/15/16.
 */

public class ItemsFaragment extends Fragment {
    public ItemsFaragment(){

    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.items_fragment,
                container, false);
        return view;
    }
}
