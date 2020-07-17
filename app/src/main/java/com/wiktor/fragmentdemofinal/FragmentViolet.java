package com.wiktor.fragmentdemofinal;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

public class FragmentViolet extends Fragment implements View.OnClickListener {

    Button buttonFragmentViolet;
    FragmentYellow myYelloFragment = new FragmentYellow();

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View viewFragmentViolet = inflater.inflate(R.layout.fragment_violet, container, false);
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


        FragmentTransaction fragmentTransaction = getActivity().getSupportFragmentManager().beginTransaction();
        fragmentTransaction.add(R.id.frame_layout_container_activity_7, myYelloFragment);
        fragmentTransaction.addToBackStack(null);
        fragmentTransaction.commit();

        Toast.makeText(getActivity(), "click", Toast.LENGTH_SHORT).show();


        Log.d("ololo", "on Click во фрагменте работает");


    }

}
