package com.example.mycalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class AdvancedCalc extends AppCompatActivity implements View.OnClickListener {
    Button zeroButton, oneButton,twoButton,threeButton,fourButton,fiveButton,sixButton,eightButton,nineButton,
            sevenButton,bkspButton,cButton,plusMinusButton,slashButton,plusButton,minusButton,multipleButton,resultButton,pointButton,
            sinButton,cosButton,lnButton,logButton,xPowYButton,pow2Button,tanButton,sqrtButton;
    EditText wynik;
    private int c=0;
    float valueOne, valueTwo;
    boolean add, sub, mul, div,
    pow,log;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_advance_calc);
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

        sinButton = findViewById(R.id.sinButton);
        sinButton.setOnClickListener(this);

        cosButton = findViewById(R.id.cosButton);
        cosButton.setOnClickListener(this);

        tanButton = findViewById(R.id.tanButton);
        tanButton.setOnClickListener(this);

        lnButton = findViewById(R.id.lnButton);
        lnButton.setOnClickListener(this);

        sqrtButton = findViewById(R.id.sqrtButton);
        sqrtButton.setOnClickListener(this);

        pow2Button = findViewById(R.id.pow2Button);
        pow2Button.setOnClickListener(this);

        xPowYButton = findViewById(R.id.xpowYButton);
        xPowYButton.setOnClickListener(this);

        logButton = findViewById(R.id.logButton);
        logButton.setOnClickListener(this);

        wynik = findViewById(R.id.wynik);
        wynik.setOnClickListener(this);
        wynik.setText("0");
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
                int length = wynik.length();
                if(length!=0) {
                    String tekst = String.valueOf(wynik.getText());
                    wynik.setText(tekst.substring(length - (length - 1)));
                }
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
                    c=0;}

                break;
            }
            case R.id.plusMinusButton:{
                float number = Float.parseFloat(wynik.getText() + "");
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
                if(add){
                    wynik.setText(valueOne+valueTwo+"");
                    add=false;
                }
                if(sub){
                    wynik.setText(valueOne-valueTwo+"");
                    sub=false;
                }
                if(mul){
                    wynik.setText(valueOne*valueTwo+"");
                    mul=false;
                }
                if(div){
                    if (valueTwo==0){
                        Toast.makeText(getApplicationContext(),"Nie można dzielić przez 0!!!",Toast.LENGTH_LONG).show();
                        div =false;
                    }
                    else {
                        wynik.setText(valueOne / valueTwo + "");
                        div = false;
                    }
                }
                if(pow){
                    wynik.setText(Math.pow(valueOne,valueTwo)+"");
                    pow=false;
                }
                if(log){
                    wynik.setText(Math.log(valueOne)/Math.log(valueTwo)+"");
                }
                break;
            }
            case R.id.pointButton:{
                String liczba = String.valueOf(wynik.getText());
                if(liczba.contains("."))
                {
                    Toast.makeText(getApplicationContext(),"Zawiera już separator dziesiętny",Toast.LENGTH_LONG).show();
                }
                else
                    wynik.setText(wynik.getText() + ".");

                break;
            }
            // Advanced operations
            case R.id.sinButton:{
                valueTwo= Float.parseFloat(wynik.getText()+"");
                wynik.setText(Math.sin(valueTwo)+"");
                break;
            }
            case R.id.cosButton:{
                valueTwo= Float.parseFloat(wynik.getText()+"");
                wynik.setText(Math.cos(valueTwo)+"");
                break;
            }
            case R.id.tanButton:{
                valueTwo= Float.parseFloat(wynik.getText()+"");
                wynik.setText(Math.tan(valueTwo)+"");
                break;
            }
            case R.id.sqrtButton:{
                valueTwo= Float.parseFloat(wynik.getText()+"");
                wynik.setText(Math.sqrt(valueTwo)+"");
                break;
            }
            case R.id.pow2Button:{
                valueTwo= Float.parseFloat(wynik.getText()+"");
                wynik.setText(Math.pow(valueTwo,2)+"");
                break;
            }
            case R.id.lnButton:{
                valueTwo= Float.parseFloat(wynik.getText()+"");
                wynik.setText(Math.log(valueTwo)+"");
                break;
            }
            case R.id.xpowYButton:{
                valueOne = Float.parseFloat(wynik.getText()+"");
                pow=true;
                wynik.setText(null);
                break;
            }
            case R.id.logButton:{
                valueOne = Float.parseFloat(wynik.getText()+"");
                log=true;
                wynik.setText(null);
                break;
            }


        }

    }

}
