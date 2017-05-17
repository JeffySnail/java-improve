package com.viashare;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * Created by Jeffy on 17/5/12.
 */
public class CalendarMain {

    public static void main(String[] args) {
        Calendar calendar = new GregorianCalendar();
        System.err.println(calendar.get(Calendar.DATE));
        calendar.set(Calendar.YEAR, 2009);
        calendar.set(Calendar.MONTH, 11); // 11 = december
        calendar.set(Calendar.DAY_OF_MONTH, 24);

        System.err.println(calendar.getTime());




        Calendar calendar1 = Calendar.getInstance();
        calendar1.setTime(new Date());
        System.err.println(calendar1.get(Calendar.MONTH));

    }
}
