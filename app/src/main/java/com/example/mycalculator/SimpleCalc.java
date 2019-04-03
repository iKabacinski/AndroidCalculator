package com.example.mycalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class SimpleCalc extends AppCompatActivity implements View.OnClickListener {
   Button zeroButton, oneButton,twoButton,threeButton,fourButton,fiveButton,sixButton,eightButton,nineButton,
    sevenButton,bkspButton,cButton,plusMinusButton,slashButton,plusButton,minusButton,multipleButton,resultButton,pointButton;
    EditText wynik;
    private int c=0;
    float valueOne=0, valueTwo=0;
    boolean add, sub, mul, div;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simple_calc);
         zeroButton =  findViewById(R.id.zeroButton);
        zeroButton.setOnClickListener(this);

         oneButton =  findViewById(R.id.oneButton);
        oneButton.setOnClickListener(this);

         twoButton =  findViewById(R.id.twoButton);
        twoButton.setOnClickListener(this);

         threeButton =  findViewById(R.id.threeButton);
        threeButton.setOnClickListener(this);

         fourButton =  findViewById(R.id.fourButton);
        fourButton.setOnClickListener(this);

         fiveButton = findViewById(R.id.fiveButton);
        fiveButton.setOnClickListener(this);

         sixButton =  findViewById(R.id.sixButton);
        sixButton.setOnClickListener(this);

         sevenButton = findViewById(R.id.sevenButton);
        sevenButton.setOnClickListener(this);

         eightButton =  findViewById(R.id.eightButton);
        eightButton.setOnClickListener(this);

         nineButton =  findViewById(R.id.nineButton);
        nineButton.setOnClickListener(this);

         bkspButton =  findViewById(R.id.bkspButton);
        bkspButton.setOnClickListener(this);

         cButton =  findViewById(R.id.cButton);
        cButton.setOnClickListener(this);

         plusMinusButton =  findViewById(R.id.plusMinusButton);
        plusMinusButton.setOnClickListener(this);

         slashButton = findViewById(R.id.slashButton);
        slashButton.setOnClickListener(this);

         plusButton = findViewById(R.id.plusButton);
        plusButton.setOnClickListener(this);

         minusButton =  findViewById(R.id.minusButton);
        minusButton.setOnClickListener(this);

         multipleButton =  findViewById(R.id.multileButton);
        multipleButton.setOnClickListener(this);

         resultButton =  findViewById(R.id.resultButton);
        resultButton.setOnClickListener(this);

         pointButton =  findViewById(R.id.pointButton);
        pointButton.setOnClickListener(this);

        wynik =  findViewById(R.id.wynik);
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
                    wynik.setText(tekst.substring(length-(length - 1)));
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
                    c=0;}

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

                valueOne = Float.parseFloat(wynik.getText() + "");
                div = true;
                wynik.setText("0");
                break;
            }
            case R.id.multileButton:{
                valueOne = Float.parseFloat(wynik.getText() + "");
                mul = true;
                wynik.setText("0");

                break;
            }
            case R.id.minusButton:{

                    valueOne = Float.parseFloat(wynik.getText()+"");
                    add=true;
                    wynik.setText("0");

                break;
            }
            case R.id.plusButton:{

                    valueOne = Float.parseFloat(wynik.getText()+"");
                    add=true;
                    wynik.setText("0");

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
                        Toast.makeText(getApplicationContext(),"Nie można dzielić przez 0!!!",Toast.LENGTH_SHORT).show();
                    }
                    else {
                        wynik.setText(valueOne / valueTwo + "");
                        div = false;
                    }
                }
                break;
            }
            case R.id.pointButton:{
                String liczba= String.valueOf(wynik.getText());
                if(liczba.contains("."))
                {
                    Toast.makeText(getApplicationContext(),"Zawiera już separator dziesiętny",Toast.LENGTH_SHORT).show();
                }
                else
                wynik.setText(wynik.getText() + ".");

                break;
            }

        }

    }

}
