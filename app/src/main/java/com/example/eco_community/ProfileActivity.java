package com.example.eco_community;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ProfileActivity extends AppCompatActivity {

    Button btnlogout, btnchangepw;
    TextView tvname, tvnickname, tvusername, tvemail, tvpassword, tvpointsaccu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        btnlogout = findViewById(R.id.btn_logout);
        btnchangepw = findViewById(R.id.btn_changepw);
        //tvname = findViewById(R.id.tv_name);
        tvnickname = findViewById(R.id.tv_name);
        tvusername = findViewById(R.id.tv_username);
        tvemail =  findViewById(R.id.tv_email);
        tvpassword = findViewById(R.id.tv_password);
        tvpointsaccu = findViewById(R.id.tv_pointsaccu);

        btnlogout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=  new Intent(ProfileActivity.this, LogOutActivity.class);
                startActivity(intent);
            }
        });

        btnchangepw.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Intent intent=  new Intent(MainActivity.this, ChangepwActivity.class);
                //startActivity(intent);
            }
        });
    }
}