package org.csystem.util.math.geometry;

class PointCommonUtil {

    public static double distance(int x1, int y1, int x2, int y2)
    {
        return Math.sqrt(Math.pow((double)(x1 - x2), 2.0) + Math.pow((double)(y1- y2), 2.0));

    }

    public static String toString(int x, int y) {
        return String.format("(%d, %d)", x, y);
    }
}
