package org.csystem.util.math.geometry;

public class AnalyticalCircle extends Circle {
    private final MutablePoint m_center;
    public AnalyticalCircle(double radius, int x, int y)
    {
        super(radius);
        m_center = new MutablePoint(x, y);
    }
    public AnalyticalCircle(int x, int y)
    {

        this(0, x, y);
    }


    public AnalyticalCircle(double radius)
    {
        this(radius, 0, 0);
    }

    public void setX(int m_x) {
        m_center.setX(m_x);
    }

    public void setY(int m_y) {
        m_center.setY(m_y);
    }

    public void set(int x, int y) {
        setX(x);
        setY(y);
    }
    public int getX() {
        return m_center.getX();
    }

    public int getY() {
        return m_center.getY();
    }

    public void offset(int dxy) {
        offset(dxy, dxy);
    }

    public void offset(int dx, int dy) {
        m_center.offset(dx, dy);
    }

    public double radiusDistance(AnalyticalCircle other) {
        return  m_center.distance(other.m_center);
    }

    public boolean isInside(int x, int y) {

        if(m_center.distance(x, y) <= getRadius())
            return true;

        return false;
    }



}