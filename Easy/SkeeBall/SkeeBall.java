package Easy.SkeeBall;

import java.util.Scanner;

public class SkeeBall {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int points = input.nextInt();
        int costInTickets = input.nextInt();

        int tickets = points / 12;
        if (tickets >= costInTickets) {
            System.out.println("Buy it!");
        } else {
            System.out.println("Try again");
        }
    }
}

