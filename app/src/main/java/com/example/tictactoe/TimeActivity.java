package com.example.tictactoe;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class TimeActivity extends AppCompatActivity {
private TextView timer,playerName;
private String SharedPreferences="SharedPreferences";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_time);
       timer=(TextView)findViewById(R.id.timer);
       playerName=(TextView)findViewById(R.id.playerName);
       String winnerName=getIntent().getExtras().getString("winner");

       SharedPreferences sp=getSharedPreferences("SharedPreferences",MODE_PRIVATE);
        SharedPreferences.Editor editor=sp.edit();
        editor.putString("WinnerName",winnerName);
        editor.apply();
        playerName.setText(sp.getString("WinnerName","player1"));

    }
}
