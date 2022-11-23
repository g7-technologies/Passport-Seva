package com.g7tech.passport.Activities;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.g7tech.passport.R;

public class tatkaal_application extends Fragment {
    public tatkaal_application(){

    }
    public static tatkaal_application newInstance(String param1, String param2) {
        tatkaal_application fragment = new tatkaal_application();
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
        getActivity().setTitle("TATKAAL APPLICATION");
        return inflater.inflate(R.layout.tatkaal_fragment, container, false);
    }
}
