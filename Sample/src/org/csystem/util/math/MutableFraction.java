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
        m_a = a;
        m_b = b;
    }

    public int getNumerator()
    {
        return m_a;
    }


    public void setNumerator(int value)
    {
        //TODO:
    }

    public int getDenominator()
    {
        return m_b;
    }


    public void setDenominator(int value)
    {
        //TODO:
    }

    public static MutableFraction add(int value, MutableFraction fraction)
    {
        //TODO:

        return new MutableFraction();
    }

    public MutableFraction add(MutableFraction other)
    {
        //TODO:

        return new MutableFraction();
    }

    public MutableFraction add(int value)
    {
        //TODO:

        return new MutableFraction();
    }

    public static MutableFraction subtract(int value, MutableFraction fraction)
    {
        //TODO:

        return new MutableFraction();
    }

    public MutableFraction subtract(MutableFraction other)
    {
        //TODO:

        return new MutableFraction();
    }

    public MutableFraction subtract(int value)
    {
        //TODO:

        return new MutableFraction();
    }

    public static MutableFraction multiply(int value, MutableFraction fraction)
    {
        //TODO:

        return new MutableFraction();
    }

    public MutableFraction multiply(MutableFraction other)
    {
        //TODO:

        return new MutableFraction();
    }

    public MutableFraction multiply(int value)
    {
        //TODO:

        return new MutableFraction();
    }

    public static MutableFraction divide(int value, MutableFraction fraction)
    {
        //TODO:

        return new MutableFraction();
    }

    public MutableFraction divide(MutableFraction other)
    {
        //TODO:

        return new MutableFraction();
    }

    public MutableFraction divide(int value)
    {
        //TODO:

        return new MutableFraction();
    }

    public void inc(int value)
    {
        //TODO:
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
        //TODO:
        return "10 / 3 = 3.333333";
    }
}