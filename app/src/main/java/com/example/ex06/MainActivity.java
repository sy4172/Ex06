package com.example.ex06;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Switch;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    Switch sW;
    ToggleButton tB;
    LinearLayout displayScreen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sW = findViewById(R.id.sW);
        tB = findViewById(R.id.tB);
        displayScreen = findViewById(R.id.displayScreen);
    }

    public void changeBackground(View view) {
        if (sW.isChecked()) {
            if (tB.isChecked()) {
                displayScreen.setBackgroundResource(R.color.blue);
            } else {
                displayScreen.setBackgroundResource(R.color.red);
            }
        }
        else{
            if (tB.isChecked()){
                displayScreen.setBackgroundResource(R.color.yellow);
            }
            else{
                displayScreen.setBackgroundResource(R.color.green);
            }
        }
    }
}
