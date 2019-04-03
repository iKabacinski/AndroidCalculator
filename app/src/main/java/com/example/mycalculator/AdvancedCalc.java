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
                int len = wynik.length();
                if(wynik.length()!=0) {
                    String tekst = String.valueOf(wynik.getText());
                    wynik.setText(tekst.substring(1,len));
                }
                break;
            }
            case R.id.cButton:{
                c++;
                if(c==1) {
                    wynik.setText("0");
                }
                else{
                    wynik.setText("0");
                    valueOne= 0;
                    c=0;
                    add=false;
                    sub=false;
                    mul=false;
                    div=false;
                    pow=false;
                    log=false;
                }

                break;
            }
            case R.id.plusMinusButton:{

                String sNumber = wynik.getText()+"";
                if(!sNumber.contains("-")){
                    wynik.setText("-"+wynik.getText());
                }
                else if(sNumber.contains("-")) {
                    float number = -1 * Float.parseFloat(wynik.getText() + "");
                    wynik.setText(number+"");
                }
                break;
            }
            case R.id.slashButton:{
                if(wynik.getText()!=null)
                {
                    valueOne = Float.parseFloat("0"+wynik.getText() + "0");
                    div = true;
                    wynik.setText("0");
                }
                break;
            }
            case R.id.multileButton:{
                if(wynik.getText()!=null)
                {
                    valueOne = Float.parseFloat("0"+wynik.getText() + "0");
                    mul = true;
                    wynik.setText("0");
                }
                break;
            }
            case R.id.minusButton:{
                if(wynik.getText()!=null)
                {
                    valueOne = Float.parseFloat("0"+wynik.getText() + "0");
                    add = true;
                    wynik.setText("0");
                }
                break;
            }
            case R.id.plusButton:{
                if(wynik.getText()!=null)
                {
                    valueOne = Float.parseFloat("0"+wynik.getText() + "");
                    add = true;
                    wynik.setText("0");
                }
                break;
            }
            case R.id.resultButton:{
                valueTwo=Float.parseFloat("0"+wynik.getText()+"");
                if(add)
                {
                    wynik.setText(valueOne+valueTwo+"");
                    add=false;
                }
                if(sub)
                {
                    wynik.setText(valueOne-valueTwo+"");
                    sub=false;
                }
                if(mul)
                {
                    wynik.setText(valueOne*valueTwo+"");
                    mul=false;
                }
                if(div){
                    if (valueTwo==0)
                        Toast.makeText(getApplicationContext(),"Nie można dzielić przez 0!!!",Toast.LENGTH_SHORT).show();

                    else if (valueTwo!=0){
                        wynik.setText(valueOne / valueTwo + "");
                        div=false;
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
                    Toast.makeText(getApplicationContext(),"Zawiera już separator dziesiętny",Toast.LENGTH_SHORT).show();
                else
                    wynik.setText(wynik.getText() + ".");

                break;
            }
            // Advanced operations
            case R.id.sinButton:{
                valueTwo= Float.parseFloat("0"+wynik.getText()+"");
                wynik.setText(Math.sin(valueTwo)+"");
                break;
            }
            case R.id.cosButton:{
                valueTwo= Float.parseFloat("0"+wynik.getText()+"");
                wynik.setText(Math.cos(valueTwo)+"");
                break;
            }
            case R.id.tanButton:{
                valueTwo= Float.parseFloat("0"+wynik.getText()+"");
                wynik.setText(Math.tan(valueTwo)+"");
                break;
            }
            case R.id.sqrtButton:{
                valueTwo= Float.parseFloat("0"+wynik.getText()+"");
                wynik.setText(Math.sqrt(valueTwo)+"");
                break;
            }
            case R.id.pow2Button:{
                valueTwo= Float.parseFloat("0"+wynik.getText()+"");
                wynik.setText(Math.pow(valueTwo,2)+"");
                break;
            }
            case R.id.lnButton:{
                valueTwo= Float.parseFloat("0"+wynik.getText()+"");
                wynik.setText(Math.log(valueTwo)+"");
                break;
            }
            case R.id.xpowYButton:{
                valueOne = Float.parseFloat("0"+wynik.getText()+"");
                pow=true;
                wynik.setText("0");
                break;
            }
            case R.id.logButton:{
                valueOne = Float.parseFloat("0"+wynik.getText()+"");
                log=true;
                wynik.setText("0");
                break;
            }


        }

    }

}
