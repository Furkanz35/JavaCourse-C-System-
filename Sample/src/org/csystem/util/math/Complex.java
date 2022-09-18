package org.csystem.util.math;

import static java.lang.Math.sqrt;

public class Complex {
    private double m_real;
    private double m_imag;

    public double getM_real() {
        return m_real;
    }

    public void setM_real(double m_real) {
        this.m_real = m_real;
    }

    public double getM_imag() {
        return m_imag;
    }

    public void setM_imag(double m_imag) {
        this.m_imag = m_imag;
    }



    private static Complex add(double a1, double b1, double a2, double b2) //İleride bu metot gizlenecektir
    {
        return new Complex(a1 + a2, b1 + b2);
    }

    private static Complex subtract(double a1, double b1, double a2, double b2) //İleride bu metot gizlenecektir
    {
        return add(a1, b1, -a2, -b2);
    }

    private static Complex multiply(double a1, double b1, double a2, double b2) //İleride bu metot gizlenecektir
    {
        return new Complex(a1 * a2 - b1  * b2, a1 * b2 + a2 * b1);
    }

    public Complex()
    {
    }

    public Complex(double real)
    {
        m_real = real;
    }

    public Complex(double real, double imag)
    {
        m_real = real;
        m_imag = imag;
    }

    public double getNorm()
    {
        return sqrt(m_real * m_real + m_imag * m_imag);
    }

    public double getLength()
    {
        return getNorm();
    }

    public Complex getConjugate()
    {
        return new Complex(m_real, -m_imag);
    }

    //add
    public static Complex add(double value, Complex z)
    {
        return add(value, 0, z.m_real, z.m_imag);
    }

    public Complex add(Complex other)
    {
        return add(m_real, m_imag, other.m_real, other.m_imag);
    }

    public Complex add(double value)
    {
        return add(m_real, m_imag, value, 0);
    }

    //subtract
    public static Complex subtract(double value, Complex z)
    {
        return subtract(value, 0, z.m_real, z.m_imag);
    }

    public Complex subtract(Complex other)
    {
        return subtract(m_real, m_imag, other.m_real, other.m_imag);
    }

    public Complex subtract(double value)
    {
        return subtract(m_real, m_imag, value, 0);
    }


    //multiply
    public static Complex multiply(double value, Complex z)
    {
        return multiply(value, 0, z.m_real, z.m_imag);
    }

    public Complex multiply(Complex other)
    {
        return multiply(m_real, m_imag, other.m_real, other.m_imag);
    }

    public Complex multiply(double value)
    {
        return multiply(m_real, m_imag, value, 0);
    }

    //divide (TODO)

    //inc
    public void inc(double value)
    {
        m_real += value;
    }

    public void inc()
    {
        inc(1);
    }

    //dec
    public void dec(double value)
    {
        inc(-value);
    }

    public void dec()
    {
        dec(1);
    }

    public String toString()
    {
        return String.format("|%.2f, %.2f| = %f", m_real, m_imag, getNorm());
    }
}