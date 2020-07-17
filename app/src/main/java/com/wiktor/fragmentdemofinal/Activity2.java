package com.wiktor.fragmentdemofinal;

import android.os.Bundle;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class Activity2 extends AppCompatActivity implements View.OnClickListener {

    private FragmentManager fragmentManager;
    private FragmentTransaction fragmentTransaction;

    Button buttonBlueFragment;
    Button buttonGreenFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        buttonBlueFragment = findViewById(R.id.button_1);
        buttonGreenFragment = findViewById(R.id.button_2);

        buttonBlueFragment.setOnClickListener(this);
        buttonGreenFragment.setOnClickListener(this);

        fragmentManager = getSupportFragmentManager();


/*        // получаем экземпляр FragmentTransaction
        FragmentManager manager = getSupportFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();

        FragmentWithOutXML fragmentWithOutXML = new FragmentWithOutXML();
        transaction.add(R.id.container, fragmentWithOutXML);
        transaction.commit();*/


    }

    @Override
    public void onClick(View v) {
        fragmentTransaction = fragmentManager.beginTransaction();
        switch (v.getId()) {
            case R.id.button_1:
                FragmentWithOutXML blueFragmetnt = new FragmentWithOutXML();
                fragmentTransaction.add(R.id.container, blueFragmetnt);
                break;
            case R.id.button_2:
                FragmentWithOutXML2 greenFragmetnt = new FragmentWithOutXML2();
                fragmentTransaction.add(R.id.container, greenFragmetnt);
                break;
        }
        fragmentTransaction.commit();

    }
}
