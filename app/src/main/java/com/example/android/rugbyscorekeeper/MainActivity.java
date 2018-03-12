package com.example.android.rugbyscorekeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreHomeTeam = 0;
    int scoreAwayTeam = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Adds 5 to Home Team Score
     */
    public void add5HomeTeam(View v) {
        scoreHomeTeam = scoreHomeTeam + 5;
        displayForHomeTeam(scoreHomeTeam);
    }

    /**
     * Adds 2 to Home Team Score
     */
    public void add2HomeTeam(View v) {
        scoreHomeTeam = scoreHomeTeam + 2;
        displayForHomeTeam(scoreHomeTeam);
    }

    /**
     * Adds 3 to Home Team Score
     */
    public void add3HomeTeam(View v) {
        scoreHomeTeam = scoreHomeTeam + 3;
        displayForHomeTeam(scoreHomeTeam);
    }

    /**
     * Displays the score for Home Team.
     */
    public void displayForHomeTeam(int score) {
        TextView scoreView = findViewById(R.id.homeTeamScore);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Adds 5 to Away Team Score
     */
    public void add5AwayTeam(View v) {
        scoreAwayTeam = scoreAwayTeam + 5;
        displayForAwayTeam(scoreAwayTeam);
    }

    /**
     * Adds 2 to Away Team Score
     */
    public void add2AwayTeam(View v) {
        scoreAwayTeam = scoreAwayTeam + 2;
        displayForAwayTeam(scoreAwayTeam);
    }

    /**
     * Adds 3 to Away Team Score
     */

    public void add3AwayTeam(View v) {
        scoreAwayTeam = scoreAwayTeam + 3;
        displayForAwayTeam(scoreAwayTeam);
    }

    /**
     * Displays the score for Away Team.
     */
    public void displayForAwayTeam(int score) {
        TextView scoreView = findViewById(R.id.awayTeamScore);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Makes the reset button clear the scores
     */
    public void resetEverything(View v) {
        scoreHomeTeam = 0;
        displayForHomeTeam(scoreHomeTeam);
        scoreAwayTeam = 0;
        displayForAwayTeam(scoreAwayTeam);
    }
}