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
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.g7tech.passport.R;
import com.g7tech.passport.helper.AppController;
import com.g7tech.passport.helper.App_config;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.Calendar;
import java.util.HashMap;

import java.util.Map;

public class Emergency_contact extends AppCompatActivity {

    private static final String TAG = Emergency_contact.class.getSimpleName();
    SharedPreferences prefs;
    SharedPreferences.Editor editor;
    String emailPattern = "[a-zA-Z0-9._-]+@[a-z]+\\.+[a-z]+";

    TextView error_checkbox;
    EditText editText1,editText2,editText3,editText4,editText5,editText6;
    CheckBox checkBox;
    Button next6,back6;
    private DatePickerDialog.OnDateSetListener mDateSetListener;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_emergency_contact);
        setTitle("EmergencyContacts");

        prefs= getSharedPreferences("Passport", MODE_PRIVATE);
        editor = prefs.edit();


        next6 = findViewById(R.id.next6);
        back6 = findViewById(R.id.back6);

        editText1= findViewById(R.id.s6_ed1);
        editText2= findViewById(R.id.s6_ed2);
        editText3= findViewById(R.id.s6_ed3);
        editText4= findViewById(R.id.s6_ed4);
        editText5= findViewById(R.id.s6_ed5);
        editText6= findViewById(R.id.s6_ed6);
        checkBox= findViewById(R.id.s6_r1);
        error_checkbox=findViewById(R.id.s6_error_checkbox);



        checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    editor.putInt("S6_r1",1);
                    editor.apply();
                }
            }
        });

        back6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent back6 = new Intent(Emergency_contact.this,other_details.class);
                startActivity(back6);
            }
        });
        next6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(editText1.getText().toString().length() == 0 ){
                    editText1.setError("Field must be required");
                    editText1.requestFocus();
                }
                else if(editText2.getText().toString().length() == 0 ){
                    editText2.setError("Field must be required");
                    editText2.requestFocus();
                }
                else if(!editText2.getText().toString().trim().matches(emailPattern)){
                    editText2.setError("Email not correct");
                    editText2.requestFocus();
                }
                else if(editText3.getText().length() != 10){
                    editText3.setError("Phone number is required");
                    editText3.requestFocus();
                }
                else if(!(checkBox.isChecked())){
                       error_checkbox.setVisibility(View.VISIBLE);
                       error_checkbox.requestFocus();
                }
                else if(editText5.getText().toString().length() == 0 ){
                    editText5.setError("Field must be required");
                    editText5.requestFocus();
                }
                else if(editText6.getText().toString().length() == 0 ){
                    editText6.setError("Field must be required");
                    editText6.requestFocus();
                }
                else{

                    editor.putString("S6_ed1",editText1.getText().toString());
                    editor.putString("S6_ed2",editText2.getText().toString());
                    editor.putString("S6_ed3",editText3.getText().toString());
                    editor.putString("S6_ed4",editText4.getText().toString());
                    editor.putString("S6_ed5",editText5.getText().toString());
                    editor.putString("S6_ed6",editText6.getText().toString());
                    editor.commit();

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

                    Intent next5 = new Intent(Emergency_contact.this,Summary.class);
                startActivity(next5);
                }
            }
        });



            editText6.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Calendar cal = Calendar.getInstance();
                    int year = cal.get(Calendar.YEAR);
                    int month = cal.get(Calendar.MONTH);
                    int day = cal.get(Calendar.DAY_OF_MONTH);

                    DatePickerDialog dialog = new DatePickerDialog(
                            Emergency_contact.this,
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
                editText6.setText(date);
            }
        };
    }



    private void submitform(final String s1_d1, final String s1_r1, final String s1_r2, final String s1_ed1, final String s1_ed2, final String s1_ed3, final String s1_ed4, final String s1_ed5, final String s2_ed1, final String s2_ed2, final String s2_ed3, final String s2_ed4, final String s2_ed5, final String s2_ed6, final String s2_d1, final String s2_d2, final String s2_d3, final String s2_d4, final String s2_r1, final String s2_r2, final String s2_r3, final String s2_r4, final String s2_r5, final String s2_d5, final String s2_ed7, final String s2_ed8, final String s2_ed9, final String s2_ed10, final String s2_r6, final String s3_ed1, final String s3_ed2, final String s3_ed3, final String s3_ed4, final String wife, final String s4_ed1, final String s4_ed2, final String s4_ed3, final String s4_ed4, final String s4_d1, final String s4_ed5, final String s4_ed6, final String s4_ed7, final String s4_ed8, final String s4_r1, final String s4_ed9, final String s4_ed10, final String s4_ed11, final String s4_ed12, final String s4_d2, final String s4_ed13, final String s4_ed14, final String s4_ed15, final String s4_ed16, final String s5_r1, final String s5_r2, final String s5_r3, final String s5_r4, final String s5_r5, final String s5_r6, final String s5_r7, final String s5_r8, final String s5_r9, final String s6_ed1, final String s6_ed2, final String s6_ed3, final String s6_ed4, final String s6_r1, final String s6_ed5, final String s6_ed6)

    {
        // Tag used to cancel the request
        String tag_string_req = "req_report_problem";

        StringRequest strReq = new StringRequest(Request.Method.POST,
                App_config.PostFormURL, new Response.Listener<String>() {

            @Override
            public void onResponse(String response) {
                Log.d(TAG, "Report Response: " + response);

                try {
                    Log.i("tagconvertstr", "["+response+"]");
                    JSONObject jObj = new JSONObject(response);
                    boolean error = jObj.getBoolean("error");
                    if (!error) {
                        //Toast.makeText(getApplicationContext(), "Report Submitted Succesfully..!", Toast.LENGTH_LONG).show();
                        //editor.clear().apply();
                    }
                    else {
                        String errorMsg = jObj.getString("error_msg");
//                        Toast.makeText(getApplicationContext(),
//                                errorMsg, Toast.LENGTH_LONG).show();
                    }
                } catch (JSONException e) {
                    e.printStackTrace();
                }

            }
        }, new Response.ErrorListener() {

            @Override
            public void onErrorResponse(VolleyError error) {
                Log.e(TAG, "Report Error: " + error.getMessage());
                //Toast.makeText(getApplicationContext(),
                  //      error.getMessage(), Toast.LENGTH_LONG).show();
            }
        }) {

            @Override
            protected Map<String, String> getParams() {
                // Posting params to register url
                Map<String, String> params = new HashMap<String, String>();

                params.put("transaction_id","Not Paid Yet");
                params.put("amount","0");
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


    @Override
    public void onBackPressed() {
        startActivity(new Intent(Emergency_contact.this, other_details.class));
        finish();
    }

    @Override
    protected void onResume() {
        super.onResume();
        editText1.setText(prefs.getString("S6_ed1",""));
        editText2.setText(prefs.getString("S6_ed2",""));
        editText3.setText(prefs.getString("S6_ed3",""));
        editText4.setText(prefs.getString("S6_ed4",""));
        editText5.setText(prefs.getString("S6_ed5",""));
        editText6.setText(prefs.getString("S6_ed6",""));

        if(prefs.getInt("S6_r1",0)== 1){
            checkBox.setChecked(true);
        }else{
            checkBox.setChecked(false);
        }
    }
}
