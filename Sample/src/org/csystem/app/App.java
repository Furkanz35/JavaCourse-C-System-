package org.csystem.app;
import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;


import org.csystem.util.array.ArrayUtil;


class App {
    public static void main(String [] args)
    {
        MatrixTest.run();
    }
}

class MatrixTest {
    public static void run()
    {

        IsSquareMatrixTest.run();
        System.out.println("Tekrar yapıyor musunuz?");
    }
}


class IsSquareMatrixTest {
    public static int [][] getArray(Random r, int m, int n)
    {
        return r.nextBoolean() ? ArrayUtil.getRandomMatrix(r, m, n, 0, 99) : ArrayUtil.getRandomSquareMatrix(r, m, 0, 99);
    }

    public static void run()
    {
        Scanner kb = new Scanner(System.in);
        Random r = new Random();

        for (;;) {
            System.out.print("Satır ve sütun sayılarını giriniz:");
            int m = kb.nextInt();
            int n = kb.nextInt();

            if (m <= 0)
                return;

            int [][] a = getArray(r, m, n);

            ArrayUtil.print(2, a);
            System.out.println("-----------------------------------");
            System.out.println(ArrayUtil.isSquareMatrix(a) ? "Kare matris" : "Kare matris değil");

            System.out.println("---------------------------");
            System.out.printf("Dioganal toplamı = %d%n", ArrayUtil.sumDioganal(a) );
        }
    }
}
