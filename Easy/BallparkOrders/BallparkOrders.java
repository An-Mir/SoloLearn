package BallparkOrders;

import java.util.Scanner;

public class BallparkOrders {

    // Method to determine order cost before taxes
    static int getPrice(String s) {
        switch (s) {
            case "Nachos":
                return 6;
            case "Pizza":
                return 6;
            case "Cheeseburger":
                return 10;
            case "Water":
                return 4;
            default:
                return 5;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String order = scanner.nextLine();
        scanner.close();

        // Splitting input and making an Array with input values
        String[] orders = order.split(" ");
        int sum = 0;
        double totalPrice;

        //Adding prices of the entire order into int sum
        for (int i = 0; i < 4; i++) {
            sum += getPrice(orders[i]);
        }

        //Adding tax
        totalPrice = sum * 1.07;

        //Formating output
        System.out.printf("%.2f", totalPrice);
    }
}
