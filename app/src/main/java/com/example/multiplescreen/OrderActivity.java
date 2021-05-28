package com.example.multiplescreen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import com.example.multiplescreen.R;

public class OrderActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order);

        Intent intent = getIntent();
        String message = intent.getStringExtra(com.example.multiplescreen.MainActivity.MSG);

        // Set text inside textview to message
        TextView textView = findViewById(R.id.orderText);
        textView.setText(message);



    }
}

