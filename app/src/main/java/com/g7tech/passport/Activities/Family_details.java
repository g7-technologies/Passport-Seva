package com.g7tech.passport.Activities;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.g7tech.passport.R;

public class Family_details extends AppCompatActivity {

    SharedPreferences prefs;
    SharedPreferences.Editor editor;

    EditText editText1,editText2,editText3,editText4,edtwife;
    Button next3,back3;
    LinearLayout Lwife;
    TextView txtwife;
    boolean wife;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_family_details);
        setTitle("Family Detail");

        prefs= getSharedPreferences("Passport", MODE_PRIVATE);
        editor = prefs.edit();

        Lwife = findViewById(R.id.wifename);
        txtwife = findViewById(R.id.txtwife);
        edtwife = findViewById(R.id.edtwife);
        editText1= findViewById(R.id.s3_ed1);
        editText2= findViewById(R.id.s3_ed2);
        editText3= findViewById(R.id.s3_ed3);
        editText4= findViewById(R.id.s3_ed4);
        next3 = findViewById(R.id.next3);
        back3 = findViewById(R.id.back3);

        if(prefs.getInt("S2_d1",0) == 1 && prefs.getInt("S2_d2",0) == 2){
            Lwife.setVisibility(View.VISIBLE);
            txtwife.setText("Wife Name");
            edtwife.setVisibility(View.VISIBLE);
            wife = true;
        }
        else if(prefs.getInt("S2_d1",0) == 2 && prefs.getInt("S2_d2",0) == 2){
            Lwife.setVisibility(View.VISIBLE);
            txtwife.setText("Husband Name");
            edtwife.setVisibility(View.VISIBLE);
            wife = true;
        }
        else if(prefs.getInt("S2_d1",0) == 1 && prefs.getInt("S2_d2",0) == 4){
            Lwife.setVisibility(View.VISIBLE);
            txtwife.setText("Wife Name");
            edtwife.setVisibility(View.VISIBLE);
            wife = true;
        }
        else if(prefs.getInt("S2_d1",0) == 2 && prefs.getInt("S2_d2",0) == 4){
            Lwife.setVisibility(View.VISIBLE);
            txtwife.setText("Husband Name");
            edtwife.setVisibility(View.VISIBLE);
            wife = true;
        }
        else {
            Lwife.setVisibility(View.GONE);
            edtwife.setVisibility(View.GONE);
            wife = false;
        }

        back3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent back3 = new Intent(Family_details.this,Applicant_details.class);
                startActivity(back3);
            }
        });

        next3.setOnClickListener(new View.OnClickListener() {
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
                else if(editText4.getText().toString().length()==0){
                    editText4.setError("Field must be filled");
                    editText4.requestFocus();
                }
                else if(wife && edtwife.getText().toString().length() == 0){
                    edtwife.setError("Field must be filled");
                    edtwife.requestFocus();
                }
                else{
                    editor.putString("Wife",edtwife.getText().toString());
                    editor.putString("S3_ed1",editText1.getText().toString());
                    editor.putString("S3_ed2",editText2.getText().toString());
                    editor.putString("S3_ed3",editText3.getText().toString());
                    editor.putString("S3_ed4",editText4.getText().toString());
                    editor.commit();
                    Intent next3 = new Intent(Family_details.this, residential_address.class);
                    startActivity(next3);
                }
            }
        });
    }

    @Override
    public void onBackPressed() {
        startActivity(new Intent(Family_details.this, Applicant_details.class));
        finish();
    }

    @Override
    protected void onResume() {
        super.onResume();
        edtwife.setText(prefs.getString("Wife",""));
        editText1.setText(prefs.getString("S3_ed1",""));
        editText2.setText(prefs.getString("S3_ed2",""));
        editText3.setText(prefs.getString("S3_ed3",""));
        editText4.setText(prefs.getString("S3_ed4",""));
    }
}
