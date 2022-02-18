package com.example.testapp.Service;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class fredagsservice {

    public String erdetfredag(){
        LocalDate today = LocalDate.now();
        DayOfWeek dow = today.getDayOfWeek();

        if(dow.equals(DayOfWeek.FRIDAY)){
            return "DET FREDAG!";
        }else{
            return "Det ikke fredag!";
        }
    }
}
