package com.example.messanger1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText editText = findViewById(R.id.editText);
        Button sendMessage = findViewById(R.id.button);

        sendMessage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String message = editText.getText().toString();
                launchNextScreen(message);
            }
        });
    }

    private void launchNextScreen(String text) {
        Intent intent = new Intent(this, ReceivedMessageActivity.class);
        intent.putExtra("message", text);
        startActivity(intent);
    }
}