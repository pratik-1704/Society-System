package com.example.societysystem;

import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import android.Manifest;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class ContactActivity extends AppCompatActivity {

    EditText etNumber;
    ImageButton btCall;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact);

        etNumber = findViewById(R.id.et_number);
        btCall = findViewById(R.id.bt_call);

        btCall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String phone = etNumber.getText().toString();
                if(phone.isEmpty()){
                    Toast.makeText(getApplicationContext(),"Please Enter Number !",
                            Toast.LENGTH_SHORT).show();
                }else {
                    String s = "tel:" + phone;
                    Intent intent = new Intent(Intent.ACTION_CALL);
                    intent.setData(Uri.parse(s));
                    startActivity(intent);
                }
            }
        });
    }
}