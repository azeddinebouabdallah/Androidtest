package com.cocoapp.myapplication;

import android.content.Intent;
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

        EditText number1 = (EditText) findViewById(R.id.n1Input);
        EditText number2 = (EditText) findViewById(R.id.n2Input);
        TextView result = (TextView) findViewById(R.id.result);

        int n1 = Integer.parseInt(number1.getText().toString());
        int n2 = Integer.parseInt(number2.getText().toString());

    public void calculatekSum(View view) {

        Intent myIntent = new Intent(this, SecondActivity.class);
        Bundle myBundle = new Bundle();

        myBundle.putInt("number1", n1);
        myBundle.putInt("number2", n2);

        myIntent.putExtras(myBundle);


        startActivity(myIntent);

    }


}
}

