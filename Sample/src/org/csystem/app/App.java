package org.csystem.app;

import org.csystem.util.array.ArrayUtil;
import static org.csystem.util.array.ArrayUtil.*;

import java.util.Random;
import java.util.Scanner;

class App {
    public static void main(String [] args)
    {
        getHistogramTest.run();
    }
}

class getHistogramTest {
    public static void run()
    {
        Scanner kb = new Scanner(System.in);
        Random r = new Random();

        for (;;) {
            System.out.print("Dizinin eleman sayısını giriniz:");
            int count = Integer.parseInt(kb.nextLine());

            if (count <= 0)
                break;
            System.out.print("Hangi değere kadar Histogram elde etmek istediğinizi giriniz:");
            int n = Integer.parseInt(kb.nextLine());

            int[] arr = ArrayUtil.getRandomArray(r, count, 0, 15);
            print(2, arr);
            int[] historgramArray = getHistogramData(arr, n);
            print(2, historgramArray);

        }

        System.out.println("Tekrar yapıyor musunuz?");
    }
}
