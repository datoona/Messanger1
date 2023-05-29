package com.example.messanger1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ReceivedMessageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_received_message);

        Intent intent = getIntent();
        String putText = intent.getStringExtra("message");
        TextView typedText = findViewById(R.id.typedText);
        typedText.setText(putText);
    }
}