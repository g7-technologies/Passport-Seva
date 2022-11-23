package com.g7tech.passport.Activities;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import com.g7tech.passport.R;

public class other_details extends AppCompatActivity {

    SharedPreferences prefs;
    SharedPreferences.Editor editor;

    Button next5,back5;
    RadioGroup radioGroup1,radioGroup2,radioGroup3,radioGroup4,radioGroup5,radioGroup6,radioGroup7,radioGroup8,radioGroup9;
    RadioButton radioButton1,radioButton2,radioButton3,radioButton4,radioButton5,radioButton6,radioButton7,radioButton8,radioButton9,
            radioButton10,radioButton11,radioButton12,radioButton13,radioButton14,radioButton15,radioButton16,radioButton17,radioButton18;
    public int RadioGroup1,RadioGroup2,RadioGroup3,RadioGroup4,RadioGroup5,RadioGroup6,RadioGroup7,RadioGroup8,RadioGroup9;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_other_activities);
        setTitle("Other details");

        prefs= getSharedPreferences("Passport", MODE_PRIVATE);
        editor = prefs.edit();

        radioGroup1=findViewById(R.id.s5_1r);
        radioGroup2=findViewById(R.id.s5_2r);
        radioGroup3=findViewById(R.id.s5_3r);
        radioGroup4=findViewById(R.id.s5_4r);
        radioGroup5=findViewById(R.id.s5_5r);
        radioGroup6=findViewById(R.id.s5_6r);
        radioGroup7=findViewById(R.id.s5_7r);
        radioGroup8=findViewById(R.id.s5_8r);
        radioGroup9=findViewById(R.id.s5_9r);

        radioButton1 = findViewById(R.id.s5_r1);
        radioButton2 = findViewById(R.id.s5_r2);
        radioButton3 = findViewById(R.id.s5_r3);
        radioButton4 = findViewById(R.id.s5_r4);
        radioButton5 = findViewById(R.id.s5_r5);
        radioButton6 = findViewById(R.id.s5_r6);
        radioButton7 = findViewById(R.id.s5_r7);
        radioButton8 = findViewById(R.id.s5_r8);
        radioButton9 = findViewById(R.id.s5_r9);
        radioButton10 = findViewById(R.id.s5_r10);
        radioButton11 = findViewById(R.id.s5_r11);
        radioButton12 = findViewById(R.id.s5_r12);
        radioButton13 = findViewById(R.id.s5_r13);
        radioButton14 = findViewById(R.id.s5_r14);
        radioButton15 = findViewById(R.id.s5_r15);
        radioButton16 = findViewById(R.id.s5_r16);
        radioButton17 = findViewById(R.id.s5_r17);
        radioButton18 = findViewById(R.id.s5_r18);
        next5 = findViewById(R.id.next5);
        back5 = findViewById(R.id.back5);

        //getting values from radiogroup


        radioGroup1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                // checkedId is the RadioButton selected
                switch (checkedId) {
                    case R.id.s5_r1:
                        RadioGroup1 = 1;
                        editor.putInt("S5_r1",RadioGroup1);
                        editor.commit();
                        break;
                    case R.id.s5_r2:
                        RadioGroup1 = 2;
                        editor.putInt("S5_r1",RadioGroup1);
                        editor.commit();
                        break;
                }
            }
        });


        radioGroup2.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId){
                    case R.id.s5_r3:
                        RadioGroup2 = 1;
                        editor.putInt("S5_r2",RadioGroup2);
                        editor.commit();
                        break;

                    case R.id.s5_r4:
                        RadioGroup2 = 2;
                        editor.putInt("S5_r2",RadioGroup2);
                        editor.commit();
                        break;


                }
            }
        });

        radioGroup3.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId){
                    case R.id.s5_r5:
                        RadioGroup3 = 1;
                        editor.putInt("S5_r3",RadioGroup3);
                        editor.commit();
                        break;
                    case R.id.s5_r6:
                        RadioGroup3 = 2;
                        editor.putInt("S5_r3",RadioGroup3);
                        editor.commit();
                        break;
                }
            }
        });


        radioGroup4.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId){
                    case R.id.s5_r7:
                        RadioGroup4 = 1;
                        editor.putInt("S5_r4",RadioGroup4);
                        editor.commit();
                        break;

                    case R.id.s5_r8:
                        RadioGroup4 = 2;
                        editor.putInt("S5_r4",RadioGroup4);
                        editor.commit();
                        break;

                }
            }
        });

        radioGroup5.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId){
                    case R.id.s5_r9:
                        RadioGroup5 = 1;
                        editor.putInt("S5_r5",RadioGroup5);
                        editor.commit();
                        break;

                    case R.id.s5_r10:
                        RadioGroup5 = 2;
                        editor.putInt("S5_r5",RadioGroup5);
                        editor.commit();
                        break;

                }
            }
        });
        radioGroup6.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId){
                    case R.id.s5_r11:
                        RadioGroup6 = 1;
                        editor.putInt("S5_r6",RadioGroup6);
                        editor.commit();
                        break;
                    case R.id.s5_r12:
                        RadioGroup6 = 2;
                        editor.putInt("S5_r6",RadioGroup6);
                        editor.commit();
                        break;

                }
            }
        });
        radioGroup7.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId){
                    case R.id.s5_r13:
                        RadioGroup7 = 1;
                        editor.putInt("S5_r7",RadioGroup7);
                        editor.commit();
                        break;
                    case R.id.s5_r14:
                        RadioGroup7 = 2;
                        editor.putInt("S5_r7",RadioGroup7);
                        editor.commit();
                        break;

                }
            }
        });
        radioGroup8.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId){
                    case R.id.s5_r15:
                        RadioGroup8 = 1;
                        editor.putInt("S5_r8",RadioGroup8);
                        editor.commit();
                        break;
                    case R.id.s5_r16:
                        RadioGroup8 = 2;
                        editor.putInt("S5_r8",RadioGroup8);
                        editor.commit();
                        break;

                }
            }
        });
        radioGroup9.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId){
                    case R.id.s5_r17:
                        RadioGroup9 = 1;
                        editor.putInt("S5_r9",RadioGroup9);
                        editor.commit();
                        break;
                    case R.id.s5_r18:
                        RadioGroup9 = 2;
                        editor.putInt("S5_r9",RadioGroup9);
                        editor.commit();
                        break;

                }
            }
        });
        back5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent back5 = new Intent(other_details.this,residential_address.class);
                startActivity(back5);
            }
        });




        next5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent next5 = new Intent(other_details.this,Emergency_contact.class);
                startActivity(next5);
            }
        });
    }
    @Override
    public void onBackPressed() {
        startActivity(new Intent(other_details.this, residential_address.class));
        finish();
    }

    @Override
    protected void onResume() {
        super.onResume();

        if(prefs.getInt("S5_r1" ,0)== 1){
            radioButton1.setChecked(true);
        }else {
            radioButton2.setChecked(true);
        }

        if(prefs.getInt("S5_r2" ,0)== 1){
            radioButton3.setChecked(true);
        }else {
            radioButton4.setChecked(true);
        }

        if(prefs.getInt("S5_r3" ,0)== 1){
            radioButton5.setChecked(true);
        }else {
            radioButton6.setChecked(true);
        }

        if(prefs.getInt("S5_r4" ,0)== 1){
            radioButton7.setChecked(true);
        }else {
            radioButton8.setChecked(true);
        }

        if(prefs.getInt("S5_r5" ,0)== 1){
            radioButton9.setChecked(true);
        }else {
            radioButton10.setChecked(true);
        }
        if(prefs.getInt("S5_r6" ,0)== 1){
            radioButton11.setChecked(true);
        }else {
            radioButton12.setChecked(true);
        }

        if(prefs.getInt("S5_r7" ,0)== 1){
            radioButton13.setChecked(true);
        }else {
            radioButton14.setChecked(true);
        }

        if(prefs.getInt("S5_r8" ,0)== 1){
            radioButton15.setChecked(true);
        }else {
            radioButton16.setChecked(true);
        }

        if(prefs.getInt("S5_r9" ,0)== 1){
            radioButton17.setChecked(true);
        }else {
            radioButton18.setChecked(true);
        }
    }
}
