package com.g7tech.passport.Activities;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.g7tech.passport.R;

public class birth_Proof_fragment extends Fragment{
    public birth_Proof_fragment() {
    }

    public static birth_Proof_fragment newInstance(String param1, String param2) {
        birth_Proof_fragment fragment = new birth_Proof_fragment();
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
        getActivity().setTitle("BIRTH PROOF");
        return inflater.inflate(R.layout.birth_proof_fragment, container, false);
    }
}

