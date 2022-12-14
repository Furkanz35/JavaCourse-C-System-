package org.csystem.util.math.geometry;

public class Circle {

    private double m_r;
    private double m_area;
    private double m_circumference;
    public Circle(double r)
    {
        setRadius(r);
        calculateAre();
        calculateCircumference();
    }
    public Circle()
    {
        setRadius(0);
        calculateAre();
        calculateCircumference();

    }

    private void calculateAre()
    {
        m_area = Math.PI * m_r * m_r;
    }
    private void calculateCircumference()
    {
        m_circumference = 2 * Math.PI * m_r;

    }



    public double getRadius()
    {
        return m_r;
    }

    public void setRadius(double r)
    {
        m_r = Math.abs(r);
        calculateAre();
        calculateCircumference();
    }

    public double getArea()
    {
        return  m_area;
    }

    public double getCircumference()
    {
        return m_circumference;
    }
}
