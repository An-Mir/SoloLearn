package Candles;

import java.util.Scanner;

public class Candles {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int friends = scanner.nextInt();
        scanner.close();

        //Simple calculations
        int result = (friends * 9) + 9;
        System.out.println(result);
    }
}
