package com.wiktor.fragmentdemofinal;

import android.os.Bundle;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;
import android.widget.TextView;

import java.util.List;

public class Activity4 extends FragmentActivity implements View.OnClickListener {

    private Button buttonAdd;
    private Button buttonReplace;
    private Button buttonRemove;
    TextView count;

    Switch mySwitch;

    FragmentManager manager = getSupportFragmentManager();
    FragmentTransaction transaction;

    FragmentBlue fragmentBlue;
    FragmentGreen fragmentGreen;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_4);

        buttonAdd = findViewById(R.id.button_add);
        buttonReplace = findViewById(R.id.button_replace);
        buttonRemove = findViewById(R.id.button_remove);
        mySwitch = findViewById(R.id.switch_back_stack);
        count = findViewById(R.id.tv_count);

        buttonAdd.setOnClickListener(this);
        buttonReplace.setOnClickListener(this);
        buttonRemove.setOnClickListener(this);
        mySwitch.setOnClickListener(this);

        fragmentBlue = new FragmentBlue();
        fragmentGreen = new FragmentGreen();






    }

    @Override
    public void onClick(View v) {
        transaction = manager.beginTransaction();
        switch (v.getId()) {
            case R.id.button_add:
                    transaction.add(R.id.container, fragmentBlue);

                break;
            case R.id.button_replace:
                transaction.replace(R.id.container, fragmentGreen);
                break;
            case R.id.button_remove:
                transaction.remove(fragmentBlue);

                break;
        }
        if (mySwitch.isChecked()) transaction.addToBackStack(null);
        List<Fragment> myList = manager.getFragments();
        count.setText(Integer.toString(myList.size()+1));
        transaction.commit();


    }
}
