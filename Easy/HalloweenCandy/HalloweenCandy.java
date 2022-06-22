package HalloweenCandy;

import java.util.Scanner;

public class HalloweenCandy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int houses = scanner.nextInt();
        scanner.close();

        //Simple proportion to count % of randomly pulling a dollar from a bag,
        //Math.ceil function to round a number upward, and printing int in output
        while (houses >= 3) {
            double i = Math.ceil(2 * 100 / (double) houses);
            System.out.println((int) i);
            break;
        }
    }
}
