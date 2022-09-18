
package org.csystem.util.math.geometry;

public class Point {
    private int m_x;
    private int m_y;

    public Point() {
    }

    public Point(int x) {
        this.m_x = x;
    }

    public Point(int x, int y) {
        this.m_x = x;
        this.m_y = y;
    }

    public double distance() {
        return this.distance(0, 0);
    }

    public double distance(Point other) {
        return this.distance(other.m_x, other.m_y);
    }

    public double distance(int x, int y) {
        return Math.sqrt(Math.pow((double)(this.m_x - x), 2.0) + Math.pow((double)(this.m_y - y), 2.0));
    }

    public void offset(int dxy) {
        this.offset(dxy, dxy);
    }

    public void offset(int dx, int dy) {
        this.m_x += dx;
        this.m_y += dy;
    }

    public String toString() {
        return String.format("(%d, %d)", this.m_x, this.m_y);
    }
}