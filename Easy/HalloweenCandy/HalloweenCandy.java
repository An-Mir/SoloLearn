package HalloweenCandy;

import java.util.Scanner;

public class HalloweenCandy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int houses = scanner.nextInt();

        while (houses >= 3) {
            double i = Math.ceil(2 * 100 / (double) houses);
            System.out.println((int) i);
            break;
        }
    }
}
