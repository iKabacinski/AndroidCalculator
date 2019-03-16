package com.example.mycalculator;

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

                break;
            }
            case R.id.advancedButton: {

                break;
            }
            case R.id.aboutButton: {

                break;
            }
            case R.id.exitButton: {
                moveTaskToBack(true);
                android.os.Process.killProcess(android.os.Process.myPid());
                System.exit(1);
                break;
            }
        }
    }
}