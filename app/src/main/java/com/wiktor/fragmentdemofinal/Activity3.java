package com.wiktor.fragmentdemofinal;

import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class Activity3 extends AppCompatActivity implements View.OnClickListener {

    FragmentManager fragmentManager;
    FragmentBlue fragmentBlue;
    FragmentGreen fragmentGreen;
    FragmentRed fragmentRed;

    Button button1;
    Button button2;
    Button button3;

    final static String KEY_MSG_1 = "FRAGMENT_BLUE_MSG";
    final static String KEY_MSG_2 = "FRAGMENT_GREEN_MSG";
    final static String KEY_MSG_3 = "FRAGMENT_RED_MSG";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_3);

        button1 = findViewById(R.id.button_1);
        button2 = findViewById(R.id.button_2);
        button3 = findViewById(R.id.button_3);

        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);

        fragmentBlue = new FragmentBlue();
        fragmentGreen = new FragmentGreen();
        fragmentRed = new FragmentRed();


        fragmentManager = getSupportFragmentManager();

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {

            case R.id.button_1:
                Bundle bundle1 = new Bundle();
                bundle1.putString(KEY_MSG_1, "Заменили на первый фрагмент");
                fragmentBlue.setArguments(bundle1);

                FragmentTransaction transaction = fragmentManager.beginTransaction();
                transaction.replace(R.id.containerActivity3, fragmentBlue);
                transaction.commit();
                break;
            case R.id.button_2:
                Bundle bundle2 = new Bundle();
                bundle2.putString(KEY_MSG_2, "Заменили на второй фрагмент");
                fragmentGreen.setArguments(bundle2);

                FragmentTransaction transaction1 = fragmentManager.beginTransaction();
                transaction1.replace(R.id.containerActivity3, fragmentGreen);
                transaction1.commit();
                break;
            case R.id.button_3:
                Bundle bundle3 = new Bundle();
                bundle3.putString(KEY_MSG_3, "Заменили на третий фрагмент");
                fragmentRed.setArguments(bundle3);

                FragmentTransaction transaction3 = fragmentManager.beginTransaction();
                transaction3.replace(R.id.containerActivity3, fragmentRed);
                transaction3.commit();
                break;
        }

    }
}
