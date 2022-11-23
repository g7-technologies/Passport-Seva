package com.g7tech.passport.Activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.g7tech.passport.R;

public class Faqs extends AppCompatActivity {

    TextView ques1,ques2,ques3,ques4,ques5,ques6,ques7,ques8,ques9,ques10,ques11,ques12,ques13,ques14,ques15,ques16,ques17,ques18,ques19,ques20,ques21,ques22,ques23
            ,ques24,ques25,ques26;
    TextView ans1,ans2,ans3,ans4,ans5,ans6,ans7,ans8,ans9,ans10,ans11,ans12,ans13,ans14,ans15,ans16,ans17,ans18,ans19,ans20,ans21,ans22,ans23
            ,ans24,ans25,ans26;
    int q1,q2,q3,q4,q5,q6,q7,q8,q9,q10,q11,q12,q13,q14,q15,q16,q17,q18,q19,q20,q21,q22,q23,q24,q25,q26;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_faqs);
        setTitle("FAQS");

        ques1 = findViewById(R.id.ques_1);
        ques2 = findViewById(R.id.ques_2);
        ques3 = findViewById(R.id.ques_3);
        ques4 = findViewById(R.id.ques_4);
        ques5 = findViewById(R.id.ques_5);
        ques6 = findViewById(R.id.ques_6);
        ques7 = findViewById(R.id.ques_7);
        ques8 = findViewById(R.id.ques_8);
        ques9 = findViewById(R.id.ques_9);
        ques10 = findViewById(R.id.ques_10);
        ques11 = findViewById(R.id.ques_11);
        ques12 = findViewById(R.id.ques_12);
        ques13 = findViewById(R.id.ques_13);
        ques14 = findViewById(R.id.ques_14);
        ques15 = findViewById(R.id.ques_15);
        ques16 = findViewById(R.id.ques_16);
        ques17 = findViewById(R.id.ques_17);
        ques18 = findViewById(R.id.ques_18);
        ques19 = findViewById(R.id.ques_19);
        ques20 = findViewById(R.id.ques_20);
        ques21 = findViewById(R.id.ques_21);
        ques22 = findViewById(R.id.ques_22);
        ques23 = findViewById(R.id.ques_23);
        ques24 = findViewById(R.id.ques_24);
        ques25 = findViewById(R.id.ques_25);
        ques26 = findViewById(R.id.ques_26);


        q1 = 0;
        q2 = 0;
        q3 = 0;
        q4 = 0;
        q5 = 0;
        q6 = 0;
        q7 = 0;
        q8 = 0;
        q9 = 0;
        q10 = 0;
        q11 = 0;
        q12 = 0;
        q13 = 0;
        q14 = 0;
        q15 = 0;
        q16 = 0;
        q17 = 0;
        q18 = 0;
        q19 = 0;
        q20 = 0;
        q21 = 0;
        q22 = 0;
        q23 = 0;
        q24 = 0;
        q25 = 0;
        q26 = 0;




        ans1=findViewById(R.id.ans_1);
        ans2=findViewById(R.id.ans_2);
        ans3=findViewById(R.id.ans_3);
        ans4=findViewById(R.id.ans_4);
        ans5=findViewById(R.id.ans_5);
        ans6=findViewById(R.id.ans_6);
        ans7=findViewById(R.id.ans_7);
        ans8=findViewById(R.id.ans_8);
        ans9=findViewById(R.id.ans_9);
        ans10=findViewById(R.id.ans_10);
        ans11=findViewById(R.id.ans_11);
        ans12=findViewById(R.id.ans_12);
        ans13=findViewById(R.id.ans_13);
        ans14=findViewById(R.id.ans_14);
        ans15=findViewById(R.id.ans_15);
        ans16=findViewById(R.id.ans_16);
        ans17=findViewById(R.id.ans_17);
        ans18=findViewById(R.id.ans_18);
        ans19=findViewById(R.id.ans_19);
        ans20=findViewById(R.id.ans_20);
        ans21=findViewById(R.id.ans_21);
        ans22=findViewById(R.id.ans_22);
        ans23=findViewById(R.id.ans_23);
        ans24=findViewById(R.id.ans_24);
        ans25=findViewById(R.id.ans_25);
        ans26=findViewById(R.id.ans_26);




        ques1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
             if (q1 == 0){
                 ans1.setVisibility(View.VISIBLE);
                 q1 = 1;
             }
             else if (q1 == 1){
                 ans1.setVisibility(View.GONE);
                 q1 = 0;
             }
            }
        });
        ques2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (q2 == 0){
                    ans2.setVisibility(View.VISIBLE);
                    q2 = 1;
                }
                else if (q2 == 1){
                    ans2.setVisibility(View.GONE);
                    q2 = 0;
                }
            }
        });
        ques3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (q3 == 0){
                    ans3.setVisibility(View.VISIBLE);
                    q3= 1;
                }
                else if (q3 == 1){
                    ans3.setVisibility(View.GONE);
                    q3 = 0;
                }
            }
        });
        ques4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (q4 == 0){
                    ans4.setVisibility(View.VISIBLE);
                    q4 = 1;
                }
                else if (q4 == 1){
                    ans4.setVisibility(View.GONE);
                    q4 = 0;
                }
            }
        });
        ques5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (q5 == 0){
                    ans5.setVisibility(View.VISIBLE);
                    q5 = 1;
                }
                else if (q5 == 1){
                    ans5.setVisibility(View.GONE);
                    q5 = 0;
                }
            }
        });
        ques6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (q6 == 0){
                    ans6.setVisibility(View.VISIBLE);
                    q6 = 1;
                }
                else if (q6 == 1){
                    ans6.setVisibility(View.GONE);
                    q6 = 0;
                }
            }
        });
        ques7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (q7 == 0){
                    ans7.setVisibility(View.VISIBLE);
                    q7 = 1;
                }
                else if (q7 == 1){
                    ans7.setVisibility(View.GONE);
                    q7 = 0;
                }
            }
        });
        ques8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (q8 == 0){
                    ans8.setVisibility(View.VISIBLE);
                    q8 = 1;
                }
                else if (q8 == 1){
                    ans8.setVisibility(View.GONE);
                    q8 = 0;
                }
            }
        });
        ques9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (q9 == 0){
                    ans9.setVisibility(View.VISIBLE);
                    q9 = 1;
                }
                else if (q9 == 1){
                    ans9.setVisibility(View.GONE);
                    q9 = 0;
                }
            }
        });
        ques10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (q10 == 0){
                    ans10.setVisibility(View.VISIBLE);
                    q10 = 1;
                }
                else if (q10 == 1){
                    ans10.setVisibility(View.GONE);
                    q10 = 0;
                }
            }
        });
        ques11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (q11 == 0){
                    ans11.setVisibility(View.VISIBLE);
                    q11 = 1;
                }
                else if (q11 == 1){
                    ans11.setVisibility(View.GONE);
                    q11 = 0;
                }
            }
        });
        ques12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (q12 == 0){
                    ans12.setVisibility(View.VISIBLE);
                    q12 = 1;
                }
                else if (q12 == 1){
                    ans12.setVisibility(View.GONE);
                    q12 = 0;
                }
            }
        });
        ques13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (q13 == 0){
                    ans13.setVisibility(View.VISIBLE);
                    q13 = 1;
                }
                else if (q13 == 1){
                    ans13.setVisibility(View.GONE);
                    q13 = 0;
                }
            }
        });
        ques14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (q14 == 0){
                    ans14.setVisibility(View.VISIBLE);
                    q14 = 1;
                }
                else if (q14 == 1){
                    ans14.setVisibility(View.GONE);
                    q14 = 0;
                }
            }
        });
        ques15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (q15 == 0){
                    ans15.setVisibility(View.VISIBLE);
                    q15 = 1;
                }
                else if (q15 == 1){
                    ans15.setVisibility(View.GONE);
                    q15 = 0;
                }
            }
        });
        ques16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (q16 == 0){
                    ans16.setVisibility(View.VISIBLE);
                    q16 = 1;
                }
                else if (q16 == 1){
                    ans16.setVisibility(View.GONE);
                    q16 = 0;
                }
            }
        });
        ques17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (q17 == 0){
                    ans17.setVisibility(View.VISIBLE);
                    q17 = 1;
                }
                else if (q17 == 1){
                    ans17.setVisibility(View.GONE);
                    q17 = 0;
                }
            }
        });
        ques18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (q18 == 0){
                    ans18.setVisibility(View.VISIBLE);
                    q18 = 1;
                }
                else if (q18 == 1){
                    ans18.setVisibility(View.GONE);
                    q18 = 0;
                }
            }
        });
        ques19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (q19 == 0){
                    ans19.setVisibility(View.VISIBLE);
                    q19 = 1;
                }
                else if (q19 == 1){
                    ans19.setVisibility(View.GONE);
                    q19 = 0;
                }
            }
        });
        ques20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (q20 == 0){
                    ans20.setVisibility(View.VISIBLE);
                    q20 = 1;
                }
                else if (q20 == 1){
                    ans20.setVisibility(View.GONE);
                    q20 = 0;
                }
            }
        });
        ques21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (q21 == 0){
                    ans21.setVisibility(View.VISIBLE);
                    q21 = 1;
                }
                else if (q21 == 1){
                    ans21.setVisibility(View.GONE);
                    q21 = 0;
                }
            }
        });
        ques22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (q22 == 0){
                    ans22.setVisibility(View.VISIBLE);
                    q22 = 1;
                }
                else if (q22 == 1){
                    ans22.setVisibility(View.GONE);
                    q22 = 0;
                }
            }
        });
        ques23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (q23 == 0){
                    ans23.setVisibility(View.VISIBLE);
                    q23 = 1;
                }
                else if (q23 == 1){
                    ans23.setVisibility(View.GONE);
                    q23 = 0;
                }
            }
        });
        ques24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (q24 == 0){
                    ans24.setVisibility(View.VISIBLE);
                    q24 = 1;
                }
                else if (q24 == 1){
                    ans24.setVisibility(View.GONE);
                    q24 = 0;
                }
            }
        });
        ques25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (q25 == 0){
                    ans25.setVisibility(View.VISIBLE);
                    q25 = 1;
                }
                else if (q25 == 1){
                    ans25.setVisibility(View.GONE);
                    q25 = 0;
                }
            }
        });
        ques26.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (q26 == 0){
                    ans26.setVisibility(View.VISIBLE);
                    q26 = 1;
                }
                else if (q26 == 1){
                    ans26.setVisibility(View.GONE);
                    q26 = 0;
                }
            }
        });

    }
}
