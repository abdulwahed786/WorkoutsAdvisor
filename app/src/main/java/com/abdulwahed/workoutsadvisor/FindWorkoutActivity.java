package com.abdulwahed.workoutsadvisor;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.List;


public class FindWorkoutActivity extends Activity {


    private WorkExpert expert=new WorkExpert();

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_find_workout);

    }

    public void onClickFindWorkout(View view)
    {
        TextView workouts =(TextView) findViewById(R.id.workout);


        Spinner workouttype=(Spinner) findViewById(R.id.workouttype);

        //now to save the name of the spinner selected we use a string
        String workout =String.valueOf(workouttype.getSelectedItem());

      //  workouts.setText(workout);

        List<String> workoutlist=expert.getworkout(workout);
        StringBuilder workoutsFormatted =new StringBuilder();

        for(String work: workoutlist)
        {
            workoutsFormatted.append(work).append('\n');
        }
        workouts.setText(workoutsFormatted);

    }



}
