package com.example.societysystem;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class HomeAcivity extends AppCompatActivity {

    public TextView tv_profile,tv_contactus,tv_rules,tv_meetings,tv_complain,tv_events,tv_parking,tv_bills;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_acivity);


        tv_profile = findViewById(R.id.tv_profile);
        tv_contactus = findViewById(R.id.tv_contact);
        tv_rules = findViewById(R.id.tv_rules);
        tv_meetings = findViewById(R.id.tv_meetings);
        tv_complain = findViewById(R.id.tv_complain);
        tv_events = findViewById(R.id.tv_event);
        tv_parking = findViewById(R.id.tv_parking);
        tv_bills = findViewById(R.id.tv_bill);

        tv_events.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeAcivity.this,MainActivity.class);
                startActivity(intent);
            }
        });

        tv_complain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeAcivity.this,ComplainActivity.class);
                startActivity(intent);
            }
        });


        tv_profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeAcivity.this,ProfileActivity.class);
                startActivity(intent);
            }
        });


        tv_rules.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeAcivity.this,RulesActivity.class);
                startActivity(intent);
            }
        });


        tv_contactus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeAcivity.this,ContactActivity.class);
                startActivity(intent);
            }
        });


    }
}