package com.g7tech.passport.Activities;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.g7tech.passport.R;

public class Non_ECR_proof_fragment extends Fragment {
    public Non_ECR_proof_fragment(){

    }
    public Non_ECR_proof_fragment newInstance(String param1, String param2){
        Non_ECR_proof_fragment fragment= new Non_ECR_proof_fragment();
        Bundle args =new Bundle();
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
        getActivity().setTitle("NON ECR PROOF");
        return inflater.inflate(R.layout.non_ecr_proof_fragment, container, false);
    }
}
