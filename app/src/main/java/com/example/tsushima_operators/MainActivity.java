package com.example.tsushima_operators;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        TextView display;
        display = findViewById(R.id.displayText);

        //Arithmetic operators
        //Assignment operators
        //Logical operators
        //Comparison operators

        //Addition
        //Subtraction
        //Multiplication
        //Division
        //Modulo (Division Operation Remainder)

        double x =0;
        //A double variable named x has been assigned a value of zero
        double y =0;

        x= 7;
        y= 3;

        display.setText(
                "The value between"+
                String.valueOf( x )+
                " and "+
                String.valueOf( y )+
                " \nin a modulo operation "+
                " is "+
                String.valueOf( x % y ));
        //Concatenation

    }
}