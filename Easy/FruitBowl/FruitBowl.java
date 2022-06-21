package FruitBowl;

import java.util.Scanner;

public class FruitBowl {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int fruit = scanner.nextInt();

        int pie = (fruit / 2) / 3;
        System.out.println(pie);
    }
}
