package com.example.intentextrasexample;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.intentextrasexample.R;



public class FragmentWithText extends Fragment {

    TextView textFrag;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        View view  = inflater.inflate(R.layout.fragment_with_text,container,false);
        textFrag = view.findViewById(R.id.textFrag);

        return view;
    }
}
