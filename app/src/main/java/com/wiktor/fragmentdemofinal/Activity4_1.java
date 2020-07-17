package com.wiktor.fragmentdemofinal;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.appcompat.app.AppCompatActivity;
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

    private FragmentManager fragmentManager = getSupportFragmentManager();
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
                // todo удаляется весь стек и выводится на экран только один фрагмент
                //fragmentManager.getFragments();
                FragmentWithOutXML2 redFragment = new FragmentWithOutXML2();
                fragmentTransaction.replace(R.id.container, redFragment);
                break;
                case R.id.button_remove:

                    //todo поччему удаляется только 1 фрагмент?
                   // fragmentTransaction.remove(blueFragmetnt);


                    Fragment fragment =  fragmentManager.findFragmentById(R.id.container);
                    if (fragment != null) {
                        fragmentTransaction = fragmentManager.beginTransaction();
                        fragmentTransaction.remove(fragment);
                    }
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

    @Override
    public void onBackPressed() {
        Fragment fragment =  fragmentManager.findFragmentById(R.id.container);
        if (fragment != null){
            fragmentTransaction =fragmentManager.beginTransaction();
                    fragmentTransaction.remove(fragment)
                    .commit();
        }
        super.onBackPressed();
    }
}
