package com.example.eightqueens;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ImageButton pA1 = null;
    ImageButton pA2 = null;
    ImageButton pA3 = null;
    ImageButton pA4 = null;
    ImageButton pA5 = null;
    ImageButton pA6 = null;
    ImageButton pA7 = null;
    ImageButton pA8 = null;
    ImageButton pB1 = null;
    ImageButton pB2 = null;
    ImageButton pB3 = null;
    ImageButton pB4 = null;
    ImageButton pB5 = null;
    ImageButton pB6 = null;
    ImageButton pB7 = null;
    ImageButton pB8 = null;
    ImageButton pC1 = null;
    ImageButton pC2 = null;
    ImageButton pC3 = null;
    ImageButton pC4 = null;
    ImageButton pC5 = null;
    ImageButton pC6 = null;
    ImageButton pC7 = null;
    ImageButton pC8 = null;
    ImageButton pD1 = null;
    ImageButton pD2 = null;
    ImageButton pD3 = null;
    ImageButton pD4 = null;
    ImageButton pD5 = null;
    ImageButton pD6 = null;
    ImageButton pD7 = null;
    ImageButton pD8 = null;
    ImageButton pE1 = null;
    ImageButton pE2 = null;
    ImageButton pE3 = null;
    ImageButton pE4 = null;
    ImageButton pE5 = null;
    ImageButton pE6 = null;
    ImageButton pE7 = null;
    ImageButton pE8 = null;
    ImageButton pF1 = null;
    ImageButton pF2 = null;
    ImageButton pF3 = null;
    ImageButton pF4 = null;
    ImageButton pF5 = null;
    ImageButton pF6 = null;
    ImageButton pF7 = null;
    ImageButton pF8 = null;
    ImageButton pG1 = null;
    ImageButton pG2 = null;
    ImageButton pG3 = null;
    ImageButton pG4 = null;
    ImageButton pG5 = null;
    ImageButton pG6 = null;
    ImageButton pG7 = null;
    ImageButton pG8 = null;
    ImageButton pH1 = null;
    ImageButton pH2 = null;
    ImageButton pH3 = null;
    ImageButton pH4 = null;
    ImageButton pH5 = null;
    ImageButton pH6 = null;
    ImageButton pH7 = null;
    ImageButton pH8 = null;


    int[][] moves = new int[][] {
        {0,0,0,0,0,0,0,0},
        {0,0,0,0,0,0,0,0},
        {0,0,0,0,0,0,0,0},
        {0,0,0,0,0,0,0,0},
        {0,0,0,0,0,0,0,0},
        {0,0,0,0,0,0,0,0},
        {0,0,0,0,0,0,0,0},
        {0,0,0,0,0,0,0,0}
    };

    int[] soln1 = new int[] {0,0,0,0,0,0,0,0};
    int[] soln2 = new int[] {0,0,0,0,0,0,0,0};
    int[] soln3 = new int[] {0,0,0,0,0,0,0,0};
    int[] soln4 = new int[] {0,0,0,0,0,0,0,0};
    int[] soln5 = new int[] {0,0,0,0,0,0,0,0};
    int[] soln6 = new int[] {0,0,0,0,0,0,0,0};
    int[] soln7 = new int[] {0,0,0,0,0,0,0,0};
    int[] soln8 = new int[] {0,0,0,0,0,0,0,0};
    int[] soln9 = new int[] {0,0,0,0,0,0,0,0};
    int[] soln10 = new int[] {0,0,0,0,0,0,0,0};
    int[] soln11 = new int[] {0,0,0,0,0,0,0,0};
    int[] soln12 = new int[] {0,0,0,0,0,0,0,0};
    int[] soln13 = new int[] {0,0,0,0,0,0,0,0};
    int[] soln14 = new int[] {0,0,0,0,0,0,0,0};
    int[] soln15 = new int[] {0,0,0,0,0,0,0,0};
    int[] soln16 = new int[] {0,0,0,0,0,0,0,0};
    int[] soln17 = new int[] {0,0,0,0,0,0,0,0};
    int[] soln18 = new int[] {0,0,0,0,0,0,0,0};
    int[] soln19 = new int[] {0,0,0,0,0,0,0,0};
    int[] soln20 = new int[] {0,0,0,0,0,0,0,0};
    int[] soln21 = new int[] {0,0,0,0,0,0,0,0};
    int[] soln22 = new int[] {0,0,0,0,0,0,0,0};
    int[] soln23 = new int[] {0,0,0,0,0,0,0,0};
    int[] soln24 = new int[] {0,0,0,0,0,0,0,0};
    int[] soln25 = new int[] {0,0,0,0,0,0,0,0};
    int[] soln26 = new int[] {0,0,0,0,0,0,0,0};
    int[] soln27 = new int[] {0,0,0,0,0,0,0,0};
    int[] soln28 = new int[] {0,0,0,0,0,0,0,0};
    int[] soln29 = new int[] {0,0,0,0,0,0,0,0};
    int[] soln30 = new int[] {0,0,0,0,0,0,0,0};
    int[] soln31 = new int[] {0,0,0,0,0,0,0,0};
    int[] soln32 = new int[] {0,0,0,0,0,0,0,0};
    int[] soln33 = new int[] {0,0,0,0,0,0,0,0};
    int[] soln34 = new int[] {0,0,0,0,0,0,0,0};
    int[] soln35 = new int[] {0,0,0,0,0,0,0,0};
    int[] soln36 = new int[] {0,0,0,0,0,0,0,0};
    int[] soln37 = new int[] {0,0,0,0,0,0,0,0};
    int[] soln38 = new int[] {0,0,0,0,0,0,0,0};
    int[] soln39 = new int[] {0,0,0,0,0,0,0,0};
    int[] soln40 = new int[] {0,0,0,0,0,0,0,0};
    int[] soln41 = new int[] {0,0,0,0,0,0,0,0};
    int[] soln42 = new int[] {0,0,0,0,0,0,0,0};
    int[] soln43 = new int[] {0,0,0,0,0,0,0,0};
    int[] soln44 = new int[] {0,0,0,0,0,0,0,0};
    int[] soln45 = new int[] {0,0,0,0,0,0,0,0};
    int[] soln46 = new int[] {0,0,0,0,0,0,0,0};
    int[] soln47 = new int[] {0,0,0,0,0,0,0,0};
    int[] soln48 = new int[] {0,0,0,0,0,0,0,0};
    int[] soln49 = new int[] {0,0,0,0,0,0,0,0};
    int[] soln50 = new int[] {0,0,0,0,0,0,0,0};
    int[] soln51 = new int[] {0,0,0,0,0,0,0,0};
    int[] soln52 = new int[] {0,0,0,0,0,0,0,0};
    int[] soln53 = new int[] {0,0,0,0,0,0,0,0};
    int[] soln54 = new int[] {0,0,0,0,0,0,0,0};
    int[] soln55 = new int[] {0,0,0,0,0,0,0,0};
    int[] soln56 = new int[] {0,0,0,0,0,0,0,0};
    int[] soln57 = new int[] {0,0,0,0,0,0,0,0};
    int[] soln58 = new int[] {0,0,0,0,0,0,0,0};
    int[] soln59 = new int[] {0,0,0,0,0,0,0,0};
    int[] soln60 = new int[] {0,0,0,0,0,0,0,0};
    int[] soln61 = new int[] {0,0,0,0,0,0,0,0};
    int[] soln62 = new int[] {0,0,0,0,0,0,0,0};
    int[] soln63 = new int[] {0,0,0,0,0,0,0,0};
    int[] soln64 = new int[] {0,0,0,0,0,0,0,0};
    int[] soln65 = new int[] {0,0,0,0,0,0,0,0};
    int[] soln66 = new int[] {0,0,0,0,0,0,0,0};
    int[] soln67 = new int[] {0,0,0,0,0,0,0,0};
    int[] soln68 = new int[] {0,0,0,0,0,0,0,0};
    int[] soln69 = new int[] {0,0,0,0,0,0,0,0};
    int[] soln70 = new int[] {0,0,0,0,0,0,0,0};
    int[] soln71 = new int[] {0,0,0,0,0,0,0,0};
    int[] soln72 = new int[] {0,0,0,0,0,0,0,0};
    int[] soln73 = new int[] {0,0,0,0,0,0,0,0};
    int[] soln74 = new int[] {0,0,0,0,0,0,0,0};
    int[] soln75 = new int[] {0,0,0,0,0,0,0,0};
    int[] soln76 = new int[] {0,0,0,0,0,0,0,0};
    int[] soln77 = new int[] {0,0,0,0,0,0,0,0};
    int[] soln78 = new int[] {0,0,0,0,0,0,0,0};
    int[] soln79 = new int[] {0,0,0,0,0,0,0,0};
    int[] soln80 = new int[] {0,0,0,0,0,0,0,0};
    int[] soln81 = new int[] {0,0,0,0,0,0,0,0};
    int[] soln82 = new int[] {0,0,0,0,0,0,0,0};
    int[] soln83 = new int[] {0,0,0,0,0,0,0,0};
    int[] soln84 = new int[] {0,0,0,0,0,0,0,0};
    int[] soln85 = new int[] {0,0,0,0,0,0,0,0};
    int[] soln86 = new int[] {0,0,0,0,0,0,0,0};
    int[] soln87 = new int[] {0,0,0,0,0,0,0,0};
    int[] soln88 = new int[] {0,0,0,0,0,0,0,0};
    int[] soln89 = new int[] {0,0,0,0,0,0,0,0};
    int[] soln90 = new int[] {0,0,0,0,0,0,0,0};
    int[] soln91 = new int[] {0,0,0,0,0,0,0,0};
    int[] soln92 = new int[] {0,0,0,0,0,0,0,0};



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick(View v) {
         pA1 = (ImageButton) findViewById(R.id.A1);
         pA2 = (ImageButton) findViewById(R.id.A2);
         pA3 = (ImageButton) findViewById(R.id.A3);
         pA4 = (ImageButton) findViewById(R.id.A4);
         pA5 = (ImageButton) findViewById(R.id.A5);
         pA6 = (ImageButton) findViewById(R.id.A6);
         pA7 = (ImageButton) findViewById(R.id.A7);
         pA8 = (ImageButton) findViewById(R.id.A8);
        pB1 = (ImageButton) findViewById(R.id.B1);
        pB2 = (ImageButton) findViewById(R.id.B2);
        pB3 = (ImageButton) findViewById(R.id.B3);
        pB4 = (ImageButton) findViewById(R.id.B4);
        pB5 = (ImageButton) findViewById(R.id.B5);
        pB6 = (ImageButton) findViewById(R.id.B6);
        pB7 = (ImageButton) findViewById(R.id.B7);
        pB8 = (ImageButton) findViewById(R.id.B8);
        pC1 = (ImageButton) findViewById(R.id.C1);
        pC2 = (ImageButton) findViewById(R.id.C2);
        pC3 = (ImageButton) findViewById(R.id.C3);
        pC4 = (ImageButton) findViewById(R.id.C4);
        pC5 = (ImageButton) findViewById(R.id.C5);
        pC6 = (ImageButton) findViewById(R.id.C6);
        pC7 = (ImageButton) findViewById(R.id.C7);
        pC8 = (ImageButton) findViewById(R.id.C8);
        pD1 = (ImageButton) findViewById(R.id.D1);
        pD2 = (ImageButton) findViewById(R.id.D2);
        pD3 = (ImageButton) findViewById(R.id.D3);
        pD4 = (ImageButton) findViewById(R.id.D4);
        pD5 = (ImageButton) findViewById(R.id.D5);
        pD6 = (ImageButton) findViewById(R.id.D6);
        pD7 = (ImageButton) findViewById(R.id.D7);
        pD8 = (ImageButton) findViewById(R.id.D8);
        pE1 = (ImageButton) findViewById(R.id.E1);
        pE2 = (ImageButton) findViewById(R.id.E2);
        pE3 = (ImageButton) findViewById(R.id.E3);
        pE4 = (ImageButton) findViewById(R.id.E4);
        pE5 = (ImageButton) findViewById(R.id.E5);
        pE6 = (ImageButton) findViewById(R.id.E6);
        pE7 = (ImageButton) findViewById(R.id.E7);
        pE8 = (ImageButton) findViewById(R.id.E8);
        pF1 = (ImageButton) findViewById(R.id.F1);
        pF2 = (ImageButton) findViewById(R.id.F2);
        pF3 = (ImageButton) findViewById(R.id.F3);
        pF4 = (ImageButton) findViewById(R.id.F4);
        pF5 = (ImageButton) findViewById(R.id.F5);
        pF6 = (ImageButton) findViewById(R.id.F6);
        pF7 = (ImageButton) findViewById(R.id.F7);
        pF8 = (ImageButton) findViewById(R.id.F8);
        pG1 = (ImageButton) findViewById(R.id.G1);
        pG2 = (ImageButton) findViewById(R.id.G2);
        pG3 = (ImageButton) findViewById(R.id.G3);
        pG4 = (ImageButton) findViewById(R.id.G4);
        pG5 = (ImageButton) findViewById(R.id.G5);
        pG6 = (ImageButton) findViewById(R.id.G6);
        pG7 = (ImageButton) findViewById(R.id.G7);
        pG8 = (ImageButton) findViewById(R.id.G8);
        pH1 = (ImageButton) findViewById(R.id.H1);
        pH2 = (ImageButton) findViewById(R.id.H2);
        pH3 = (ImageButton) findViewById(R.id.H3);
        pH4 = (ImageButton) findViewById(R.id.H4);
        pH5 = (ImageButton) findViewById(R.id.H5);
        pH6 = (ImageButton) findViewById(R.id.H6);
        pH7 = (ImageButton) findViewById(R.id.H7);
        pH8 = (ImageButton) findViewById(R.id.H8);

        switch(v.getId()) {
            case R.id.A1: {
                if (moves[7][0] == 0) {
                    for (int i = 0; i <= 7; i++) {
                        moves[7][i] = 1;
                        moves[i][0] = 1;
                    }
                    moves[6][1] = 1;
                    moves[5][2] = 1;
                    moves[4][3] = 1;
                    moves[3][4] = 1;
                    moves[2][5] = 1;
                    moves[1][6] = 1;
                    moves[0][7] = 1;
                    moves[7][0] = 2;
                    pA1.setImageResource(R.drawable.brownwq);

                }
                else if (moves[7][0] == 1) {
                    Toast.makeText(this, "Conflict with prexisting queen!",Toast.LENGTH_LONG).show();
                }
                else if (moves[7][0] == 2){
                    for (int i = 0; i <= 7; i++) {
                        moves[7][i] = 0;
                        moves[i][0] = 0;
                    }
                    moves[6][1] = 0;
                    moves[5][2] = 0;
                    moves[4][3] = 0;
                    moves[3][4] = 0;
                    moves[2][5] = 0;
                    moves[1][6] = 0;
                    moves[0][7] = 0;
                    moves[7][0] = 0;
                    pA1.setImageResource(R.drawable.brown);
                }
                break;
            }
            case R.id.A2: {
                if (moves[7][1] == 0) {
                    for (int i = 0; i <= 7; i++) {
                        moves[7][i] = 1;
                        moves[i][1] = 1;
                    }
                    moves[6][0] = 1;
                    moves[6][2] = 1;
                    moves[5][3] = 1;
                    moves[4][4] = 1;
                    moves[3][5] = 1;
                    moves[2][6] = 1;
                    moves[1][7] = 1;
                    moves[7][1] = 2;
                    pA2.setImageResource(R.drawable.beigewq);

                }
                else if (moves[7][1] == 1) {
                    Toast.makeText(this, "Conflict with prexisting queen!",Toast.LENGTH_LONG).show();
                }
                else if (moves[7][1] == 2){
                    for (int i = 0; i <= 7; i++) {
                        moves[7][i] = 0;
                        moves[i][1] = 0;
                    }
                    moves[6][0] = 0;
                    moves[6][2] = 0;
                    moves[5][3] = 0;
                    moves[4][4] = 0;
                    moves[3][5] = 0;
                    moves[2][6] = 0;
                    moves[1][7] = 0;
                    moves[7][1] = 0;
                    pA2.setImageResource(R.drawable.beige);
                }
                break;
            }
            case R.id.A3: {
                if (moves[7][2] == 0) {
                    for (int i = 0; i <= 7; i++) {
                        moves[7][i] = 1;
                        moves[i][2] = 1;
                    }
                    moves[5][0] = 1;
                    moves[6][1] = 1;
                    moves[6][3] = 1;
                    moves[5][4] = 1;
                    moves[4][5] = 1;
                    moves[3][6] = 1;
                    moves[2][7] = 1;
                    moves[7][2] = 2;
                    pA3.setImageResource(R.drawable.brownwq);

                }
                else if (moves[7][2] == 1) {
                    Toast.makeText(this, "Conflict with prexisting queen!",Toast.LENGTH_LONG).show();
                }
                else if (moves[7][2] == 2){
                    for (int i = 0; i <= 7; i++) {
                        moves[7][i] = 0;
                        moves[i][2] = 0;
                    }
                    moves[5][0] = 0;
                    moves[6][1] = 0;
                    moves[6][3] = 0;
                    moves[5][4] = 0;
                    moves[4][5] = 0;
                    moves[3][6] = 0;
                    moves[2][7] = 0;
                    moves[7][2] = 0;
                    pA3.setImageResource(R.drawable.brown);
                }
                break;
            }
            case R.id.A4: {
                if (moves[7][3] == 0) {
                    for (int i = 0; i <= 7; i++) {
                        moves[7][i] = 1;
                        moves[i][3] = 1;
                    }
                    moves[4][0] = 1;
                    moves[5][1] = 1;
                    moves[6][2] = 1;
                    moves[6][4] = 1;
                    moves[5][5] = 1;
                    moves[4][6] = 1;
                    moves[3][7] = 1;
                    moves[7][3] = 2;
                    pA4.setImageResource(R.drawable.beigewq);

                }
                else if (moves[7][3] == 1) {
                    Toast.makeText(this, "Conflict with prexisting queen!",Toast.LENGTH_LONG).show();
                }
                else if (moves[7][3] == 2){
                    for (int i = 0; i <= 7; i++) {
                        moves[7][i] = 0;
                        moves[i][3] = 0;
                    }
                    moves[4][0] = 0;
                    moves[5][1] = 0;
                    moves[6][2] = 0;
                    moves[6][4] = 0;
                    moves[5][5] = 0;
                    moves[4][6] = 0;
                    moves[3][7] = 0;
                    moves[7][3] = 0;
                    pA4.setImageResource(R.drawable.beige);
                }
                break;
            }
            case R.id.A5: {
                if (moves[7][4] == 0) {
                    for (int i = 0; i <= 7; i++) {
                        moves[7][i] = 1;
                        moves[i][4] = 1;
                    }
                    moves[3][0] = 1;
                    moves[4][1] = 1;
                    moves[5][2] = 1;
                    moves[6][3] = 1;
                    moves[6][5] = 1;
                    moves[5][6] = 1;
                    moves[4][7] = 1;
                    moves[7][4] = 2;
                    pA5.setImageResource(R.drawable.brownwq);

                }
                else if (moves[7][4] == 1) {
                    Toast.makeText(this, "Conflict with prexisting queen!",Toast.LENGTH_LONG).show();
                }
                else if (moves[7][4] == 2){
                    for (int i = 0; i <= 7; i++) {
                        moves[7][i] = 0;
                        moves[i][4] = 0;
                    }
                    moves[3][0] = 0;
                    moves[4][1] = 0;
                    moves[5][2] = 0;
                    moves[6][3] = 0;
                    moves[6][5] = 0;
                    moves[5][6] = 0;
                    moves[4][7] = 0;
                    moves[7][4] = 0;
                    pA5.setImageResource(R.drawable.brown);
                }
                break;
            }
            case R.id.A6: {
                if (moves[7][5] == 0) {
                    for (int i = 0; i <= 7; i++) {
                        moves[7][i] = 1;
                        moves[i][5] = 1;
                    }
                    moves[2][0] = 1;
                    moves[3][1] = 1;
                    moves[4][2] = 1;
                    moves[5][3] = 1;
                    moves[6][4] = 1;
                    moves[6][6] = 1;
                    moves[5][7] = 1;
                    moves[7][5] = 2;
                    pA6.setImageResource(R.drawable.beigewq);

                }
                else if (moves[7][5] == 1) {
                    Toast.makeText(this, "Conflict with prexisting queen!",Toast.LENGTH_LONG).show();
                }
                else if (moves[7][5] == 2){
                    for (int i = 0; i <= 7; i++) {
                        moves[7][i] = 0;
                        moves[i][5] = 0;
                    }
                    moves[2][0] = 0;
                    moves[3][1] = 0;
                    moves[4][2] = 0;
                    moves[5][3] = 0;
                    moves[6][4] = 0;
                    moves[6][6] = 0;
                    moves[5][7] = 0;
                    moves[7][5] = 0;
                    pA6.setImageResource(R.drawable.beige);
                }
                break;
            }
            case R.id.A7: {
                if (moves[7][6] == 0) {
                    for (int i = 0; i <= 7; i++) {
                        moves[7][i] = 1;
                        moves[i][6] = 1;
                    }
                    moves[1][0] = 1;
                    moves[2][1] = 1;
                    moves[3][2] = 1;
                    moves[4][3] = 1;
                    moves[5][4] = 1;
                    moves[6][5] = 1;
                    moves[6][7] = 1;
                    moves[7][6] = 2;
                    pA7.setImageResource(R.drawable.brownwq);

                }
                else if (moves[7][6] == 1) {
                    Toast.makeText(this, "Conflict with prexisting queen!",Toast.LENGTH_LONG).show();
                }
                else if (moves[7][6] == 2){
                    for (int i = 0; i <= 7; i++) {
                        moves[7][i] = 0;
                        moves[i][6] = 0;
                    }
                    moves[1][0] = 0;
                    moves[2][1] = 0;
                    moves[3][2] = 0;
                    moves[4][3] = 0;
                    moves[5][4] = 0;
                    moves[6][5] = 0;
                    moves[6][7] = 0;
                    moves[7][6] = 0;
                    pA7.setImageResource(R.drawable.brown);
                }
                break;
            }
            case R.id.A8: {
                if (moves[7][7] == 0) {
                    for (int i = 0; i <= 7; i++) {
                        moves[7][i] = 1;
                        moves[i][7] = 1;
                    }
                    moves[0][0] = 1;
                    moves[1][1] = 1;
                    moves[2][2] = 1;
                    moves[3][3] = 1;
                    moves[4][4] = 1;
                    moves[5][5] = 1;
                    moves[6][6] = 1;
                    moves[7][7] = 2;
                    pA8.setImageResource(R.drawable.beigewq);

                }
                else if (moves[7][7] == 1) {
                    Toast.makeText(this, "Conflict with prexisting queen!",Toast.LENGTH_LONG).show();
                }
                else if (moves[7][7] == 2){
                    for (int i = 0; i <= 7; i++) {
                        moves[1][i] = 0;
                        moves[i][7] = 0;
                    }
                    moves[0][0] = 0;
                    moves[1][1] = 0;
                    moves[2][2] = 0;
                    moves[3][3] = 0;
                    moves[4][4] = 0;
                    moves[5][5] = 0;
                    moves[6][6] = 0;
                    moves[7][7] = 0;
                    pA8.setImageResource(R.drawable.beige);
                }
                break;
            }


            //DONE
                //
                //
                //
            case R.id.B1: {
                if (moves[6][0] == 0) {
                    for (int i = 0; i <= 7; i++) {
                        moves[6][i] = 1;
                        moves[i][0] = 1;
                    }
                    moves[7][1] = 1;
                    moves[5][1] = 1;
                    moves[4][2] = 1;
                    moves[3][3] = 1;
                    moves[2][4] = 1;
                    moves[1][5] = 1;
                    moves[0][6] = 1;
                    moves[6][0] = 2;
                    pB1.setImageResource(R.drawable.beigewq);

                }
                else if (moves[6][0] == 1) {
                    Toast.makeText(this, "Conflict with prexisting queen!",Toast.LENGTH_LONG).show();
                }
                else if (moves[6][0] == 2){
                    for (int i = 0; i <= 7; i++) {
                        moves[6][i] = 0;
                        moves[i][0] = 0;
                    }
                    moves[7][1] = 0;
                    moves[5][1] = 0;
                    moves[4][2] = 0;
                    moves[3][3] = 0;
                    moves[2][4] = 0;
                    moves[1][5] = 0;
                    moves[0][6] = 0;
                    moves[6][0] = 0;
                    pB1.setImageResource(R.drawable.beige);
                }
                break;
            }
            case R.id.B2: {
                if (moves[6][1] == 0) {
                    for (int i = 0; i <= 7; i++) {
                        moves[6][i] = 1;
                        moves[i][1] = 1;
                    }
                    moves[7][0] = 1;
                    moves[5][0] = 1;
                    moves[5][2] = 1;
                    moves[4][3] = 1;
                    moves[3][4] = 1;
                    moves[2][5] = 1;
                    moves[1][6] = 1;
                    moves[0][7] = 1;
                    moves[7][2] = 1;
                    moves[6][1] = 2;
                    pB2.setImageResource(R.drawable.brownwq);

                }
                else if (moves[6][1] == 1) {
                    Toast.makeText(this, "Conflict with prexisting queen!",Toast.LENGTH_LONG).show();
                }
                else if (moves[6][1] == 2){
                    for (int i = 0; i <= 7; i++) {
                        moves[6][i] = 0;
                        moves[i][1] = 0;
                    }
                    moves[7][0] = 0;
                    moves[5][0] = 0;
                    moves[5][2] = 0;
                    moves[4][3] = 0;
                    moves[3][4] = 0;
                    moves[2][5] = 0;
                    moves[1][6] = 0;
                    moves[0][7] = 0;
                    moves[7][2] = 0;
                    moves[6][1] = 0;
                    pB2.setImageResource(R.drawable.brown);
                }
                break;
            }
            case R.id.B3: {
                if (moves[6][2] == 0) {
                    for (int i = 0; i <= 7; i++) {
                        moves[6][i] = 1;
                        moves[i][2] = 1;
                    }
                    moves[7][1] = 1;
                    moves[4][0] = 1;
                    moves[5][1] = 1;
                    moves[5][3] = 1;
                    moves[4][4] = 1;
                    moves[3][5] = 1;
                    moves[2][6] = 1;
                    moves[1][7] = 1;
                    moves[7][3] = 1;
                    moves[6][2] = 2;
                    pB3.setImageResource(R.drawable.beigewq);

                }
                else if (moves[6][2] == 1) {
                    Toast.makeText(this, "Conflict with prexisting queen!",Toast.LENGTH_LONG).show();
                }
                else if (moves[6][2] == 2){
                    for (int i = 0; i <= 7; i++) {
                        moves[6][i] = 0;
                        moves[i][2] = 0;
                    }
                    moves[7][1] = 0;
                    moves[4][0] = 0;
                    moves[5][1] = 0;
                    moves[5][3] = 0;
                    moves[4][4] = 0;
                    moves[3][5] = 0;
                    moves[2][6] = 0;
                    moves[1][7] = 0;
                    moves[7][3] = 0;
                    moves[6][2] = 0;
                    pB3.setImageResource(R.drawable.beige);
                }
                break;
            }
            case R.id.B4: {
                if (moves[6][3] == 0) {
                    for (int i = 0; i <= 7; i++) {
                        moves[6][i] = 1;
                        moves[i][3] = 1;
                    }
                    moves[7][2] = 1;
                    moves[3][0] = 1;
                    moves[4][1] = 1;
                    moves[5][2] = 1;
                    moves[5][4] = 1;
                    moves[4][5] = 1;
                    moves[3][6] = 1;
                    moves[2][7] = 1;
                    moves[7][4] = 1;
                    moves[6][3] = 2;
                    pB4.setImageResource(R.drawable.brownwq);

                }
                else if (moves[6][3] == 1) {
                    Toast.makeText(this, "Conflict with prexisting queen!",Toast.LENGTH_LONG).show();
                }
                else if (moves[6][3] == 2){
                    for (int i = 0; i <= 7; i++) {
                        moves[6][i] = 0;
                        moves[i][3] = 0;
                    }
                    moves[7][2] = 0;
                    moves[3][0] = 0;
                    moves[4][1] = 0;
                    moves[5][2] = 0;
                    moves[5][4] = 0;
                    moves[4][5] = 0;
                    moves[3][6] = 0;
                    moves[2][7] = 0;
                    moves[7][4] = 0;
                    moves[6][3] = 0;
                    pB4.setImageResource(R.drawable.brown);
                }
                break;
            }
            case R.id.B5: {
                if (moves[6][4] == 0) {
                    for (int i = 0; i <= 7; i++) {
                        moves[6][i] = 1;
                        moves[i][4] = 1;
                    }
                    moves[7][3] = 1;
                    moves[2][0] = 1;
                    moves[3][1] = 1;
                    moves[4][2] = 1;
                    moves[5][3] = 1;
                    moves[5][5] = 1;
                    moves[4][6] = 1;
                    moves[3][7] = 1;
                    moves[7][5] = 1;
                    moves[6][4] = 2;
                    pB5.setImageResource(R.drawable.beigewq);

                }
                else if (moves[6][4] == 1) {
                    Toast.makeText(this, "Conflict with prexisting queen!",Toast.LENGTH_LONG).show();
                }
                else if (moves[6][4] == 2){
                    for (int i = 0; i <= 7; i++) {
                        moves[6][i] = 0;
                        moves[i][4] = 0;
                    }
                    moves[7][3] = 0;
                    moves[2][0] = 0;
                    moves[3][1] = 0;
                    moves[4][2] = 0;
                    moves[5][3] = 0;
                    moves[5][5] = 0;
                    moves[4][6] = 0;
                    moves[3][7] = 0;
                    moves[7][5] = 0;
                    moves[6][4] = 0;
                    pB5.setImageResource(R.drawable.beige);
                }
                break;
            }
            case R.id.B6: {
                if (moves[6][5] == 0) {
                    for (int i = 0; i <= 7; i++) {
                        moves[6][i] = 1;
                        moves[i][5] = 1;
                    }
                    moves[7][4] = 1;
                    moves[1][0] = 1;
                    moves[2][1] = 1;
                    moves[3][2] = 1;
                    moves[4][3] = 1;
                    moves[5][4] = 1;
                    moves[5][6] = 1;
                    moves[4][7] = 1;
                    moves[7][6] = 1;
                    moves[6][5] = 2;
                    pB6.setImageResource(R.drawable.brownwq);

                }
                else if (moves[6][5] == 1) {
                    Toast.makeText(this, "Conflict with prexisting queen!",Toast.LENGTH_LONG).show();
                }
                else if (moves[6][5] == 2){
                    for (int i = 0; i <= 7; i++) {
                        moves[6][i] = 0;
                        moves[i][5] = 0;
                    }
                    moves[7][4] = 0;
                    moves[1][0] = 0;
                    moves[2][1] = 0;
                    moves[3][2] = 0;
                    moves[4][3] = 0;
                    moves[5][4] = 0;
                    moves[5][6] = 0;
                    moves[4][7] = 0;
                    moves[7][6] = 0;
                    moves[6][5] = 0;
                    pB6.setImageResource(R.drawable.brown);
                }
                break;
            }
            case R.id.B7: {
                if (moves[6][6] == 0) {
                    for (int i = 0; i <= 7; i++) {
                        moves[6][i] = 1;
                        moves[i][6] = 1;
                    }
                    moves[7][5] = 1;
                    moves[0][0] = 1;
                    moves[1][1] = 1;
                    moves[2][2] = 1;
                    moves[3][3] = 1;
                    moves[4][4] = 1;
                    moves[5][5] = 1;
                    moves[5][7] = 1;
                    moves[7][7] = 1;
                    moves[6][6] = 2;
                    pB7.setImageResource(R.drawable.beigewq);

                }
                else if (moves[6][6] == 1) {
                    Toast.makeText(this, "Conflict with prexisting queen!",Toast.LENGTH_LONG).show();
                }
                else if (moves[6][6] == 2){
                    for (int i = 0; i <= 7; i++) {
                        moves[6][i] = 0;
                        moves[i][6] = 0;
                    }
                    moves[7][5] = 0;
                    moves[0][0] = 0;
                    moves[1][1] = 0;
                    moves[2][2] = 0;
                    moves[3][3] = 0;
                    moves[4][4] = 0;
                    moves[5][5] = 0;
                    moves[5][7] = 0;
                    moves[7][7] = 0;
                    moves[6][6] = 0;
                    pB7.setImageResource(R.drawable.beige);
                }
                break;
            }
            case R.id.B8: {
                if (moves[6][7] == 0) {
                    for (int i = 0; i <= 7; i++) {
                        moves[6][i] = 1;
                        moves[i][7] = 1;
                    }
                    moves[7][6] = 1;
                    moves[0][1] = 1;
                    moves[1][2] = 1;
                    moves[2][3] = 1;
                    moves[3][4] = 1;
                    moves[4][5] = 1;
                    moves[5][6] = 1;
                    moves[6][7] = 2;
                    pB8.setImageResource(R.drawable.brownwq);

                }
                else if (moves[6][7] == 1) {
                    Toast.makeText(this, "Conflict with prexisting queen!",Toast.LENGTH_LONG).show();
                }
                else if (moves[6][7] == 2){
                    for (int i = 0; i <= 7; i++) {
                        moves[6][i] = 0;
                        moves[i][7] = 0;
                    }
                    moves[7][6] = 0;
                    moves[0][1] = 0;
                    moves[1][2] = 0;
                    moves[2][3] = 0;
                    moves[3][4] = 0;
                    moves[4][5] = 0;
                    moves[5][6] = 0;
                    moves[6][7] = 0;
                    pB8.setImageResource(R.drawable.brown);
                }
                break;
            }
//DONE
                //
                //
                //

            case R.id.C1: {
                if (moves[5][0] == 0) {
                    for (int i = 0; i <= 7; i++) {
                        moves[5][i] = 1;
                        moves[i][0] = 1;
                    }
                    moves[6][1] = 1;
                    moves[7][2] = 1;
                    moves[4][1] = 1;
                    moves[3][2] = 1;
                    moves[2][3] = 1;
                    moves[1][4] = 1;
                    moves[0][5] = 1;
                    moves[5][0] = 2;
                    pC1.setImageResource(R.drawable.brownwq);

                }
                else if (moves[5][0] == 1) {
                    Toast.makeText(this, "Conflict with prexisting queen!",Toast.LENGTH_LONG).show();
                }
                else if (moves[5][0] == 2){
                    for (int i = 0; i <= 7; i++) {
                        moves[5][i] = 0;
                        moves[i][0] = 0;
                    }
                    moves[6][1] = 0;
                    moves[7][2] = 0;
                    moves[4][1] = 0;
                    moves[3][2] = 0;
                    moves[2][3] = 0;
                    moves[1][4] = 0;
                    moves[0][5] = 0;
                    moves[5][0] = 0;
                    pC1.setImageResource(R.drawable.brown);
                }
                break;
            }
            case R.id.C2: {
                if (moves[5][1] == 0) {
                    for (int i = 0; i <= 7; i++) {
                        moves[5][i] = 1;
                        moves[i][1] = 1;
                    }
                    moves[6][2] = 1;
                    moves[7][3] = 1;
                    moves[4][2] = 1;
                    moves[3][3] = 1;
                    moves[2][4] = 1;
                    moves[1][5] = 1;
                    moves[0][6] = 1;
                    moves[4][0] = 1;
                    moves[6][0] = 1;
                    moves[5][1] = 2;
                    pC2.setImageResource(R.drawable.beigewq);

                }
                else if (moves[5][1] == 1) {
                    Toast.makeText(this, "Conflict with prexisting queen!",Toast.LENGTH_LONG).show();
                }
                else if (moves[5][1] == 2){
                    for (int i = 0; i <= 7; i++) {
                        moves[5][i] = 0;
                        moves[i][1] = 0;
                    }
                    moves[6][2] = 0;
                    moves[7][3] = 0;
                    moves[4][2] = 0;
                    moves[3][3] = 0;
                    moves[2][4] = 0;
                    moves[1][5] = 0;
                    moves[0][6] = 0;
                    moves[4][0] = 0;
                    moves[6][0] = 0;
                    moves[5][1] = 0;
                    pC2.setImageResource(R.drawable.beige);
                }
                break;
            }
            case R.id.C3: {
                if (moves[5][2] == 0) {
                    for (int i = 0; i <= 7; i++) {
                        moves[5][i] = 1;
                        moves[i][2] = 1;
                    }
                    moves[6][3] = 1;
                    moves[7][4] = 1;
                    moves[4][1] = 1;
                    moves[4][3] = 1;
                    moves[3][4] = 1;
                    moves[2][5] = 1;
                    moves[1][6] = 1;
                    moves[0][7] = 1;
                    moves[3][0] = 1;
                    moves[7][0] = 1;
                    moves[6][1] = 1;
                    moves[5][2] = 2;
                    pC3.setImageResource(R.drawable.brownwq);

                }
                else if (moves[5][2] == 1) {
                    Toast.makeText(this, "Conflict with prexisting queen!",Toast.LENGTH_LONG).show();
                }
                else if (moves[5][2] == 2){
                    for (int i = 0; i <= 7; i++) {
                        moves[5][i] = 0;
                        moves[i][2] = 0;
                    }
                    moves[6][3] = 0;
                    moves[7][4] = 0;
                    moves[4][1] = 0;
                    moves[4][3] = 0;
                    moves[3][4] = 0;
                    moves[2][5] = 0;
                    moves[1][6] = 0;
                    moves[0][7] = 0;
                    moves[3][0] = 0;
                    moves[7][0] = 0;
                    moves[6][1] = 0;
                    moves[5][2] = 0;
                    pC3.setImageResource(R.drawable.brown);
                }
                break;
            }
            case R.id.C4: {
                if (moves[5][3] == 0) {
                    for (int i = 0; i <= 7; i++) {
                        moves[5][i] = 1;
                        moves[i][3] = 1;
                    }
                    moves[6][4] = 1;
                    moves[7][5] = 1;
                    moves[4][2] = 1;
                    moves[4][4] = 1;
                    moves[3][5] = 1;
                    moves[2][6] = 1;
                    moves[1][7] = 1;
                    moves[2][0] = 1;
                    moves[7][1] = 1;
                    moves[6][2] = 1;
                    moves[3][1] = 1;
                    moves[5][3] = 2;
                    pC4.setImageResource(R.drawable.beigewq);

                }
                else if (moves[5][3] == 1) {
                    Toast.makeText(this, "Conflict with prexisting queen!",Toast.LENGTH_LONG).show();
                }
                else if (moves[5][3] == 2){
                    for (int i = 0; i <= 7; i++) {
                        moves[5][i] = 0;
                        moves[i][3] = 0;
                    }
                    moves[6][4] = 0;
                    moves[7][5] = 0;
                    moves[4][2] = 0;
                    moves[4][4] = 0;
                    moves[3][5] = 0;
                    moves[2][6] = 0;
                    moves[1][7] = 0;
                    moves[2][0] = 0;
                    moves[7][1] = 0;
                    moves[6][2] = 0;
                    moves[3][1] = 0;
                    moves[5][3] = 0;
                    pC4.setImageResource(R.drawable.beige);
                }
                break;
            }
            case R.id.C5: {
                if (moves[5][4] == 0) {
                    for (int i = 0; i <= 7; i++) {
                        moves[5][i] = 1;
                        moves[i][4] = 1;
                    }
                    moves[6][5] = 1;
                    moves[7][6] = 1;
                    moves[4][3] = 1;
                    moves[4][5] = 1;
                    moves[3][6] = 1;
                    moves[2][7] = 1;
                    moves[1][7] = 1;
                    moves[6][3] = 1;
                    moves[1][0] = 1;
                    moves[2][1] = 1;
                    moves[7][2] = 1;
                    moves[3][2] = 1;
                    moves[5][4] = 2;
                    pC5.setImageResource(R.drawable.brownwq);

                }
                else if (moves[5][4] == 1) {
                    Toast.makeText(this, "Conflict with prexisting queen!",Toast.LENGTH_LONG).show();
                }
                else if (moves[5][4] == 2){
                    for (int i = 0; i <= 7; i++) {
                        moves[5][i] = 0;
                        moves[i][4] = 0;
                    }
                    moves[6][5] = 0;
                    moves[7][6] = 0;
                    moves[4][3] = 0;
                    moves[4][5] = 0;
                    moves[3][6] = 0;
                    moves[2][7] = 0;
                    moves[1][7] = 0;
                    moves[6][3] = 0;
                    moves[1][0] = 0;
                    moves[2][1] = 0;
                    moves[7][2] = 0;
                    moves[3][2] = 0;
                    moves[5][4] = 0;
                    pC5.setImageResource(R.drawable.brown);
                }
                break;
            }
            case R.id.C6: {
                if (moves[5][5] == 0) {
                    for (int i = 0; i <= 7; i++) {
                        moves[5][i] = 1;
                        moves[i][5] = 1;
                    }
                    moves[6][6] = 1;
                    moves[7][7] = 1;
                    moves[4][4] = 1;
                    moves[4][6] = 1;
                    moves[3][7] = 1;
                    moves[7][3] = 1;
                    moves[6][4] = 1;
                    moves[3][3] = 1;
                    moves[2][2] = 1;
                    moves[0][0] = 1;
                    moves[1][1] = 1;
                    moves[5][5] = 2;
                    pC6.setImageResource(R.drawable.beigewq);

                }
                else if (moves[5][5] == 1) {
                    Toast.makeText(this, "Conflict with prexisting queen!",Toast.LENGTH_LONG).show();
                }
                else if (moves[5][5] == 2){
                    for (int i = 0; i <= 7; i++) {
                        moves[1][i] = 0;
                        moves[i][5] = 0;
                    }
                    moves[6][6] = 0;
                    moves[7][7] = 0;
                    moves[4][4] = 0;
                    moves[4][6] = 0;
                    moves[3][7] = 0;
                    moves[7][3] = 0;
                    moves[6][4] = 0;
                    moves[3][3] = 0;
                    moves[2][2] = 0;
                    moves[0][0] = 0;
                    moves[1][1] = 0;
                    moves[5][5] = 0;
                    pC6.setImageResource(R.drawable.beige);
                }
                break;
            }
            case R.id.C7: {
                if (moves[5][6] == 0) {
                    for (int i = 0; i <= 7; i++) {
                        moves[5][i] = 1;
                        moves[i][6] = 1;
                    }
                    moves[6][7] = 1;
                    moves[4][7] = 1;
                    moves[6][5] = 1;
                    moves[7][4] = 1;
                    moves[4][5] = 1;
                    moves[3][4] = 1;
                    moves[2][3] = 1;
                    moves[1][2] = 1;
                    moves[0][1] = 1;
                    moves[5][6] = 2;
                    pC7.setImageResource(R.drawable.brownwq);

                }
                else if (moves[5][6] == 1) {
                    Toast.makeText(this, "Conflict with prexisting queen!",Toast.LENGTH_LONG).show();
                }
                else if (moves[5][6] == 2){
                    for (int i = 0; i <= 7; i++) {
                        moves[5][i] = 0;
                        moves[i][6] = 0;
                    }
                    moves[6][7] = 0;
                    moves[4][7] = 0;
                    moves[6][5] = 0;
                    moves[7][4] = 0;
                    moves[4][5] = 0;
                    moves[3][4] = 0;
                    moves[2][3] = 0;
                    moves[1][2] = 0;
                    moves[0][1] = 0;
                    moves[5][6] = 0;
                    pC7.setImageResource(R.drawable.brown);
                }
                break;
            }
            case R.id.C8: {
                if (moves[5][7] == 0) {
                    for (int i = 0; i <= 7; i++) {
                        moves[5][i] = 1;
                        moves[i][7] = 1;
                    }
                    moves[6][6] = 1;
                    moves[7][5] = 1;
                    moves[4][6] = 1;
                    moves[3][5] = 1;
                    moves[2][4] = 1;
                    moves[1][3] = 1;
                    moves[0][2] = 1;
                    moves[5][7] = 2;
                    pC8.setImageResource(R.drawable.beigewq);

                }
                else if (moves[5][7] == 1) {
                    Toast.makeText(this, "Conflict with prexisting queen!",Toast.LENGTH_LONG).show();
                }
                else if (moves[5][7] == 2){
                    for (int i = 0; i <= 7; i++) {
                        moves[5][i] = 0;
                        moves[i][7] = 0;
                    }
                    moves[6][6] = 0;
                    moves[7][5] = 0;
                    moves[4][6] = 0;
                    moves[3][5] = 0;
                    moves[2][4] = 0;
                    moves[1][3] = 0;
                    moves[0][2] = 0;
                    moves[5][7] = 0;
                    pC8.setImageResource(R.drawable.beige);
                }
                break;
            }

            //DONE
                //
                //
                //
            case R.id.D1: {
                if (moves[4][0] == 0) {
                    for (int i = 0; i <= 7; i++) {
                        moves[4][i] = 1;
                        moves[i][0] = 1;
                    }
                    moves[5][1] = 1;
                    moves[6][2] = 1;
                    moves[7][3] = 1;
                    moves[3][1] = 1;
                    moves[2][2] = 1;
                    moves[1][3] = 1;
                    moves[0][4] = 1;
                    moves[4][0] = 2;
                    pD1.setImageResource(R.drawable.beigewq);

                }
                else if (moves[4][0] == 1) {
                    Toast.makeText(this, "Conflict with prexisting queen!",Toast.LENGTH_LONG).show();
                }
                else if (moves[4][0] == 2){
                    for (int i = 0; i <= 7; i++) {
                        moves[4][i] = 0;
                        moves[i][0] = 0;
                    }
                    moves[5][1] = 0;
                    moves[6][2] = 0;
                    moves[7][3] = 0;
                    moves[3][1] = 0;
                    moves[2][2] = 0;
                    moves[1][3] = 0;
                    moves[0][4] = 0;
                    moves[4][0] = 0;
                    pD1.setImageResource(R.drawable.beige);
                }
                break;
            }
            case R.id.D2: {
                if (moves[4][1] == 0) {
                    for (int i = 0; i <= 7; i++) {
                        moves[4][i] = 1;
                        moves[i][1] = 1;
                    }
                    moves[3][0] = 1;
                    moves[5][0] = 1;
                    moves[5][2] = 1;
                    moves[6][3] = 1;
                    moves[7][4] = 1;
                    moves[3][2] = 1;
                    moves[2][3] = 1;
                    moves[1][4] = 1;
                    moves[0][5] = 1;
                    moves[4][1] = 2;
                    pD2.setImageResource(R.drawable.brownwq);

                }
                else if (moves[4][1] == 1) {
                    Toast.makeText(this, "Conflict with prexisting queen!",Toast.LENGTH_LONG).show();
                }
                else if (moves[4][1] == 2){
                    for (int i = 0; i <= 7; i++) {
                        moves[4][i] = 0;
                        moves[i][1] = 0;
                    }
                    moves[3][0] = 0;
                    moves[5][0] = 0;
                    moves[5][2] = 0;
                    moves[6][3] = 0;
                    moves[7][4] = 0;
                    moves[3][2] = 0;
                    moves[2][3] = 0;
                    moves[1][4] = 0;
                    moves[0][5] = 0;
                    moves[4][1] = 0;
                    pD2.setImageResource(R.drawable.brown);
                }
                break;
            }
            case R.id.D3: {
                if (moves[4][2] == 0) {
                    for (int i = 0; i <= 7; i++) {
                        moves[4][i] = 1;
                        moves[i][2] = 1;
                    }
                    moves[2][0] = 1;
                    moves[6][0] = 1;
                    moves[3][1] = 1;
                    moves[5][1] = 1;
                    moves[5][3] = 1;
                    moves[6][4] = 1;
                    moves[7][5] = 1;
                    moves[3][3] = 1;
                    moves[2][4] = 1;
                    moves[1][5] = 1;
                    moves[0][6] = 1;
                    moves[4][2] = 2;
                    pD3.setImageResource(R.drawable.beigewq);

                }
                else if (moves[4][2] == 1) {
                    Toast.makeText(this, "Conflict with prexisting queen!",Toast.LENGTH_LONG).show();
                }
                else if (moves[4][2] == 2){
                    for (int i = 0; i <= 7; i++) {
                        moves[4][i] = 0;
                        moves[i][2] = 0;
                    }
                    moves[2][0] = 0;
                    moves[6][0] = 0;
                    moves[3][1] = 0;
                    moves[5][1] = 0;
                    moves[5][3] = 0;
                    moves[6][4] = 0;
                    moves[7][5] = 0;
                    moves[3][3] = 0;
                    moves[2][4] = 0;
                    moves[1][5] = 0;
                    moves[0][6] = 0;
                    moves[4][2] = 0;
                    pD3.setImageResource(R.drawable.beige);
                }
                break;
            }
            case R.id.D4: {
                if (moves[4][3] == 0) {
                    for (int i = 0; i <= 7; i++) {
                        moves[4][i] = 1;
                        moves[i][3] = 1;
                    }
                    moves[1][0] = 1;
                    moves[7][0] = 1;
                    moves[2][1] = 1;
                    moves[6][1] = 1;
                    moves[3][2] = 1;
                    moves[5][2] = 1;
                    moves[5][4] = 1;
                    moves[6][5] = 1;
                    moves[7][6] = 1;
                    moves[3][4] = 1;
                    moves[2][5] = 1;
                    moves[1][6] = 1;
                    moves[0][7] = 1;
                    moves[4][3] = 2;
                    pD4.setImageResource(R.drawable.brownwq);

                }
                else if (moves[4][3] == 1) {
                    Toast.makeText(this, "Conflict with prexisting queen!",Toast.LENGTH_LONG).show();
                }
                else if (moves[4][3] == 2){
                    for (int i = 0; i <= 7; i++) {
                        moves[4][i] = 0;
                        moves[i][3] = 0;
                    }
                    moves[1][0] = 0;
                    moves[7][0] = 0;
                    moves[2][1] = 0;
                    moves[6][1] = 0;
                    moves[3][2] = 0;
                    moves[5][2] = 0;
                    moves[5][4] = 0;
                    moves[6][5] = 0;
                    moves[7][6] = 0;
                    moves[3][4] = 0;
                    moves[2][5] = 0;
                    moves[1][6] = 0;
                    moves[0][7] = 0;
                    moves[4][3] = 0;
                    pD4.setImageResource(R.drawable.brown);
                }
                break;
            }
            case R.id.D5: {
                if (moves[4][4] == 0) {
                    for (int i = 0; i <= 7; i++) {
                        moves[4][i] = 1;
                        moves[i][4] = 1;
                    }
                    moves[0][0] = 1;
                    moves[7][1] = 1;
                    moves[1][1] = 1;
                    moves[6][2] = 1;
                    moves[2][2] = 1;
                    moves[5][3] = 1;
                    moves[3][3] = 1;
                    moves[5][5] = 1;
                    moves[6][6] = 1;
                    moves[7][7] = 1;
                    moves[3][5] = 1;
                    moves[2][6] = 1;
                    moves[1][7] = 1;
                    moves[4][4] = 2;
                    pD5.setImageResource(R.drawable.beigewq);

                }
                else if (moves[4][4] == 1) {
                    Toast.makeText(this, "Conflict with prexisting queen!",Toast.LENGTH_LONG).show();
                }
                else if (moves[4][4] == 2){
                    for (int i = 0; i <= 7; i++) {
                        moves[4][i] = 0;
                        moves[i][4] = 0;
                    }
                    moves[0][0] = 0;
                    moves[7][1] = 0;
                    moves[1][1] = 0;
                    moves[6][2] = 0;
                    moves[2][2] = 0;
                    moves[5][3] = 0;
                    moves[3][3] = 0;
                    moves[5][5] = 0;
                    moves[6][6] = 0;
                    moves[7][7] = 0;
                    moves[3][5] = 0;
                    moves[2][6] = 0;
                    moves[1][7] = 0;
                    moves[4][4] = 0;
                    pD5.setImageResource(R.drawable.beige);
                }
                break;
            }
            case R.id.D6: {
                if (moves[4][5] == 0) {
                    for (int i = 0; i <= 7; i++) {
                        moves[4][i] = 1;
                        moves[i][5] = 1;
                    }
                    moves[0][1] = 1;
                    moves[7][2] = 1;
                    moves[1][2] = 1;
                    moves[6][3] = 1;
                    moves[2][3] = 1;
                    moves[5][4] = 1;
                    moves[3][4] = 1;
                    moves[5][6] = 1;
                    moves[6][7] = 1;
                    moves[3][6] = 1;
                    moves[2][7] = 1;
                    moves[4][5] = 2;
                    pD6.setImageResource(R.drawable.brownwq);

                }
                else if (moves[4][5] == 1) {
                    Toast.makeText(this, "Conflict with prexisting queen!",Toast.LENGTH_LONG).show();
                }
                else if (moves[4][5] == 2){
                    for (int i = 0; i <= 7; i++) {
                        moves[4][i] = 0;
                        moves[i][5] = 0;
                    }
                    moves[0][1] = 0;
                    moves[7][2] = 0;
                    moves[1][2] = 0;
                    moves[6][3] = 0;
                    moves[2][3] = 0;
                    moves[5][4] = 0;
                    moves[3][4] = 0;
                    moves[5][6] = 0;
                    moves[6][7] = 0;
                    moves[3][6] = 0;
                    moves[2][7] = 0;
                    moves[4][5] = 0;
                    pD6.setImageResource(R.drawable.brown);
                }
                break;
            }
            case R.id.D7: {
                if (moves[4][6] == 0) {
                    for (int i = 0; i <= 7; i++) {
                        moves[4][i] = 1;
                        moves[i][6] = 1;
                    }
                    moves[0][2] = 1;
                    moves[7][3] = 1;
                    moves[1][3] = 1;
                    moves[6][4] = 1;
                    moves[2][4] = 1;
                    moves[5][5] = 1;
                    moves[3][5] = 1;
                    moves[5][7] = 1;
                    moves[3][7] = 1;
                    moves[4][6] = 2;
                    pD7.setImageResource(R.drawable.beigewq);

                }
                else if (moves[4][6] == 1) {
                    Toast.makeText(this, "Conflict with prexisting queen!",Toast.LENGTH_LONG).show();
                }
                else if (moves[4][6] == 2){
                    for (int i = 0; i <= 7; i++) {
                        moves[4][i] = 0;
                        moves[i][6] = 0;
                    }
                    moves[0][2] = 0;
                    moves[7][3] = 0;
                    moves[1][3] = 0;
                    moves[6][4] = 0;
                    moves[2][4] = 0;
                    moves[5][5] = 0;
                    moves[3][5] = 0;
                    moves[5][7] = 0;
                    moves[3][7] = 0;
                    moves[4][6] = 0;
                    pD7.setImageResource(R.drawable.beige);
                }
                break;
            }
            case R.id.D8: {
                if (moves[4][7] == 0) {
                    for (int i = 0; i <= 7; i++) {
                        moves[4][i] = 1;
                        moves[i][7] = 1;
                    }
                    moves[0][3] = 1;
                    moves[7][4] = 1;
                    moves[1][4] = 1;
                    moves[6][5] = 1;
                    moves[2][5] = 1;
                    moves[5][6] = 1;
                    moves[3][6] = 1;
                    moves[4][7] = 2;
                    pD8.setImageResource(R.drawable.brownwq);

                }
                else if (moves[4][7] == 1) {
                    Toast.makeText(this, "Conflict with prexisting queen!",Toast.LENGTH_LONG).show();
                }
                else if (moves[4][7] == 2){
                    for (int i = 0; i <= 7; i++) {
                        moves[4][i] = 0;
                        moves[i][7] = 0;
                    }
                    moves[0][3] = 0;
                    moves[7][4] = 0;
                    moves[1][4] = 0;
                    moves[6][5] = 0;
                    moves[2][5] = 0;
                    moves[5][6] = 0;
                    moves[3][6] = 0;
                    moves[4][7] = 0;
                    pD8.setImageResource(R.drawable.brown);
                }
                break;
            }
            //DONE
                //
                //
                //

            case R.id.E1: {
                if (moves[3][0] == 0) {
                    for (int i = 0; i <= 7; i++) {
                        moves[3][i] = 1;
                        moves[i][0] = 1;
                    }
                    moves[2][1] = 1;
                    moves[1][2] = 1;
                    moves[0][3] = 1;
                    moves[4][1] = 1;
                    moves[5][2] = 1;
                    moves[6][3] = 1;
                    moves[7][4] = 1;
                    moves[3][0] = 2;
                    pE1.setImageResource(R.drawable.brownwq);

                }
                else if (moves[3][0] == 1) {
                    Toast.makeText(this, "Conflict with prexisting queen!",Toast.LENGTH_LONG).show();
                }
                else if (moves[3][0] == 2){
                    for (int i = 0; i <= 7; i++) {
                        moves[3][i] = 0;
                        moves[i][0] = 0;
                    }
                    moves[2][1] = 0;
                    moves[1][2] = 0;
                    moves[0][3] = 0;
                    moves[4][1] = 0;
                    moves[5][2] = 0;
                    moves[6][3] = 0;
                    moves[7][4] = 0;
                    moves[3][0] = 0;
                    pE1.setImageResource(R.drawable.brown);
                }
                break;
            }
            case R.id.E2: {
                if (moves[3][1] == 0) {
                    for (int i = 0; i <= 7; i++) {
                        moves[3][i] = 1;
                        moves[i][1] = 1;
                    }
                    moves[2][0] = 1;
                    moves[4][0] = 1;
                    moves[2][2] = 1;
                    moves[1][3] = 1;
                    moves[0][4] = 1;
                    moves[4][2] = 1;
                    moves[5][3] = 1;
                    moves[6][4] = 1;
                    moves[7][5] = 1;
                    moves[3][1] = 2;
                    pE2.setImageResource(R.drawable.beigewq);

                }
                else if (moves[3][1] == 1) {
                    Toast.makeText(this, "Conflict with prexisting queen!",Toast.LENGTH_LONG).show();
                }
                else if (moves[3][1] == 2){
                    for (int i = 0; i <= 7; i++) {
                        moves[3][i] = 0;
                        moves[i][1] = 0;
                    }
                    moves[2][0] = 0;
                    moves[4][0] = 0;
                    moves[2][2] = 0;
                    moves[1][3] = 0;
                    moves[0][4] = 0;
                    moves[4][2] = 0;
                    moves[5][3] = 0;
                    moves[6][4] = 0;
                    moves[7][5] = 0;
                    moves[3][1] = 0;
                    pE2.setImageResource(R.drawable.beige);
                }
                break;
            }
            case R.id.E3: {
                if (moves[3][2] == 0) {
                    for (int i = 0; i <= 7; i++) {
                        moves[3][i] = 1;
                        moves[i][2] = 1;
                    }
                    moves[1][0] = 1;
                    moves[5][0] = 1;
                    moves[2][1] = 1;
                    moves[4][1] = 1;
                    moves[2][3] = 1;
                    moves[1][4] = 1;
                    moves[0][5] = 1;
                    moves[4][3] = 1;
                    moves[5][4] = 1;
                    moves[6][5] = 1;
                    moves[7][6] = 1;
                    moves[3][2] = 2;
                    pE3.setImageResource(R.drawable.brownwq);

                }
                else if (moves[3][2] == 1) {
                    Toast.makeText(this, "Conflict with prexisting queen!",Toast.LENGTH_LONG).show();
                }
                else if (moves[3][2] == 2){
                    for (int i = 0; i <= 7; i++) {
                        moves[3][i] = 0;
                        moves[i][2] = 0;
                    }
                    moves[1][0] = 0;
                    moves[5][0] = 0;
                    moves[2][1] = 0;
                    moves[4][1] = 0;
                    moves[2][3] = 0;
                    moves[1][4] = 0;
                    moves[0][5] = 0;
                    moves[4][3] = 0;
                    moves[5][4] = 0;
                    moves[6][5] = 0;
                    moves[7][6] = 0;
                    moves[3][2] = 0;
                    pE3.setImageResource(R.drawable.brown);
                }
                break;
            }
            case R.id.E4: {
                if (moves[3][3] == 0) {
                    for (int i = 0; i <= 7; i++) {
                        moves[3][i] = 1;
                        moves[i][3] = 1;
                    }
                    moves[0][0] = 1;
                    moves[6][0] = 1;
                    moves[1][1] = 1;
                    moves[5][1] = 1;
                    moves[2][2] = 1;
                    moves[4][2] = 1;
                    moves[2][4] = 1;
                    moves[1][5] = 1;
                    moves[0][6] = 1;
                    moves[4][4] = 1;
                    moves[5][5] = 1;
                    moves[6][6] = 1;
                    moves[7][7] = 1;
                    moves[3][3] = 2;
                    pE4.setImageResource(R.drawable.beigewq);

                }
                else if (moves[3][3] == 1) {
                    Toast.makeText(this, "Conflict with prexisting queen!",Toast.LENGTH_LONG).show();
                }
                else if (moves[3][3] == 2){
                    for (int i = 0; i <= 7; i++) {
                        moves[3][i] = 0;
                        moves[i][3] = 0;
                    }
                    moves[0][0] = 0;
                    moves[6][0] = 0;
                    moves[1][1] = 0;
                    moves[5][1] = 0;
                    moves[2][2] = 0;
                    moves[4][2] = 0;
                    moves[2][4] = 0;
                    moves[1][5] = 0;
                    moves[0][6] = 0;
                    moves[4][4] = 0;
                    moves[5][5] = 0;
                    moves[6][6] = 0;
                    moves[7][7] = 0;
                    moves[3][3] = 0;
                    pE4.setImageResource(R.drawable.beige);
                }
                break;
            }
            case R.id.E5: {
                if (moves[3][4] == 0) {
                    for (int i = 0; i <= 7; i++) {
                        moves[3][i] = 1;
                        moves[i][4] = 1;
                    }
                    moves[0][1] = 1;
                    moves[7][0] = 1;
                    moves[1][2] = 1;
                    moves[6][1] = 1;
                    moves[2][3] = 1;
                    moves[5][2] = 1;
                    moves[4][3] = 1;
                    moves[2][5] = 1;
                    moves[1][6] = 1;
                    moves[0][7] = 1;
                    moves[4][5] = 1;
                    moves[5][6] = 1;
                    moves[6][7] = 1;
                    moves[3][4] = 2;
                    pE5.setImageResource(R.drawable.brownwq);

                }
                else if (moves[3][4] == 1) {
                    Toast.makeText(this, "Conflict with prexisting queen!",Toast.LENGTH_LONG).show();
                }
                else if (moves[3][4] == 2){
                    for (int i = 0; i <= 7; i++) {
                        moves[3][i] = 0;
                        moves[i][4] = 0;
                    }
                    moves[0][1] = 0;
                    moves[7][0] = 0;
                    moves[1][2] = 0;
                    moves[6][1] = 0;
                    moves[2][3] = 0;
                    moves[5][2] = 0;
                    moves[4][3] = 0;
                    moves[2][5] = 0;
                    moves[1][6] = 0;
                    moves[0][7] = 0;
                    moves[4][5] = 0;
                    moves[5][6] = 0;
                    moves[6][7] = 0;
                    moves[3][4] = 0;
                    pE5.setImageResource(R.drawable.brown);
                }
                break;
            }
            case R.id.E6: {
                if (moves[3][5] == 0) {
                    for (int i = 0; i <= 7; i++) {
                        moves[3][i] = 1;
                        moves[i][5] = 1;
                    }
                    moves[0][2] = 1;
                    moves[7][1] = 1;
                    moves[1][3] = 1;
                    moves[6][2] = 1;
                    moves[2][4] = 1;
                    moves[5][3] = 1;
                    moves[4][4] = 1;
                    moves[2][6] = 1;
                    moves[1][7] = 1;
                    moves[4][6] = 1;
                    moves[5][7] = 1;
                    moves[3][5] = 2;
                    pE6.setImageResource(R.drawable.beigewq);

                }
                else if (moves[3][5] == 1) {
                    Toast.makeText(this, "Conflict with prexisting queen!",Toast.LENGTH_LONG).show();
                }
                else if (moves[3][5] == 2){
                    for (int i = 0; i <= 7; i++) {
                        moves[3][i] = 0;
                        moves[i][5] = 0;
                    }
                    moves[0][2] = 0;
                    moves[7][1] = 0;
                    moves[1][3] = 0;
                    moves[6][2] = 0;
                    moves[2][4] = 0;
                    moves[5][3] = 0;
                    moves[4][4] = 0;
                    moves[2][6] = 0;
                    moves[1][7] = 0;
                    moves[4][6] = 0;
                    moves[5][7] = 0;
                    moves[3][5] = 0;
                    pE6.setImageResource(R.drawable.beige);
                }
                break;
            }
            case R.id.E7: {
                if (moves[3][6] == 0) {
                    for (int i = 0; i <= 7; i++) {
                        moves[3][i] = 1;
                        moves[i][6] = 1;
                    }
                    moves[0][3] = 1;
                    moves[7][2] = 1;
                    moves[1][4] = 1;
                    moves[6][3] = 1;
                    moves[2][5] = 1;
                    moves[5][4] = 1;
                    moves[4][5] = 1;
                    moves[2][7] = 1;
                    moves[4][7] = 1;
                    moves[3][6] = 2;
                    pE7.setImageResource(R.drawable.brownwq);

                }
                else if (moves[3][6] == 1) {
                    Toast.makeText(this, "Conflict with prexisting queen!",Toast.LENGTH_LONG).show();
                }
                else if (moves[3][6] == 2){
                    for (int i = 0; i <= 7; i++) {
                        moves[3][i] = 0;
                        moves[i][6] = 0;
                    }
                    moves[0][3] = 0;
                    moves[7][2] = 0;
                    moves[1][4] = 0;
                    moves[6][3] = 0;
                    moves[2][5] = 0;
                    moves[5][4] = 0;
                    moves[4][5] = 0;
                    moves[2][7] = 0;
                    moves[4][7] = 0;
                    moves[3][6] = 0;
                    pE7.setImageResource(R.drawable.brown);
                }
                break;
            }
            case R.id.E8: {
                if (moves[3][7] == 0) {
                    for (int i = 0; i <= 7; i++) {
                        moves[3][i] = 1;
                        moves[i][7] = 1;
                    }
                    moves[0][4] = 1;
                    moves[7][3] = 1;
                    moves[1][5] = 1;
                    moves[6][4] = 1;
                    moves[2][6] = 1;
                    moves[5][5] = 1;
                    moves[4][6] = 1;
                    moves[3][7] = 2;
                    pE8.setImageResource(R.drawable.beigewq);

                }
                else if (moves[3][7] == 1) {
                    Toast.makeText(this, "Conflict with prexisting queen!",Toast.LENGTH_LONG).show();
                }
                else if (moves[3][7] == 2){
                    for (int i = 0; i <= 7; i++) {
                        moves[3][i] = 0;
                        moves[i][7] = 0;
                    }
                    moves[0][4] = 0;
                    moves[7][3] = 0;
                    moves[1][5] = 0;
                    moves[6][4] = 0;
                    moves[2][6] = 0;
                    moves[5][5] = 0;
                    moves[4][6] = 0;
                    moves[3][7] = 0;
                    pE8.setImageResource(R.drawable.beige);
                }
                break;
            }

            //DONE
                //
                //
                //

            case R.id.F1: {
                if (moves[2][0] == 0) {
                    for (int i = 0; i <= 7; i++) {
                        moves[2][i] = 1;
                        moves[i][0] = 1;
                    }
                    moves[0][2] = 1;
                    moves[1][1] = 1;
                    moves[3][1] = 1;
                    moves[4][2] = 1;
                    moves[5][3] = 1;
                    moves[6][4] = 1;
                    moves[7][5] = 1;
                    moves[2][0] = 2;
                    pF1.setImageResource(R.drawable.beigewq);

                }
                else if (moves[2][0] == 1) {
                    Toast.makeText(this, "Conflict with prexisting queen!",Toast.LENGTH_LONG).show();
                }
                else if (moves[2][0] == 2){
                    for (int i = 0; i <= 7; i++) {
                        moves[2][i] = 0;
                        moves[i][0] = 0;
                    }
                    moves[0][2] = 0;
                    moves[1][1] = 0;
                    moves[3][1] = 0;
                    moves[4][2] = 0;
                    moves[5][3] = 0;
                    moves[6][4] = 0;
                    moves[7][5] = 0;
                    moves[2][0] = 0;
                    pF1.setImageResource(R.drawable.beige);
                }
                break;
            }
            case R.id.F2: {
                if (moves[2][1] == 0) {
                    for (int i = 0; i <= 7; i++) {
                        moves[2][i] = 1;
                        moves[i][1] = 1;
                    }
                    moves[0][3] = 1;
                    moves[1][2] = 1;
                    moves[3][0] = 1;
                    moves[4][3] = 1;
                    moves[5][4] = 1;
                    moves[6][5] = 1;
                    moves[7][6] = 1;
                    moves[3][2] = 1;
                    moves[1][0] = 1;
                    moves[2][1] = 2;
                    pF2.setImageResource(R.drawable.brownwq);

                }
                else if (moves[2][1] == 1) {
                    Toast.makeText(this, "Conflict with prexisting queen!",Toast.LENGTH_LONG).show();
                }
                else if (moves[2][1] == 2){
                    for (int i = 0; i <= 7; i++) {
                        moves[2][i] = 0;
                        moves[i][1] = 0;
                    }
                    moves[0][3] = 0;
                    moves[1][2] = 0;
                    moves[3][0] = 0;
                    moves[4][3] = 0;
                    moves[5][4] = 0;
                    moves[6][5] = 0;
                    moves[7][6] = 0;
                    moves[3][2] = 0;
                    moves[1][0] = 0;
                    moves[2][1] = 0;
                    pF2.setImageResource(R.drawable.brown);
                }
                break;
            }
            case R.id.F3: {
                if (moves[2][2] == 0) {
                    for (int i = 0; i <= 7; i++) {
                        moves[2][i] = 1;
                        moves[i][2] = 1;
                    }
                    moves[0][0] = 1;
                    moves[1][1] = 1;
                    moves[3][1] = 1;
                    moves[4][0] = 1;
                    moves[3][3] = 1;
                    moves[4][4] = 1;
                    moves[5][5] = 1;
                    moves[6][6] = 1;
                    moves[7][7] = 1;
                    moves[1][3] = 1;
                    moves[0][4] = 1;
                    moves[2][2] = 2;
                    pF3.setImageResource(R.drawable.beigewq);

                }
                else if (moves[2][2] == 1) {
                    Toast.makeText(this, "Conflict with prexisting queen!",Toast.LENGTH_LONG).show();
                }
                else if (moves[2][2] == 2){
                    for (int i = 0; i <= 7; i++) {
                        moves[2][i] = 0;
                        moves[i][2] = 0;
                    }
                    moves[0][0] = 0;
                    moves[1][1] = 0;
                    moves[3][1] = 0;
                    moves[4][0] = 0;
                    moves[3][3] = 0;
                    moves[4][4] = 0;
                    moves[5][5] = 0;
                    moves[6][6] = 0;
                    moves[7][7] = 0;
                    moves[1][3] = 0;
                    moves[0][4] = 0;
                    moves[2][2] = 0;
                    pF3.setImageResource(R.drawable.beige);
                }
                break;
            }
            case R.id.F4: {
                if (moves[2][3] == 0) {
                    for (int i = 0; i <= 7; i++) {
                        moves[2][i] = 1;
                        moves[i][3] = 1;
                    }
                    moves[0][1] = 1;
                    moves[1][2] = 1;
                    moves[5][0] = 1;
                    moves[4][1] = 1;
                    moves[3][2] = 1;
                    moves[1][4] = 1;
                    moves[0][5] = 1;
                    moves[3][4] = 1;
                    moves[4][5] = 1;
                    moves[5][6] = 1;
                    moves[6][7] = 1;
                    moves[2][3] = 2;
                    pF4.setImageResource(R.drawable.brownwq);

                }
                else if (moves[2][3] == 1) {
                    Toast.makeText(this, "Conflict with prexisting queen!",Toast.LENGTH_LONG).show();
                }
                else if (moves[2][3] == 2){
                    for (int i = 0; i <= 7; i++) {
                        moves[2][i] = 0;
                        moves[i][3] = 0;
                    }
                    moves[0][1] = 0;
                    moves[1][2] = 0;
                    moves[5][0] = 0;
                    moves[4][1] = 0;
                    moves[3][2] = 0;
                    moves[1][4] = 0;
                    moves[0][5] = 0;
                    moves[3][4] = 0;
                    moves[4][5] = 0;
                    moves[5][6] = 0;
                    moves[6][7] = 0;
                    moves[2][3] = 0;
                    pF4.setImageResource(R.drawable.brown);
                }
                break;
            }
            case R.id.F5: {
                if (moves[2][4] == 0) {
                    for (int i = 0; i <= 7; i++) {
                        moves[2][i] = 1;
                        moves[i][4] = 1;
                    }
                    moves[0][2] = 1;
                    moves[1][3] = 1;
                    moves[6][0] = 1;
                    moves[5][1] = 1;
                    moves[4][2] = 1;
                    moves[1][5] = 1;
                    moves[0][6] = 1;
                    moves[3][3] = 1;
                    moves[3][5] = 1;
                    moves[4][6] = 1;
                    moves[5][7] = 1;
                    moves[2][4] = 2;
                    pF5.setImageResource(R.drawable.beigewq);

                }
                else if (moves[2][4] == 1) {
                    Toast.makeText(this, "Conflict with prexisting queen!",Toast.LENGTH_LONG).show();
                }
                else if (moves[2][4] == 2){
                    for (int i = 0; i <= 7; i++) {
                        moves[2][i] = 0;
                        moves[i][4] = 0;
                    }
                    moves[0][2] = 0;
                    moves[1][3] = 0;
                    moves[6][0] = 0;
                    moves[5][1] = 0;
                    moves[4][2] = 0;
                    moves[1][5] = 0;
                    moves[0][6] = 0;
                    moves[3][3] = 0;
                    moves[3][5] = 0;
                    moves[4][6] = 0;
                    moves[5][7] = 0;
                    moves[2][4] = 0;
                    pF5.setImageResource(R.drawable.beige);
                }
                break;
            }
            case R.id.F6: {
                if (moves[2][5] == 0) {
                    for (int i = 0; i <= 7; i++) {
                        moves[2][i] = 1;
                        moves[i][5] = 1;
                    }
                    moves[0][3] = 1;
                    moves[1][4] = 1;
                    moves[7][0] = 1;
                    moves[6][1] = 1;
                    moves[5][2] = 1;
                    moves[1][6] = 1;
                    moves[0][7] = 1;
                    moves[4][3] = 1;
                    moves[3][4] = 1;
                    moves[3][6] = 1;
                    moves[4][7] = 1;
                    moves[2][5] = 2;
                    pF6.setImageResource(R.drawable.brownwq);

                }
                else if (moves[2][5] == 1) {
                    Toast.makeText(this, "Conflict with prexisting queen!",Toast.LENGTH_LONG).show();
                }
                else if (moves[2][5] == 2){
                    for (int i = 0; i <= 7; i++) {
                        moves[2][i] = 0;
                        moves[i][5] = 0;
                    }
                    moves[0][3] = 0;
                    moves[1][4] = 0;
                    moves[7][0] = 0;
                    moves[6][1] = 0;
                    moves[5][2] = 0;
                    moves[1][6] = 0;
                    moves[0][7] = 0;
                    moves[4][3] = 0;
                    moves[3][4] = 0;
                    moves[3][6] = 0;
                    moves[4][7] = 0;
                    moves[2][5] = 0;
                    pF6.setImageResource(R.drawable.brown);
                }
                break;
            }
            case R.id.F7: {
                if (moves[2][6] == 0) {
                    for (int i = 0; i <= 7; i++) {
                        moves[2][i] = 1;
                        moves[i][6] = 1;
                    }
                    moves[0][4] = 1;
                    moves[1][5] = 1;
                    moves[7][1] = 1;
                    moves[6][2] = 1;
                    moves[5][3] = 1;
                    moves[1][7] = 1;
                    moves[4][4] = 1;
                    moves[3][5] = 1;
                    moves[3][7] = 1;
                    moves[2][6] = 2;
                    pF7.setImageResource(R.drawable.beigewq);

                }
                else if (moves[2][6] == 1) {
                    Toast.makeText(this, "Conflict with prexisting queen!",Toast.LENGTH_LONG).show();
                }
                else if (moves[2][6] == 2){
                    for (int i = 0; i <= 7; i++) {
                        moves[2][i] = 0;
                        moves[i][6] = 0;
                    }
                    moves[0][4] = 0;
                    moves[1][5] = 0;
                    moves[7][1] = 0;
                    moves[6][2] = 0;
                    moves[5][3] = 0;
                    moves[1][7] = 0;
                    moves[4][4] = 0;
                    moves[3][5] = 0;
                    moves[3][7] = 0;
                    moves[2][6] = 0;
                    pF7.setImageResource(R.drawable.beige);
                }
                break;
            }
            case R.id.F8: {
                if (moves[2][7] == 0) {
                    for (int i = 0; i <= 7; i++) {
                        moves[2][i] = 1;
                        moves[i][7] = 1;
                    }
                    moves[0][5] = 1;
                    moves[1][6] = 1;
                    moves[7][2] = 1;
                    moves[6][3] = 1;
                    moves[5][4] = 1;
                    moves[4][5] = 1;
                    moves[3][6] = 1;
                    moves[2][7] = 2;
                    pF8.setImageResource(R.drawable.brownwq);

                }
                else if (moves[2][7] == 1) {
                    Toast.makeText(this, "Conflict with prexisting queen!",Toast.LENGTH_LONG).show();
                }
                else if (moves[2][7] == 2){
                    for (int i = 0; i <= 7; i++) {
                        moves[2][i] = 0;
                        moves[i][7] = 0;
                    }
                    moves[0][5] = 0;
                    moves[1][6] = 0;
                    moves[7][2] = 0;
                    moves[6][3] = 0;
                    moves[5][4] = 0;
                    moves[4][5] = 0;
                    moves[3][6] = 0;
                    moves[2][7] = 0;
                    pF8.setImageResource(R.drawable.brown);
                }
                break;
            }
//DONE
                //
                //
                //

            case R.id.G1: {
                if (moves[1][0] == 0) {
                    for (int i = 0; i <= 7; i++) {
                        moves[1][i] = 1;
                        moves[i][0] = 1;
                    }
                    moves[0][1] = 1;
                    moves[2][1] = 1;
                    moves[3][2] = 1;
                    moves[4][3] = 1;
                    moves[5][4] = 1;
                    moves[6][5] = 1;
                    moves[7][6] = 1;
                    moves[1][0] = 2;
                    pG1.setImageResource(R.drawable.brownwq);

                }
                else if (moves[1][0] == 1) {
                    Toast.makeText(this, "Conflict with prexisting queen!",Toast.LENGTH_LONG).show();
                }
                else if (moves[1][0] == 2){
                    for (int i = 0; i <= 7; i++) {
                        moves[1][i] = 0;
                        moves[i][0] = 0;
                    }
                    moves[0][1] = 0;
                    moves[2][1] = 0;
                    moves[3][2] = 0;
                    moves[4][3] = 0;
                    moves[5][4] = 0;
                    moves[6][5] = 0;
                    moves[7][6] = 0;
                    moves[0][0] = 0;
                    pG1.setImageResource(R.drawable.brown);
                }
                break;
            }
            case R.id.G2: {
                if (moves[1][1] == 0) {
                    for (int i = 0; i <= 7; i++) {
                        moves[1][i] = 1;
                        moves[i][1] = 1;
                    }
                    moves[0][0] = 1;
                    moves[2][2] = 1;
                    moves[3][3] = 1;
                    moves[4][4] = 1;
                    moves[5][5] = 1;
                    moves[6][6] = 1;
                    moves[7][7] = 1;
                    moves[0][2] = 1;
                    moves[2][0] = 1;
                    moves[1][1] = 2;
                    pG2.setImageResource(R.drawable.beigewq);

                }
                else if (moves[1][1] == 1) {
                    Toast.makeText(this, "Conflict with prexisting queen!",Toast.LENGTH_LONG).show();
                }
                else if (moves[1][1] == 2){
                    for (int i = 0; i <= 7; i++) {
                        moves[1][i] = 0;
                        moves[i][1] = 0;
                    }
                    moves[0][0] = 0;
                    moves[2][2] = 0;
                    moves[3][3] = 0;
                    moves[4][4] = 0;
                    moves[5][5] = 0;
                    moves[6][6] = 0;
                    moves[7][7] = 0;
                    moves[0][2] = 0;
                    moves[2][0] = 0;
                    moves[1][1] = 0;
                    pG2.setImageResource(R.drawable.beige);
                }
                break;
            }
            case R.id.G3: {
                if (moves[1][2] == 0) {
                    for (int i = 0; i <= 7; i++) {
                        moves[1][i] = 1;
                        moves[i][2] = 1;
                    }
                    moves[0][1] = 1;
                    moves[2][1] = 1;
                    moves[3][0] = 1;
                    moves[0][3] = 1;
                    moves[2][3] = 1;
                    moves[3][4] = 1;
                    moves[4][5] = 1;
                    moves[5][6] = 1;
                    moves[6][7] = 1;
                    moves[1][2] = 2;
                    pG3.setImageResource(R.drawable.brownwq);

                }
                else if (moves[1][2] == 1) {
                    Toast.makeText(this, "Conflict with prexisting queen!",Toast.LENGTH_LONG).show();
                }
                else if (moves[1][2] == 2){
                    for (int i = 0; i <= 7; i++) {
                        moves[1][i] = 0;
                        moves[i][2] = 0;
                    }
                    moves[0][1] = 0;
                    moves[2][1] = 0;
                    moves[3][0] = 0;
                    moves[0][3] = 0;
                    moves[2][3] = 0;
                    moves[3][4] = 0;
                    moves[4][5] = 0;
                    moves[5][6] = 0;
                    moves[6][7] = 0;
                    moves[1][2] = 0;
                    pG3.setImageResource(R.drawable.brown);
                }
                break;
            }
            case R.id.G4: {
                if (moves[1][3] == 0) {
                    for (int i = 0; i <= 7; i++) {
                        moves[1][i] = 1;
                        moves[i][3] = 1;
                    }
                    moves[4][0] = 1;
                    moves[3][1] = 1;
                    moves[2][2] = 1;
                    moves[0][4] = 1;
                    moves[0][2] = 1;
                    moves[2][4] = 1;
                    moves[3][5] = 1;
                    moves[4][6] = 1;
                    moves[5][7] = 1;
                    moves[1][3] = 2;
                    pG4.setImageResource(R.drawable.beigewq);

                }
                else if (moves[1][3] == 1) {
                    Toast.makeText(this, "Conflict with prexisting queen!",Toast.LENGTH_LONG).show();
                }
                else if (moves[1][3] == 2){
                    for (int i = 0; i <= 7; i++) {
                        moves[1][i] = 0;
                        moves[i][3] = 0;
                    }
                    moves[4][0] = 0;
                    moves[3][1] = 0;
                    moves[2][2] = 0;
                    moves[0][2] = 0;
                    moves[0][4] = 0;
                    moves[2][4] = 0;
                    moves[3][5] = 0;
                    moves[4][6] = 0;
                    moves[5][7] = 0;
                    moves[1][3] = 0;
                    pG4.setImageResource(R.drawable.beige);
                }
                break;
            }
            case R.id.G5: {
                if (moves[1][4] == 0) {
                    for (int i = 0; i <= 7; i++) {
                        moves[1][i] = 1;
                        moves[i][4] = 1;
                    }
                    moves[5][0] = 1;
                    moves[4][1] = 1;
                    moves[3][2] = 1;
                    moves[2][3] = 1;
                    moves[0][3] = 1;
                    moves[0][5] = 1;
                    moves[2][5] = 1;
                    moves[3][6] = 1;
                    moves[4][7] = 1;
                    moves[1][4] = 2;
                    pG5.setImageResource(R.drawable.brownwq);

                }
                else if (moves[1][4] == 1) {
                    Toast.makeText(this, "Conflict with prexisting queen!",Toast.LENGTH_LONG).show();
                }
                else if (moves[1][4] == 2){
                    for (int i = 0; i <= 7; i++) {
                        moves[1][i] = 0;
                        moves[i][4] = 0;
                    }
                    moves[5][0] = 0;
                    moves[4][1] = 0;
                    moves[3][2] = 0;
                    moves[2][3] = 0;
                    moves[0][3] = 0;
                    moves[0][5] = 0;
                    moves[2][5] = 0;
                    moves[3][6] = 0;
                    moves[4][7] = 0;
                    moves[1][4] = 0;
                    pG5.setImageResource(R.drawable.brown);
                }
                break;
            }
            case R.id.G6: {
                if (moves[1][5] == 0) {
                    for (int i = 0; i <= 7; i++) {
                        moves[1][i] = 1;
                        moves[i][5] = 1;
                    }
                    moves[6][0] = 1;
                    moves[5][1] = 1;
                    moves[4][2] = 1;
                    moves[3][3] = 1;
                    moves[0][4] = 1;
                    moves[0][6] = 1;
                    moves[2][4] = 1;
                    moves[2][6] = 1;
                    moves[3][7] = 1;
                    moves[1][5] = 2;
                    pG6.setImageResource(R.drawable.beigewq);

                }
                else if (moves[1][5] == 1) {
                    Toast.makeText(this, "Conflict with prexisting queen!",Toast.LENGTH_LONG).show();
                }
                else if (moves[1][5] == 2){
                    for (int i = 0; i <= 7; i++) {
                        moves[1][i] = 0;
                        moves[i][5] = 0;
                    }
                    moves[6][0] = 0;
                    moves[5][1] = 0;
                    moves[4][2] = 0;
                    moves[3][3] = 0;
                    moves[0][4] = 0;
                    moves[0][6] = 0;
                    moves[2][4] = 0;
                    moves[2][6] = 0;
                    moves[3][7] = 0;
                    moves[1][5] = 0;
                    pG6.setImageResource(R.drawable.beige);
                }
                break;
            }
            case R.id.G7: {
                if (moves[1][6] == 0) {
                    for (int i = 0; i <= 7; i++) {
                        moves[1][i] = 1;
                        moves[i][6] = 1;
                    }
                    moves[7][0] = 1;
                    moves[6][1] = 1;
                    moves[5][2] = 1;
                    moves[4][3] = 1;
                    moves[0][5] = 1;
                    moves[0][7] = 1;
                    moves[3][4] = 1;
                    moves[2][5] = 1;
                    moves[2][7] = 1;
                    moves[1][6] = 2;
                    pG7.setImageResource(R.drawable.brownwq);

                }
                else if (moves[1][6] == 1) {
                    Toast.makeText(this, "Conflict with prexisting queen!",Toast.LENGTH_LONG).show();
                }
                else if (moves[1][6] == 2){
                    for (int i = 0; i <= 7; i++) {
                        moves[1][i] = 0;
                        moves[i][6] = 0;
                    }
                    moves[7][0] = 0;
                    moves[6][1] = 0;
                    moves[5][2] = 0;
                    moves[4][3] = 0;
                    moves[0][5] = 0;
                    moves[0][7] = 0;
                    moves[3][4] = 0;
                    moves[2][5] = 0;
                    moves[2][7] = 0;
                    moves[1][6] = 0;
                    pG7.setImageResource(R.drawable.brown);
                }
                break;
            }
            case R.id.G8: {
                if (moves[1][7] == 0) {
                    for (int i = 0; i <= 7; i++) {
                        moves[1][i] = 1;
                        moves[i][7] = 1;
                    }
                    moves[7][1] = 1;
                    moves[6][2] = 1;
                    moves[5][3] = 1;
                    moves[4][4] = 1;
                    moves[0][6] = 1;
                    moves[3][5] = 1;
                    moves[2][6] = 1;
                    moves[1][7] = 2;
                    pG8.setImageResource(R.drawable.beigewq);

                }
                else if (moves[1][7] == 1) {
                    Toast.makeText(this, "Conflict with prexisting queen!",Toast.LENGTH_LONG).show();
                }
                else if (moves[1][7] == 2){
                    for (int i = 0; i <= 7; i++) {
                        moves[1][i] = 0;
                        moves[i][7] = 0;
                    }
                    moves[7][1] = 0;
                    moves[6][2] = 0;
                    moves[5][3] = 0;
                    moves[4][4] = 0;
                    moves[0][6] = 0;
                    moves[3][5] = 0;
                    moves[2][6] = 0;
                    moves[1][7] = 0;
                    pG8.setImageResource(R.drawable.beige);
                }
                break;
            }
//DONE
                //
                //
                //

            case R.id.H1: {
                if (moves[0][0] == 0) {
                    for (int i = 0; i <= 7; i++) {
                        moves[0][i] = 1;
                        moves[i][0] = 1;
                        moves[i][i] = 1;
                    }
                    moves[0][0] = 2;
                    pH1.setImageResource(R.drawable.beigewq);

                }
                else if (moves[0][0] == 1) {
                    Toast.makeText(this, "Conflict with prexisting queen!",Toast.LENGTH_LONG).show();
                }
                else if (moves[0][0] == 2){
                    for (int i = 0; i <= 7; i++) {
                        moves[0][i] = 0;
                        moves[i][0] = 0;
                        moves[i][i] = 0;
                    }
                    moves[0][0] = 0;
                    pH1.setImageResource(R.drawable.beige);
                }
                break;
            }
            case R.id.H2: {
                if (moves[0][1] == 0) {
                    for (int i = 0; i <= 7; i++) {
                        moves[0][i] = 1;
                        moves[i][1] = 1;
                    }
                    moves[1][0] = 1;
                    moves[1][2] = 1;
                    moves[2][3] = 1;
                    moves[3][4] = 1;
                    moves[4][5] = 1;
                    moves[5][6] = 1;
                    moves[6][7] = 1;
                    moves[0][1] = 2;
                    pH2.setImageResource(R.drawable.brownwq);

                }
                else if (moves[0][1] == 1) {
                    Toast.makeText(this, "Conflict with prexisting queen!",Toast.LENGTH_LONG).show();
                }
                else if (moves[0][1] == 2){
                    for (int i = 0; i <= 7; i++) {
                        moves[0][i] = 0;
                        moves[i][1] = 0;
                    }
                    moves[1][0] = 0;
                    moves[1][2] = 0;
                    moves[2][3] = 0;
                    moves[3][4] = 0;
                    moves[4][5] = 0;
                    moves[5][6] = 0;
                    moves[6][7] = 0;
                    moves[0][0] = 0;
                    pH2.setImageResource(R.drawable.brown);
                }
                break;
            }
            case R.id.H3: {
                if (moves[0][2] == 0) {
                    for (int i = 0; i <= 7; i++) {
                        moves[0][i] = 1;
                        moves[i][2] = 1;
                    }
                    moves[1][1] = 1;
                    moves[2][0] = 1;
                    moves[1][3] = 1;
                    moves[2][4] = 1;
                    moves[3][5] = 1;
                    moves[4][6] = 1;
                    moves[5][7] = 1;
                    moves[0][2] = 2;
                    pH3.setImageResource(R.drawable.beigewq);

                }
                else if (moves[0][2] == 1) {
                    Toast.makeText(this, "Conflict with prexisting queen!",Toast.LENGTH_LONG).show();
                }
                else if (moves[0][2] == 2){
                    for (int i = 0; i <= 7; i++) {
                        moves[0][i] = 0;
                        moves[i][2] = 0;
                    }
                    moves[1][1] = 0;
                    moves[2][0] = 0;
                    moves[1][3] = 0;
                    moves[2][4] = 0;
                    moves[3][5] = 0;
                    moves[4][6] = 0;
                    moves[5][7] = 0;
                    moves[0][2] = 0;
                    pH3.setImageResource(R.drawable.beige);
                }
                break;
            }
            case R.id.H4: {
                if (moves[0][3] == 0) {
                    for (int i = 0; i <= 7; i++) {
                        moves[0][i] = 1;
                        moves[i][3] = 1;
                    }
                    moves[3][0] = 1;
                    moves[2][1] = 1;
                    moves[1][2] = 1;
                    moves[1][4] = 1;
                    moves[2][5] = 1;
                    moves[3][6] = 1;
                    moves[4][7] = 1;
                    moves[0][3] = 2;
                    pH4.setImageResource(R.drawable.brownwq);

                }
                else if (moves[0][3] == 1) {
                    Toast.makeText(this, "Conflict with prexisting queen!",Toast.LENGTH_LONG).show();
                }
                else if (moves[0][3] == 2){
                    for (int i = 0; i <= 7; i++) {
                        moves[0][i] = 0;
                        moves[i][3] = 0;
                    }
                    moves[3][0] = 0;
                    moves[2][1] = 0;
                    moves[1][2] = 0;
                    moves[1][4] = 0;
                    moves[2][5] = 0;
                    moves[3][6] = 0;
                    moves[4][7] = 0;
                    moves[0][3] = 0;
                    pH4.setImageResource(R.drawable.brown);
                }
                break;
            }
            case R.id.H5: {
                if (moves[0][4] == 0) {
                    for (int i = 0; i <= 7; i++) {
                        moves[0][i] = 1;
                        moves[i][4] = 1;
                    }
                    moves[4][0] = 1;
                    moves[3][1] = 1;
                    moves[2][2] = 1;
                    moves[1][3] = 1;
                    moves[1][5] = 1;
                    moves[2][6] = 1;
                    moves[3][7] = 1;
                    moves[0][4] = 2;
                    pH5.setImageResource(R.drawable.beigewq);

                }
                else if (moves[0][4] == 1) {
                    Toast.makeText(this, "Conflict with prexisting queen!",Toast.LENGTH_LONG).show();
                }
                else if (moves[0][4] == 2){
                    for (int i = 0; i <= 7; i++) {
                        moves[0][i] = 0;
                        moves[i][4] = 0;
                    }
                    moves[4][0] = 0;
                    moves[3][1] = 0;
                    moves[2][2] = 0;
                    moves[1][3] = 0;
                    moves[1][5] = 0;
                    moves[2][6] = 0;
                    moves[3][7] = 0;
                    moves[0][4] = 0;
                    pH5.setImageResource(R.drawable.beige);
                }
                break;
            }
            case R.id.H6: {
                if (moves[0][5] == 0) {
                    for (int i = 0; i <= 7; i++) {
                        moves[0][i] = 1;
                        moves[i][5] = 1;
                    }
                    moves[5][0] = 1;
                    moves[4][1] = 1;
                    moves[3][2] = 1;
                    moves[2][3] = 1;
                    moves[1][4] = 1;
                    moves[1][6] = 1;
                    moves[2][7] = 1;
                    moves[0][5] = 2;
                    pH6.setImageResource(R.drawable.brownwq);

                }
                else if (moves[0][5] == 1) {
                    Toast.makeText(this, "Conflict with prexisting queen!",Toast.LENGTH_LONG).show();
                }
                else if (moves[0][5] == 2){
                    for (int i = 0; i <= 7; i++) {
                        moves[0][i] = 0;
                        moves[i][5] = 0;
                    }
                    moves[5][0] = 0;
                    moves[4][1] = 0;
                    moves[3][2] = 0;
                    moves[2][3] = 0;
                    moves[1][4] = 0;
                    moves[1][6] = 0;
                    moves[2][7] = 0;
                    moves[0][5] = 0;
                    pH6.setImageResource(R.drawable.brown);
                }
                break;
            }
            case R.id.H7: {
                if (moves[0][6] == 0) {
                    for (int i = 0; i <= 7; i++) {
                        moves[0][i] = 1;
                        moves[i][6] = 1;
                    }
                    moves[6][0] = 1;
                    moves[5][1] = 1;
                    moves[4][2] = 1;
                    moves[3][3] = 1;
                    moves[2][4] = 1;
                    moves[1][5] = 1;
                    moves[1][7] = 1;
                    moves[0][6] = 2;
                    pH7.setImageResource(R.drawable.beigewq);

                }
                else if (moves[0][6] == 1) {
                    Toast.makeText(this, "Conflict with prexisting queen!",Toast.LENGTH_LONG).show();
                }
                else if (moves[0][6] == 2){
                    for (int i = 0; i <= 7; i++) {
                        moves[0][i] = 0;
                        moves[i][6] = 0;
                    }
                    moves[6][0] = 0;
                    moves[5][1] = 0;
                    moves[4][2] = 0;
                    moves[3][3] = 0;
                    moves[2][4] = 0;
                    moves[1][5] = 0;
                    moves[1][7] = 0;
                    moves[0][6] = 0;
                    pH7.setImageResource(R.drawable.beige);
                }
                break;
            }
            case R.id.H8: {
                if (moves[0][7] == 0) {
                    for (int i = 0; i <= 7; i++) {
                        moves[0][i] = 1;
                        moves[i][7] = 1;
                    }
                    moves[7][0] = 1;
                    moves[6][1] = 1;
                    moves[5][2] = 1;
                    moves[4][3] = 1;
                    moves[3][4] = 1;
                    moves[2][5] = 1;
                    moves[1][6] = 1;
                    moves[0][7] = 2;
                    pH8.setImageResource(R.drawable.brownwq);

                }
                else if (moves[0][7] == 1) {
                    Toast.makeText(this, "Conflict with prexisting queen!",Toast.LENGTH_LONG).show();
                }
                else if (moves[0][7] == 2){
                    for (int i = 0; i <= 7; i++) {
                        moves[0][i] = 0;
                        moves[i][7] = 0;
                    }
                    moves[5][0] = 0;
                    moves[4][1] = 0;
                    moves[3][2] = 0;
                    moves[2][3] = 0;
                    moves[1][4] = 0;
                    moves[1][6] = 0;
                    moves[2][7] = 0;
                    moves[0][5] = 0;
                    pH8.setImageResource(R.drawable.brown);
                }
                break;
            }
            
            case R.id.restart: {
                pA1.setImageResource(R.drawable.brown);
                pA2.setImageResource(R.drawable.beige);
                pA3.setImageResource(R.drawable.brown);
                pA4.setImageResource(R.drawable.beige);
                pA5.setImageResource(R.drawable.brown);
                pA6.setImageResource(R.drawable.beige);
                pA7.setImageResource(R.drawable.brown);
                pA8.setImageResource(R.drawable.beige);
                moves[7][0] = 0;
                moves[7][1] = 0;
                moves[7][2] = 0;
                moves[7][3] = 0;
                moves[7][4] = 0;
                moves[7][5] = 0;
                moves[7][6] = 0;
                moves[7][7] = 0;

                pB1.setImageResource(R.drawable.beige);
                pB2.setImageResource(R.drawable.brown);
                pB3.setImageResource(R.drawable.beige);
                pB4.setImageResource(R.drawable.brown);
                pB5.setImageResource(R.drawable.beige);
                pB6.setImageResource(R.drawable.brown);
                pB7.setImageResource(R.drawable.beige);
                pB8.setImageResource(R.drawable.brown);
                moves[6][0] = 0;
                moves[6][1] = 0;
                moves[6][2] = 0;
                moves[6][3] = 0;
                moves[6][4] = 0;
                moves[6][5] = 0;
                moves[6][6] = 0;
                moves[6][7] = 0;

                pC1.setImageResource(R.drawable.brown);
                pC2.setImageResource(R.drawable.beige);
                pC3.setImageResource(R.drawable.brown);
                pC4.setImageResource(R.drawable.beige);
                pC5.setImageResource(R.drawable.brown);
                pC6.setImageResource(R.drawable.beige);
                pC7.setImageResource(R.drawable.brown);
                pC8.setImageResource(R.drawable.beige);
                moves[5][0] = 0;
                moves[5][1] = 0;
                moves[5][2] = 0;
                moves[5][3] = 0;
                moves[5][4] = 0;
                moves[5][5] = 0;
                moves[5][6] = 0;
                moves[5][7] = 0;

                pD1.setImageResource(R.drawable.beige);
                pD2.setImageResource(R.drawable.brown);
                pD3.setImageResource(R.drawable.beige);
                pD4.setImageResource(R.drawable.brown);
                pD5.setImageResource(R.drawable.beige);
                pD6.setImageResource(R.drawable.brown);
                pD7.setImageResource(R.drawable.beige);
                pD8.setImageResource(R.drawable.brown);
                moves[4][0] = 0;
                moves[4][1] = 0;
                moves[4][2] = 0;
                moves[4][3] = 0;
                moves[4][4] = 0;
                moves[4][5] = 0;
                moves[4][6] = 0;
                moves[4][7] = 0;

                pE1.setImageResource(R.drawable.brown);
                pE2.setImageResource(R.drawable.beige);
                pE3.setImageResource(R.drawable.brown);
                pE4.setImageResource(R.drawable.beige);
                pE5.setImageResource(R.drawable.brown);
                pE6.setImageResource(R.drawable.beige);
                pE7.setImageResource(R.drawable.brown);
                pE8.setImageResource(R.drawable.beige);
                moves[3][0] = 0;
                moves[3][1] = 0;
                moves[3][2] = 0;
                moves[3][3] = 0;
                moves[3][4] = 0;
                moves[3][5] = 0;
                moves[3][6] = 0;
                moves[3][7] = 0;

                pF1.setImageResource(R.drawable.beige);
                pF2.setImageResource(R.drawable.brown);
                pF3.setImageResource(R.drawable.beige);
                pF4.setImageResource(R.drawable.brown);
                pF5.setImageResource(R.drawable.beige);
                pF6.setImageResource(R.drawable.brown);
                pF7.setImageResource(R.drawable.beige);
                pF8.setImageResource(R.drawable.brown);
                moves[2][0] = 0;
                moves[2][1] = 0;
                moves[2][2] = 0;
                moves[2][3] = 0;
                moves[2][4] = 0;
                moves[2][5] = 0;
                moves[2][6] = 0;
                moves[2][7] = 0;

                pG1.setImageResource(R.drawable.brown);
                pG2.setImageResource(R.drawable.beige);
                pG3.setImageResource(R.drawable.brown);
                pG4.setImageResource(R.drawable.beige);
                pG5.setImageResource(R.drawable.brown);
                pG6.setImageResource(R.drawable.beige);
                pG7.setImageResource(R.drawable.brown);
                pG8.setImageResource(R.drawable.beige);
                moves[1][0] = 0;
                moves[1][1] = 0;
                moves[1][2] = 0;
                moves[1][3] = 0;
                moves[1][4] = 0;
                moves[1][5] = 0;
                moves[1][6] = 0;
                moves[1][7] = 0;

                pH1.setImageResource(R.drawable.beige);
                pH2.setImageResource(R.drawable.brown);
                pH3.setImageResource(R.drawable.beige);
                pH4.setImageResource(R.drawable.brown);
                pH5.setImageResource(R.drawable.beige);
                pH6.setImageResource(R.drawable.brown);
                pH7.setImageResource(R.drawable.beige);
                pH8.setImageResource(R.drawable.brown);
                moves[0][0] = 0;
                moves[0][1] = 0;
                moves[0][2] = 0;
                moves[0][3] = 0;
                moves[0][4] = 0;
                moves[0][5] = 0;
                moves[0][6] = 0;
                moves[0][7] = 0;

            }
            //DONE
                //
                //
                //
            case R.id.giveup: {
                int qPosition = 1;
                int[] qPlaced = new int[] {0,0,0,0,0,0,0,0};
                int arrayPlace = 0;

                for (int i = 0; i < 7; i++) {
                    for (int j = 0; j < 7; j++) {
                        if (moves[i][j] == 2) {
                            qPlaced[arrayPlace] = qPosition;
                            arrayPlace++;
                        }
                        qPosition++;
                    }
                    qPosition++;
                }

                for (int i = 0; i < 91; i++) {
                    for (int j = 0;j < 7; j++) {

                    }
                }
            }
        }

    }
}
