package com.example.mycalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class AdvancedCalc extends AppCompatActivity implements View.OnClickListener {
    Button zeroButton, oneButton,twoButton,threeButton,fourButton,fiveButton,sixButton,eightButton,nineButton,
            sevenButton,bkspButton,cButton,plusMinusButton,slashButton,plusButton,minusButton,multipleButton,resultButton,pointButton,
            sinButton,cosButton,lnButton,logButton,xPowYButton,pow2Button,tanButton,sqrtButton;
    TextView wynik;
    private int c=0;
    float valueOne, valueTwo;
    boolean add, sub, mul, div,
    pow,log;
    String tekst;


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

        threeButton = findViewById(R.id.threeButton );
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
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putString("wynik", wynik.getText()+"");
        outState.putFloat("valueOne",valueOne);
        outState.putFloat("valueTwo",valueTwo);
        outState.putBoolean("div",div);
        outState.putBoolean("mul",mul);
        outState.putBoolean("add",add);
        outState.putBoolean("sub",sub);
        outState.putBoolean("pow",pow);
        outState.putBoolean("log",log);


    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        String tekst = savedInstanceState.getString("wynik");
        wynik.setText(tekst);
        float firstValue = savedInstanceState.getFloat("valueOne",valueOne);
        valueOne =firstValue;
        float secondValue = savedInstanceState.getFloat("valueTwo",valueTwo);
        valueTwo =secondValue;

        Boolean adding = savedInstanceState.getBoolean("add",add);
        add =adding;
        Boolean subbin = savedInstanceState.getBoolean("sub",sub);
        sub = subbin;
        Boolean mullin = savedInstanceState.getBoolean("mul",mul);
        mul=mullin;
        Boolean divid = savedInstanceState.getBoolean("div",div);
        div = divid;
        Boolean logg = savedInstanceState.getBoolean("log",log);
        log = logg;
        Boolean power = savedInstanceState.getBoolean("pow",pow);
        pow=power;



        super.onRestoreInstanceState(savedInstanceState);
    }

    @Override
    public void onClick(View v) {


        switch (v.getId()){

            case R.id.zeroButton:{
                tekst =wynik.getText()+"";
                if(tekst.contains("Infinity")) {
                    Toast.makeText(getApplicationContext(), "Zamieniam infinity na 0!!!", Toast.LENGTH_SHORT).show();
                    wynik.setText("0");
                }
                wynik.setText(wynik.getText() + "0");

                break;
            }
            case R.id.oneButton:{
                tekst =wynik.getText()+"";
                if(tekst.contains("Infinity")) {
                    Toast.makeText(getApplicationContext(), "Zamieniam infinity na 1!!!", Toast.LENGTH_SHORT).show();
                    wynik.setText("1");
                }
                wynik.setText(wynik.getText() + "1");

                break;
            }
            case R.id.twoButton:{
                tekst =wynik.getText()+"";
                if(tekst.contains("Infinity")) {
                    Toast.makeText(getApplicationContext(), "Zamieniam infinity na 2!!!", Toast.LENGTH_SHORT).show();
                    wynik.setText("2");
                }
                wynik.setText(wynik.getText() + "2");

                break;
            }
            case R.id.threeButton :{
                tekst =wynik.getText()+"";
                if(tekst.contains("Infinity")) {
                    Toast.makeText(getApplicationContext(), "Zamieniam infinity na 3!!!", Toast.LENGTH_SHORT).show();
                    wynik.setText("3");
                }
                wynik.setText(wynik.getText() + "3");

                break;
            }
            case R.id.fourButton:{
                tekst =wynik.getText()+"";
                if(tekst.contains("Infinity")) {
                    Toast.makeText(getApplicationContext(), "Zamieniam infinity na 4!!!", Toast.LENGTH_SHORT).show();
                    wynik.setText("4");
                }
                wynik.setText(wynik.getText() + "4");

                break;
            }
            case R.id.fiveButton:{
                 tekst =wynik.getText()+"";
                if(tekst.contains("Infinity")) {
                    Toast.makeText(getApplicationContext(), "Zamieniam infinity na 5!!!", Toast.LENGTH_SHORT).show();
                    wynik.setText("5");
                }

                wynik.setText(wynik.getText() + "5");

                break;
            }
            case R.id.sixButton:{
                 tekst =wynik.getText()+"";
                if(tekst.contains("Infinity")) {
                    Toast.makeText(getApplicationContext(), "Zamieniam infinity na 6!!!", Toast.LENGTH_SHORT).show();
                    wynik.setText("6");
                }
                wynik.setText(wynik.getText() + "6");
                break;
            }
            case R.id.sevenButton:{
                tekst =wynik.getText()+"";
                if(tekst.contains("Infinity")) {
                    Toast.makeText(getApplicationContext(), "Zamieniam infinity na 7!!!", Toast.LENGTH_SHORT).show();
                    wynik.setText("7");
                }
                wynik.setText(wynik.getText() + "7");

                break;
            }
            case R.id.eightButton:{
                tekst =wynik.getText()+"";
                if(tekst.contains("Infinity")) {
                    Toast.makeText(getApplicationContext(), "Zamieniam infinity na 8!!!", Toast.LENGTH_SHORT).show();
                    wynik.setText("8");
                }
                wynik.setText(wynik.getText() + "8");

                break;
            }
            case R.id.nineButton:{
                tekst =wynik.getText()+"";
                if(tekst.contains("Infinity")) {
                    Toast.makeText(getApplicationContext(), "Zamieniam infinity na 9!!!", Toast.LENGTH_SHORT).show();
                    wynik.setText("9");
                }
                wynik.setText(wynik.getText() + "9");

                break;
            }
            case R.id.bkspButton:{
                tekst =wynik.getText()+"";
                if(tekst.contains("Infinity")) {
                    Toast.makeText(getApplicationContext(), "Zamieniam infinity na 0!!!", Toast.LENGTH_SHORT).show();
                    wynik.setText("0");
                }
                int len = wynik.length();
                if(wynik.length()!=0) {
                    wynik.setText(tekst.substring(0,len-1));
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
                    Toast.makeText(getApplicationContext(),"WYZEROWANO WSZYSTKO",Toast.LENGTH_SHORT).show();
                }

                break;
            }
            case R.id.plusMinusButton:{

                tekst = wynik.getText()+"";
                if(tekst.contains("Infinity")) {
                    Toast.makeText(getApplicationContext(), "Zamieniam na 0!!!", Toast.LENGTH_SHORT).show();
                    wynik.setText("0");
                }
                if(!tekst.contains("-")){
                    wynik.setText("-"+wynik.getText());
                }
                else if(tekst.contains("-")) {
                    float number = -1 * Float.parseFloat(wynik.getText() + "");
                    wynik.setText(number+"");
                }
                break;
            }
            case R.id.slashButton:{
                tekst = wynik.getText()+"";
                if(tekst.contains("Infinity")||tekst.isEmpty()||tekst.equals(".")) {
                    Toast.makeText(getApplicationContext(), "Zamieniam  na 0!!!", Toast.LENGTH_SHORT).show();
                    wynik.setText("0");
                }
                else {
                    valueOne = 0+Float.parseFloat(wynik.getText()+"");
                    div = true;
                    wynik.setText("0");
                }
                break;
            }
            case R.id.multileButton:{
                tekst = wynik.getText()+"";
                if(tekst.contains("Infinity")||tekst.isEmpty()||tekst.equals(".")) {
                    Toast.makeText(getApplicationContext(), "Zamieniam na 0!!!", Toast.LENGTH_SHORT).show();
                    wynik.setText("0");
                }
                else {
                    valueOne =0+ Float.parseFloat( wynik.getText()+"");
                    mul = true;
                    wynik.setText("0");
                }
                break;
            }
            case R.id.minusButton:{
                tekst = wynik.getText()+"";
                if(tekst.contains("Infinity")||tekst.isEmpty()||tekst.equals(".")) {
                    Toast.makeText(getApplicationContext(), "Zamieniam na 0!!!", Toast.LENGTH_SHORT).show();
                    wynik.setText("0");
                }
                else {
                    valueOne =0+ Float.parseFloat("0" + wynik.getText());
                    sub = true;
                    wynik.setText("0");
                }
                break;
            }
            case R.id.plusButton:{
                tekst = wynik.getText()+"";
                if(tekst.contains("Infinity")||tekst.isEmpty()||tekst.equals(".")) {
                    Toast.makeText(getApplicationContext(), "Zamieniam na 0!!!", Toast.LENGTH_SHORT).show();
                    wynik.setText("0");
                }
                else {

                    valueOne =0+ Float.parseFloat(wynik.getText()+"");
                    add = true;
                    wynik.setText("0");
                }
                break;
            }
            case R.id.resultButton:{
                if((wynik.getText()+"").isEmpty()||tekst.equals(".")){
                    Toast.makeText(getApplicationContext(), "Zamieniam na 0!!!", Toast.LENGTH_SHORT).show();
                    wynik.setText("0");
                }
                valueTwo=0+Float.parseFloat(wynik.getText()+"");
                if(add)
                {
                    wynik.setText(valueOne+valueTwo+"");
                    add=false;
                    valueOne=0;
                    valueTwo=0;
                }
                if(sub)
                {
                    wynik.setText(valueOne-valueTwo+"");
                    sub=false;
                    valueOne=0;
                    valueTwo=0;
                }
                if(mul)
                {
                    wynik.setText(valueOne*valueTwo+"");
                    mul=false;
                    valueOne=0;
                    valueTwo=0;
                }
                if(div){
                    if (valueTwo==0)
                        Toast.makeText(getApplicationContext(),"Nie można dzielić przez 0!!!",Toast.LENGTH_SHORT).show();

                    else if (valueTwo!=0){
                        wynik.setText(valueOne / valueTwo + "");
                        div=false;
                        valueOne=0;
                        valueTwo=0;
                    }
                }
                if(pow){
                    wynik.setText(Math.pow(valueOne,valueTwo)+"");
                    pow=false;
                    valueOne=0;
                    valueTwo=0;
                }
                if(log){
                    wynik.setText(Math.log(valueOne)/Math.log(valueTwo)+"");
                    log=false;
                    valueOne=0;
                    valueTwo=0;
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
                String tekst =wynik.getText()+"";

                if(tekst.contains("Infinity")||tekst.equals(".")||tekst.isEmpty()) {
                    Toast.makeText(getApplicationContext(), "BŁĄD", Toast.LENGTH_SHORT).show();
                    wynik.setText("0");
                }
                else {
                    valueTwo = 0+Float.parseFloat(wynik.getText() + "");
                    wynik.setText(Math.sin(valueTwo) + "");
                    break;
                }
            }
            case R.id.cosButton:{
                String tekst =wynik.getText()+"";

                if(tekst.contains("Infinity")||tekst.equals(".")||tekst.isEmpty()) {
                    Toast.makeText(getApplicationContext(), "BŁĄD", Toast.LENGTH_SHORT).show();
                    wynik.setText("0");
                }
                else {
                    valueTwo =0+ Float.parseFloat(wynik.getText() + "");
                    wynik.setText(Math.cos(valueTwo) + "");
                    break;
                }
            }
            case R.id.tanButton:{
                String tekst =wynik.getText()+"";

                if(tekst.contains("Infinity")||tekst.equals(".")||tekst.isEmpty()) {
                    Toast.makeText(getApplicationContext(), "BŁĄD", Toast.LENGTH_SHORT).show();
                    wynik.setText("0");
                }
                else {
                    valueTwo =0+ Float.parseFloat(wynik.getText() + "");
                    wynik.setText(Math.tan(valueTwo) + "");
                    break;
                }
            }
            case R.id.sqrtButton:{
                String tekst =wynik.getText()+"";

                if(tekst.contains("Infinity")||tekst.equals(".")||tekst.isEmpty()) {
                    Toast.makeText(getApplicationContext(), "BŁĄD", Toast.LENGTH_SHORT).show();
                    wynik.setText("0");
                }
                if(tekst.contains("-")) {
                    Toast.makeText(getApplicationContext(), "Nie można pierwiastkować przez UJEMNE!!", Toast.LENGTH_SHORT).show();
                    wynik.setText("0");
                }
                else {
                    valueTwo =0+ Float.parseFloat(wynik.getText()+"");
                    wynik.setText(Math.sqrt(valueTwo) + "");
                    break;
                }
            }
            case R.id.pow2Button:{
                String tekst =wynik.getText()+"";
                if(tekst.contains("Infinity")||tekst.equals(".")||tekst.isEmpty()) {
                    Toast.makeText(getApplicationContext(), "BŁĄD", Toast.LENGTH_SHORT).show();
                    wynik.setText("0");
                }
                else {
                    valueTwo = 0+Float.parseFloat(wynik.getText() + "");
                    wynik.setText(Math.pow(valueTwo, 2) + "");
                    break;
                }
            }
            case R.id.lnButton:{
                String tekst =wynik.getText()+"";
                float sNumber =Float.parseFloat(tekst);
                if(tekst.contains("Infinity")||tekst.equals(".")||tekst.isEmpty()) {
                    Toast.makeText(getApplicationContext(), "BŁĄD", Toast.LENGTH_SHORT).show();
                    wynik.setText("0");
                }
                if(sNumber==0){
                    Toast.makeText(getApplicationContext(), "BŁĄD", Toast.LENGTH_SHORT).show();
                    wynik.setText("0");
                }
                else {
                    valueTwo =0+ Float.parseFloat(wynik.getText() + "");
                    wynik.setText(Math.log(valueTwo) + "");
                    break;
                }
            }
            case R.id.xpowYButton:{
                String tekst =wynik.getText()+"";
                if(tekst.contains("Infinity")||tekst.equals(".")||tekst.isEmpty()) {
                    Toast.makeText(getApplicationContext(), "BŁĄD", Toast.LENGTH_SHORT).show();
                    wynik.setText("0");
                }
                else {
                    valueOne =0+ Float.parseFloat(wynik.getText() + "");
                    pow = true;
                    wynik.setText("0");
                    break;
                }
            }
            case R.id.logButton:{
                String tekst =wynik.getText()+"";
                if(tekst.contains("Infinity")||tekst.equals(".")||tekst.isEmpty()) {
                    Toast.makeText(getApplicationContext(), "BŁĄD", Toast.LENGTH_SHORT).show();
                    wynik.setText("0");
                }
                else {
                    valueOne =0+ Float.parseFloat(wynik.getText() + "");
                    log = true;
                    wynik.setText("0");
                    break;
                }
            }


        }

    }

}
