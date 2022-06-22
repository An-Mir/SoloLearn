package EasterEggs;

import java.util.Scanner;

public class EasterEggs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int total = scanner.nextInt();
        int you = scanner.nextInt();
        int friend = scanner.nextInt();
        scanner.close();

        //Simple if statement
        if ((you + friend) == total){
            System.out.println("Candy Time");
        } else {
            System.out.println("Keep Hunting");
        }
    }
}
