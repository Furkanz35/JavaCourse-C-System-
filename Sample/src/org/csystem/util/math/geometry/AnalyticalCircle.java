package org.csystem.util.math.geometry;

public class AnalyticalCircle extends Circle {
    private MutablePoint m_center;

    public AnalyticalCircle(double radius)
    {
        this(radius, 0, 0);
    }

    public AnalyticalCircle(int x, int y)
    {
        this(0, x, y);
    }

    public AnalyticalCircle(double radius, int x, int y)
    {
        super(radius);
        m_center = new MutablePoint(x, y);
    }
    //...
}