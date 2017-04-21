package com.example.a15017519.p01_dailygoals;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final RadioGroup rg1 = (RadioGroup) findViewById(R.id.radioGroup1);
        final RadioGroup rg2 = (RadioGroup) findViewById(R.id.radioGroup2);
        final RadioGroup rg3 = (RadioGroup) findViewById(R.id.radioGroup3);

        final TextView tv1 = (TextView)findViewById(R.id.textViewGoal1);
        final TextView tv2 = (TextView)findViewById(R.id.textViewGoal2);
        final TextView tv3 = (TextView)findViewById(R.id.textViewGoal3);

        final EditText et = (EditText)findViewById(R.id.editTextReflect);

        Button btnOk = (Button)findViewById(R.id.buttonOk);

        btnOk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int selectedButtonId1 = rg1.getCheckedRadioButtonId();
                // Get the radio button object from the Id we had gotten above
                RadioButton rb1 = (RadioButton) findViewById(selectedButtonId1);
                String goal1 = tv1.getText().toString() + ":" + rb1.getText().toString();

                Intent i = new Intent(MainActivity.this,
                        Summary.class);
                // Pass the String array holding the name & age to new activity
                i.putExtra("goal1", goal1);
                int selectedButtonId2 = rg2.getCheckedRadioButtonId();
                // Get the radio button object from the Id we had gotten above
                RadioButton rb2 = (RadioButton) findViewById(selectedButtonId2);
                String goal2 = tv2.getText().toString() + ":" + rb2.getText().toString();
                i.putExtra("goal2", goal2);
                int selectedButtonId3 = rg3.getCheckedRadioButtonId();
                // Get the radio button object from the Id we had gotten above
                RadioButton rb3 = (RadioButton) findViewById(selectedButtonId3);
                String goal3 = tv3.getText().toString() + ":" + rb3.getText().toString();
                i.putExtra("goal3", goal3);

                String reflection = "Reflection:" +et.getText().toString();
                i.putExtra("reflection",reflection);
                // Start the new activity
                startActivity(i);
            }
        });
    }
}
