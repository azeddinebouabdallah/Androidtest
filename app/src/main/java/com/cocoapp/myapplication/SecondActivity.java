package com.cocoapp.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by mac on 13/08/2017.
 */

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Bundle myBundle = getIntent().getExtras();

        int sum = myBundle.getInt("number1");
        int number2 = myBundle.getInt("number2");

        TextView result = (TextView) findViewById(R.id.result);
        Button myButton = (Button) findViewById(R.id.buttonReturn);

        sum += number2;
        result.setText(String.valueOf(sum));

        myButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent myIntent = new Intent(SecondActivity.class, MainActivity.class);

                startActivity(myIntent);

            }
        });






    }

}
