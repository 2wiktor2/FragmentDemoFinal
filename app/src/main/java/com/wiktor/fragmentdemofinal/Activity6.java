package com.wiktor.fragmentdemofinal;

        import android.support.v4.app.FragmentManager;
        import android.support.v4.app.FragmentTransaction;
        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.widget.Button;

public class Activity6 extends AppCompatActivity {

    Button buttonFragmentBlue;
    Button buttonFragmentGreen;
    Button buttonFragmentRed;

    FragmentManager manager = getSupportFragmentManager();
    FragmentTransaction transaction;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_6);

    }
}
