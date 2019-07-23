package com.example.tictactoe;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class bestTime extends AppCompatActivity {
    private TextView playerName, BestTime;
    public static final String sharedPref="sharedPref";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_best_time);
        playerName = (TextView)findViewById(R.id.playerName);
        BestTime = (TextView)findViewById(R.id.BestTime);

        int intValue = getIntent().getExtras().getInt("intValue", 360000);
        String string = getIntent().getExtras().getString("winName", "none");
        SharedPreferences sp=getSharedPreferences("sharedPref",MODE_PRIVATE);

        int j = Integer.parseInt(sp.getString("value","360000"));
        if (j > intValue)
        {
            String value=Integer.toString(intValue);
            SharedPreferences shp=getSharedPreferences("sharedPref",MODE_PRIVATE);
            SharedPreferences.Editor editor=shp.edit();
            editor.putString("value",value);
            editor.putString("string",string);
            editor.apply();

        }
        SharedPreferences shp=getSharedPreferences("sharedPref",MODE_PRIVATE);
        BestTime.setText(shp.getString("value","360000"));
        playerName.setText(shp.getString("string","none"));


    }
}
