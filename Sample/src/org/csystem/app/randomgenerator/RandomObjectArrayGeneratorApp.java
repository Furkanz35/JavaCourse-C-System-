package org.csystem.app.randomgenerator;

import org.csystem.randomgenerator.RandomObjectArrayFactory;
import org.csystem.util.array.ArrayUtil;
import org.csystem.util.math.MutableFraction;
import org.csystem.util.math.geometry.Circle;

import java.util.Random;
import java.util.Scanner;

public class RandomObjectArrayGeneratorApp {
    public static void run()
    {
        Random r = new Random();
        RandomObjectArrayFactory factory = new RandomObjectArrayFactory(r);
        Scanner kb = new Scanner(System.in);
        System.out.print("Dizinin eleman sayısını giriniz:");
        int count = Integer.parseInt(kb.nextLine());

        for (Object o : factory.getObjects(count)) {
            System.out.println("-----------------------------------------------------------------");
            String typeName = o.getClass().getName();
            System.out.printf("Dinamik tür ismi:%s%n", typeName);

            if (o instanceof String s) {
                s = (String)o;

                System.out.println(s.toUpperCase());
            }
            else if (o instanceof Circle c) {
                c = (Circle)o;

                System.out.printf("Alan:%f%n", c.getArea());
            }
            else if (o instanceof int [] a) {
                a = (int [])o;
                ArrayUtil.print(a);
                            }
            else {
                MutableFraction f = (MutableFraction)o;

                System.out.printf("Real Value:%f%n", f.getRealValue());
            }

            System.out.println("-----------------------------------------------------------------");
        }
    }
}