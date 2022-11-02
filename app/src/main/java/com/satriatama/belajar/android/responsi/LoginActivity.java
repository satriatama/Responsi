package com.satriatama.belajar.android.responsi;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        Button submitBtn = findViewById(R.id.user_input_submit);
        TextView lupaPass = findViewById(R.id.lupa_password_submit);
        TextView regist = findViewById(R.id.user_input_regist);
        EditText userInput = findViewById(R.id.user_input_login);
        EditText passInput = findViewById(R.id.user_input_password);



        submitBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LoginActivity.this , HomePage.class);
                startActivity(intent);
            }
        });
        lupaPass.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LoginActivity.this , GantiPassword.class);
                startActivity(intent);
            }
        });
        regist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LoginActivity.this , RegisterActivity.class);
                startActivity(intent);
            }
        });
    }
}
