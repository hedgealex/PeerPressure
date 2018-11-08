package com.example.alexhedge.peerpressure;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class LobbyActivity extends AppCompatActivity {

    private ImageView logo;
    private TextView lobbyName, lobbyNameActual, playersJoined, name1, name2, name3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lobby);
    }
}
