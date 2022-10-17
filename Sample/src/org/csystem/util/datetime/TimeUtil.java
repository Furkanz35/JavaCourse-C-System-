package org.csystem.util.datetime;

import java.util.Random;

public class TimeUtil {
    private TimeUtil()
    {
    }

    public static Time randomTime(Random r)
    {
        return new Time(r.nextInt(24), r.nextInt(60), r.nextInt(60), r.nextInt(1000));
    }

    public static Time randomTime()
    {
        return randomTime(new Random());
    }
}