package com.satriatama.belajar.android.responsi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class HomePage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);
        TextView nama = findViewById(R.id.chat1);
        TextView nama2 = findViewById(R.id.chat2);
        TextView nama3 = findViewById(R.id.chat3);
        ImageView imgBtn = findViewById(R.id.profile);

        nama.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomePage.this , ChatPersonal.class);
                startActivity(intent);
            }
        });
        nama2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomePage.this , ChatPersonal.class);
                startActivity(intent);
            }
        });
        nama3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomePage.this , ChatPersonal.class);
                startActivity(intent);
            }
        });

        imgBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomePage.this , ProfilePic.class);
                startActivity(intent);
            }
        });
    }
}