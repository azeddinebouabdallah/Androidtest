package com.cocoapp.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText number1 = (EditText) findViewById(R.id.n1Input);
        final EditText number2 = (EditText) findViewById(R.id.n2Input);
        final TextView result = (TextView) findViewById(R.id.result);
        Button Bu = (Button) findViewById(R.id.sumButton);

        Bu.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {

                int sum = Integer.parseInt( number1.getText().toString());
                int n1 = Integer.parseInt( number2.getText().toString());
                sum += n1;



                result.setText("The result is: " + String.valueOf(sum));




            }
        });


    }
}
