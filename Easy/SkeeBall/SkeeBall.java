package Easy.SkeeBall;

import java.util.Scanner;

public class SkeeBall {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int points = input.nextInt();
        int costInTickets = input.nextInt();
        input.close();

        //Find out how many tickets we will get
        int tickets = points / 12;

        //Determining if we have enough tickets
        if (tickets >= costInTickets) {
            System.out.println("Buy it!");
        } else {
            System.out.println("Try again");
        }
    }
}

