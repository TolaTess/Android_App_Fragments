package com.example.tolaotesanya.fragments;

/*
 * Created by tolaotesanya on 04/03/2018.
 * fragments do not communicate directly to one another
 * fragments need a medium = the main activity
 */


import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;

public class PictureFragment extends Fragment{

    private static TextView topid;
    private static TextView botid;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.bottom_fragment, container, false);
        topid = (TextView) view.findViewById(R.id.topid);
        botid = (TextView)view.findViewById(R.id.botid);
        return view;
    }

    //method to set text to new values passed in from the widgets
    public void setMemeText(String top, String bottom){
        topid.setText(top);
        botid.setText(bottom);
    }
}
