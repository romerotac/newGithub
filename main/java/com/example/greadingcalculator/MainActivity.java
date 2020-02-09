package com.example.greadingcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void handleClick(View view) {
        EditText IndivAssignEarn = findViewById(R.id.editTextIndividualPointsEarned);
        EditText IndivAssignPoss = findViewById(R.id.editTextIndividualPointsPossible);
        EditText TeamProjEarn = findViewById(R.id.editTextTeamProjectEarned);
        EditText TeamProjPoss = findViewById(R.id.editTextTeamProjectPossible);
        EditText MidTermEarn = findViewById(R.id.editTextMidTermEarned);
        EditText MidTermPoss = findViewById(R.id.editTextMidtermPossible);
        EditText FinalEarn = findViewById(R.id.editTextFinalExamEarned);
        EditText FinalPoss = findViewById(R.id.editTextFinalExamPossible);
        TextView output = findViewById(R.id.textViewResult);

        int AssignEarn = Integer.parseInt(IndivAssignEarn.getText().toString());
        int AssignPoss = Integer.parseInt(IndivAssignPoss.getText().toString());
        int ProjEarn = Integer.parseInt(TeamProjEarn.getText().toString());
        int ProjPoss = Integer.parseInt(TeamProjPoss.getText().toString());
        int MidEarn = Integer.parseInt(MidTermEarn.getText().toString());
        int MidPoss = Integer.parseInt(MidTermPoss.getText().toString());
        int FinEarn = Integer.parseInt(FinalEarn.getText().toString());
        int FinPoss = Integer.parseInt(FinalPoss.getText().toString());

        final int ASSIGMENT_PERCENTAGE = 20;
        final int TEAM_PROJECT_PERCENTAGE = 30;
        final int MID_TEARM_PERCENTAGE = 30;
        final int FINAL_PERENTAGE = 20;


        // calculate Total percentage from all the points
        int TotAssigment = (AssignEarn * ASSIGMENT_PERCENTAGE) / AssignPoss;
        int TotTeamProj = (ProjEarn * TEAM_PROJECT_PERCENTAGE) / ProjPoss;
        int TotMidterm = (MidEarn * MID_TEARM_PERCENTAGE) / MidPoss;
        int TotFinal = (FinEarn * FINAL_PERENTAGE) / FinPoss;

        int TotalPercentage = TotAssigment + TotTeamProj + TotMidterm + TotFinal;

        // Transform the TotalPercentage into grade letter
        String LetterGrade;


        if(TotalPercentage >= 90) {
            LetterGrade = "A";
        }
        else if (TotalPercentage >= 80 ) {
            LetterGrade = "B";
        }
        else if (TotalPercentage >= 70){
            LetterGrade = "C";
        }
        else if (TotalPercentage >= 60){
            LetterGrade = "D";
        }else LetterGrade = "F";

        output.setText(LetterGrade);


    }
}
