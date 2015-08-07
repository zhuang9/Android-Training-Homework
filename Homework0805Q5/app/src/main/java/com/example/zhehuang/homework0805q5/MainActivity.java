package com.example.zhehuang.homework0805q5;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button myButton1, myButton2, myButton3, myButton4, myButton5, myButton6, myButton7, myButton8, myButton9, myButton0, myButtonStar, myButtonNumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myButton1 = (Button) findViewById(R.id.button1);
        myButton2 = (Button) findViewById(R.id.button2);
        myButton3 = (Button) findViewById(R.id.button3);
        myButton4 = (Button) findViewById(R.id.button4);
        myButton5 = (Button) findViewById(R.id.button5);
        myButton6 = (Button) findViewById(R.id.button6);
        myButton7 = (Button) findViewById(R.id.button7);
        myButton8 = (Button) findViewById(R.id.button8);
        myButton9 = (Button) findViewById(R.id.button9);
        myButton0 = (Button) findViewById(R.id.button0);
        myButtonStar = (Button) findViewById(R.id.buttonstar);
        myButtonNumber = (Button) findViewById(R.id.buttonnumber);

        myButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"1",Toast.LENGTH_SHORT).show();
            }
        });

        myButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"2",Toast.LENGTH_SHORT).show();
            }
        });

        myButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"3",Toast.LENGTH_SHORT).show();
            }
        });

        myButton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"4",Toast.LENGTH_SHORT).show();
            }
        });

        myButton5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"5",Toast.LENGTH_SHORT).show();
            }
        });

        myButton6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"6",Toast.LENGTH_SHORT).show();
            }
        });

        myButton7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"7",Toast.LENGTH_SHORT).show();
            }
        });

        myButton8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"8",Toast.LENGTH_SHORT).show();
            }
        });

        myButton9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"9",Toast.LENGTH_SHORT).show();
            }
        });

        myButton0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"0",Toast.LENGTH_SHORT).show();
            }
        });

        myButtonStar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"*",Toast.LENGTH_SHORT).show();
            }
        });

        myButtonNumber.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"#",Toast.LENGTH_SHORT).show();
            }
        });
    }

}
