package org.csystem.app;
import java.util.Random;
import java.util.Scanner;
import org.csystem.util.array.ArrayUtil;
import org.csystem.util.string.StringUtil;

import static java.util.Arrays.sort;

class App {

    public static void main(String [] args)
    {
        JoinTest.run();
    }


}

class JoinTest {

    public static void run()
    {   Scanner inp = new Scanner(System.in);
        Random r = new Random();
        for(;;) {
            System.out.println("Lütfen string adedini giriniz:");
            int n = Integer.parseInt(inp.nextLine());
            System.out.println("Lütfen bir ayıraç giriniz");
            char ch = inp.nextLine().charAt(0);
            if(n <= 0)
                break;

            String [] str = new String[n];
            for(int i = 0; i < str.length; ++i) {
                str[i] = StringUtil.getRandomTurkishWord();
                System.out.println(str[i]);
            }
            System.out.println("---------------------------------");

            System.out.println(StringUtil.join(str, ch));


        }
    }

}
