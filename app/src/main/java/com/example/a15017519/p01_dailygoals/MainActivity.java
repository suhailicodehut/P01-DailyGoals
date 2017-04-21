package com.example.a15017519.p01_dailygoals;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RadioGroup rg1 = (RadioGroup) findViewById(R.id.radioGroup1);
        RadioGroup rg2 = (RadioGroup) findViewById(R.id.radioGroup2);
        RadioGroup rg3 = (RadioGroup) findViewById(R.id.radioGroup3);

        TextView tv1 = (TextView)findViewById(R.id.textViewGoal1);
        TextView tv2 = (TextView)findViewById(R.id.textViewGoal2);
        TextView tv3 = (TextView)findViewById(R.id.textViewGoal3);


    }
}
