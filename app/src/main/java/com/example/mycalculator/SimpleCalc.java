package com.example.mycalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class SimpleCalc extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simple_calc);
        Button zeroButton = (Button) findViewById(R.id.zeroButton);
        zeroButton.setOnClickListener(this);

        Button oneButton = (Button) findViewById(R.id.oneButton);
        oneButton.setOnClickListener(this);

        Button twoButton = (Button) findViewById(R.id.twoButton);
        twoButton.setOnClickListener(this);

        Button threeButton = (Button) findViewById(R.id.threeButton);
        threeButton.setOnClickListener(this);

        Button fourButton = (Button) findViewById(R.id.fourButton);
        fourButton.setOnClickListener(this);

        Button fiveButton = (Button) findViewById(R.id.fiveButton);
        fiveButton.setOnClickListener(this);

        Button sixButton = (Button) findViewById(R.id.sixButton);
        sixButton.setOnClickListener(this);

        Button sevenButton = (Button) findViewById(R.id.sevenButton);
        sevenButton.setOnClickListener(this);

        Button eightButton = (Button) findViewById(R.id.eightButton);
        eightButton.setOnClickListener(this);

        Button nineButton = (Button) findViewById(R.id.nineButton);
        nineButton.setOnClickListener(this);

        Button bkspButton = (Button) findViewById(R.id.bkspButton);
        bkspButton.setOnClickListener(this);

        Button cButton = (Button) findViewById(R.id.cButton);
        cButton.setOnClickListener(this);

        Button plusMinusButton = (Button) findViewById(R.id.plusMinusButton);
        plusMinusButton.setOnClickListener(this);

        Button slashButton = (Button) findViewById(R.id.slashButton);
        slashButton.setOnClickListener(this);

        Button plusButton = (Button) findViewById(R.id.plusButton);
        plusButton.setOnClickListener(this);

        Button minusButton = (Button) findViewById(R.id.minusButton);
        minusButton.setOnClickListener(this);

        Button multipleButton = (Button) findViewById(R.id.multileButton);
        multipleButton.setOnClickListener(this);

        Button resultButton = (Button) findViewById(R.id.resultButton);
        resultButton.setOnClickListener(this);

        Button pointButton = (Button) findViewById(R.id.pointButton);
        pointButton.setOnClickListener(this);

        EditText text = (EditText) findViewById(R.id.text);










    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){

            case R.id.zeroButton:{
                break;
            }
            case R.id.oneButton:{
                break;
            }
            case R.id.twoButton:{
                break;
            }
            case R.id.threeButton:{
                break;
            }
            case R.id.fourButton:{
                break;
            }
            case R.id.fiveButton:{
                break;
            }
            case R.id.sixButton:{
                break;
            }
            case R.id.sevenButton:{
                break;
            }
            case R.id.eightButton:{
                break;
            }
            case R.id.nineButton:{
                break;
            }
            case R.id.bkspButton:{
                break;
            }
            case R.id.cButton:{
                break;
            }
            case R.id.plusMinusButton:{
                break;
            }
            case R.id.slashButton:{
                break;
            }
            case R.id.multileButton:{
                break;
            }
            case R.id.minusButton:{
                break;
            }
            case R.id.plusButton:{
                break;
            }
            case R.id.resultButton:{
                break;
            }
            case R.id.pointButton:{
                break;
            }

        }

    }
}
