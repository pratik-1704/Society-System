package com.example.societysystem;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class ComplainActivity extends AppCompatActivity {

    public EditText complainEdit;
    public Button btnSubmit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_complain);

        complainEdit = findViewById(R.id.editTextComplain);
        btnSubmit = findViewById(R.id.btn_Submit);

        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(ComplainActivity.this,"Complain Register Successfully",Toast.LENGTH_SHORT).show();
            }
        });

    }
}