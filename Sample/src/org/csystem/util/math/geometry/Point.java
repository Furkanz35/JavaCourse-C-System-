
package org.csystem.util.math.geometry;

public class Point {
    private final int m_x;
    private final int m_y;

    public Point()
    {
        this(0);
    }

    public Point(int x) {
        this.m_x = x;
         m_y = 0;
    }

    public Point(int x, int y) {
        this.m_x = x;
        this.m_y = y;
    }

    public int getX() {
        return m_x;
    }

    public int getY() {
        return m_y;
    }

    public double distance() {
        return this.distance(0, 0);
    }

    public double distance(Point other) {
        return this.distance(other.m_x, other.m_y);
    }

    public Point offset(int dx, int dy){
       return new Point(m_x + dx, m_y + dy);
    }
    public double distance(int x, int y) {
        return PointCommonUtil.distance(m_x, m_y, x, y);
    }

    public String toString() {
        return PointCommonUtil.toString(m_x, m_y);
    }

    public MutablePoint toMutablePoint()
    {
        return new MutablePoint(m_x, m_y);
    }
}