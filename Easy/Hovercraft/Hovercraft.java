package Hovercraft;

import java.util.Scanner;

public class Hovercraft {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sold = scanner.nextInt();
        scanner.close();

        //Calculations
        int howercraftsBuildPerMonth = 10;
        int howercraftPrice = 2;
        int insurance = 1;
        int monthlyExpenses = (howercraftsBuildPerMonth * howercraftPrice) + insurance;
        int monthlyIncome = sold * 3;
        int result = monthlyIncome - monthlyExpenses;

        //If statement
        if (result > 0) {
            System.out.println("Profit");
        } else if (result < 0) {
            System.out.println("Loss");
        } else {
            System.out.println("Broke Even");
        }
    }
}
