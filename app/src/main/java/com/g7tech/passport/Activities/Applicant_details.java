package com.g7tech.passport.Activities;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.g7tech.passport.R;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

public class Applicant_details extends AppCompatActivity {

    private static final String TAG = Service_required.class.getSimpleName();

    SharedPreferences prefs;
    SharedPreferences.Editor editor;

    String emailPattern = "[a-zA-Z0-9._-]+@[a-z]+\\.+[a-z]+";


    TextView error_spinner1,error_spinner2,error_spinner3,error_spinner4,error_spinner5;
    EditText editText1,editText2,editText3,editText4,editText5,editText6,editText7,editText8,editText9,editText10;
    RadioGroup radioGroup1,radioGroup2,radioGroup3,radioGroup4,radioGroup5,radioGroup6;
    RadioButton radioButton1,radioButton2,radioButton3,radioButton4,radioButton5,radioButton6,radioButton7,radioButton8,radioButton9,
                radioButton10,radioButton11,radioButton12;
    Spinner spinner1,spinner2,spinner3,spinner4,spinner5;
    Calendar mycalender;
    Button next2,back2;
    public int Spinner1,Spinner2,Spinner3,Spinner4,Spinner5,RadioGroup1,RadioGroup2,RadioGroup3,RadioGroup4,RadioGroup5,RadioGroup6;

    private DatePickerDialog.OnDateSetListener mDateSetListener;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.applicant_details);
        setTitle("Applicant Details");

        prefs= getSharedPreferences("Passport", MODE_PRIVATE);
        editor = prefs.edit();

        error_spinner1=findViewById(R.id.s2_error_spinner1);
        error_spinner2=findViewById(R.id.s2_error_spinner2);
        error_spinner3=findViewById(R.id.s2_error_spinner3);
        error_spinner4=findViewById(R.id.s2_error_spinner4);
        error_spinner5=findViewById(R.id.s2_error_spinner5);
        editText1 = findViewById(R.id.s2_ed1);
        editText2 = findViewById(R.id.s2_ed2);
        editText3 = findViewById(R.id.s2_ed3);
        editText4 = findViewById(R.id.s2_ed4);
        editText5 = findViewById(R.id.s2_ed5);
        editText6 = findViewById(R.id.s2_ed6);
        editText7 = findViewById(R.id.s2_ed7);
        editText8 = findViewById(R.id.s2_ed8);
        editText9 = findViewById(R.id.s2_ed9);
        editText10 = findViewById(R.id.s2_ed10);
        radioGroup1 = findViewById(R.id.s2_1r);
        radioGroup2 = findViewById(R.id.s2_2r);
        radioGroup3 = findViewById(R.id.s2_3r);
        radioGroup4 = findViewById(R.id.s2_4r);
        radioGroup5 = findViewById(R.id.s2_5r);
        radioGroup6 = findViewById(R.id.s2_6r);
        radioButton1 =findViewById(R.id.s2_r1);
        radioButton2 =findViewById(R.id.s2_r2);
        radioButton3 =findViewById(R.id.s2_r3);
        radioButton4 =findViewById(R.id.s2_r4);
        radioButton5 =findViewById(R.id.s2_r5);
        radioButton6 =findViewById(R.id.s2_r6);
        radioButton7 =findViewById(R.id.s2_r7);
        radioButton8 =findViewById(R.id.s2_r8);
        radioButton9 =findViewById(R.id.s2_r9);
        radioButton10 =findViewById(R.id.s2_r10);
        radioButton11 =findViewById(R.id.s2_r11);
        radioButton12 =findViewById(R.id.s2_r12);
        spinner1 = findViewById(R.id.s2_dp1);
        spinner2 = findViewById(R.id.s2_dp2);
        spinner3 = findViewById(R.id.s2_dp3);
        spinner4 = findViewById(R.id.s2_dp4);
        spinner5 = findViewById(R.id.s2_dp5);
        mycalender = Calendar.getInstance();
        next2 = findViewById(R.id.next2);
        back2 = findViewById(R.id.back2);


        //getting values from radiogroup

        radioGroup1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId){
                    case R.id.s2_r1:
                        RadioGroup1 = 1;
                        editor.putInt("S2_r1",RadioGroup1);
                        editor.commit();
                        break;
                    case R.id.s2_r2:
                        RadioGroup1 = 2;
                        editor.putInt("S2_r1",RadioGroup1);
                        editor.commit();
                        break;
                }
            }
        });
        radioGroup2.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId){
                    case R.id.s2_r3:
                        RadioGroup2 = 1;
                        editor.putInt("S2_r2",RadioGroup2);
                        editor.commit();
                        break;
                    case R.id.s2_r4:
                        RadioGroup2 = 2;
                        editor.putInt("S2_r2",RadioGroup2);
                        editor.commit();
                        break;
                }
            }
        });
        radioGroup3.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId){
                    case R.id.s2_r5:
                        RadioGroup3 = 1;
                        editor.putInt("S2_r3",RadioGroup3);
                        editor.commit();
                        break;
                    case R.id.s2_r6:
                        RadioGroup3 = 2;
                        editor.putInt("S2_r3",RadioGroup3);
                        editor.commit();
                        break;
                }
            }
        });
        radioGroup4.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId){
                    case R.id.s2_r7:
                        RadioGroup4 = 1;
                        editor.putInt("S2_r4",RadioGroup4);
                        editor.commit();
                        break;
                    case R.id.s2_r8:
                        RadioGroup4 = 2;
                        editor.putInt("S2_r4",RadioGroup4);
                        editor.commit();
                        break;

                }
            }
        });
        radioGroup5.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId){
                    case R.id.s2_r9:
                        RadioGroup5 = 1;
                        editor.putInt("S2_r5",RadioGroup5);
                        editor.commit();
                        break;
                    case R.id.s2_r10:
                        RadioGroup5 = 2;
                        editor.putInt("S2_r5",RadioGroup5);
                        editor.commit();
                        break;

                }
            }
        });
        radioGroup6.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId){
                    case R.id.s2_r11:
                        RadioGroup6 = 1;
                        editor.putInt("S2_r6",RadioGroup6);
                        editor.commit();
                        break;
                    case R.id.s2_r12:
                        RadioGroup6 = 2;
                        editor.putInt("S2_r6",RadioGroup6);
                        editor.commit();
                        break;
                }
            }
        });


        spinner1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                Spinner1 = spinner1.getSelectedItemPosition();
                editor.putInt("S2_d1",Spinner1);
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
                editor.putInt("S2_d2",Spinner2);
                editor.commit();

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
        spinner3.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                Spinner3 = spinner3.getSelectedItemPosition();
                editor.putInt("S2_d3",Spinner3);
                editor.commit();

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
        spinner4.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                Spinner4 = spinner4.getSelectedItemPosition();
                editor.putInt("S2_d4",Spinner4);
                editor.commit();

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
        spinner5.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                Spinner5 = spinner5.getSelectedItemPosition();
                editor.putInt("S2_d5",Spinner5);
                editor.commit();

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });


        next2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(editText1.getText().toString().length()==0){
                    editText1.setError("Field must be filled");
                    editText1.requestFocus();
                }
                else if(editText2.getText().toString().length()== 0){
                    editText2.setError("Field must be filled");
                    editText2.requestFocus();
                }
                else if(editText3.getText().toString().length()== 0){
                    editText3.setError("Field must be filled");
                    editText3.requestFocus();
                }
                else if(!editText3.getText().toString().trim().matches(emailPattern)){
                    editText3.setError("Email not correct");
                    editText3.requestFocus();
                }
                else if(editText4.getText().toString().length()== 0){
                    editText4.setError("Field must be filled");
                    editText4.requestFocus();
                }
                else if(editText5.getText().toString().length() != 10){
                    editText5.setError("Phone Number is required");
                    editText5.requestFocus();
                }
                else if (Spinner1 == 0){
                    error_spinner1.requestFocus();
                    error_spinner1.setVisibility(View.VISIBLE);
                }
                else if (Spinner2 == 0){
                    error_spinner2.requestFocus();
                    error_spinner2.setVisibility(View.VISIBLE);
                }
                else if (Spinner3 == 0){
                    error_spinner3.requestFocus();
                    error_spinner3.setVisibility(View.VISIBLE);
                }
                else if (Spinner4 == 0){
                    error_spinner4.requestFocus();
                    error_spinner4.setVisibility(View.VISIBLE);
                }
                else if (Spinner5 == 0){
                    error_spinner5.requestFocus();
                    error_spinner5.setVisibility(View.VISIBLE);
                }
                else if(editText10.getText().toString().length()== 0){
                    editText10.setError("Aadhar number is required");
                    editText10.requestFocus();
                }else if(!radioButton11.isChecked()){
                    Toast.makeText(Applicant_details.this,"Cannot Procede until you agree",Toast.LENGTH_SHORT).show();
                }
                else{

                    editor.putString("S2_ed1",editText1.getText().toString());
                    editor.putString("S2_ed2",editText2.getText().toString());
                    editor.putString("S2_ed3",editText3.getText().toString());
                    editor.putString("S2_ed4",editText4.getText().toString());
                    editor.putString("S2_ed5",editText5.getText().toString());
                    editor.putString("S2_ed6",editText6.getText().toString());
                    editor.putString("S2_ed7",editText7.getText().toString());
                    editor.putString("S2_ed8",editText8.getText().toString());
                    editor.putString("S2_ed9",editText9.getText().toString());
                    editor.putString("S2_ed10",editText10.getText().toString());
                    editor.commit();
                    Intent next2 = new Intent(Applicant_details.this, Family_details.class);
                    startActivity(next2);
                }
            }
        });

        back2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent back2 = new Intent(Applicant_details.this,Service_required.class);
                startActivity(back2);
            }
        });

        editText4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Calendar cal = Calendar.getInstance();
                int year = cal.get(Calendar.YEAR);
                int month = cal.get(Calendar.MONTH);
                int day = cal.get(Calendar.DAY_OF_MONTH);

                DatePickerDialog dialog = new DatePickerDialog(
                        Applicant_details.this,
                        android.R.style.Theme_Holo_Light_Dialog_MinWidth,
                        mDateSetListener,
                        year,month,day);
                dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                dialog.show();
            }
        });

        mDateSetListener = new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker datePicker, int year, int month, int day) {
                month = month + 1;
                Log.d(TAG, "onDateSet: mm/dd/yyy: " + month + "/" + day + "/" + year);

                String date = month + "/" + day + "/" + year;
                editText4.setText(date);
            }
        };
    }

    @Override
    public void onBackPressed() {
        startActivity(new Intent(Applicant_details.this, Service_required.class));
        finish();
    }

    @Override
    protected void onResume() {
        super.onResume();
        editText1.setText(prefs.getString("S2_ed1",""));
        editText2.setText(prefs.getString("S2_ed2",""));
        editText3.setText(prefs.getString("S2_ed3",""));
        editText4.setText(prefs.getString("S2_ed4",""));
        editText5.setText(prefs.getString("S2_ed5",""));
        editText6.setText(prefs.getString("S2_ed6",""));
        editText7.setText(prefs.getString("S2_ed7",""));
        editText8.setText(prefs.getString("S2_ed8",""));
        editText9.setText(prefs.getString("S2_ed9",""));
        editText10.setText(prefs.getString("S2_ed10",""));

        if(prefs.getInt("S2_r1" ,0)== 1){
            radioButton1.setChecked(true);
        }else {
            radioButton2.setChecked(true);
        }
        if(prefs.getInt("S2_r2" ,0)== 1){
            radioButton3.setChecked(true);
        }else {
            radioButton4.setChecked(true);
        }
        if(prefs.getInt("S2_r3" ,0)== 1){
            radioButton5.setChecked(true);
        }else {
            radioButton6.setChecked(true);
        }
        if(prefs.getInt("S2_r4" ,0)== 1){
            radioButton7.setChecked(true);
        }else {
            radioButton8.setChecked(true);
        }
        if(prefs.getInt("S2_r5" ,0)== 1){
            radioButton9.setChecked(true);
        }else {
            radioButton10.setChecked(true);
        }
        if(prefs.getInt("S2_r6" ,0)== 1){
            radioButton11.setChecked(true);
        }else {
            radioButton12.setChecked(true);
        }

        spinner1.setSelection(prefs.getInt("S2_d1",0));
        spinner2.setSelection(prefs.getInt("S2_d2",0));
        spinner3.setSelection(prefs.getInt("S2_d3",0));
        spinner4.setSelection(prefs.getInt("S2_d4",0));
        spinner5.setSelection(prefs.getInt("S2_d5",0));
    }
}
