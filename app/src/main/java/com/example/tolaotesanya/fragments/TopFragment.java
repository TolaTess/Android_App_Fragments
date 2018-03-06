package com.example.tolaotesanya.fragments;

/*
 * Created by tolaotesanya on 04/03/2018.
 * few rules to follow to create a fragments.
 * 1. extend from the main class Fragment
 * 2. need to override onCreateView
 *
 */


import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.app.Activity;
import android.widget.Button;
import android.widget.EditText;

public class TopFragment extends Fragment {

    private static EditText topTextInput;
    private static EditText bottomTextInput;

    TopSectionListener activityCommander;

    public interface TopSectionListener{
         public void createMeme(String top, String bottom);

    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        try {
            activityCommander = (TopSectionListener)context;
        }catch (ClassCastException e){
            throw new ClassCastException(context.toString());
        }
    }


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.top_fragment, container, false);

        topTextInput = view.findViewById(R.id.topTextInput);
        bottomTextInput = view.findViewById(R.id.bottomTextInput);
        final Button button = view.findViewById(R.id.button);

        button.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        buttonClicked(v);
                    }
                }
        );
        return view;
    }

    //calls this when the button is clicked
    public void buttonClicked(View v){
        activityCommander.createMeme(topTextInput.getText().toString(), bottomTextInput.getText().toString());


    }

}

