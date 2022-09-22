package org.csystem.util.wrapper;

public class IntValue {

    private static final int CACHE_MIN = -128;
    private static final int CACHE_MAX = 127;

    public static final IntValue ZERO = of(0);
    public static final IntValue ONE = of(1);
    public static final IntValue TWO = of(2);
    public static final IntValue TEN = of(10);

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

    public IntValue add(int value)
    {
        return of(m_value + value);
    }

    public IntValue add(IntValue val)
    {
        return add(val.m_value);
    }
    public IntValue substract(int value)
    {
        return add(- value);
    }

    public IntValue substract(IntValue val)
    {
        return add(-val.m_value);
    }

    public IntValue multiply(int val)
    {
        return of(m_value * val);
    }

    public IntValue multiply(IntValue val)
    {
        return multiply(val.m_value);
    }

    public int compareTo(IntValue other)
    {
        return m_value - other.m_value;
    }


}
