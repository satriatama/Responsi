package com.satriatama.belajar.android.responsi;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class RegisterActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        EditText password = findViewById(R.id.daftar_username);
        EditText email = findViewById(R.id.daftar_email);
        EditText pass = findViewById(R.id.daftar_password);
        EditText repass = findViewById(R.id.daftar_confirm_password);

        Button submit = findViewById(R.id.daftar_button_submit);
        TextView kembali = findViewById(R.id.daftar_button_back);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(RegisterActivity.this , LoginActivity.class);
                startActivity(intent);
            }

        });
        kembali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(RegisterActivity.this , LoginActivity.class);
                startActivity(intent);
            }
        });
    }
}
