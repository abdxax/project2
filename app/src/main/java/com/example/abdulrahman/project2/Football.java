package com.example.abdulrahman.project2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Football extends AppCompatActivity {
int goalTeam1=0
        ,goalTeam2=0
        ,foulTeam1=0
        ,foulTeam2=0
        ,yellowCardTeam1=0
        ,yellowCardTeam2=0
        ,readCardTeam1=0
        ,readCardTeam2=0;
TextView goalT1,foulT1,yellowCareT1,redCardT1,goalT2,foulT2,yellowCareT2,redCardT2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //Declaration views for team 1
        setContentView(R.layout.activity_football);
        goalT1=(TextView) findViewById(R.id.goal1);
        foulT1=(TextView) findViewById(R.id.foul1);
        yellowCareT1=(TextView) findViewById(R.id.yellow1);
        redCardT1=(TextView) findViewById(R.id.red1);

        //Declaration views for team 2
        goalT2=(TextView) findViewById(R.id.goal2);
        foulT2=(TextView) findViewById(R.id.foul2);
        yellowCareT2=(TextView) findViewById(R.id.yellow2);
        redCardT2=(TextView) findViewById(R.id.red2);
    }
    public void butGoalTeam1(View view) {
        goalTeam1++;
        goalT1.setText(goalTeam1+"");

    }
    public void butFoulTeam1(View view) {
        foulTeam1++;
        foulT1.setText(foulTeam1+"");
    }

    public void butYellowCardTeam1(View view) {
        yellowCardTeam1++;
        yellowCareT1.setText(yellowCardTeam1+"");
    }

    public void butRedCardTeam1(View view) {
        readCardTeam1++;
        redCardT1.setText(readCardTeam1+"");
    }

    public void butGoalTeam2(View view) {
        goalTeam2++;
        goalT2.setText(goalTeam2+"");
    }

    public void butFoulTeam2(View view) {
        foulTeam2++;
        foulT2.setText(foulTeam2+"");
    }
    public void butYellowCardTeam2(View view) {
        yellowCardTeam2++;
        yellowCareT2.setText(yellowCardTeam2+"");
    }

    public void butRedCardTeam2(View view) {
        readCardTeam2++;
        redCardT2.setText(readCardTeam2+"");
    }

    // Rest button
    public void butNewGame(View view) {
        goalTeam1=0;
        goalTeam2=0;
        foulTeam1=0;
        foulTeam2=0;
        yellowCardTeam1=0;
        yellowCardTeam2=0;
        readCardTeam1=0;
        readCardTeam2=0;

        goalT1.setText(goalTeam1+"");
        goalT2.setText(goalTeam2+"");
        foulT1.setText(foulTeam1+"");
        foulT2.setText(foulTeam2+"");
        yellowCareT1.setText(yellowCardTeam1+"");
        yellowCareT2.setText(yellowCardTeam2+"");
        redCardT1.setText(readCardTeam1+"");
        redCardT2.setText(readCardTeam2+"");


    }
}
