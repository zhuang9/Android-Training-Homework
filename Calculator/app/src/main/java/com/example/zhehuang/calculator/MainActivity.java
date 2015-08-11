package com.example.zhehuang.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button b0, b1, b2, b3, b4, b5, b6, b7, b8, b9, bClear, bDel, bPercent, bDivide, bMultiply, bMinus, bPlus, bDot, bEqual;
    private EditText playET;

    private StringBuilder display = new StringBuilder();
    private String operation = "";
    private String result;
    private double num1, num2;
    private boolean flag = true;
    private boolean b_Minus, b_Multiply, b_Divide;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b0 = (Button) findViewById(R.id.zero);
        b1 = (Button) findViewById(R.id.one);
        b2 = (Button) findViewById(R.id.two);
        b3 = (Button) findViewById(R.id.three);
        b4 = (Button) findViewById(R.id.four);
        b5 = (Button) findViewById(R.id.five);
        b6 = (Button) findViewById(R.id.six);
        b7 = (Button) findViewById(R.id.seven);
        b8 = (Button) findViewById(R.id.eight);
        b9 = (Button) findViewById(R.id.nine);
        bClear = (Button) findViewById(R.id.clear);
        bDel = (Button) findViewById(R.id.delete);
        bPercent = (Button) findViewById(R.id.percent);
        bDivide = (Button) findViewById(R.id.devide);
        bMultiply = (Button) findViewById(R.id.multiply);
        bMinus = (Button) findViewById(R.id.minus);
        bPlus = (Button) findViewById(R.id.plus);
        bDot = (Button) findViewById(R.id.dot);
        bEqual = (Button) findViewById(R.id.equal);
        playET = (EditText) findViewById(R.id.playET);

        playET.setText("0.0");

        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display.append("0");
                playET.setText(display.toString());
            }
        });

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display.append("1");
                playET.setText(display.toString());
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display.append("2");
                playET.setText(display.toString());
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display.append("3");
                playET.setText(display.toString());
            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display.append("4");
                playET.setText(display.toString());
            }
        });

        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display.append("5");
                playET.setText(display.toString());
            }
        });

        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display.append("6");
                playET.setText(display.toString());
            }
        });

        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display.append("7");
                playET.setText(display.toString());
            }
        });

        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display.append("8");
                playET.setText(display.toString());
            }
        });

        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display.append("9");
                playET.setText(display.toString());
            }
        });

        bClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operation = "+";
                display = new StringBuilder("");
                result = null;
                num1 = 0;
                num2 = 0;
                flag = true;
                b_Divide = false;
                b_Minus = false;
                b_Multiply = false;
                playET.setText("0.0");
            }
        });

        bDel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (display.length() != 0) {
                    display.deleteCharAt(display.length() - 1);
                    playET.setText(display.toString());
                }
            }
        });

        bPercent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        bDivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operation = "/";

                if (!b_Divide && !(display.toString() == "")) {
                    num1 = Double.parseDouble(display.toString());
                    playET.setText(String.valueOf(num1));
                    display = new StringBuilder("");
                    b_Divide = true;
                } else {
                    if (!(display.toString() == "")) {
                        if (Double.parseDouble(display.toString()) == 0) {
                            Toast.makeText(getApplicationContext(), "The dividend can not be 0!", Toast.LENGTH_LONG).show();
                        } else {
                            num1 /= Double.parseDouble(display.toString());
                            display = new StringBuilder("");
                        }
                    }
                    if (!(result == null)) {
                        num1 = Double.parseDouble(result);
                        result = null;
                    }
                    playET.setText(String.valueOf(num1));
                }
                flag = true;
            }
        });

        bMultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operation = "*";

                if (!b_Multiply && !(display.toString() == "")) {
                    num1 = Double.parseDouble(display.toString());
                    playET.setText(String.valueOf(num1));
                    display = new StringBuilder("");
                    b_Multiply = true;
                } else {
                    if (!(display.toString() == "")) {
                        num1 *= Double.parseDouble(display.toString());
                        display = new StringBuilder("");
                    }
                    if (!(result == null)) {
                        num1 = Double.parseDouble(result);
                        result = null;
                    }
                    playET.setText(String.valueOf(num1));
                }
                flag = true;
            }
        });

        bMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operation = "-";

                if (!b_Minus && !(display.toString() == "")) {
                    num1 = Double.parseDouble(display.toString());
                    playET.setText(String.valueOf(num1));
                    display = new StringBuilder("");
                    b_Minus = true;
                } else {
                    if (!(display.toString() == "")) {
                        num1 -= Double.parseDouble(display.toString());
                        display = new StringBuilder("");
                    }
                    if (!(result == null)) {
                        num1 = Double.parseDouble(result);
                        result = null;
                    }
                    playET.setText(String.valueOf(num1));
                }
                flag = true;
            }
        });

        bPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operation = "+";

                if (!(display.toString() == "")) {
                    num1 += Double.parseDouble(display.toString());
                    display = new StringBuilder("");
                }
                if (!(result == null)) {
                    num1 = Double.parseDouble(result);
                    result = null;
                }
                playET.setText(String.valueOf(num1));
                flag = true;
            }
        });

        bDot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (flag) {
                    display.append(".");
                    flag = false;
                }
            }
        });

        bEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (operation.equals("+")) {
                    num2 = Double.parseDouble(display.toString());
                    result = String.valueOf((num1 + num2));
                    playET.setText(result);
                    display = new StringBuilder("");
                }
                if (operation.equals("-")) {
                    num2 = Double.parseDouble(display.toString());
                    result = String.valueOf((num1 - num2));
                    playET.setText(result);
                    display = new StringBuilder("");
                }
                if (operation.equals("*")) {
                    num2 = Double.parseDouble(display.toString());
                    result = String.valueOf((num1 * num2));
                    playET.setText(result);
                    display = new StringBuilder("");
                }
                if (operation.equals("/")) {
                    num2 = Double.parseDouble(display.toString());
                    if (!(num2 == 0)) {
                        result = String.valueOf((num1 / num2));
                        playET.setText(result);
                    } else {
                        Toast.makeText(getApplicationContext(), "The dividend can not be 0!", Toast.LENGTH_LONG).show();
                    }
                    display = new StringBuilder("");
                }
            }
        });

        playET.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

    }

}