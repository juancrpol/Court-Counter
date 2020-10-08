package com.example.courtcounter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreTeamA = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForTeamA(8);
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Increase the score for Team A by 3 points.
     */
    public void AddThreeForTeamA(View view) {
        scoreTeamA = 3;
        displayForTeamA(scoreTeamA);
    }


    /**
     * Increase the score for Team A by 2 points.
     */
    public void AddTwoForTeamA(View view) {
        scoreTeamA = 2;
        displayForTeamA(scoreTeamA);
    }


    /**
     * Increase the score for Team A by 1 point.
     */
    public void AddOneForTeamA(View view) {
        scoreTeamA = 1;
        displayForTeamA(scoreTeamA);
    }
}