package com.company;

import java.util.Calendar;
import java.util.Date;


public class Main {

    public static void main(String[] args) {

        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.YEAR, 2015);
        calendar.set(Calendar.MONTH, Calendar.MARCH);
        calendar.set(Calendar.DAY_OF_MONTH, 15);

        System.out.println(calendar.getTime());

        RoadChecker roadChecker = new ReaderData();
        int count = roadChecker.getRestrictedRoads("D:\\JAVA\\Занятие 9\\restrictions\\Данные.csv",
                calendar.getTime());

        System.out.println(count);

    }
}
