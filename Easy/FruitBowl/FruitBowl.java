package FruitBowl;

import java.util.Scanner;

public class FruitBowl {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int fruit = scanner.nextInt();
        scanner.close();

        //Dividing fruits and counting how many pies we can make
        int pie = (fruit / 2) / 3;
        System.out.println(pie);
    }
}
