package org.csystem.app;
import org.csystem.util.array.ArrayUtil;
import org.csystem.util.datetime.Time;
import org.csystem.util.math.MutableFraction;

import java.sql.SQLOutput;
import java.util.Arrays;

class App {
    public static void main(String[] args) {

        MutableFraction fraction = new MutableFraction(18 , -27);
        System.out.println(fraction.toString());
    }
}