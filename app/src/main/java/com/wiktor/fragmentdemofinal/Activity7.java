package com.wiktor.fragmentdemofinal;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class Activity7 extends AppCompatActivity implements View.OnClickListener {

    FragmentManager fragmentManager = getSupportFragmentManager();
    FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

    FragmentBlue myFragmentBlue;
    FragmentGreen myFragmentGreen;
    FragmentRed myFragmentRed;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_7);

        myFragmentBlue = new FragmentBlue();
        fragmentTransaction.add(R.id.container, myFragmentBlue);
        fragmentTransaction.commit();




    }

   @Override
    public void onClick(View v) {

/*        switch (v.getId()) {
            case R.id.button_fragment_blue:
                Toast.makeText(this, "Click", Toast.LENGTH_SHORT).show();
                Log.d("oooo", "click");

                break;
            case R.id.button_fragment_green:
                fragmentTransaction.add(R.id.container, myFragmentRed)
                        .commit();
                break;
            case R.id.button_fragment_red:
                Toast.makeText(this, "дальше двигаться некуда!", Toast.LENGTH_SHORT).show();


                break;


        }*/

    }


    @Override
    public void onBackPressed() {
        Fragment fragment = fragmentManager.findFragmentById(R.id.container);
        if (fragment != null) {
            fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.remove(fragment)
                    .commit();
        }
        super.onBackPressed();
    }
}
