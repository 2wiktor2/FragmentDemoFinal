package com.wiktor.fragmentdemofinal;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class FragmentRed extends Fragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_red, container, false);

        TextView textMsg = view.findViewById(R.id.tv_fragmentRed2);

        Bundle bundle = getArguments();
        if (bundle != null) {
            String msg =bundle.getString(Activity3.KEY_MSG_3);
            if (msg != null)
            textMsg.setText(msg);
        }
        return view;
    }
}
