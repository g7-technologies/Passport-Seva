
package com.g7tech.passport.Activities;

import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;


import com.g7tech.passport.R;

public class documents_required extends AppCompatActivity {

    TextView txt1,txt2,txt3,txt4,txt5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_documents_required);

        txt1 = findViewById(R.id.txt1);
        txt2 = findViewById(R.id.txt2);
        txt3 = findViewById(R.id.txt3);
        txt4 = findViewById(R.id.txt4);
        txt5 = findViewById(R.id.txt5);



        txt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loadFragment(new birth_Proof_fragment());
                txt1.setTextSize(TypedValue.COMPLEX_UNIT_SP,20);
                txt2.setTextSize(TypedValue.COMPLEX_UNIT_SP,16);
                txt3.setTextSize(TypedValue.COMPLEX_UNIT_SP,16);
                txt4.setTextSize(TypedValue.COMPLEX_UNIT_SP,16);
                txt5.setTextSize(TypedValue.COMPLEX_UNIT_SP,16);
            }
        });

        txt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loadFragment(new address_proof_fragment());
                txt1.setTextSize(TypedValue.COMPLEX_UNIT_SP,16);
                txt2.setTextSize(TypedValue.COMPLEX_UNIT_SP,20);
                txt3.setTextSize(TypedValue.COMPLEX_UNIT_SP,16);
                txt4.setTextSize(TypedValue.COMPLEX_UNIT_SP,16);
                txt5.setTextSize(TypedValue.COMPLEX_UNIT_SP,16);
            }
        });

        txt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loadFragment(new Non_ECR_proof_fragment());
                txt1.setTextSize(TypedValue.COMPLEX_UNIT_SP,16);
                txt2.setTextSize(TypedValue.COMPLEX_UNIT_SP,16);
                txt3.setTextSize(TypedValue.COMPLEX_UNIT_SP,20);
                txt4.setTextSize(TypedValue.COMPLEX_UNIT_SP,16);
                txt5.setTextSize(TypedValue.COMPLEX_UNIT_SP,16);
            }
        });

        txt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loadFragment(new Identity());
                txt1.setTextSize(TypedValue.COMPLEX_UNIT_SP,16);
                txt2.setTextSize(TypedValue.COMPLEX_UNIT_SP,16);
                txt3.setTextSize(TypedValue.COMPLEX_UNIT_SP,16);
                txt4.setTextSize(TypedValue.COMPLEX_UNIT_SP,20);
                txt5.setTextSize(TypedValue.COMPLEX_UNIT_SP,16);
            }
        });

        txt5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loadFragment(new tatkaal_application());
                txt1.setTextSize(TypedValue.COMPLEX_UNIT_SP,16);
                txt2.setTextSize(TypedValue.COMPLEX_UNIT_SP,16);
                txt3.setTextSize(TypedValue.COMPLEX_UNIT_SP,16);
                txt4.setTextSize(TypedValue.COMPLEX_UNIT_SP,16);
                txt5.setTextSize(TypedValue.COMPLEX_UNIT_SP,20);
            }
        });

        //_____________Load fragment on create________________________
        loadFragment(new birth_Proof_fragment());
        txt1.setTextSize(TypedValue.COMPLEX_UNIT_SP,20);
        txt2.setTextSize(TypedValue.COMPLEX_UNIT_SP,16);
        txt3.setTextSize(TypedValue.COMPLEX_UNIT_SP,16);
        txt4.setTextSize(TypedValue.COMPLEX_UNIT_SP,16);
        txt5.setTextSize(TypedValue.COMPLEX_UNIT_SP,16);

    }

    private void loadFragment(Fragment fragment) {
        //_________load fragment___________________
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();

        transaction.replace(R.id.frame_container, fragment);
        //transaction.addToBackStack(null);
        transaction.commit();
    }

}



