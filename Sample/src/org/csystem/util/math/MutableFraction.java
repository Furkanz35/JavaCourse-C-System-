/*----------------------------------------------------------------------------------------------------------------------
	Sınıf Çalışması: Bir kesri temsil eden MutableFraction isimli sınıfı aşağıdaki açıklamalara göre yazınız
	Açıklamalar:
	- Sınıf Matematikteki bir kesri temsil ettiğinden pay ve payda değerleri tutulacaktır
	- Sınıfın ilgili set ve get metotları yazılacaktır
	- Pay'ın sıfırdan farklı, paydanın sıfır olması durumunda tanımsızlığa ilişkin bir mesaj verilecektir, pay ve paydanın
	her ikisinin birden sıfır olması durumunda belirsizliğe ilişkin mesaj verilecektir. Her iki durumda da program
	sonlandırılacaktır
	- Kesir her durumda sadeleşmiş bir biçimde tutulacaktır. Örneğin kesrin pay ve paydası sırasıyla 4 ve 18 olarak
	verildiğinde kesir 2 / 9 olarak tutulacaktır.
	- Kesir negatif ise işaret payda bulunacaktır. Örneğin kesrin pay ve paydası sırasıyla 3 ve -4 olarak verilmişse
	kesir -3 / 4 biçiminde tutulacaktır
	- Kesrin pay ve paydasının ikisinin birden negatif olması durumunda kesir pozitif olarak tutulacaktır
	- Kesrin payının sıfır olması durumunda payda ne olursa olsun 1(bir) yapılacaktır
	- Sınıfın iki kesri toplayan, bir kesir ile bir tamsayıyı toplayan aşağıdaki gibi metotları olacaktır. Aynı işlemler
	 çıkarma, çarpma ve bölme için de yapılacaktır
	- Sınıfın kesri 1(bir) artıran ve bir azaltan inc ve dec metotları yazılacaktır
	- Sınıfın toString metodu şu formatta yazı döndürecektir:
	    3 / 10 kesri için -> 3 / 10 = 3.333333
	    10 / 1 kesri için -> 10
	 - Sınıfın public bölümünü değiştirmeden istediğiniz değişikliği ve eklemeleri yapabilirsiniz
----------------------------------------------------------------------------------------------------------------------*/
package org.csystem.util.math;

public class MutableFraction {
    private int m_a, m_b;

    public MutableFraction()
    {
        m_b = 1;
    }

    public MutableFraction(int a)
    {
        m_a = a;
        m_b = 1;
    }

    public MutableFraction(int a, int b)
    {
        check(a, b);
        set(a, b);
    }

    private static void doWorkForException(String message) {

        System.out.println(message);
        System.exit(1);

    }

    private static void check(int a, int b) {
        if (b == 0) {
            if (a == 0)
                doWorkForException("Indeterminate");
            else
                doWorkForException("Undefined");
        }
    }

    private void configureSigned() {
        if(m_b < 0) {
            m_a = -m_a;
            m_b = -m_b;
        }
    }

    private void simplfy() {
        int min = Math.min(Math.abs(m_a), m_b);

        for(int i = min; i > 1; --i) {

            if( m_a % i == 0 && m_b % i == 0) {
                m_a /= i;
                m_b /= i;
                break;
            }

        }
    }


    private void set(int a, int b){

        if(a == 0) {
            m_a = 0;
            m_b = 1;
            return;
        }
        m_a = a;
        m_b = b;

        configureSigned();
        simplfy();
    }


    public int getNumerator()
    {
        return m_a;
    }


    public void setNumerator(int value)
    {
        if(value == m_a)
            return;

        set(value, m_b);
    }

    public int getDenominator()
    {
        return m_b;
    }


    public void setDenominator(int value)
    {
        if(value == m_b)
            return;
        check( m_a, value);
        set( m_a, value);

    }

    public double getRealValue(){
        return (double)m_a / m_b;
    }

    public static MutableFraction add(int value, MutableFraction fraction)
    {
        //TODO:

        return new MutableFraction();
    }

    private static MutableFraction add(int a1, int b1, int a2, int b2) {

        return new MutableFraction(a1 * b2 + a2 * b1, b1 * b2);

    }

    private static MutableFraction substract(int a1, int b1, int a2, int b2){
        return add(a1, b1, -a2, b2);
    }

    private static MutableFraction multiply(int a1, int b1, int a2, int b2) {
        return new MutableFraction( a1 * a2 , b1 * b2);
    }

    private static MutableFraction divide(int a1, int b1, int a2, int b2) {
        return multiply(a1, b1 , b2, a2);
    }

    public MutableFraction add(MutableFraction other)
    {
        return add(m_a, m_b, other.m_a, other.m_b);
    }

    public MutableFraction add(int value)
    {
        return add(m_a, m_b, value, 1);
    }

    public static MutableFraction subtract(int value, MutableFraction fraction)
    {
        return substract(value, 1, fraction.m_a, fraction.m_b);
    }

    public MutableFraction subtract(MutableFraction other)
    {
        return substract(m_a, m_b, other.m_a, other.m_b);
    }

    public MutableFraction subtract(int value)
    {
        return substract(m_a, m_b, value, 1 );
    }

    public static MutableFraction multiply(int value, MutableFraction fraction)
    {
        return multiply(value, 1, fraction.m_a, fraction.m_b);
    }

    public MutableFraction multiply(MutableFraction other)
    {
        return multiply(m_a, m_b, other.m_a, other.m_b);
    }

    public MutableFraction multiply(int value)
    {
        return multiply(m_a, m_b, value, 1);
    }
     public static MutableFraction divide(int value, MutableFraction fraction)
    {
        return divide(value, 1, fraction.m_a, fraction.m_b);
    }

    public MutableFraction divide(MutableFraction other)
    {
        return divide(m_a, m_b, other.m_a, other.m_b);
    }

    public MutableFraction divide(int value)
    {
        return divide(m_a, m_b, value, 1);
    }

    public void inc(int value)
    {
        m_a += value * m_b ;
    }

    public void inc()
    {
        inc(1);
    }

    public void dec(int value)
    {
        inc(-value);
    }

    public void dec()
    {
        dec(1);
    }

    public String toString()
    {
        return String.format("%d%s", m_a, m_b == 1 ? "" : (" / " + m_b) + " = " + getRealValue());
    }
}