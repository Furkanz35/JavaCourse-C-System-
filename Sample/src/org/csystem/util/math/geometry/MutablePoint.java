
package org.csystem.util.math.geometry;

public class MutablePoint {

    private  int m_x;
    private  int m_y;

    private MutablePoint() {
    }

    public MutablePoint(int x) {
        this.m_x = x;
    }

    public MutablePoint(int x, int y) {
        this.m_x = x;
        this.m_y = y;
    }

    public void setX(int m_x) {
        this.m_x = m_x;
    }

    public void setY(int m_y) {
        this.m_y = m_y;
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

    public double distance(MutablePoint other) {
        return this.distance(other.m_x, other.m_y);
    }

    public void offset(int dx, int dy){
        m_x += dx;
        m_x += dy;
    }

    public double distance(int x, int y) {
        return PointCommonUtil.distance(m_x, m_y, x, y);
    }



    public String toString() {
        return PointCommonUtil.toString(m_x, m_y);
    }

    public Point toPoint()
    {
        return new Point(m_x, m_y);
    }
}