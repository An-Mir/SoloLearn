package CheerCreator;

import java.util.Scanner;

public class CheerCreator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int yards = scanner.nextInt();
        scanner.close();

        //Determining output using input and if statement
        if (yards > 10) {
            System.out.print("High Five");
        } else if (yards < 1) {
            System.out.print("shh");
        } else {
            System.out.print("Ra!".repeat(yards));
        }
    }
}
