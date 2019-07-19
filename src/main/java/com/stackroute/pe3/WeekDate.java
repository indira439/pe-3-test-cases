package com.stackroute.pe3;


import java.util.*;
import java.text.SimpleDateFormat;

public class WeekDate {


    public String getFirstDate() {

        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.DAY_OF_WEEK,Calendar.MONDAY);

        SimpleDateFormat dateFormat = new SimpleDateFormat("EEE dd/MM/yyyy");
        //calendar.add(Calendar.DATE+1);

        return dateFormat.format(calendar.getTime());

    }

    public String getLastDate() {

        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.DAY_OF_WEEK, Calendar.MONDAY);
        SimpleDateFormat dateFormat = new SimpleDateFormat("EEE dd/MM/yyyy");

        for (int i = 0; i <6; i++) {
            calendar.add(Calendar.DATE, 1);
        }

        return dateFormat.format(calendar.getTime());

    }


}
