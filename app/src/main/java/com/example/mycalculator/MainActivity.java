package com.example.mycalculator;

import android.content.Intent;
import android.os.Process;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button simpleButton = (Button) findViewById(R.id.simpleButton);
        simpleButton.setOnClickListener(this);

        Button advancedButton = (Button) findViewById(R.id.advancedButton);
        simpleButton.setOnClickListener(this);

        Button aboutButton = (Button) findViewById(R.id.aboutButton);
        simpleButton.setOnClickListener(this);

        Button exitButton = (Button) findViewById(R.id.exitButton);
        simpleButton.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.simpleButton: {
                Intent simple = new Intent(this, SimpleCalc.class);
                startActivity(simple);
                break;
            }
            case R.id.advancedButton: {
                Intent advanced = new Intent(this, AdvancedCalc.class);
                startActivity(advanced);
                break;
            }
            case R.id.aboutButton: {
                Intent about = new Intent(this, AboutCalc.class);
                startActivity(about);
                break;
            }
            case R.id.exitButton: {
                moveTaskToBack(true);
                Process.killProcess(Process.myPid());
                System.exit(1);
                break;
            }
        }
    }
}