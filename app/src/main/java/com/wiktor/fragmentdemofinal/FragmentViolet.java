package com.wiktor.fragmentdemofinal;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class FragmentViolet extends Fragment implements View.OnClickListener {

    Button buttonFragmentViolet;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View viewFragmentViolet = inflater.inflate(R.layout.fragment_violet, container, false);

       /*  buttonFragmentViolet = viewFragmentViolet.findViewById(R.id.button_fragment_violet);
        Log.d("ololo", "ojwdjlsdj");
        buttonFragmentViolet.setOnClickListener(this);*/

        return viewFragmentViolet;
    }

    @Override
    public void onStart() {
        buttonFragmentViolet = getActivity().findViewById(R.id.button_fragment_violet);
        Log.d("ololo", "ojwdjlsdj");

        buttonFragmentViolet.setOnClickListener(this);

        super.onStart();
    }

    @Override
    public void onClick(View v) {

        Log.d("ololo", "8888888");



    }
}
