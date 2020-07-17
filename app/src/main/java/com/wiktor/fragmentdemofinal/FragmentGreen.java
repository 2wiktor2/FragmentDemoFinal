package com.wiktor.fragmentdemofinal;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class FragmentGreen extends Fragment implements View.OnClickListener {

    EditText editTextRedFragment;
    Button buttonFragmentGreen;
    TextView textView2FragmentGreen;

    TextView textMsg;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_green, container, false);

        textMsg = view.findViewById(R.id.tv_fragmentGreen2);

        Bundle bundle = getArguments();
        if (bundle != null) {
            String msg = bundle.getString(Activity3.KEY_MSG_2);
            if (msg != null) {
                textMsg.setText(msg);
            }
        }
        return view;
    }

    @Override
    public void onStart() {
        super.onStart();

        editTextRedFragment = getActivity().findViewById(R.id.edit_text_red_fragment);
        buttonFragmentGreen = getActivity().findViewById(R.id.button_fragment_green);
        textView2FragmentGreen = getActivity().findViewById(R.id.tv_fragmentGreen2);

        buttonFragmentGreen.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        textView2FragmentGreen.setText(editTextRedFragment.getText());

    }
}
