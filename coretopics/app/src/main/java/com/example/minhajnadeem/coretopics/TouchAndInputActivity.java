package com.example.minhajnadeem.coretopics;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.minhajnadeem.coretopics.fragments.touchandinput.InputEventFragment;

public class TouchAndInputActivity extends AppCompatActivity {

    private int idFragmentContainer;
    private FragmentManager fragmentManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_touch_and_input);

        idFragmentContainer = R.id.fragment_container;
        fragmentManager = getSupportFragmentManager();

    }

    public void onClickInputEvent(View view) {
        InputEventFragment inputEventFragment = new InputEventFragment();
        fragmentManager
                .beginTransaction()
                .replace(idFragmentContainer,inputEventFragment)
                .commit();

    }
}
