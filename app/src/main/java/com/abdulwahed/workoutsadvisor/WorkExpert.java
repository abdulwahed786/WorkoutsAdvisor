package com.abdulwahed.workoutsadvisor;


import java.util.ArrayList;
import java.util.List;

public class WorkExpert
{
    List<String> getworkout(String workoutypes)
    {
         List<String> workout=new ArrayList<String>();

        if(workoutypes.equals("Chest")) {
            workout.add("bench press");
            workout.add("cable flys");
        }
        else if(workoutypes.equals("Triceps"))
        {
            workout.add("Triceps ext");
            workout.add("Triceps PushDowns");
        }

        else if(workoutypes.equals("Shoulders"))
        {
             workout.add("Sholder press");
        }

         else if(workoutypes.equals("Biceps"))
        {
            workout.add("Biceps curl");
        }
        return workout;
    }



}
