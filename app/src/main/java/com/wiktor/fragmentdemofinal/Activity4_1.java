package com.wiktor.fragmentdemofinal;

import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;
import android.widget.TextView;

public class Activity4_1 extends AppCompatActivity implements View.OnClickListener {

    Button myAdd;
    Button myReplace;
    Button myRemove;
    Switch mySwitch;
    TextView myTextView;

    private FragmentManager fragmentManager;
    private FragmentTransaction fragmentTransaction;

    FragmentWithOutXML blueFragmetnt;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity4_1);

        myAdd =findViewById(R.id.button_add);
        myReplace =findViewById(R.id.button_replace);
        myRemove =findViewById(R.id.button_remove);
        mySwitch =findViewById(R.id.mySwitch);

        myAdd.setOnClickListener(this);
        mySwitch.setOnClickListener(this);
        myReplace.setOnClickListener(this);
        myRemove.setOnClickListener(this);

        fragmentManager = getSupportFragmentManager();
    }

    @Override
    public void onClick(View v) {

        fragmentTransaction = fragmentManager.beginTransaction();
        switch (v.getId()) {
            case R.id.button_add:
                 blueFragmetnt = new FragmentWithOutXML();
                fragmentTransaction.add(R.id.container, blueFragmetnt);
                break;
            case R.id.button_replace:
                FragmentWithOutXML2 redFragment = new FragmentWithOutXML2();
                fragmentTransaction.replace(R.id.container, redFragment);
                break;
                case R.id.button_remove:
                    fragmentTransaction.remove(blueFragmetnt);

                break;
        }
        if (mySwitch.isChecked()) fragmentTransaction.addToBackStack(null);

        // todo как получить колличество фрагментов в textView
        //List<Fragment> myList = fragmentManager.getFragments();
        //int x = myList.size()+1;


/*        int x = fragmentManager.getBackStackEntryCount();
        myTextView.setText(Integer.toString(x));*/

        fragmentTransaction.commit();

    }
}
