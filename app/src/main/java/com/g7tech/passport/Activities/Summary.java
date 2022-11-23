package com.g7tech.passport.Activities;

import android.app.DatePickerDialog;
import android.app.ProgressDialog;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.g7tech.passport.R;
import com.g7tech.passport.helper.AppController;
import com.g7tech.passport.helper.App_config;
import com.paykun.sdk.PaykunApiCall;
import com.paykun.sdk.eventbus.Events;
import com.paykun.sdk.eventbus.GlobalBus;
import com.paykun.sdk.helper.PaykunHelper;

import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;

public class Summary extends AppCompatActivity {

    SharedPreferences prefs;
    SharedPreferences.Editor editor;
    private static final String TAG = Summary.class.getSimpleName();
    private ProgressDialog pDialog;
    String trans_id;
    CheckBox cb1,cb2,cb3;
    TextView error_checkbox1,error_checkbox2,error_checkbox3;

    //Service_required(secreen_1)


    LinearLayout linear1;
    CheckBox s1_cb1,s1_cb2,s1_cb3,s1_cb4,s1_cb5,s1_cb6;
    TextView spinner_error;
    EditText editText1, editText2, editText3, editText4, editText5;
    Spinner spinner1;
    Calendar mycalender, mycalender1;
    Button next,back;
    RadioGroup radioGroup1;
    RadioButton radioButton1, radioButton2;
    public int Spinner1,RadioGroup1,Checkbox1,Checkbox2,Checkbox3,Checkbox4,Checkbox5,Checkbox6;
    private DatePickerDialog.OnDateSetListener mDateSetListener,mDateSetListener1;

    //Applicant_detail(secreen_2)

    TextView error_spinner1_s2,error_spinner2_s2,error_spinner3_s2,error_spinner4_s2,error_spinner5_s2;
    EditText editText1_s2,editText2_s2,editText3_s2,editText4_s2,editText5_s2,editText6_s2,editText7_s2,editText8_s2,editText9_s2,editText10_s2;
    RadioGroup radioGroup1_s2,radioGroup2_s2,radioGroup3_s2,radioGroup4_s2,radioGroup5_s2,radioGroup6_s2;
    RadioButton radioButton1_s2,radioButton2_s2,radioButton3_s2,radioButton4_s2,radioButton5_s2,radioButton6_s2,radioButton7_s2,radioButton8_s2,radioButton9_s2,
            radioButton10_s2,radioButton11_s2,radioButton12_s2;
    Spinner spinner1_s2,spinner2_s2,spinner3_s2,spinner4_s2,spinner5_s2;
    Calendar mycalender_s2;



            //family_detail(screen_3)

    EditText editText1_s3,editText2_s3,editText3_s3,editText4_s3,edtwife;
    LinearLayout Lwife;
    TextView txtwife;


            //Residential_detail(screen_4)

    LinearLayout linear3_s4;
    TextView error_spinner1_s4,error_spinner2_s4;
    EditText editText1_s4,editText2_s4,editText3_s4,editText4_s4,editText5_s4,editText6_s4,editText7_s4,editText8_s4,editText9_s4,
            editText10_s4,editText11_s4,editText12_s4,editText13_s4,editText14_s4,editText15_s4,editText16_s4;
    RadioGroup radioGroup_s4;
    RadioButton radioButton1_s4,radioButton2_s4;
    Spinner spinner1_s4,spinner2_s4;


            //other_detail(screen_5)

    RadioGroup radioGroup1_s5,radioGroup2_s5,radioGroup3_s5,radioGroup4_s5,radioGroup5_s5,radioGroup6_s5,radioGroup7_s5,radioGroup8_s5,radioGroup9_s5;
    RadioButton radioButton1_s5,radioButton2_s5,radioButton3_s5,radioButton4_s5,radioButton5_s5,radioButton6_s5,radioButton7_s5,radioButton8_s5,radioButton9_s5,
            radioButton10_s5,radioButton11_s5,radioButton12_s5,radioButton13_s5,radioButton14_s5,radioButton15_s5,radioButton16_s5,radioButton17_s5,radioButton18_s5;

            //Emergency_detail(screen_6)


    TextView error_checkbox_s6;
    EditText editText1_s6,editText2_s6,editText3_s6,editText4_s6,editText5_s6,editText6_s6;
    android.widget.CheckBox checkBox_s6;
    Calendar mycalender3_s6;
    int fee;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_summary);
        setTitle("Summary");

        pDialog = new ProgressDialog(this);
        pDialog.setCancelable(false);

        prefs= getSharedPreferences("Passport", MODE_PRIVATE);
        editor = prefs.edit();

        error_checkbox1 = findViewById(R.id.s4_check1);
        error_checkbox2 = findViewById(R.id.s4_check2);
        error_checkbox3 = findViewById(R.id.s4_check3);

        cb1 = findViewById(R.id.check1);
        cb2 = findViewById(R.id.check2);
        cb3 = findViewById(R.id.check3);
        //Screen_1

        linear1 = findViewById(R.id.linear1);
        spinner_error = findViewById(R.id.s1_error_spinner);
        next= findViewById(R.id.summery);
        back= findViewById(R.id.back1);
        editText1 = findViewById(R.id.s1_ed1);
        editText2 = findViewById(R.id.s1_ed2);
        editText3 = findViewById(R.id.s1_ed3);
        editText4 = findViewById(R.id.s1_ed4);
        editText5 = findViewById(R.id.s1_ed5);
        spinner1 = findViewById(R.id.s1_dp1);
        radioGroup1= findViewById(R.id.s1_1r);
        s1_cb1= findViewById(R.id.s1_2r);
        s1_cb2= findViewById(R.id.cb1);
        s1_cb3= findViewById(R.id.cb2);
        s1_cb4= findViewById(R.id.cb3);
        s1_cb5= findViewById(R.id.cb4);
        s1_cb6= findViewById(R.id.cb5);

        radioButton1 = findViewById(R.id.s1_r1);
        radioButton2 = findViewById(R.id.s1_r2);
//        radioButton3 = findViewById(R.id.s1_r3);
//        radioButton4 = findViewById(R.id.s1_r4);
//        radioButton5 = findViewById(R.id.s1_r5);
//        radioButton6 = findViewById(R.id.s1_r6);
//        radioButton7 = findViewById(R.id.s1_r7);
//        radioButton8 = findViewById(R.id.s1_r8);
        mycalender= Calendar.getInstance();
        mycalender1= Calendar.getInstance();

                   //Screen_2
        error_spinner1_s2=findViewById(R.id.s2_error_spinner1);
        error_spinner2_s2=findViewById(R.id.s2_error_spinner2);
        error_spinner3_s2=findViewById(R.id.s2_error_spinner3);
        error_spinner4_s2=findViewById(R.id.s2_error_spinner4);
        error_spinner5_s2=findViewById(R.id.s2_error_spinner5);
        editText1_s2 = findViewById(R.id.s2_ed1);
        editText2_s2 = findViewById(R.id.s2_ed2);
        editText3_s2 = findViewById(R.id.s2_ed3);
        editText4_s2 = findViewById(R.id.s2_ed4);
        editText5_s2 = findViewById(R.id.s2_ed5);
        editText6_s2 = findViewById(R.id.s2_ed6);
        editText7_s2 = findViewById(R.id.s2_ed7);
        editText8_s2 = findViewById(R.id.s2_ed8);
        editText9_s2 = findViewById(R.id.s2_ed9);
        editText10_s2 = findViewById(R.id.s2_ed10);
        radioGroup1_s2 = findViewById(R.id.s2_1r);
        radioGroup2_s2 = findViewById(R.id.s2_2r);
        radioGroup3_s2 = findViewById(R.id.s2_3r);
        radioGroup4_s2 = findViewById(R.id.s2_4r);
        radioGroup5_s2 = findViewById(R.id.s2_5r);
        radioGroup6_s2 = findViewById(R.id.s2_6r);
        radioButton1_s2 =findViewById(R.id.s2_r1);
        radioButton2_s2 =findViewById(R.id.s2_r2);
        radioButton3_s2 =findViewById(R.id.s2_r3);
        radioButton4_s2 =findViewById(R.id.s2_r4);
        radioButton5_s2 =findViewById(R.id.s2_r5);
        radioButton6_s2 =findViewById(R.id.s2_r6);
        radioButton7_s2 =findViewById(R.id.s2_r7);
        radioButton8_s2 =findViewById(R.id.s2_r8);
        radioButton9_s2 =findViewById(R.id.s2_r9);
        radioButton10_s2 =findViewById(R.id.s2_r10);
        radioButton11_s2 =findViewById(R.id.s2_r11);
        radioButton12_s2 =findViewById(R.id.s2_r12);
        spinner1_s2 = findViewById(R.id.s2_dp1);
        spinner2_s2 = findViewById(R.id.s2_dp2);
        spinner3_s2 = findViewById(R.id.s2_dp3);
        spinner4_s2 = findViewById(R.id.s2_dp4);
        spinner5_s2 = findViewById(R.id.s2_dp5);
        mycalender_s2 = Calendar.getInstance();
                    //Screen_3
        editText1_s3= findViewById(R.id.s3_ed1);
        editText2_s3= findViewById(R.id.s3_ed2);
        editText3_s3= findViewById(R.id.s3_ed3);
        editText4_s3= findViewById(R.id.s3_ed4);
        Lwife = findViewById(R.id.wifename);
        txtwife = findViewById(R.id.txtwife);
        edtwife = findViewById(R.id.edtwife);

        //Screen_4
        linear3_s4 = findViewById(R.id.s4_linear3);
        error_spinner1_s4 = findViewById(R.id.s4_error_spinner1);
        error_spinner2_s4 = findViewById(R.id.s4_error_spinner2);

        editText1_s4 = findViewById(R.id.s4_ed1);
        editText2_s4 = findViewById(R.id.s4_ed2);
        editText3_s4 = findViewById(R.id.s4_ed3);
        editText4_s4 = findViewById(R.id.s4_ed4);
        editText5_s4 = findViewById(R.id.s4_ed5);
        editText6_s4 = findViewById(R.id.s4_ed6);
        editText7_s4 = findViewById(R.id.s4_ed7);
        editText8_s4 = findViewById(R.id.s4_ed8);
        editText9_s4 = findViewById(R.id.s4_ed9);
        editText10_s4 = findViewById(R.id.s4_ed10);
        editText11_s4 = findViewById(R.id.s4_ed11);
        editText12_s4 = findViewById(R.id.s4_ed12);
        editText13_s4 = findViewById(R.id.s4_ed13);
        editText14_s4 = findViewById(R.id.s4_ed14);
        editText15_s4 = findViewById(R.id.s4_ed15);
        editText16_s4 = findViewById(R.id.s4_ed16);
        radioGroup_s4= findViewById(R.id.s4_r);
        radioButton1_s4 = findViewById(R.id.s4_r1);
        radioButton2_s4 = findViewById(R.id.s4_r2);
        spinner1_s4 = findViewById(R.id.s4_dp1);
        spinner2_s4 = findViewById(R.id.s4_dp2);
                    //Screen_5
        radioGroup1_s5=findViewById(R.id.s5_1r);
        radioGroup2_s5=findViewById(R.id.s5_2r);
        radioGroup3_s5=findViewById(R.id.s5_3r);
        radioGroup4_s5=findViewById(R.id.s5_4r);
        radioGroup5_s5=findViewById(R.id.s5_5r);
        radioGroup6_s5=findViewById(R.id.s5_6r);
        radioGroup7_s5=findViewById(R.id.s5_7r);
        radioGroup8_s5=findViewById(R.id.s5_8r);
        radioGroup9_s5=findViewById(R.id.s5_9r);

        radioButton1_s5 = findViewById(R.id.s5_r1);
        radioButton2_s5 = findViewById(R.id.s5_r2);
        radioButton3_s5 = findViewById(R.id.s5_r3);
        radioButton4_s5 = findViewById(R.id.s5_r4);
        radioButton5_s5 = findViewById(R.id.s5_r5);
        radioButton6_s5 = findViewById(R.id.s5_r6);
        radioButton7_s5 = findViewById(R.id.s5_r7);
        radioButton8_s5 = findViewById(R.id.s5_r8);
        radioButton9_s5 = findViewById(R.id.s5_r9);
        radioButton10_s5 = findViewById(R.id.s5_r10);
        radioButton11_s5 = findViewById(R.id.s5_r11);
        radioButton12_s5 = findViewById(R.id.s5_r12);
        radioButton13_s5 = findViewById(R.id.s5_r13);
        radioButton14_s5 = findViewById(R.id.s5_r14);
        radioButton15_s5 = findViewById(R.id.s5_r15);
        radioButton16_s5 = findViewById(R.id.s5_r16);
        radioButton17_s5 = findViewById(R.id.s5_r17);
        radioButton18_s5 = findViewById(R.id.s5_r18);

                    //Screen_6
        editText1_s6= findViewById(R.id.s6_ed1);
        editText2_s6= findViewById(R.id.s6_ed2);
        editText3_s6= findViewById(R.id.s6_ed3);
        editText4_s6= findViewById(R.id.s6_ed4);
        editText5_s6= findViewById(R.id.s6_ed5);
        editText6_s6= findViewById(R.id.s6_ed6);
        checkBox_s6= findViewById(R.id.s6_cb1);
        error_checkbox_s6=findViewById(R.id.s6_error_checkbox);
        mycalender3_s6 = Calendar.getInstance();


        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent back = new Intent(Summary.this,Emergency_contact.class);
                startActivity(back);
            }
        });


        //      Calculating fee
        if(prefs.getInt("S1_d1",0)==1 && prefs.getInt("S1_r1",0)==1 ||prefs.getInt("S1_d1",0)==3 && prefs.getInt("S1_r1",0)==1){
            fee = 2990;

        }else if(prefs.getInt("S1_d1",0)==1 && prefs.getInt("S1_r1",0)==2 ||prefs.getInt("S1_d1",0)==3 && prefs.getInt("S1_r1",0)==2){
            fee = 3490;
        }else if(prefs.getInt("S1_d1",0)==2 && prefs.getInt("S1_r1",0)==1 ||prefs.getInt("S1_d1",0)==2 && prefs.getInt("S1_r1",0)==2){
            fee = 4490;
        }else if(prefs.getInt("S1_d1",0)==4 && prefs.getInt("S1_r1",0)==1 ||prefs.getInt("S1_d1",0)==4 && prefs.getInt("S1_r1",0)==2){
            fee = 5500;
        }

        //disabling spinner
        spinner1.setEnabled(false);
        spinner1_s2.setEnabled(false);
        spinner2_s2.setEnabled(false);
        spinner3_s2.setEnabled(false);
        spinner4_s2.setEnabled(false);
        spinner5_s2.setEnabled(false);
        spinner1_s4.setEnabled(false);
        spinner2_s4.setEnabled(false);

                        /*Screen 1*/
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
            s1_cb1.setChecked(true);
        }else{
            s1_cb1.setChecked(false);
        }

        if (prefs.getInt("cb1",0)==2){
            s1_cb2.setChecked(true);
        }else{
            s1_cb2.setChecked(false);
        }

        if (prefs.getInt("cb2",0)==3){
            s1_cb3.setChecked(true);
        }else{
            s1_cb3.setChecked(false);
        }


        if (prefs.getInt("cb3",0)==4){
            s1_cb4.setChecked(true);
        }else{
            s1_cb4.setChecked(false);
        }

        if (prefs.getInt("cb4",0)==5){
            s1_cb5.setChecked(true);
        }else{
            s1_cb5.setChecked(false);
        }

        if(prefs.getInt("cb5",0)==6){
            s1_cb6.setChecked(true);
        }else{
            s1_cb6.setChecked(false);
        }

        spinner1.setSelection(prefs.getInt("S1_d1",0));


        /*Screen 2*/
        editText1_s2.setText(prefs.getString("S2_ed1",""));
        editText2_s2.setText(prefs.getString("S2_ed2",""));
        editText3_s2.setText(prefs.getString("S2_ed3",""));
        editText4_s2.setText(prefs.getString("S2_ed4",""));
        editText5_s2.setText(prefs.getString("S2_ed5",""));
        editText6_s2.setText(prefs.getString("S2_ed6",""));
        editText7_s2.setText(prefs.getString("S2_ed7",""));
        editText8_s2.setText(prefs.getString("S2_ed8",""));
        editText9_s2.setText(prefs.getString("S2_ed9",""));
        editText10_s2.setText(prefs.getString("S2_ed10",""));

        if(prefs.getInt("S2_r1" ,0)== 1){
            radioButton1_s2.setChecked(true);
        }else {
            radioButton2_s2.setChecked(true);
        }
        if(prefs.getInt("S2_r2" ,0)== 1){
            radioButton3_s2.setChecked(true);
        }else {
            radioButton4_s2.setChecked(true);
        }
        if(prefs.getInt("S2_r3" ,0)== 1){
            radioButton5_s2.setChecked(true);
        }else {
            radioButton6_s2.setChecked(true);
        }
        if(prefs.getInt("S2_r4" ,0)== 1){
            radioButton7_s2.setChecked(true);
        }else {
            radioButton8_s2.setChecked(true);
        }
        if(prefs.getInt("S2_r5" ,0)== 1){
            radioButton9_s2.setChecked(true);
        }else {
            radioButton10_s2.setChecked(true);
        }
        if(prefs.getInt("S2_r6" ,0)== 1){
            radioButton11_s2.setChecked(true);
        }else {
            radioButton12_s2.setChecked(true);
        }

        spinner1_s2.setSelection(prefs.getInt("S2_d1",0));
        spinner2_s2.setSelection(prefs.getInt("S2_d2",0));
        spinner3_s2.setSelection(prefs.getInt("S2_d3",0));
        spinner4_s2.setSelection(prefs.getInt("S2_d4",0));
        spinner5_s2.setSelection(prefs.getInt("S2_d5",0));

                    /*Screen 3*/

        editText1_s3.setText(prefs.getString("S3_ed1",""));
        editText2_s3.setText(prefs.getString("S3_ed2",""));
        editText3_s3.setText(prefs.getString("S3_ed3",""));
        editText4_s3.setText(prefs.getString("S3_ed4",""));
        if(prefs.getInt("S2_d1",0) == 1 && prefs.getInt("S2_d2",0) == 2){
            Lwife.setVisibility(View.VISIBLE);
            txtwife.setText("Wife Name");
            edtwife.setText(prefs.getString("Wife",""));

            edtwife.setVisibility(View.VISIBLE);
        }
        else if(prefs.getInt("S2_d1",0) == 2 && prefs.getInt("S2_d2",0) == 2){
            Lwife.setVisibility(View.VISIBLE);
            txtwife.setText("Husband Name");
            edtwife.setText(prefs.getString("Wife",""));

            edtwife.setVisibility(View.VISIBLE);
        }
        else if(prefs.getInt("S2_d1",0) == 1 && prefs.getInt("S2_d2",0) == 4){
            Lwife.setVisibility(View.VISIBLE);
            txtwife.setText("Wife Name");
            edtwife.setText(prefs.getString("Wife",""));

            edtwife.setVisibility(View.VISIBLE);
        }
        else if(prefs.getInt("S2_d1",0) == 2 && prefs.getInt("S2_d2",0) == 4){
            Lwife.setVisibility(View.VISIBLE);
            txtwife.setText("Husband Name");
            edtwife.setVisibility(View.VISIBLE);
            edtwife.setText(prefs.getString("Wife",""));

        }
        else {
            Lwife.setVisibility(View.GONE);
            edtwife.setVisibility(View.GONE);
        }


//                Screen 4
        editText1_s4.setText(prefs.getString("S4_ed1",""));
        editText2_s4.setText(prefs.getString("S4_ed2",""));
        editText3_s4.setText(prefs.getString("S4_ed3",""));
        editText4_s4.setText(prefs.getString("S4_ed4",""));
        editText5_s4.setText(prefs.getString("S4_ed5",""));
        editText6_s4.setText(prefs.getString("S4_ed6",""));
        editText7_s4.setText(prefs.getString("S4_ed7",""));
        editText8_s4.setText(prefs.getString("S4_ed8",""));
        editText9_s4.setText(prefs.getString("S4_ed9",""));
        editText10_s4.setText(prefs.getString("S4_ed10",""));
        editText11_s4.setText(prefs.getString("S4_ed11",""));
        editText12_s4.setText(prefs.getString("S4_ed12",""));
        editText13_s4.setText(prefs.getString("S4_ed13",""));
        editText14_s4.setText(prefs.getString("S4_ed14",""));
        editText15_s4.setText(prefs.getString("S4_ed15",""));
        editText16_s4.setText(prefs.getString("S4_ed16",""));

        if(prefs.getInt("S4_r1" ,0)== 1){
            radioButton1_s4.setChecked(true);
        }else {
            radioButton2_s4.setChecked(true);
        }

        spinner1_s4.setSelection(prefs.getInt("S4_d1",0));
        spinner2_s4.setSelection(prefs.getInt("S4_d2",0));

//                    Screen 5

        if(prefs.getInt("S5_r1" ,0)== 1){
            radioButton1_s5.setChecked(true);
        }else {
            radioButton2_s5.setChecked(true);
        }

        if(prefs.getInt("S5_r2" ,0)== 1){
            radioButton3_s5.setChecked(true);
        }else {
            radioButton4_s5.setChecked(true);
        }

        if(prefs.getInt("S5_r3" ,0)== 1){
            radioButton5_s5.setChecked(true);
        }else {
            radioButton6_s5.setChecked(true);
        }

        if(prefs.getInt("S5_r4" ,0)== 1){
            radioButton7_s5.setChecked(true);
        }else {
            radioButton8_s5.setChecked(true);
        }

        if(prefs.getInt("S5_r5" ,0)== 1){
            radioButton9_s5.setChecked(true);
        }else {
            radioButton10_s5.setChecked(true);
        }
        if(prefs.getInt("S5_r6" ,0)== 1){
            radioButton11_s5.setChecked(true);
        }else {
            radioButton12_s5.setChecked(true);
        }

        if(prefs.getInt("S5_r7" ,0)== 1){
            radioButton13_s5.setChecked(true);
        }else {
            radioButton14_s5.setChecked(true);
        }

        if(prefs.getInt("S5_r8" ,0)== 1){
            radioButton15_s5.setChecked(true);
        }else {
            radioButton16_s5.setChecked(true);
        }

        if(prefs.getInt("S5_r9" ,0)== 1){
            radioButton17_s5.setChecked(true);
        }else {
            radioButton18_s5.setChecked(true);
        }


//                    Screen 6

        editText1_s6.setText(prefs.getString("S6_ed1",""));
        editText2_s6.setText(prefs.getString("S6_ed2",""));
        editText3_s6.setText(prefs.getString("S6_ed3",""));
        editText4_s6.setText(prefs.getString("S6_ed4",""));
        editText5_s6.setText(prefs.getString("S6_ed5",""));
        editText6_s6.setText(prefs.getString("S6_ed6",""));

        if(prefs.getInt("S6_r1",0)== 1){
            checkBox_s6.setChecked(true);
        }else{
            checkBox_s6.setChecked(false);
        }

//        Visibility and Invisibility screen 1

        if (prefs.getInt("S1_d1",0)== 3 || prefs.getInt("S1_d1",0)== 4) {
            linear1.setVisibility(View.VISIBLE);
        } else {
            linear1.setVisibility(View.GONE);
        }

//        Visibility and Invisibility screen 4

        if (prefs.getInt("S4_r1",0)== 1 ) {
            linear3_s4.setVisibility(View.GONE);
        } else {
            linear3_s4.setVisibility(View.VISIBLE);
        }

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!(cb1.isChecked())){
                    error_checkbox1.setVisibility(View.VISIBLE);
                    error_checkbox1.requestFocus();
                }else if (!(cb2.isChecked())){
                    error_checkbox2.setVisibility(View.VISIBLE);
                    error_checkbox2.requestFocus();
                }else if(!(cb3.isChecked())){
                    error_checkbox3.setVisibility(View.VISIBLE);
                    error_checkbox3.requestFocus();
                }else{
                    pay();
                }
            }
        });

    }

    private void pay(){
        JSONObject object = new JSONObject();
        try {
            object.put("merchant_id","701854750015230");
            object.put("access_token","ECFFAB5C634F25902FAE4F37D527CBA7");
            object.put("customer_name",prefs.getString("S2_ed1",""));
            object.put("customer_email",prefs.getString("S2_ed3",""));
            object.put("customer_phone",prefs.getString("S2_ed5",""));
            object.put("product_name","Passport");
            object.put("order_no",System.currentTimeMillis()); // order no. should have 10 to 30 character in numeric format
            object.put("amount",String.valueOf(fee));  // minimum amount should be 10
            object.put("isLive",true); // need to send false if you are in sandbox mode
        } catch (JSONException e) {
            e.printStackTrace();
        }
        new PaykunApiCall.Builder(Summary.this).sendJsonObject(object); // Paykun api to initialize your payment and send info.

    }

    @Subscribe(sticky = true, threadMode = ThreadMode.MAIN)
    public void getResults(Events.PaymentMessage message){
        if(message.getResults().equalsIgnoreCase(PaykunHelper.MESSAGE_SUCCESS)){
            // do your stuff here
            // message.getTransactionId() will return your failed or succeed transaction id
            submitform(
                    String.valueOf(prefs.getInt("S1_d1",0)),
                    String.valueOf(prefs.getInt("S1_r1",0)),
                    String.valueOf(prefs.getInt("S1_r2",0)),
                    prefs.getString("S1_ed1","" ),
                    prefs.getString("S1_ed2","" ),
                    prefs.getString("S1_ed3","" ),
                    prefs.getString("S1_ed4","" ),
                    prefs.getString("S1_ed5","" ),
                    prefs.getString("S2_ed1","" ),
                    prefs.getString("S2_ed2","" ),
                    prefs.getString("S2_ed3","" ),
                    prefs.getString("S2_ed4","" ),
                    prefs.getString("S2_ed5","" ),
                    prefs.getString("S2_ed6","" ),
                    String.valueOf(prefs.getInt("S2_d1",0)),
                    String.valueOf(prefs.getInt("S2_d2",0)),
                    String.valueOf(prefs.getInt("S2_d3",0)),
                    String.valueOf(prefs.getInt("S2_d4",0)),
                    String.valueOf(prefs.getInt("S2_r1",0)),
                    String.valueOf(prefs.getInt("S2_r2",0)),
                    String.valueOf(prefs.getInt("S2_r3",0)),
                    String.valueOf(prefs.getInt("S2_r4",0)),
                    String.valueOf(prefs.getInt("S2_r5",0)),
                    String.valueOf(prefs.getInt("S2_d5",0)),
                    prefs.getString("S2_ed7","" ),
                    prefs.getString("S2_ed8","" ),
                    prefs.getString("S2_ed9","" ),
                    prefs.getString("S2_ed10","" ),
                    String.valueOf(prefs.getInt("S2_r6",0)),
                    prefs.getString("S3_ed1","" ),
                    prefs.getString("S3_ed2","" ),
                    prefs.getString("S3_ed3","" ),
                    prefs.getString("S3_ed4","" ),
                    prefs.getString("Wife","" ),
                    prefs.getString("S4_ed1","" ),
                    prefs.getString("S4_ed2","" ),
                    prefs.getString("S4_ed3","" ),
                    prefs.getString("S4_ed4","" ),
                    String.valueOf(prefs.getInt("S4_d1",0)),
                    prefs.getString("S4_ed5","" ),
                    prefs.getString("S4_ed6","" ),
                    prefs.getString("S4_ed7","" ),
                    prefs.getString("S4_ed8","" ),
                    String.valueOf(prefs.getInt("S4_r1",0 )),
                    prefs.getString("S4_ed9","" ),
                    prefs.getString("S4_ed10","" ),
                    prefs.getString("S4_ed11","" ),
                    prefs.getString("S4_ed12","" ),
                    String.valueOf(prefs.getInt("S4_d2",0)),
                    prefs.getString("S4_ed13","" ),
                    prefs.getString("S4_ed14","" ),
                    prefs.getString("S4_ed15","" ),
                    prefs.getString("S4_ed16","" ),
                    String.valueOf(prefs.getInt("S5_r1",0)),
                    String.valueOf(prefs.getInt("S5_r2",0)),
                    String.valueOf(prefs.getInt("S5_r3",0)),
                    String.valueOf(prefs.getInt("S5_r4",0)),
                    String.valueOf(prefs.getInt("S5_r5",0)),
                    String.valueOf(prefs.getInt("S5_r6",0)),
                    String.valueOf(prefs.getInt("S5_r7",0)),
                    String.valueOf(prefs.getInt("S5_r8",0)),
                    String.valueOf(prefs.getInt("S5_r9",0)),
                    prefs.getString("S6_ed1","" ),
                    prefs.getString("S6_ed2","" ),
                    prefs.getString("S6_ed3","" ),
                    prefs.getString("S6_ed4","" ),
                    String.valueOf(prefs.getInt("S6_r1",0)),
                    prefs.getString("S6_ed5","" ),
                    prefs.getString("S6_ed6","" )
            );
            /* if you want to get your transaction detail call message.getTransactionDetail()
             *  getTransactionDetail return all the field from server and you can use it here as per your need
             *  For Example you want to get Order id from detail use message.getTransactionDetail().order.orderId */
            if(!TextUtils.isEmpty(message.getTransactionId())){
//                Toast.makeText(getApplicationContext(),"Your Transaction is succeed with transaction id : "+message.getTransactionId(),Toast.LENGTH_SHORT).show();
//                Log.v(" order id "," getting order id value : "+message.getTransactionDetail().order.orderId);
                trans_id = message.getTransactionId();
            }
        }
        else if(message.getResults().equalsIgnoreCase(PaykunHelper.MESSAGE_FAILED)){
            // do your stuff here
            Toast.makeText(getApplicationContext(),"Your Transaction is failed",Toast.LENGTH_SHORT).show();
        }
        else if(message.getResults().equalsIgnoreCase(PaykunHelper.MESSAGE_SERVER_ISSUE)){
            // do your stuff here
            Toast.makeText(getApplicationContext(),PaykunHelper.MESSAGE_SERVER_ISSUE,Toast.LENGTH_SHORT).show();
        }else if(message.getResults().equalsIgnoreCase(PaykunHelper.MESSAGE_ACCESS_TOKEN_MISSING)){
            // do your stuff here
            Toast.makeText(getApplicationContext(),"Access Token missing",Toast.LENGTH_SHORT).show();
        }
        else if(message.getResults().equalsIgnoreCase(PaykunHelper.MESSAGE_MERCHANT_ID_MISSING)){
            // do your stuff here
            Toast.makeText(getApplicationContext(),"Merchant Id is missing",Toast.LENGTH_SHORT).show();
        }
        else if(message.getResults().equalsIgnoreCase(PaykunHelper.MESSAGE_INVALID_REQUEST)){
            Toast.makeText(getApplicationContext(),"Invalid Request",Toast.LENGTH_SHORT).show();
        }
        else if(message.getResults().equalsIgnoreCase(PaykunHelper.MESSAGE_NETWORK_NOT_AVAILABLE)){
            Toast.makeText(getApplicationContext(),"Network is not available",Toast.LENGTH_SHORT).show();
        }

    }
    @Override
    protected void onStart() {
        super.onStart();
        // Register this activity to listen to event.
        GlobalBus.getBus().register(this);
    }
    @Override
    protected void onStop() {
        super.onStop();
        // Unregister from activity
        GlobalBus.getBus().unregister(this);
    }



    private void submitform(final String s1_d1, final String s1_r1, final String s1_r2, final String s1_ed1, final String s1_ed2, final String s1_ed3, final String s1_ed4, final String s1_ed5, final String s2_ed1, final String s2_ed2, final String s2_ed3, final String s2_ed4, final String s2_ed5, final String s2_ed6, final String s2_d1, final String s2_d2, final String s2_d3, final String s2_d4, final String s2_r1, final String s2_r2, final String s2_r3, final String s2_r4, final String s2_r5, final String s2_d5, final String s2_ed7, final String s2_ed8, final String s2_ed9, final String s2_ed10, final String s2_r6, final String s3_ed1, final String s3_ed2, final String s3_ed3, final String s3_ed4, final String wife, final String s4_ed1, final String s4_ed2, final String s4_ed3, final String s4_ed4, final String s4_d1, final String s4_ed5, final String s4_ed6, final String s4_ed7, final String s4_ed8, final String s4_r1, final String s4_ed9, final String s4_ed10, final String s4_ed11, final String s4_ed12, final String s4_d2, final String s4_ed13, final String s4_ed14, final String s4_ed15, final String s4_ed16, final String s5_r1, final String s5_r2, final String s5_r3, final String s5_r4, final String s5_r5, final String s5_r6, final String s5_r7, final String s5_r8, final String s5_r9, final String s6_ed1, final String s6_ed2, final String s6_ed3, final String s6_ed4, final String s6_r1, final String s6_ed5, final String s6_ed6)

    {
        // Tag used to cancel the request
        String tag_string_req = "req_report_problem";

        pDialog.setMessage(getString(R.string.pdialog));
        showDialog();

        StringRequest strReq = new StringRequest(Request.Method.POST,
                App_config.PostFormURL, new Response.Listener<String>() {

            @Override
            public void onResponse(String response) {
                Log.d(TAG, "Report Response: " + response);
                hideDialog();

                try {
                    Log.i("tagconvertstr", "["+response+"]");
                    JSONObject jObj = new JSONObject(response);
                    boolean error = jObj.getBoolean("error");
                    if (!error) {
                        Toast.makeText(getApplicationContext(), "Report Submitted Succesfully..!", Toast.LENGTH_LONG).show();
                        editor.clear().apply();
                        Intent intent = new Intent(Summary.this,Dashboard.class);
                        startActivity(intent);
                    }
                    else {
                        String errorMsg = jObj.getString("error_msg");
                        Toast.makeText(getApplicationContext(),
                                errorMsg, Toast.LENGTH_LONG).show();
                    }
                } catch (JSONException e) {
                    e.printStackTrace();
                }

            }
        }, new Response.ErrorListener() {

            @Override
            public void onErrorResponse(VolleyError error) {
                Log.e(TAG, "Report Error: " + error.getMessage());
                Toast.makeText(getApplicationContext(),
                        error.getMessage(), Toast.LENGTH_LONG).show();
                hideDialog();
            }
        }) {

            @Override
            protected Map<String, String> getParams() {
                // Posting params to register url
                Map<String, String> params = new HashMap<String, String>();

                params.put("transaction_id",trans_id);
                params.put("amount",String.valueOf(fee));
                params.put("s1_d1",  s1_d1);
                params.put("s1_r1",  s1_r1);
                params.put("s1_r2",  s1_r2);
                params.put("s1_ed1", s1_ed1);
                params.put("s1_ed2", s1_ed2);
                params.put("s1_ed3", s1_ed3);
                params.put("s1_ed4", s1_ed4);
                params.put("s1_ed5", s1_ed5);

//                            Screen 2
                params.put("s2_ed1", s2_ed1);
                params.put("s2_ed2", s2_ed2);
                params.put("s2_ed3", s2_ed3);
                params.put("s2_ed4", s2_ed4);
                params.put("s2_ed5", s2_ed5);
                params.put("s2_ed6", s2_ed6);
                params.put("s2_d1", s2_d1);
                params.put("s2_d2", s2_d2);
                params.put("s2_d3", s2_d3);
                params.put("s2_d4", s2_d4);
                params.put("s2_r1", s2_r1);
                params.put("s2_r2", s2_r2);
                params.put("s2_r3", s2_r3);
                params.put("s2_r4", s2_r4);
                params.put("s2_r5", s2_r5);
                params.put("s2_d5", s2_d5);
                params.put("s2_ed7", s2_ed7);
                params.put("s2_ed8", s2_ed8);
                params.put("s2_ed9", s2_ed9);
                params.put("s2_ed10", s2_ed10);
                params.put("s2_r6", s2_r6);

//                            Screen 3
                params.put("s3_ed1", s3_ed1);
                params.put("s3_ed2", s3_ed2);
                params.put("s3_ed3", s3_ed3);
                params.put("s3_ed4", s3_ed4);
                params.put("wife", wife);

//                            Screen4
                params.put("s4_ed1", s4_ed1);
                params.put("s4_ed2", s4_ed2);
                params.put("s4_ed3", s4_ed3);
                params.put("s4_ed4", s4_ed4);
                params.put("s4_d1", s4_d1);
                params.put("s4_ed5", s4_ed5);
                params.put("s4_ed6", s4_ed6);
                params.put("s4_ed7", s4_ed7);
                params.put("s4_ed8", s4_ed8);
                params.put("s4_r1", s4_r1);
                params.put("s4_ed9", s4_ed9);
                params.put("s4_ed10", s4_ed10);
                params.put("s4_ed11", s4_ed11);
                params.put("s4_ed12", s4_ed12);
                params.put("s4_d2", s4_d2);
                params.put("s4_ed13", s4_ed13);
                params.put("s4_ed14", s4_ed14);
                params.put("s4_ed15", s4_ed15);
                params.put("s4_ed16", s4_ed16);

//                            Screen 5
                params.put("s5_r1", s5_r1);
                params.put("s5_r2", s5_r2);
                params.put("s5_r3", s5_r3);
                params.put("s5_r4", s5_r4);
                params.put("s5_r5", s5_r5);
                params.put("s5_r6", s5_r6);
                params.put("s5_r7", s5_r7);
                params.put("s5_r8", s5_r8);
                params.put("s5_r9", s5_r9);

//                            Screen 6
                params.put("s6_ed1", s6_ed1);
                params.put("s6_ed2", s6_ed2);
                params.put("s6_ed3", s6_ed3);
                params.put("s6_ed4", s6_ed4);
                params.put("s6_r1", s6_r1);
                params.put("s6_ed5", s6_ed5);
                params.put("s6_ed6", s6_ed6);


                return params;
            }

        };

        // Adding request to request queue
        AppController.getInstance().addToRequestQueue(strReq, tag_string_req);
    }

    private void showDialog() {
        if (!pDialog.isShowing())
            pDialog.show();
    }

    private void hideDialog() {
        if (pDialog.isShowing())
            pDialog.dismiss();
    }

    @Override
    public void onBackPressed(){
        startActivity(new Intent(Summary.this, Emergency_contact.class));
        finish();
    }
    @Override
    protected void onResume() {
        super.onResume();

    }

    }

