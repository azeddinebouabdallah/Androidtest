package com.cocoapp.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);







    }

    public void calculateSum(View view) {
        Intent myIntent = new Intent(this, SecondActivity.class);
        Bundle myBundle = new Bundle();
        EditText num1 = (EditText) findViewById(R.id.n1Input);
        EditText num2 = (EditText) findViewById(R.id.n2Input);
        int n1 = Integer.parseInt(num1.getText().toString());
        int n2 = Integer.parseInt(num2.getText().toString());

        myBundle.putInt("number1", n1);
        myBundle.putInt("number2", n2);

        try{

        myIntent.putExtras(myBundle);
        startActivity(myIntent);

        } catch (Exception e){

            Toast.makeText(this, "Error in Intent" , Toast.LENGTH_LONG).show();

        }

    }
}


