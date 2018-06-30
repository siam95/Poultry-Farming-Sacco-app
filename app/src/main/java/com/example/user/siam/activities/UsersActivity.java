package com.example.user.siam.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

import com.example.user.siam.Home;
import com.example.user.siam.R;

public class UsersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle SavedInstanceState) {
        super.onCreate(SavedInstanceState);
        setContentView(R.layout.activity_users);
    }

    public void sendMessage (View view)
    {
        EditText editText = findViewById(R.id.message_text);
        String message = editText.getText().toString();

        Intent intent = new Intent(this,Home.class);
        intent.putExtra("EXTRA MESSAGE", message);
        startActivity(intent);
    }
}
