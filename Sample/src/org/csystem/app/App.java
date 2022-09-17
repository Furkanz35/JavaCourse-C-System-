package org.csystem.app;

import java.util.Random;
import java.util.Scanner;
import org.csystem.app.simulation.ExamSimulationApp;
import org.csystem.util.array.ArrayUtil;


class App {
    public static void main(String [] args)
    {
        ExamSimulationApp.run();
    }
}

class TransPoseTest {
        public static void run()
        {
            Scanner kb = new Scanner(System.in);
            Random r = new Random();

            System.out.print("Bir sayı giriniz:");
            int count = kb.nextInt();

            for (int i = 0; i < count; ++i) {
                int [][] a = ArrayUtil.getRandomMatrix(r, r.nextInt(3, 8), r.nextInt(3, 8), 0, 99);
                System.out.println("-----------------------------------------------");
                ArrayUtil.print(2, a);
                System.out.println("matrisinin devriği:");
                ArrayUtil.print(2, ArrayUtil.transpose(a));
                System.out.println("-----------------------------------------------");
            }

            System.out.println("Tekrar yapıyor musunuz?");
        }
    }

