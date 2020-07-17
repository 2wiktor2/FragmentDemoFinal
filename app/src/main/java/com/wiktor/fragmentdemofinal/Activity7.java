package com.wiktor.fragmentdemofinal;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.appcompat.app.AppCompatActivity;

public class Activity7 extends AppCompatActivity {


    //     EventBus - библиотека

    FragmentManager fragmentManager = getSupportFragmentManager();
    FragmentTransaction fragmentTransaction;

    FragmentViolet myFragmentViolet;
    FragmentYellow myFragmentYellow;
    FragmentBlue myFragmentBlue;

    //Activity7 activity7 = getActivity();

    // Button buttonFragmentViolet;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_7);

        //buttonFragmentViolet = findViewById(R.id.button_fragment_violet);
        //buttonFragmentViolet.setOnClickListener(this);


        fragmentTransaction = fragmentManager.beginTransaction();
        myFragmentViolet = new FragmentViolet();
        fragmentTransaction.addToBackStack(null);
        fragmentTransaction.add(R.id.frame_layout_container_activity_7, myFragmentViolet);
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
public void openFragment (Fragment myFragment){

    fragmentTransaction = fragmentManager.beginTransaction();
    fragmentTransaction.addToBackStack(null);
    fragmentTransaction.add(R.id.frame_layout_container_activity_7, myFragment);
    fragmentTransaction.commit();

}



}
