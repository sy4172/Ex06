package com.example.ex06;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Switch;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    Switch sW;
    ToggleButton tB;
    Button start;
    LinearLayout dispalyScreen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sW = findViewById(R.id.sW);
        tB = findViewById(R.id.tB);
        dispalyScreen = findViewById(R.id.displayScreen);
        start = findViewById(R.id.start);

    }

    public void changeBackground(View view) {
        if (sW.isChecked()) {
            if (tB.isChecked()) {
                dispalyScreen.setBackgroundResource(R.color.blue);
                // 1,1
            } else {
                dispalyScreen.setBackgroundResource(R.color.red);
                // 1,0
            }
        }
        else{
            if (tB.isChecked()){
                dispalyScreen.setBackgroundResource(R.color.yellow);
                   // 0,1
            }
            else{
                dispalyScreen.setBackgroundResource(R.color.green);
                // 0,0
            }
        }
    }
}
