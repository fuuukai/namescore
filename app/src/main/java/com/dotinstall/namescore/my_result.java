package com.dotinstall.namescore;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class my_result extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_result);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Intent intent = getIntent();
        String myName = intent.getStringExtra(myform.EXTRA_MYNAME);
        TextView namelabl = (TextView)findViewById(R.id.nameLabel);
        namelabl.setText(myName + "の点数は...");

        Random randomGenerator = new Random();
        int score = randomGenerator.nextInt(101); //0-100
        TextView scorelabl = (TextView)findViewById(R.id.scoreLabel);
        scorelabl.setText(String.valueOf(score)+ "点!!");

    }

}
