package BallparkOrders;

import java.util.Scanner;

public class BallparkOrders {

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
        String[] orders = order.split(" ");
        int sum = 0;
        double totalPrice = 0.0;
        for (int i = 0; i < 4; i++) {
            sum += getPrice(orders[i]);
        }
        totalPrice = sum * 1.07;
        System.out.printf("%.2f", totalPrice);
    }
}
