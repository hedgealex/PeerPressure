package com.example.alexhedge.peerpressure;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class WriteDareActivity extends AppCompatActivity {

    private ImageView logo, stopwatch;
    private TextView name, write;
    private EditText enterDare;
    private Button desperateDare, submitButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_write_dare);
    }
}
