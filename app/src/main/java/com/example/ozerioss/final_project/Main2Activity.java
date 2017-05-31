package com.example.ozerioss.final_project;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.view.ViewGroup;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        // Get the intent from the first activity
        Intent intent = getIntent();
        String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);

        // Now we set the textview to the value entered in the first activity
        TextView textView = (TextView) findViewById(R.id.textView);
        textView.setText(message);
    }





}
