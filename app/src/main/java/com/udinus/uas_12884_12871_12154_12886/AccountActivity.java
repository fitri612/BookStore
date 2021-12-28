package com.udinus.uas_12884_12871_12154_12886;

import static com.udinus.uas_12884_12871_12154_12886.R.layout.activity_account;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;

public class AccountActivity extends AppCompatActivity {

    ImageView plus;
    Button btnLog;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(activity_account);
        plus = findViewById(R.id.plus);
        btnLog = findViewById(R.id.btnLogout);

        plus.setOnClickListener(view -> {
            startActivity(new Intent(AccountActivity.this, TopUpActivity.class));
        });

        btnLog.setOnClickListener(view -> {
            startActivity(new Intent(AccountActivity.this, LoginFirebase.class));
        });
    }
}