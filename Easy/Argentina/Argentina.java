package Easy.Argentina;

import java.util.Scanner;

public class Argentina {

    static int newPriceInDollars;

    // Exchanging Pesos into Dollars
    static int getDollars (int pesos) {
        return newPriceInDollars = (int) (pesos * 0.02);
    }

    // Method to compare prices in Dollars and in Pesos
    static void compare(int getDollars, int dollars) {
        if (getDollars < dollars) {
            System.out.println("Pesos");
        }else{
            System.out.println("Dollars");
        }
    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int pesos = input.nextInt();
        int dollars = input.nextInt();
        input.close();

        compare(getDollars(pesos), dollars);

    }
}