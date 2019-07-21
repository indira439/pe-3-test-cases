package com.stackroute.pe3;

/**
 * Write a java program to calculate first and last date of a week.
 */

import java.util.*;
import java.text.SimpleDateFormat;

public class WeekDate {


    public String getFirstDate() {

        /**Get calendar set to current date and time*/
        Calendar calendar = Calendar.getInstance();
        /**Set the calendar to monday of the current week*/
        calendar.set(Calendar.DAY_OF_WEEK, Calendar.MONDAY);
        /**Format the date in required format*/
        SimpleDateFormat dateFormat = new SimpleDateFormat("EEE dd/MM/yyyy");
        //calendar.add(Calendar.DATE+1);

        /**Return the first date of the week starting on monday*/
        return dateFormat.format(calendar.getTime());

    }

    public String getLastDate() {

        /**Get calendar set to current date and time*/
        Calendar calendar = Calendar.getInstance();
        /**Set the calendar to monday of the current week*/
        calendar.set(Calendar.DAY_OF_WEEK, Calendar.MONDAY);
        /**Format the date in required format*/
        SimpleDateFormat dateFormat = new SimpleDateFormat("EEE dd/MM/yyyy");

        /**Loop till sunday*/
        for (int i = 0; i < 6; i++) {
            calendar.add(Calendar.DATE, 1);
        }

        /**Return the last date of the week ending on sunday*/
        return dateFormat.format(calendar.getTime());

    }


}
