package com.example.zno;

import static androidx.constraintlayout.motion.utils.Oscillator.TAG;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class StartPage extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start_page);

        ImageButton sign_in = findViewById(R.id.log_in);
        ImageButton sign_up = findViewById(R.id.sing_up);

        sign_in.setOnClickListener(view -> {
            Log.e(TAG, "sign in");
            Intent intent = new Intent(StartPage.this, SignIn.class);
            startActivity(intent);
        });

        sign_up.setOnClickListener(view -> {
            Log.e(TAG, "sign up");
            Intent intent = new Intent(StartPage.this, SignUp.class);
            startActivity(intent);
        });
    }
}