package com.wiktor.fragmentdemofinal;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button button1;
    private Button button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button1 = findViewById(R.id.b_1);
        button2 = findViewById(R.id.b_2);
        button1.setOnClickListener(this);
        button2.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.b_1:
                Intent myIntent = new Intent(MainActivity.this,Activity1.class);
                startActivity(myIntent);
                break;
                case R.id.b_2:
                Intent myIntent2 = new Intent(MainActivity.this,Activity2.class);
                startActivity(myIntent2);
                break;

        }

    }
}
