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
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;

import com.g7tech.passport.R;

import java.util.Calendar;
import java.text.SimpleDateFormat;
import java.util.Locale;

public class Service_required extends AppCompatActivity {

    private static final String TAG = Service_required.class.getSimpleName();


    SharedPreferences prefs;
    SharedPreferences.Editor editor;

    LinearLayout linear1;
    CheckBox cb1,cb2,cb3,cb4,cb5,cb6;
    TextView spinner_error;
    EditText editText1, editText2, editText3, editText4, editText5;
    Spinner spinner1;
    Calendar mycalender, mycalender1;
    Button next;
    RadioGroup radioGroup1;
    RadioButton radioButton1, radioButton2;
    public int Spinner1,RadioGroup1,Checkbox1,Checkbox2,Checkbox3,Checkbox4,Checkbox5,Checkbox6;
    private DatePickerDialog.OnDateSetListener mDateSetListener,mDateSetListener1;



    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_service_required);
        setTitle("Service Required");

        prefs= getSharedPreferences("Passport", MODE_PRIVATE);
        editor = prefs.edit();

        linear1 = findViewById(R.id.linear1);
        spinner_error = findViewById(R.id.s1_error_spinner);
        next = findViewById(R.id.next1);
        editText1 = findViewById(R.id.s1_ed1);
        editText2 = findViewById(R.id.s1_ed2);
        editText3 = findViewById(R.id.s1_ed3);
        editText4 = findViewById(R.id.s1_ed4);
        editText5 = findViewById(R.id.s1_ed5);
        spinner1 = findViewById(R.id.s1_dp1);
        radioGroup1 = findViewById(R.id.s1_1r);
        cb1 = findViewById(R.id.s1_2r);
        cb2 = findViewById(R.id.cb1);
        cb3 = findViewById(R.id.cb2);
        cb4 = findViewById(R.id.cb3);
        cb5 = findViewById(R.id.cb4);
        cb6 = findViewById(R.id.cb5);
        radioButton1 = findViewById(R.id.s1_r1);
        radioButton2 = findViewById(R.id.s1_r2);
//        radioButton3 = findViewById(R.id.s1_r3);
//        radioButton4 = findViewById(R.id.s1_r4);
//        radioButton5 = findViewById(R.id.s1_r5);
//        radioButton6 = findViewById(R.id.s1_r6);
//        radioButton7 = findViewById(R.id.s1_r7);
//        radioButton8 = findViewById(R.id.s1_r8);
        mycalender = Calendar.getInstance();
        mycalender1 = Calendar.getInstance();


        //getting values from editetxt and radiobuttons

        radioGroup1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                // checkedId is the RadioButton selected
                switch (checkedId) {
                    case R.id.s1_r1:
                        RadioGroup1 = 1;
                        editor.putInt("S1_r1",RadioGroup1);
                        editor.commit();

                        break;
                    case R.id.s1_r2:
                        RadioGroup1 = 2;
                        editor.putInt("S1_r1",RadioGroup1);
                        editor.commit();

                        break;
                }
            }
        });

        cb1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(cb1.isChecked()){
                    Checkbox1 = 1;
                    editor.putInt("S1_r2",Checkbox1);
                    editor.commit();
                }
            }
        });
        cb2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(cb2.isChecked()){
                    Checkbox2 = 2;
                    editor.putInt("cb1",Checkbox2);
                    editor.commit();
                }
            }
        });
        cb3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(cb3.isChecked()){
                    Checkbox3 = 3;
                    editor.putInt("cb2",Checkbox3);
                    editor.commit();
                }
            }
        });
        cb4.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(cb4.isChecked()){
                    Checkbox4 = 4;
                    editor.putInt("cb3",Checkbox4);
                    editor.commit();
                }
            }
        });
        cb5.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(cb5.isChecked()){
                    Checkbox5 = 5;
                    editor.putInt("cb4",Checkbox5);
                    editor.commit();
                }
            }
        });
        cb6.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(cb6.isChecked()){
                    Checkbox6 = 6;
                    editor.putInt("cb5",Checkbox6);
                    editor.commit();
                }
            }
        });

//        radioGroup2.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
//            @Override
//            public void onCheckedChanged(RadioGroup group, int checkedId) {
//                switch (checkedId) {
//                    case R.id.s1_r3:
//                        RadioGroup2 = 1;
//                        editor.putInt("S1_r2",RadioGroup2);
//                        editor.commit();
//                        break;
//                    case R.id.s1_r4:
//                        RadioGroup2 = 2;
//                        editor.putInt("S1_r2",RadioGroup2);
//                        editor.commit();
//                        break;
//                    case R.id.s1_r5:
//                        RadioGroup2 = 3;
//                        editor.putInt("S1_r2",RadioGroup2);
//                        editor.commit();
//                        break;
//                    case R.id.s1_r6:
//                        RadioGroup1 = 4;
//                        editor.putInt("S1_r2",RadioGroup2);
//                        editor.commit();
//                        break;
//                    case R.id.s1_r7:
//                        RadioGroup1 = 5;
//                        editor.putInt("S1_r2",RadioGroup2);
//                        editor.commit();
//                        break;
//                    case R.id.s1_r8:
//                        RadioGroup1 = 6;
//                        editor.putInt("S1_r2",RadioGroup2);
//                        editor.commit();
//                        break;
//                }
//            }
//        });


        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Spinner1 == 0) {
                    spinner_error.setVisibility(View.VISIBLE);
                }else {
                    if (Spinner1 == 3 || Spinner1 == 4) {
                        if (editText1.getText().toString().length() == 0) {
                            editText1.setError("Passport Number must be entered");
                            editText1.requestFocus();
                        } else if (editText2.getText().toString().length() == 0) {
                            editText2.setError("File number must be entered");
                            editText2.requestFocus();
                        } else if (editText3.getText().toString().length() == 0) {
                            editText3.setError("Field must be required");
                            editText3.requestFocus();
                        } else if (editText4.getText().toString().length() == 0) {
                            editText4.setError("Field must be required");
                            editText4.requestFocus();
                        } else if (editText5.getText().toString().length() == 0) {
                            editText5.setError("Field must be required");
                            editText5.requestFocus();
                        }else {
                            editor.putString("S1_ed1", editText1.getText().toString());
                            editor.putString("S1_ed2", editText2.getText().toString());
                            editor.putString("S1_ed3", editText3.getText().toString());
                            editor.putString("S1_ed4", editText4.getText().toString());
                            editor.putString("S1_ed5", editText5.getText().toString());
                            editor.commit();
                            Intent next = new Intent(Service_required.this, Applicant_details.class);
                            startActivity(next);
                        }
                    }else{

                        Intent next = new Intent(Service_required.this, Applicant_details.class);
                        startActivity(next);

                    }
                }
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
                        Service_required.this,
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


        editText5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Calendar cal = Calendar.getInstance();
                int year = cal.get(Calendar.YEAR);
                int month = cal.get(Calendar.MONTH);
                int day = cal.get(Calendar.DAY_OF_MONTH);

                DatePickerDialog dialog = new DatePickerDialog(
                        Service_required.this,
                        android.R.style.Theme_Holo_Light_Dialog_MinWidth,
                        mDateSetListener1,
                        year,month,day);
                dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                dialog.show();
            }
        });

        mDateSetListener1 = new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker datePicker, int year, int month, int day) {
                month = month + 1;
                Log.d(TAG, "onDateSet: mm/dd/yyy: " + month + "/" + day + "/" + year);

                String date = month + "/" + day + "/" + year;
                editText5.setText(date);
            }
        };



        spinner1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                Spinner1 = spinner1.getSelectedItemPosition();
                editor.putInt("S1_d1",Spinner1);
                editor.commit();
                if (spinner1.getSelectedItemPosition() == 3 || spinner1.getSelectedItemPosition() == 4) {
                    linear1.setVisibility(View.VISIBLE);
                } else {
                    linear1.setVisibility(View.INVISIBLE);
                }

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }



    @Override
    public void onBackPressed() {
        startActivity(new Intent(Service_required.this, Dashboard.class));
        finish();
    }

    @Override
    protected void onResume() {
        super.onResume();
        editText1.setText(prefs.getString("S1_ed1",""));
        editText2.setText(prefs.getString("S1_ed2",""));
        editText3.setText(prefs.getString("S1_ed3",""));
        editText4.setText(prefs.getString("S1_ed4",""));
        editText5.setText(prefs.getString("S1_ed5",""));

        if(prefs.getInt("S1_r1" ,0)== 1){
            radioButton1.setChecked(true);
        }else {
            radioButton2.setChecked(true);
        }

        if(prefs.getInt("S1_r2" ,0)== 1){
            cb1.setChecked(true);
        }else{
            cb1.setChecked(false);
        }

        if (prefs.getInt("cb1",0)==2){
            cb2.setChecked(true);
        }else{
            cb2.setChecked(false);
        }

        if (prefs.getInt("cb2",0)==3){
            cb3.setChecked(true);
        }else{
            cb3.setChecked(false);
        }


        if (prefs.getInt("cb3",0)==4){
            cb4.setChecked(true);
        }else{
            cb4.setChecked(false);
        }

        if (prefs.getInt("cb4",0)==5){
            cb5.setChecked(true);
        }else{
            cb5.setChecked(false);
        }

        if(prefs.getInt("cb5",0)==6){
            cb6.setChecked(true);
        }else{
            cb6.setChecked(false);
        }

        spinner1.setSelection(prefs.getInt("S1_d1",0));
    }
}
