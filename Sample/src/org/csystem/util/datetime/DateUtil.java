package org.csystem.util.datetime;

import java.util.Random;

public class DateUtil {
    private DateUtil()
    {
    }

    private static final int [] DAYS_OF_MONTHS = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};


    public static int getDays(int month, int year)
    {
        return month == 2 && isLeapYear(year) ? 29 : DateUtil.DAYS_OF_MONTHS[month];
    }

    public static boolean isLeapYear(int year)
    {
        return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
    }


    public static Date randomDate()
    {
        return randomDate(new Random());
    }

    public static Date randomDate(Random r)
    {
        return randomDate(r, new Date().getYear());
    }

    public static Date randomDate(int year)
    {
        return randomDate(new Random(), year);
    }

    public static Date randomDate(Random r, int year)
    {
        return randomDate(r, year, year);
    }

    public static Date randomDate(int minYear, int maxYear)
    {
        return randomDate(new Random(), minYear, maxYear);
    }

    public static Date randomDate(Random r, int minYear, int maxYear)
    {
        int year = r.nextInt(1900, 2101);
        int month = r.nextInt(1, 13);
        int day = r.nextInt(1, getDays(month, year) + 1);

        return new Date(day, month, year);
    }

}