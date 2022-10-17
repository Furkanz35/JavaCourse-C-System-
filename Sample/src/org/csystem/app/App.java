package org.csystem.app;
import org.csystem.util.array.ArrayUtil;
import org.csystem.util.datetime.Time;

import java.sql.SQLOutput;
import java.util.Arrays;

class App {
    public static void main(String[] args) {
        Time now = new Time();

        System.out.println( now.toLongTimeString());
    }
}