package org.csystem.util.datetime;

import java.time.LocalTime;

public class Time {
    private int m_hour, m_minute, m_second, m_millisecond;

    public Time() //Bu ctor içerisinde yazılanların bilinmesi gerekmez. Sadece default ctor'un anlamına odaklanınız
    {
        LocalTime now = LocalTime.now();

        m_hour = now.getHour();
        m_minute = now.getMinute();
        m_second = now.getSecond();
        m_millisecond = now.getNano() / 1_000_000;
    }



    private static void doWorkForException(String message) {

        System.out.println(message);
        System.exit(1);

    }

    private static boolean isValid(int value, int max) {
        return 0 <= value && value <= max;
    }


    private static boolean isValidHour(int hour) {
        return isValid(hour, 23);
    }

    private static boolean isValidMinute(int minute) {
        return isValid(minute, 59);
    }

    private static boolean isValidSecond(int second) {
        return isValid(second, 59);
    }

    private static boolean isValidMiliSecond(int milisecond) {
        return isValid(milisecond, 999);
    }

    private static boolean isValidTime(int hour, int minute, int second, int milisecond) {
        return isValidHour(hour) && isValidSecond(second) && isValidMiliSecond(milisecond) && isValidMinute(minute);
    }

    private static void checkHour(int hour) {
        if(!isValidHour(hour))
        doWorkForException("Invalid hour value -->" + hour);
    }

    private static void checkSecond(int second) {
        if(!isValidSecond(second))
            doWorkForException("Invalid second value -->" + second);
    }

    private static void checkMinute(int minute) {
        if(!isValidMinute(minute))
            doWorkForException("Invalid hour minute -->" + minute);
    }

    private static void checkMiliSecond(int miliSecond) {
        if(!isValidMiliSecond(miliSecond))
            doWorkForException("Invalid miliSecond value -->" + miliSecond);
    }

    private static void checkTime(int hour, int minute, int second, int miliSecond) {
        if(!isValidTime(hour, minute, second, miliSecond))
            doWorkForException("Invalid time values--> hour:" + hour +" minute:" + minute + " second:" + second + " milisecond:" + miliSecond);
    }

    public Time(int hour, int minute, int second, int milisecond)
    {
        checkTime(hour, minute, second, milisecond);
        set(hour, minute, second, milisecond);
    }


    public Time(int hour, int minute)
    {
        this(hour, minute, 0, 0);
    }

    public Time(int hour, int minute, int second)
    {
        this(hour, minute, second, 0);
    }
    public Time(int hour)
    {
        this(hour, 0, 0, 0);
    }

    private void set(int hour, int minute, int second, int milisecond) {
        m_hour = hour;
        m_minute = minute;
        m_second = second;
        m_millisecond = milisecond;
    }

    public int getHour()
    {
        return m_hour;
    }

    public void setHour(int hour)
    {
        if(hour == m_hour)
            return;
        checkHour(hour);
        m_hour = hour;
    }

    public int getMinute()
    {
        return m_minute;
    }

    public void setMinute(int minute)
    {
        if(minute == m_minute)
            return;
        checkMinute(minute);
        m_minute = minute;
    }

    public int getSecond()
    {
        return m_second;
    }

    public void setSecond(int second)
    {
        if(second == m_second)
            return;
        checkSecond(second);
        m_second = second;
    }

    public int getMillisecond()
    {
        return m_millisecond;
    }

    public void setMillisecond(int milisecond)
    {
        if(milisecond == m_millisecond)
            return;
        checkMiliSecond(milisecond);
        m_millisecond = milisecond;
    }

    public String toString()
    {
        return toShortTimeString() + String.format(":%02d", m_second);
    }

    public String toShortTimeString()
    {
        return String.format("%02d:%02d", m_hour, m_minute);
    }

    public String toLongTimeString()
    {
        return toString() + String.format(".%03d", m_millisecond);
    }
}