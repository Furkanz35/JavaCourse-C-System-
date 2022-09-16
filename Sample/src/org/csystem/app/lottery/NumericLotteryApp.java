
package org.csystem.app.lottery;

import java.util.Scanner;
import org.csystem.util.array.ArrayUtil;

public class NumericLotteryApp {
    public NumericLotteryApp() {
    }

    public static void run() {
        Scanner kb = new Scanner(System.in);
        NumericLottery lottery = new NumericLottery();

        while(true) {
            System.out.print("Kaç tane kupon oynamak istersiniz:");
            int n = Integer.parseInt(kb.nextLine());
            if (n <= 0) {
                System.out.println("Tekrar yapıyor musunuz?");
                return;
            }

            ArrayUtil.print(2, lottery.getNumbers(n));
        }
    }
}
