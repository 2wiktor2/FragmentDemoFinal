package com.wiktor.fragmentdemofinal;

import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Activity5 extends AppCompatActivity {

    FragmentManager fragmentManager = getSupportFragmentManager();
    FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

    FragmentBlue myFragmentBlue;
    Button button;
    EditText editText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_5);

        button = findViewById(R.id.button_activity_5);
        editText = findViewById(R.id.edit_text_Activity_5);


        myFragmentBlue = new FragmentBlue();
        fragmentTransaction.add(R.id.container, myFragmentBlue);
        fragmentTransaction.commit();


        button.setOnClickListener(new View.OnClickListener() {
                                      @Override
                                      public void onClick(View v) {
                                          String text = editText.getText().toString();
                                          TextView textViewFragment = findViewById(R.id.tv_fragmentBlue2);
                                          textViewFragment.setText(text);

                                      }
                                  }

        );


    }
}
