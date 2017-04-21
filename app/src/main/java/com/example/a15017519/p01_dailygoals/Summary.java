package com.example.a15017519.p01_dailygoals;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Summary extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_summary);

        TextView tv1 = (TextView) findViewById(R.id.textViewGoal1);
        TextView tv2 = (TextView) findViewById(R.id.textViewGoal2);
        TextView tv3 = (TextView) findViewById(R.id.textViewGoal3);
        TextView tvR = (TextView) findViewById(R.id.textViewReflection);
        Button btn = (Button)findViewById(R.id.button);

        Intent i = getIntent();
        // Get the String array named "info" we passed in
        String goal1 = i.getStringExtra("goal1");
        String goal2 = i.getStringExtra("goal2");
        String goal3 = i.getStringExtra("goal3");
        String reflect = i.getStringExtra("reflection");

        tv1.setText(goal1);
        tv2.setText(goal2);
        tv3.setText(goal3);
        tvR.setText(reflect);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Summary.this,
                        MainActivity.class);
                startActivity(i);
            }
        });
    }

}
