package com.g7tech.passport.Activities;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.g7tech.passport.R;

public class Identity extends Fragment {
    public Identity(){

    }
    public static Identity newInstance(String param1, String param2) {
        Identity fragment = new Identity();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        getActivity().setTitle("IDENTITY");
        return inflater.inflate(R.layout.identity_fragment, container, false);
    }

}
