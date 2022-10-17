package org.csystem.util.datetime;

import java.util.Random;

public class TimeUtil {
    private TimeUtil()
    {
    }

    public static Time randomTime(Random r)
    {
        //TODO:
        return new Time();
    }

    public static Time randomTime()
    {
        return randomTime(new Random());
    }
}