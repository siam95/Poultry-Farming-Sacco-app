package com.example.user.siam;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class Home extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        Intent intent = getIntent();

        String message = intent.getStringExtra("EXTRA MESSAGE");
        TextView textView = findViewById(R.id.diplay_message);
        textView.setText(message);
    }
}
