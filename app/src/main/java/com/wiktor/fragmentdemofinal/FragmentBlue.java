package com.wiktor.fragmentdemofinal;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class FragmentBlue extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_blue, container, false);

        TextView textMsg = view.findViewById(R.id.tv_fragmentBlue2);

        Bundle bundle = getArguments();
        if (bundle != null) {
            String msg = bundle.getString(Activity3.KEY_MSG_1);
            if (msg != null) {
                textMsg.setText(msg);
            }
        }
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
