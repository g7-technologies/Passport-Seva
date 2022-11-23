package com.g7tech.passport.Activities;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;

import com.g7tech.passport.R;

public class Fee_structure extends AppCompatActivity {

    Button calculate;
    Spinner spinner1;
    TextView error,Fee;
    RadioGroup radioGroup1;
    RadioButton radioButton1,radioButton2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fee_structure);
        setTitle("Fee Structure");

        error= findViewById(R.id.sFee_error_spinner);
        Fee= findViewById(R.id.fee);
        spinner1 = findViewById(R.id.sFee_dp1);
        calculate = findViewById(R.id.calculate);
        radioGroup1 = findViewById(R.id.sFee_1r);
        radioButton1 = findViewById(R.id.sFee_r1);
        radioButton2 = findViewById(R.id.sFee_r2);

        calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(spinner1.getSelectedItemPosition() == 0){
                    error.setVisibility(View.VISIBLE);

                }else {
                    error.setVisibility(View.INVISIBLE);
                    if(spinner1.getSelectedItemPosition()==1 && radioButton1.isChecked() ||spinner1.getSelectedItemPosition()==3 && radioButton1.isChecked()){
                        Fee.setText("Required amount is 2990");
                        Fee.setVisibility(View.VISIBLE);
                    }else if(spinner1.getSelectedItemPosition()==1 && radioButton2.isChecked() ||spinner1.getSelectedItemPosition()==3 && radioButton2.isChecked()){
                        Fee.setText("Required amount is 3490");
                        Fee.setVisibility(View.VISIBLE);
                    }else if(spinner1.getSelectedItemPosition()==2 && radioButton1.isChecked() ||spinner1.getSelectedItemPosition()==2 && radioButton2.isChecked()){
                        Fee.setText("Required amount is 4490");
                        Fee.setVisibility(View.VISIBLE);
                    }else if(spinner1.getSelectedItemPosition()==4 && radioButton1.isChecked() ||spinner1.getSelectedItemPosition()==4 && radioButton2.isChecked()){
                        Fee.setText("Required amount is 5500");
                        Fee.setVisibility(View.VISIBLE);
                    }else{
                        Fee.setVisibility(View.INVISIBLE);
                    }
                }
            }
        });
    }
}
