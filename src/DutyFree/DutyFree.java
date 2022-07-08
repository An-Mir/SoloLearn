package DutyFree;

import java.util.Scanner;

public class DutyFree {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String prices = input.nextLine();
        String[] price = prices.split(" ");

        double firstPrice = Double.parseDouble(price[0]);
        double secondPrice = Double.parseDouble(price[1]);
        double thirdPrice = Double.parseDouble(price[2]);
        double fourthPrice = Double.parseDouble(price[3]);

        if ((firstPrice * 1.1) >= 20) {
            System.out.println("Back to the store");
        }else if ((secondPrice * 1.1) >= 20) {
            System.out.println("Back to the store");
        }else if ((thirdPrice * 1.1) >= 20) {
            System.out.println("Back to the store");
        }else if ((fourthPrice * 1.1) >= 20) {
            System.out.println("Back to the store");
        }else{
            System.out.println("On to the terminal");
        }
    }
}
