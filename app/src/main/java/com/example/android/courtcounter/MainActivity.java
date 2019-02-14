package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    //declaring the Global variables teamAScore and teamBScore and initializing them to zeros
    int teamAScore = 0;
    int teamBScore = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //displayForTeamA(6);
    }
    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }
    /**
     * increases the score for Team A by 3 points.
     */
    public void AddThreeForTeamA(View view){
        teamAScore = teamAScore + 3;
        displayForTeamA(teamAScore);
    }
    /**
     * increases the score for Team A by 2 points.
     */
    public void AddTwoForTeamA(View view){
        teamAScore = teamAScore + 2;
        displayForTeamA(teamAScore);
    }
    /**
     * increases the score for Team A by 1 point.
     */
    public void AddOneForTeamA(View view){
        teamAScore = teamAScore + 1;
        displayForTeamA(teamAScore);
    }

    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }
    /**
     * increases the score for Team B by 3 point.
     */
    public void AddThreeForTeamB(View view){
        teamBScore = teamBScore + 3;
        displayForTeamB(teamBScore);
    }
    /**
     * increases the score for Team B by 2 point.
     */
    public void AddTwoForTeamB(View view){
        teamBScore = teamBScore + 2;
        displayForTeamB(teamBScore);
    }
    /**
     * increases the score for Team B by 1 point.
     */
    public void AddOneForTeamB(View view){
        teamBScore = teamBScore + 1;
        displayForTeamB(teamBScore);
    }

    /**
     * resets the score for Team A and Team B.
     */
    public void ResetScore (View view) {
        teamAScore = 0;
        teamBScore = 0;
        displayForTeamA(teamAScore);
        displayForTeamB(teamBScore);
    }
}
