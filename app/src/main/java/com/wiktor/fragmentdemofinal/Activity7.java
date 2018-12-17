package com.wiktor.fragmentdemofinal;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class Activity7 extends AppCompatActivity implements View.OnClickListener {

    //     EventBus - библиотека

    FragmentManager fragmentManager = getSupportFragmentManager();
    FragmentTransaction fragmentTransaction;

    FragmentViolet myFragmentViolet;
    FragmentYellow myFragmentYellow;
    FragmentBlue myFragmentBlue;

   // Button buttonFragmentViolet;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_7);

        //buttonFragmentViolet = findViewById(R.id.button_fragment_violet);
        //buttonFragmentViolet.setOnClickListener(this);



        myFragmentViolet = new FragmentViolet();
        fragmentTransaction.add(R.id.frame_layout_container_activity_7, myFragmentViolet);
        fragmentTransaction.commit();


    }

    @Override
    public void onClick(View v) {
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        switch (v.getId()) {
            case R.id.button_fragment_violet:
                Toast.makeText(this, "Click", Toast.LENGTH_SHORT).show();
                Log.d("oooo", "click");

                break;
            case R.id.button_fragment_yellow:
                myFragmentYellow = new FragmentYellow();
            break;


        }
        fragmentTransaction.commit();

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
