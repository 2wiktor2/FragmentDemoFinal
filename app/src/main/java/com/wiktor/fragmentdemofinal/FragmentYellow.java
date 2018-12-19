package com.wiktor.fragmentdemofinal;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class FragmentYellow extends Fragment implements View.OnClickListener {
    FragmentBlue fragmentBlue = new FragmentBlue();
    Button buttonFragmentYello;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
       View myView = inflater.inflate(R.layout.fragment_yellow, container, false);


        return myView;
    }

    @Override
    public void onStart() {

        buttonFragmentYello = getActivity().findViewById(R.id.button_fragment_yellow);
        buttonFragmentYello.setOnClickListener(this);


        super.onStart();


    }

    @Override
    public void onClick(View v) {

        ((Activity7) getActivity()).openFragment(new FragmentBlue());

    }
}
