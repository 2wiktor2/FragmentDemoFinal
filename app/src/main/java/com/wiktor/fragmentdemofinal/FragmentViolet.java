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
import android.widget.Toast;

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
int buttonIndex = translateIdToIndex(v.getId());
        Toast.makeText(getActivity(), "click", Toast.LENGTH_SHORT).show();


        Log.d("ololo", "on Click во фрагменте работает");



    }
    int translateIdToIndex(int id) {
        int index = -1;
        switch (id) {
            case R.id.button_fragment_violet:
                index = 1;
                break;
        }
        return index;
    }

    public interface OnSelectedButtonListener {
        void onButtonSelected(int buttonIndex);
    }
}
