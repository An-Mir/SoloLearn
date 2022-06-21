package Argentina;

import java.util.Scanner;

public class Argentina {

    static int newPriceInDollars;

    static int getDollars (int pesos) {
        return newPriceInDollars = (int) (pesos * 0.02);
    }

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

        compare(getDollars(pesos), dollars);

    }
}