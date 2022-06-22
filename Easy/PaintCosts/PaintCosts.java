package PaintCosts;

import java.util.Scanner;

public class PaintCosts {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int numberOfPaint = scanner.nextInt();
        scanner.close();

        //Simple calculations and rounding the output
        double cost = ((5 * numberOfPaint) + 40) * 1.1;
        System.out.println(Math.round(cost));
    }
}
