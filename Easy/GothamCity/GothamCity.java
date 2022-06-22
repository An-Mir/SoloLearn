package GothamCity;

import java.util.Scanner;

public class GothamCity {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int criminals = scanner.nextInt();
        scanner.close();

        //Simple if statement
        if (criminals < 5) {
            System.out.println("I got this!");
        } else if (criminals <= 10) {
            System.out.println("Help me Batman");
        } else {
            System.out.println("Good Luck out there!");
        }
    }
}
