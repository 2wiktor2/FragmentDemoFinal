package com.wiktor.fragmentdemofinal;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class FragmentBlue extends Fragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_blue, container, false);
        return view;

    }
}

//  LinearLayout с идентификатором @+id/container является нашим контейнером.
// Подготовим класс фрагмента. Разметку для фрагмента использовать не будем,
// всё сделаем программно.


/*public class MyFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        Context context = getActivity().getApplicationContext();
        LinearLayout layout = new LinearLayout(context);
        layout.setBackgroundColor(Color.BLUE);
        TextView text = new TextView(context);
        text.setText("Это область фрагмента");
        layout.addView(text);

        return layout;
    }*/
