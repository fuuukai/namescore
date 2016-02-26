package com.dotinstall.namescore;

import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.Toast;

public class myform extends AppCompatActivity {

    public final static String EXTRA_MYNAME = "com.dotinstall.namescore.MYNAME";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_myform);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

   public void getScore(View view){
       EditText myEditText = (EditText)findViewById(R.id.myEditText);

       String myName = myEditText.getText().toString().trim();

       if(myName.equals("")) {
           myEditText.setError("Please enter your name!");

           Toast.makeText(
                   this,
                   "Please enter your name!",
                   Toast.LENGTH_LONG
           ).show();

/*           AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(this);
           alertDialogBuilder
                   .setTitle("Error!")
                   .setMessage("Please enter your name!")
                   .setPositiveButton("OK", null);
           AlertDialog alertDialog = alertDialogBuilder.create();
           alertDialog.show();*/

       }
       else {
           Intent intent = new Intent(this, my_result.class);
           intent.putExtra(EXTRA_MYNAME,myName);
           startActivity(intent);

       }

   }
}
