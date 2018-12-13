package com.wiktor.fragmentdemofinal;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Activity1 extends AppCompatActivity {
    Button button1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_1);

        button1 = findViewById(R.id.b_1);

        // получаем экземпляр FragmentTransaction
/*        FragmentManager myFragmentManager = getSupportFragmentManager();
        FragmentTransaction myFragmentTransaction = myFragmentManager.beginTransaction();*/

        // Добавляем FragmentBlue
/*        FragmentBlue myFragmentBlue = new FragmentBlue();
        myFragmentTransaction.replace(R.id.container, myFragmentBlue);
        myFragmentTransaction.commit();*/

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager myFragmentManager = getSupportFragmentManager();
                FragmentTransaction myFragmentTransaction = myFragmentManager.beginTransaction();
                FragmentBlue myFragmentBlue = new FragmentBlue();
                myFragmentTransaction.replace(R.id.container, myFragmentBlue);
                myFragmentTransaction.commit();
            }
        });


    }
}
