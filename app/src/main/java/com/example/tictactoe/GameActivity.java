package com.example.tictactoe;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.SystemClock;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Chronometer;
import android.widget.TextView;

public class GameActivity extends AppCompatActivity {
    private TextView PlayerTurn, timer;
    private TextView WinStatement;
    private Button PlayAgain, button_00, button_01, button_02, button_10, button_11, button_12, button_20, button_21, button_22,bestTime;
    int turn = 0, clicked1 = 0, clicked2 = 0, clicked3 = 0, clicked4 = 0, clicked5 = 0, clicked6 = 0, clicked7 = 0, clicked8 = 0, clicked9 = 0;
    int a = 10, b = 2, c = 3, d = 4, e = 5, f = 6, g = 7, h = 8, i = 9;
    int buttonCount = 0;
    private Chronometer DisplayTime;
    private TextView BestTime;
    private String winner, s1, s2;
    public static final String sharedPref="sharedPref";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);
        WinStatement = (TextView) findViewById(R.id.WinStatement);
        WinStatement.setVisibility(View.INVISIBLE);
        PlayerTurn = (TextView) findViewById(R.id.PlayerTurn);
        DisplayTime = (Chronometer) findViewById(R.id.DisplayTime);
        timer = (TextView) findViewById(R.id.timer);
        PlayAgain = (Button) findViewById(R.id.PlayAgain);
        PlayAgain.setEnabled(false);
        bestTime=(Button)findViewById(R.id.bestTime);
        bestTime.setEnabled(false);
        button_00 = (Button) findViewById(R.id.button_00);
        button_01 = (Button) findViewById(R.id.button_01);
        button_02 = (Button) findViewById(R.id.button_02);
        button_10 = (Button) findViewById(R.id.button_10);
        button_11 = (Button) findViewById(R.id.button_11);
        button_12 = (Button) findViewById(R.id.button_12);
        button_20 = (Button) findViewById(R.id.button_20);
        button_21 = (Button) findViewById(R.id.button_21);
        button_22 = (Button) findViewById(R.id.button_22);


        s1 = getIntent().getStringExtra("p1");
        s2 = getIntent().getStringExtra("p2");
        PlayerTurn.setText(s1 + ":X");



        bestTime.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(GameActivity.this,bestTime.class);
                SharedPreferences sp=getSharedPreferences("sharedPref",MODE_PRIVATE);

                intent.putExtra("intValue",sp.getInt("intValue",360000));
                intent.putExtra("winName",sp.getString("winName","none"));

                startActivity(intent);
            }
        });










        button_00.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (clicked1 == 0) {
                    if (turn % 2 == 0) {
                        button_00.setText("X");
                        a = 1;
                        PlayerTurn.setText(s2 + ":O");
                    } else {
                        button_00.setText("O");
                        a = 0;
                        PlayerTurn.setText(s1 + ":X");
                    }
                    turn = turn + 1;
                    clicked1 = 1;
                    buttonCount = buttonCount + 1;
                    checkForWin();
                }
            }


        });
        button_01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (clicked2 == 0) {
                    if (turn % 2 == 0) {
                        button_01.setText("X");
                        b = 1;
                        PlayerTurn.setText(s2 + ":O");
                    } else {
                        button_01.setText("O");
                        b = 0;
                        PlayerTurn.setText(s1 + ":X");
                    }
                    turn = turn + 1;
                    clicked2 = 1;
                    buttonCount = buttonCount + 1;
                    checkForWin();
                }
            }
        });
        button_02.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (clicked3 == 0) {
                    if (turn % 2 == 0) {
                        button_02.setText("X");
                        c = 1;
                        PlayerTurn.setText(s2 + ":O");
                    } else {
                        button_02.setText("O");
                        c = 0;
                        PlayerTurn.setText(s1 + ":X");
                    }
                    turn = turn + 1;
                    clicked3 = 1;
                    buttonCount = buttonCount + 1;
                    checkForWin();
                }
            }
        });
        button_10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (clicked4 == 0) {
                    if (turn % 2 == 0) {
                        button_10.setText("X");
                        d = 1;
                        PlayerTurn.setText(s2 + ":O");
                    } else {
                        button_10.setText("O");
                        d = 0;
                        PlayerTurn.setText(s1 + ":X");
                    }
                    turn = turn + 1;
                    clicked4 = 1;
                    buttonCount = buttonCount + 1;
                    checkForWin();
                }

            }
        });
        button_11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (clicked5 == 0) {
                    if (turn % 2 == 0) {
                        button_11.setText("X");
                        e = 1;
                        PlayerTurn.setText(s2 + ":O");
                    } else {
                        e = 0;
                        button_11.setText("O");
                        PlayerTurn.setText(s1 + ":X");
                    }
                    turn = turn + 1;

                    clicked5 = 1;
                    buttonCount = buttonCount + 1;
                    checkForWin();
                }
            }
        });
        button_12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (clicked6 == 0) {
                    if (turn % 2 == 0) {
                        button_12.setText("X");
                        f = 1;
                        PlayerTurn.setText(s2 + ":O");
                    } else {
                        f = 0;
                        button_12.setText("O");
                        PlayerTurn.setText(s1 + ":X");
                    }
                    turn = turn + 1;

                    clicked6 = 1;
                    buttonCount = buttonCount + 1;
                    checkForWin();
                }
            }
        });
        button_20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (clicked7 == 0) {
                    if (turn % 2 == 0) {
                        button_20.setText("X");
                        g = 1;
                        PlayerTurn.setText(s2 + ":O");

                    } else {
                        g = 0;
                        button_20.setText("O");
                        PlayerTurn.setText(s1 + ":X");
                    }
                    turn = turn + 1;

                    clicked7 = 1;
                    buttonCount = buttonCount + 1;
                    checkForWin();
                }
            }
        });
        button_21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (clicked8 == 0) {
                    if (turn % 2 == 0) {
                        button_21.setText("X");
                        h = 1;
                        PlayerTurn.setText(s2 + ":O");
                    } else {
                        h = 0;
                        button_21.setText("O");
                        PlayerTurn.setText(s1 + ":X");
                    }
                    turn = turn + 1;
                    clicked8 = 1;
                    buttonCount = buttonCount + 1;
                    checkForWin();
                }
            }
        });
        button_22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (clicked9 == 0) {
                    if (turn % 2 == 0) {
                        button_22.setText("X");
                        i = 1;
                        PlayerTurn.setText(s2 + ":O");

                    } else {
                        i = 0;
                        button_22.setText("O");
                        PlayerTurn.setText(s1 + ":X");
                    }
                    turn = turn + 1;
                    clicked9 = 1;
                    buttonCount = buttonCount + 1;
                    checkForWin();
                }
            }
        });

        PlayAgain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(GameActivity.this, MainActivity.class);
                i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(i);
            }
        });

    }

    private void checkForWin() {
        if (buttonCount == 1) {
            //StartTime
            DisplayTime.setBase(SystemClock.elapsedRealtime());
            DisplayTime.start();
        }

        if ((buttonCount > 3) && (buttonCount < 9))
        //diagonal
        {
            if (((a == e) && (e == i)) || ((c == e) && (g == e)))
                EndGame();
            //horizontal
            if ((a == b) && (a == c))
                EndGame();
            if ((d == e) && (e == f))
                EndGame();
            if ((g == h) && (h == i))
                EndGame();
            //Vertical
            if ((a == d) && (d == g))
                EndGame();
            if ((b == e) && (e == h))
                EndGame();
            if ((c == f) && (f == i))
                EndGame();
        }

        if (buttonCount == 9) {
            if (((a == e) && (e == i)) || ((c == e) && (g == e)))
                EndGame();
            //horizontal
           else if ((a == b) && (a == c))
                EndGame();
           else if ((d == e) && (e == f))
                EndGame();
           else if ((g == h) && (h == i))
                EndGame();
            //Vertical
           else if ((a == d) && (d == g))
                EndGame();
          else  if ((b == e) && (e == h))
                EndGame();
          else  if ((c == f) && (f == i))
                EndGame();
            else
                Draw();
        }
    }


    private void EndGame() {
      DisplayTime.stop();
        PlayerTurn.setVisibility(View.INVISIBLE);
        PlayAgain.setEnabled(true);
        button_00.setEnabled(false);
        button_01.setEnabled(false);
        button_02.setEnabled(false);
        button_10.setEnabled(false);
        button_11.setEnabled(false);
        button_12.setEnabled(false);
        button_20.setEnabled(false);
        button_21.setEnabled(false);
        button_22.setEnabled(false);
        WinStatement.setVisibility(View.VISIBLE);
        bestTime.setEnabled(true);
        if (turn % 2 == 0) {
            WinStatement.setText(s2 + " won");
            winner = s2;
        } else {
            WinStatement.setText(s1 + " won");
            winner = s1;
        }
        long chronovalue=SystemClock.elapsedRealtime()-DisplayTime.getBase();
        int i=(int)chronovalue/1000;
        SharedPreferences sp=getSharedPreferences("sharedPref",MODE_PRIVATE);
        SharedPreferences.Editor editor=sp.edit();
        editor.putInt("intValue",i);
        editor.putString("winName",winner);
        editor.apply();


    }
        private void Draw()
        {   DisplayTime.stop();
            PlayAgain.setEnabled(true);
            button_00.setEnabled(false);
            button_01.setEnabled(false);
            button_02.setEnabled(false);
            button_10.setEnabled(false);
            button_11.setEnabled(false);
            button_12.setEnabled(false);
            button_20.setEnabled(false);
            button_21.setEnabled(false);
            button_22.setEnabled(false);
            WinStatement.setVisibility(View.VISIBLE);
            WinStatement.setText("Its a draw match");
            PlayerTurn.setVisibility(View.INVISIBLE);
            winner="none";
            bestTime.setEnabled(true);
        }





    }
