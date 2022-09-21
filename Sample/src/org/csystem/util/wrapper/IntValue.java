package org.csystem.util.wrapper;

public class IntValue {

    private static final int CACHE_MIN = -128;
    private static final int CACHE_MAX = 127;

    private static final IntValue [] CACHE = new IntValue[CACHE_MAX - CACHE_MIN + 1];

    private final int m_value;

    private IntValue(int value)
    {
        m_value = value;

    }

    public static IntValue of(int value)
    {
        if( value < CACHE_MIN || CACHE_MAX < value)
            return new IntValue(value);

        int idx = value + 128;

        if(CACHE[idx] == null)
            CACHE[idx] = new IntValue(value);

        return CACHE[idx];
    }

    public int getValue()
    {
        return m_value;
    }

    public String toString()
    {
        return "" + m_value;
    }

}
