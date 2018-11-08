package com.example.alexhedge.peerpressure;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class JoinActivity extends AppCompatActivity {

    private ImageView logo;
    private TextView join1, join2, join3, wait;

       @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_join);
    }
}
