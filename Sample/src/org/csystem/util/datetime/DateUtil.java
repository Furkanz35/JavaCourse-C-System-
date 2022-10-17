package org.csystem.util.datetime;

import java.util.Random;

public class DateUtil {

    static final Month [] MONTHS = Month.values();
    static final DayOfWeek [] DAY_OF_WEEKS = DayOfWeek.values();

    private DateUtil()
    {
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
        int day = r.nextInt(1, MONTHS[month - 1].getDays(year) + 1);

        return new Date(day, month, year);
    }

}