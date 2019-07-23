package com.example.tictactoe;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private Button twoPlayer,androidPlay,startGame;
    private EditText player1;
    private EditText player2;
    String s1,s2;
int i=0;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
      //  twoPlayer=(Button)findViewById(R.id.button);
        //androidPlay=(Button)findViewById(R.id.computer);
        startGame=(Button)findViewById(R.id.startActivity);
        player1=(EditText)findViewById(R.id.player1);
        player2=(EditText)findViewById(R.id.player2);
        //player1.setVisibility(View.INVISIBLE);
       // player2.setVisibility(View.INVISIBLE);

       /* twoPlayer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                player1.setVisibility(View.VISIBLE);
                player2.setVisibility(View.VISIBLE);
                if(player1.getText().length()==0)
                    player1.setText("Player1");
                if(player2.getText().length()==0)
                    player2.setText("Player2");
                i=2;
                androidPlay.setEnabled(false);


            }
        });
        androidPlay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                player1.setVisibility(View.VISIBLE);
                player2.setVisibility(View.VISIBLE);
                player2.setText("Android");
                player2.setEnabled(false);
                if(player1.getText().length()==0)
                    player1.setText("Player1");
                i=1;
                twoPlayer.setEnabled(false);

            }
        });*/
        if(player1.getText().length()==0)
            player1.setText("Player1");
        if(player2.getText().length()==0)
            player2.setText("Player2");

       startGame.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {

               s1=player1.getText().toString();
               s2=player2.getText().toString();
               Intent intent=new Intent(MainActivity.this,GameActivity.class);
               intent.putExtra("p1",s1);
               intent.putExtra("p2",s2);
               startActivity(intent);
           }
       });
    }

}
