package com.example.minhajnadeem.coretopics;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickTouchAndInput(View view) {

        intent = new Intent(this,TouchAndInputActivity.class);
        startActivity(intent);
    }
}
