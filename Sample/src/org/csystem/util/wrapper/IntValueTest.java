package org.csystem.util.wrapper;

public class IntValueTest {
    public static void main(String[] args) {
        IntValue ival1 = IntValue.of(100);
        IntValue ival2 = IntValue.of(100);


        System.out.println(ival1 == ival2 ? "aynı nesne" : "farklı nesneler") ;

        IntValue ival3 = IntValue.of(129);
        IntValue ival4 = IntValue.of(129);

        System.out.println(ival1 == ival3 ? "aynı nesne" : "farklı nesneler") ;
        System.out.println(ival3 == ival4 ? "aynı nesne" : "farklı nesneler") ;



    }
}
