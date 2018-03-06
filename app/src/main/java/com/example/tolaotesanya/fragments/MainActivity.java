package com.example.tolaotesanya.fragments;

/*
@Tola Otesanya
4th March 2018
Simple app to create fragments so that you can use in different activities.
You can have multiple fragments in the same activity.
This example has 2 fragments - top to type in and bottom will have an image
Fragment need to be part of an activity - can't stand alone!
*/

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;


public class MainActivity extends AppCompatActivity implements TopFragment.TopSectionListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //This gets called by the top fragment when the user clicks the button
    @Override
    public void createMeme(String top, String bottom) {
        PictureFragment bottomFragment = (PictureFragment)getSupportFragmentManager().findFragmentById(R.id.fragment4);
        bottomFragment.setMemeText(top, bottom);
    }
}

