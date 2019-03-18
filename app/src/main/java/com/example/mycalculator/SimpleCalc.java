package com.example.mycalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class SimpleCalc extends AppCompatActivity implements View.OnClickListener {
   Button zeroButton, oneButton,twoButton,threeButton,fourButton,fiveButton,sixButton,eightButton,nineButton,
    sevenButton,bkspButton,cButton,plusMinusButton,slashButton,plusButton,minusButton,multipleButton,resultButton,pointButton;
    EditText wynik;
    private int c=0;
    float valueOne, valueTwo;
    float number;
    boolean add, sub, mul, div;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simple_calc);
         zeroButton = (Button) findViewById(R.id.zeroButton);
        zeroButton.setOnClickListener(this);

         oneButton = (Button) findViewById(R.id.oneButton);
        oneButton.setOnClickListener(this);

         twoButton = (Button) findViewById(R.id.twoButton);
        twoButton.setOnClickListener(this);

         threeButton = (Button) findViewById(R.id.threeButton);
        threeButton.setOnClickListener(this);

         fourButton = (Button) findViewById(R.id.fourButton);
        fourButton.setOnClickListener(this);

         fiveButton = (Button) findViewById(R.id.fiveButton);
        fiveButton.setOnClickListener(this);

         sixButton = (Button) findViewById(R.id.sixButton);
        sixButton.setOnClickListener(this);

         sevenButton = (Button) findViewById(R.id.sevenButton);
        sevenButton.setOnClickListener(this);

         eightButton = (Button) findViewById(R.id.eightButton);
        eightButton.setOnClickListener(this);

         nineButton = (Button) findViewById(R.id.nineButton);
        nineButton.setOnClickListener(this);

         bkspButton = (Button) findViewById(R.id.bkspButton);
        bkspButton.setOnClickListener(this);

         cButton = (Button) findViewById(R.id.cButton);
        cButton.setOnClickListener(this);

         plusMinusButton = (Button) findViewById(R.id.plusMinusButton);
        plusMinusButton.setOnClickListener(this);

         slashButton = (Button) findViewById(R.id.slashButton);
        slashButton.setOnClickListener(this);

         plusButton = (Button) findViewById(R.id.plusButton);
        plusButton.setOnClickListener(this);

         minusButton = (Button) findViewById(R.id.minusButton);
        minusButton.setOnClickListener(this);

         multipleButton = (Button) findViewById(R.id.multileButton);
        multipleButton.setOnClickListener(this);

         resultButton = (Button) findViewById(R.id.resultButton);
        resultButton.setOnClickListener(this);

         pointButton = (Button) findViewById(R.id.pointButton);
        pointButton.setOnClickListener(this);

        wynik = (EditText) findViewById(R.id.wynik);
        wynik.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){

            case R.id.zeroButton:{
                wynik.setText(wynik.getText() + "0");

                break;
            }
            case R.id.oneButton:{
                wynik.setText(wynik.getText() + "1");

                break;
            }
            case R.id.twoButton:{
                wynik.setText(wynik.getText() + "2");

                break;
            }
            case R.id.threeButton:{
                wynik.setText(wynik.getText() + "3");

                break;
            }
            case R.id.fourButton:{
                wynik.setText(wynik.getText() + "4");

                break;
            }
            case R.id.fiveButton:{
                wynik.setText(wynik.getText() + "5");

                break;
            }
            case R.id.sixButton:{
                wynik.setText(wynik.getText() + "6");

                break;
            }
            case R.id.sevenButton:{
                wynik.setText(wynik.getText() + "7");

                break;
            }
            case R.id.eightButton:{
                wynik.setText(wynik.getText() + "8");

                break;
            }
            case R.id.nineButton:{
                wynik.setText(wynik.getText() + "9");

                break;
            }
            case R.id.bkspButton:{
                break;
            }
            case R.id.cButton:{
                c++;
                if(c==1) {
                    wynik.setText("");
                }
                else{
                    wynik.setText("");
                    valueOne= Float.parseFloat("");
                    valueTwo=Float.parseFloat("");
                    c=0;
                }
                break;
            }
            case R.id.plusMinusButton:{
                number = Float.parseFloat(wynik.getText() + "");
                if(number>0){
                    wynik.setText("-"+wynik.getText());
                }
                else {
                    number = -1*Float.parseFloat(wynik.getText() + "");
                    wynik.setText(number+"");
                }
                break;
            }
            case R.id.slashButton:{
                valueOne = Float.parseFloat(wynik.getText() + "");
                div = true;
                wynik.setText(null);
                break;
            }
            case R.id.multileButton:{
                valueOne = Float.parseFloat(wynik.getText() + "");
                mul = true;
                wynik.setText(null);

                break;
            }
            case R.id.minusButton:{

                    valueOne = Float.parseFloat(wynik.getText()+"");
                    add=true;
                    wynik.setText(null);

                break;
            }
            case R.id.plusButton:{
                if(wynik==null){
                    wynik.setText("");
                }
                else{
                    valueOne = Float.parseFloat(wynik.getText()+"");
                    add=true;
                    wynik.setText(null);
                }
                break;
            }
            case R.id.resultButton:{
                valueTwo=Float.parseFloat(wynik.getText()+"");
                if(add==true){
                    wynik.setText(valueOne+valueTwo+"");
                    add=false;
                }
                if(sub==true){
                    wynik.setText(valueOne-valueTwo+"");
                    sub=false;
                }
                if(mul==true){
                    wynik.setText(valueOne*valueTwo+"");
                    mul=false;
                }
                if(div==true){
                    wynik.setText(valueOne/valueTwo+"");
                    div=false;
                }
                break;
            }
            case R.id.pointButton:{
                wynik.setText(wynik.getText() + ".");

                break;
            }

        }

    }

}
