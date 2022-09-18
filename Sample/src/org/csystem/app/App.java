package org.csystem.app;

import org.csystem.util.math.geometry.Point;


class App {
    public static void main(String [] args)
    {

    }
    public class Line {

        private Point m_p1;
        private Point m_p2;

        public Line(int x1,int y1, int x2, int y2)
        {
            m_p1 = new Point(x1, y1);
            m_p2 = new Point(x2, y2);

        }

        public Point getPoint1(){
            return  m_p1;
        }

        public Point getPoint2(){
            return  m_p2;
        }
    }
}
