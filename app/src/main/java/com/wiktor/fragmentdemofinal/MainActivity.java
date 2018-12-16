package com.wiktor.fragmentdemofinal;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button button1;
    private Button button2;
    private Button button3;
    private Button button4;
    private Button button4_1;
    private Button button5;
    private Button button6;
    private Button button7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button1 = findViewById(R.id.b_1);
        button2 = findViewById(R.id.b_2);
        button3 = findViewById(R.id.b_3);
        button4 = findViewById(R.id.b_4);
        button4_1 = findViewById(R.id.b_4_1);
        button5 = findViewById(R.id.b_5);
        button6 = findViewById(R.id.b_6);
        button7 = findViewById(R.id.b_7);

        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
        button4.setOnClickListener(this);
        button4_1.setOnClickListener(this);
        button5.setOnClickListener(this);
        button6.setOnClickListener(this);
        button7.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.b_1:
                Intent myIntent = new Intent(MainActivity.this, Activity1.class);
                startActivity(myIntent);
                break;
            case R.id.b_2:
                Intent myIntent2 = new Intent(MainActivity.this, Activity2.class);
                startActivity(myIntent2);
                break;
            case R.id.b_3:
                Intent myIntent3 = new Intent(MainActivity.this, Activity3.class);
                startActivity(myIntent3);
                break;
            case R.id.b_4:
                Intent myIntent4 = new Intent(MainActivity.this, Activity4.class);
                startActivity(myIntent4);
                break;
            case R.id.b_4_1:
                Intent myIntent4_1 = new Intent(MainActivity.this, Activity4_1.class);
                startActivity(myIntent4_1);
                break;
            case R.id.b_5:
                Intent myIntent5 = new Intent(MainActivity.this, Activity5.class);
                startActivity(myIntent5);
                break;
            case R.id.b_6:
                Intent myIntent6 = new Intent(MainActivity.this, Activity6.class);
                startActivity(myIntent6);
                break;
            case R.id.b_7:
                Intent myIntent7 = new Intent(MainActivity.this, Activity7.class);
                startActivity(myIntent7);
                break;

        }

    }
}
