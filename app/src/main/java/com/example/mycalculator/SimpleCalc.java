package com.example.mycalculator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;


public class SimpleCalc extends AppCompatActivity implements View.OnClickListener {
    Button zeroButton, oneButton, twoButton, threeButton, fourButton, fiveButton, sixButton, eightButton, nineButton,
            sevenButton, bkspButton, cButton, plusMinusButton, slashButton, plusButton, minusButton, multipleButton, resultButton, pointButton;
    TextView wynik;
    private int c = 0;
    float valueOne = 0, valueTwo = 0;
    boolean add, sub, mul, div;
    String tekst;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simple_calc);

        zeroButton = findViewById(R.id.zeroButton);
        zeroButton.setOnClickListener(this);

        oneButton = findViewById(R.id.oneButton);
        oneButton.setOnClickListener(this);

        twoButton = findViewById(R.id.twoButton);
        twoButton.setOnClickListener(this);

        threeButton = findViewById(R.id.threeButton);
        threeButton.setOnClickListener(this);

        fourButton = findViewById(R.id.fourButton);
        fourButton.setOnClickListener(this);

        fiveButton = findViewById(R.id.fiveButton);
        fiveButton.setOnClickListener(this);

        sixButton = findViewById(R.id.sixButton);
        sixButton.setOnClickListener(this);

        sevenButton = findViewById(R.id.sevenButton);
        sevenButton.setOnClickListener(this);

        eightButton = findViewById(R.id.eightButton);
        eightButton.setOnClickListener(this);

        nineButton = findViewById(R.id.nineButton);
        nineButton.setOnClickListener(this);

        bkspButton = findViewById(R.id.bkspButton);
        bkspButton.setOnClickListener(this);

        cButton = findViewById(R.id.cButton);
        cButton.setOnClickListener(this);

        plusMinusButton = findViewById(R.id.plusMinusButton);
        plusMinusButton.setOnClickListener(this);

        slashButton = findViewById(R.id.slashButton);
        slashButton.setOnClickListener(this);

        plusButton = findViewById(R.id.plusButton);
        plusButton.setOnClickListener(this);

        minusButton = findViewById(R.id.minusButton);
        minusButton.setOnClickListener(this);

        multipleButton = findViewById(R.id.multileButton);
        multipleButton.setOnClickListener(this);

        resultButton = findViewById(R.id.resultButton);
        resultButton.setOnClickListener(this);

        pointButton = findViewById(R.id.pointButton);
        pointButton.setOnClickListener(this);

        wynik = findViewById(R.id.wynik);
        wynik.setOnClickListener(this);
        wynik.setText("0");

    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putString("wynik", wynik.getText() + "");
        outState.putFloat("valueOne", valueOne);
        outState.putFloat("valueTwo", valueTwo);
        outState.putBoolean("div", div);
        outState.putBoolean("mul", mul);
        outState.putBoolean("add", add);
        outState.putBoolean("sub", sub);
    }


    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        String tekst = savedInstanceState.getString("wynik");
        wynik.setText(tekst);
        float firstValue = savedInstanceState.getFloat("valueOne", valueOne);
        valueOne = firstValue;
        float secondValue = savedInstanceState.getFloat("valueTwo", valueTwo);
        valueTwo = secondValue;

        Boolean adding = savedInstanceState.getBoolean("add", add);
        add = adding;
        Boolean subbin = savedInstanceState.getBoolean("sub", sub);
        sub = subbin;
        Boolean mullin = savedInstanceState.getBoolean("mul", mul);
        mul = mullin;
        Boolean divid = savedInstanceState.getBoolean("div", div);
        div = divid;

        super.onRestoreInstanceState(savedInstanceState);
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()) {

            case R.id.zeroButton: {
                tekst = wynik.getText() + "";
                if (tekst.contains("Infinity") || tekst.contains("NaN") || tekst.equals("0")) {
                    wynik.setText("0");
                } else
                    wynik.setText(wynik.getText() + "0");

                break;
            }
            case R.id.oneButton: {
                tekst = wynik.getText() + "";
                if (tekst.contains("Infinity") || tekst.contains("NaN") || tekst.equals("0")) {
                    wynik.setText("1");
                } else
                    wynik.setText(wynik.getText() + "1");

                break;
            }
            case R.id.twoButton: {
                tekst = wynik.getText() + "";
                if (tekst.contains("Infinity") || tekst.contains("NaN") || tekst.equals("0")) {
                    wynik.setText("2");
                } else
                    wynik.setText(wynik.getText() + "2");

                break;
            }
            case R.id.threeButton: {
                tekst = wynik.getText() + "";
                if (tekst.contains("Infinity") || tekst.contains("NaN") || tekst.equals("0")) {
                    wynik.setText("3");
                } else
                    wynik.setText(wynik.getText() + "3");

                break;
            }
            case R.id.fourButton: {
                tekst = wynik.getText() + "";
                if (tekst.contains("Infinity") || tekst.contains("NaN") || tekst.equals("0")) {
                    wynik.setText("4");
                } else
                    wynik.setText(wynik.getText() + "4");

                break;
            }
            case R.id.fiveButton: {
                tekst = wynik.getText() + "";
                if (tekst.contains("Infinity") || tekst.contains("NaN") || tekst.equals("0")) {
                    wynik.setText("5");
                } else
                    wynik.setText(wynik.getText() + "5");

                break;
            }
            case R.id.sixButton: {
                tekst = wynik.getText() + "";
                if (tekst.contains("Infinity") || tekst.contains("NaN") || tekst.equals("0")) {
                    wynik.setText("6");
                } else
                    wynik.setText(wynik.getText() + "6");

                break;
            }
            case R.id.sevenButton: {
                tekst = wynik.getText() + "";
                if (tekst.contains("Infinity") || tekst.contains("NaN") || tekst.equals("0")) {
                    wynik.setText("7");
                } else
                    wynik.setText(wynik.getText() + "7");

                break;
            }
            case R.id.eightButton: {
                tekst = wynik.getText() + "";
                if (tekst.contains("Infinity") || tekst.contains("NaN") || tekst.equals("0")) {
                    wynik.setText("8");
                } else
                    wynik.setText(wynik.getText() + "8");

                break;
            }
            case R.id.nineButton: {
                tekst = wynik.getText() + "";
                if (tekst.contains("Infinity") || tekst.contains("NaN") || tekst.equals("0")) {
                    wynik.setText("9");
                } else
                    wynik.setText(wynik.getText() + "9");

                break;
            }
            case R.id.bkspButton: {
                tekst = wynik.getText() + "";
                if (tekst.contains("Infinity") || tekst.contains("NaN")) {
                    Toast.makeText(getApplicationContext(), "Zamieniam na 0", Toast.LENGTH_SHORT).show();
                    wynik.setText("0");
                }
                int len = wynik.length();
                if (wynik.length() != 0) {
                    wynik.setText(tekst.substring(0, len - 1));
                }
                break;
            }
            case R.id.cButton: {
                c++;
                if (c == 1) {
                    wynik.setText("0");
                } else {
                    wynik.setText("0");
                    valueOne = 0;
                    c = 0;
                    mul = false;
                    div = false;
                    add = false;
                    sub = false;
                    Toast.makeText(getApplicationContext(), "WYZEROWANO WSZYSTKO", Toast.LENGTH_SHORT).show();

                }

                break;
            }
            case R.id.plusMinusButton: {

                tekst = wynik.getText() + "";


                if (tekst.contains("Infinity") || tekst.contains("NaN")) {
                    Toast.makeText(getApplicationContext(), "Zamieniam na 0", Toast.LENGTH_SHORT).show();
                    wynik.setText("0");
                }


                if (!tekst.contains("-")) {

                    wynik.setText("-" + wynik.getText());
                } else if (tekst.contains("-")) {
                    if (tekst.equals("-"))
                        wynik.setText("");
                    else {
                        float number = -1 * Float.parseFloat(wynik.getText() + "");
                        wynik.setText(number + "");
                    }
                }
                break;
            }
            case R.id.slashButton: {
                add=false;
                sub=false;
                mul=false;

                tekst = wynik.getText() + "";
                if (tekst.contains("Infinity") || tekst.isEmpty() || tekst.equals(".") || tekst.contains("NaN") || tekst.equals("-")) {
                    Toast.makeText(getApplicationContext(), "Zamieniam pierwszy operand na 0", Toast.LENGTH_SHORT).show();
                    wynik.setText("0");
                }
                valueOne = 0 + Float.parseFloat(wynik.getText() + "");
                div = true;
                wynik.setText("0");

                break;
            }
            case R.id.multileButton: {
                add=false;
                sub=false;
                div=false;

                tekst = wynik.getText() + "";
                if (tekst.contains("Infinity") || tekst.isEmpty() || tekst.equals(".") || tekst.contains("NaN") || tekst.equals("-")) {
                    Toast.makeText(getApplicationContext(), "Zamieniam pierwszy na 0", Toast.LENGTH_SHORT).show();
                    wynik.setText("0");
                }
                valueOne = 0 + Float.parseFloat(wynik.getText() + "");
                mul = true;
                wynik.setText("0");

                break;
            }
            case R.id.minusButton: {
                add=false;
                div=false;
                mul=false;

                tekst = wynik.getText() + "";
                if (tekst.contains("Infinity") || tekst.isEmpty() || tekst.equals(".") || tekst.contains("NaN") || tekst.equals("-")) {
                    Toast.makeText(getApplicationContext(), "Zamieniam pierwszy operand infinity na 0", Toast.LENGTH_SHORT).show();
                    wynik.setText("0");
                }
                valueOne = 0 + Float.parseFloat(wynik.getText() + "");
                sub = true;
                wynik.setText("0");

                break;
            }
            case R.id.plusButton: {
                sub=false;
                div=false;
                mul=false;
                tekst = wynik.getText() + "";
                if (tekst.contains("Infinity") || tekst.isEmpty() || tekst.equals(".") || tekst.contains("NaN") || tekst.equals("-")) {
                    Toast.makeText(getApplicationContext(), "Zamieniam pierwszy operand na 0", Toast.LENGTH_SHORT).show();
                    wynik.setText("0");
                }
                valueOne = 0 + Float.parseFloat(wynik.getText() + "");
                add = true;
                wynik.setText("0");

                break;
            }
            case R.id.resultButton: {
                if ((wynik.getText() + "").isEmpty() || (wynik.getText() + "").equals(".") || (wynik.getText()+"").contains("NaN") || (wynik.getText()+"").equals("-")) {
                    wynik.setText("0");
                } else
                    valueTwo = 0 + Float.parseFloat(wynik.getText() + "");

                if (add) {
                    wynik.setText(valueOne + valueTwo + "");
                    valueOne = 0;
                    valueTwo = 0;
                    add = false;
                }
                if (sub) {
                    wynik.setText(valueOne - valueTwo + "");
                    valueOne = 0;
                    valueTwo = 0;
                    sub = false;
                }
                if (mul) {
                    wynik.setText(valueOne * valueTwo + "");
                    valueOne = 0;
                    valueTwo = 0;
                    mul = false;
                }
                if (div) {
                    if (valueTwo == 0) {
                        Toast.makeText(getApplicationContext(), "Nie można dzielić przez 0", Toast.LENGTH_SHORT).show();

                    } else if (valueTwo != 0) {
                        wynik.setText(valueOne / valueTwo + "");
                        valueOne = 0;
                        valueTwo = 0;
                        div = false;
                    }

                }
                break;
            }
            case R.id.pointButton: {
                String liczba = String.valueOf(wynik.getText());
                if (liczba.contains("."))
                    Toast.makeText(getApplicationContext(), "Zawiera już separator dziesiętny", Toast.LENGTH_SHORT).show();
                else
                    wynik.setText(wynik.getText() + ".");

                break;
            }


        }
    }

    @Override
    public void onBackPressed() {
        Intent main = new Intent(this, MainActivity.class);
        startActivity(main);

    }


}
