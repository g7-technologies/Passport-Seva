package com.g7tech.passport.Activities;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;

import com.g7tech.passport.R;

public class residential_address extends AppCompatActivity {

    SharedPreferences prefs;
    SharedPreferences.Editor editor;


    LinearLayout linear3;
    TextView error_spinner1,error_spinner2;
    EditText editText1,editText2,editText3,editText4,editText5,editText6,editText7,editText8,editText9,
             editText10,editText11,editText12,editText13,editText14,editText15,editText16;
    RadioGroup radioGroup;
    RadioButton radioButton1,radioButton2;
    Spinner spinner1,spinner2;
    Button next4,back4;
    public int Spinner1,Spinner2,RadioGroup;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_residential_address);
        setTitle("Residential Title");

        prefs= getSharedPreferences("Passport", MODE_PRIVATE);
        editor = prefs.edit();


        linear3 = findViewById(R.id.s4_linear3);
        error_spinner1 = findViewById(R.id.s4_error_spinner1);
        error_spinner2 = findViewById(R.id.s4_error_spinner2);

        editText1 = findViewById(R.id.s4_ed1);
        editText2 = findViewById(R.id.s4_ed2);
        editText3 = findViewById(R.id.s4_ed3);
        editText4 = findViewById(R.id.s4_ed4);
        editText5 = findViewById(R.id.s4_ed5);
        editText6 = findViewById(R.id.s4_ed6);
        editText7 = findViewById(R.id.s4_ed7);
        editText8 = findViewById(R.id.s4_ed8);
        editText9 = findViewById(R.id.s4_ed9);
        editText10 = findViewById(R.id.s4_ed10);
        editText11 = findViewById(R.id.s4_ed11);
        editText12 = findViewById(R.id.s4_ed12);
        editText13 = findViewById(R.id.s4_ed13);
        editText14 = findViewById(R.id.s4_ed14);
        editText15 = findViewById(R.id.s4_ed15);
        editText16 = findViewById(R.id.s4_ed16);
        radioGroup= findViewById(R.id.s4_r);
        radioButton1 = findViewById(R.id.s4_r1);
        radioButton2 = findViewById(R.id.s4_r2);
        spinner1 = findViewById(R.id.s4_dp1);
        spinner2 = findViewById(R.id.s4_dp2);
        next4  = findViewById(R.id.next4);
        back4  = findViewById(R.id.back4);



        //getting values from radiogroup


        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId){
                    case R.id.s4_r1:
                        RadioGroup = 1;
                        linear3.setVisibility(View.GONE);
                        editor.putInt("S4_r1",RadioGroup);
                        editor.commit();

                        break;
                    case R.id.s4_r2:
                        RadioGroup = 2;
                        linear3.setVisibility(View.VISIBLE);
                        editor.putInt("S4_r1",RadioGroup);
                        editor.commit();
                        break;
                }

            }
        });

        spinner1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                Spinner1 = spinner1.getSelectedItemPosition();
                editor.putInt("S4_d1",Spinner1);
                editor.commit();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
        spinner2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                Spinner2 = spinner2.getSelectedItemPosition();
                editor.putInt("S4_d2",Spinner2);
                editor.commit();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
        back4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent back4 = new Intent(residential_address.this,Family_details.class);
                startActivity(back4);
            }
        });
        next4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(editText1.getText().toString().length()==0){
                    editText1.setError("Field must be filled");
                    editText1.requestFocus();
                }
                else if(editText2.getText().toString().length()==0){
                    editText2.setError("Field must be filled");
                    editText2.requestFocus();
                }
                else if(editText3.getText().toString().length()==0){
                    editText3.setError("Field must be filled");
                    editText3.requestFocus();
                }
                else if(editText4.getText().toString().length()==0){
                    editText4.setError("Field must be filled");
                    editText4.requestFocus();
                }
                else if(Spinner1 == 0){
                    error_spinner1.setVisibility(View.VISIBLE);
                    error_spinner1.requestFocus();
                }
                else if(editText5.getText().toString().length()==0){
                    editText5.setError("Field must be filled");
                    editText5.requestFocus();
                }
                else if(editText6.getText().toString().length()==0){
                    editText6.setError("Field must be filled");
                    editText6.requestFocus();
                }
                else{
                    if(RadioGroup == 2){
                        if(editText9.getText().toString().length()==0){
                            editText9.setError("Field must be filled");
                            editText9.requestFocus();
                        }
                        else if(editText10.getText().toString().length()==0){
                            editText10.setError("Field must be filled");
                            editText10.requestFocus();
                        }
                        else if(editText11.getText().toString().length()==0){
                            editText11.setError("Field must be filled");
                            editText11.requestFocus();
                        }
                        else if(editText12.getText().toString().length()==0){
                            editText12.requestFocus();
                            editText12.setError("Field must be filled");
                        }
                        else if(editText13.getText().toString().length()==0){
                            editText13.setError("Field must be filled");
                            editText13.requestFocus();
                        }
                        else if(Spinner2 == 0){
                            error_spinner2.requestFocus();
                            error_spinner2.setVisibility(View.VISIBLE);
                        }
                        else if(editText14.getText().toString().length()==0){
                            editText14.setError("Field must be filled");
                            editText14.requestFocus();
                        }
                        else{
                            editor.putString("S4_ed1",editText1.getText().toString());
                            editor.putString("S4_ed2",editText2.getText().toString());
                            editor.putString("S4_ed3",editText3.getText().toString());
                            editor.putString("S4_ed4",editText4.getText().toString());
                            editor.putString("S4_ed5",editText5.getText().toString());
                            editor.putString("S4_ed6",editText6.getText().toString());
                            editor.putString("S4_ed7",editText7.getText().toString());
                            editor.putString("S4_ed8",editText8.getText().toString());
                            editor.putString("S4_ed9",editText9.getText().toString());
                            editor.putString("S4_ed10",editText10.getText().toString());
                            editor.putString("S4_ed11",editText11.getText().toString());
                            editor.putString("S4_ed12",editText12.getText().toString());
                            editor.putString("S4_ed13",editText13.getText().toString());
                            editor.putString("S4_ed14",editText14.getText().toString());
                            editor.putString("S4_ed15",editText15.getText().toString());
                            editor.putString("S4_ed16",editText16.getText().toString());
                            editor.commit();
                            Intent next4= new Intent(residential_address.this,other_details.class);
                            startActivity(next4);
                        }

                    }
                    else {
                        editor.putString("S4_ed1",editText1.getText().toString());
                        editor.putString("S4_ed2",editText2.getText().toString());
                        editor.putString("S4_ed3",editText3.getText().toString());
                        editor.putString("S4_ed4",editText4.getText().toString());
                        editor.putString("S4_ed5",editText5.getText().toString());
                        editor.putString("S4_ed6",editText6.getText().toString());
                        editor.putString("S4_ed7",editText7.getText().toString());
                        editor.putString("S4_ed8",editText8.getText().toString());
                        editor.commit();
                        Intent next4= new Intent(residential_address.this,other_details.class);
                        startActivity(next4);
                    }
                }

            }
        });
    }
    @Override
    public void onBackPressed() {
        startActivity(new Intent(residential_address.this, Family_details.class));
        finish();
    }

    @Override
    protected void onResume() {
        super.onResume();
        editText1.setText(prefs.getString("S4_ed1",""));
        editText2.setText(prefs.getString("S4_ed2",""));
        editText3.setText(prefs.getString("S4_ed3",""));
        editText4.setText(prefs.getString("S4_ed4",""));
        editText5.setText(prefs.getString("S4_ed5",""));
        editText6.setText(prefs.getString("S4_ed6",""));
        editText7.setText(prefs.getString("S4_ed7",""));
        editText8.setText(prefs.getString("S4_ed8",""));
        editText9.setText(prefs.getString("S4_ed9",""));
        editText10.setText(prefs.getString("S4_ed10",""));
        editText11.setText(prefs.getString("S4_ed11",""));
        editText12.setText(prefs.getString("S4_ed12",""));
        editText13.setText(prefs.getString("S4_ed13",""));
        editText14.setText(prefs.getString("S4_ed14",""));
        editText15.setText(prefs.getString("S4_ed15",""));
        editText16.setText(prefs.getString("S4_ed16",""));

        if(prefs.getInt("S4_r1" ,0)== 1){
            radioButton1.setChecked(true);
        }else {
            radioButton2.setChecked(true);
        }

        spinner1.setSelection(prefs.getInt("S4_d1",0));
        spinner2.setSelection(prefs.getInt("S4_d2",0));

    }
}

