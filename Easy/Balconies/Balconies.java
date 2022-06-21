package Easy.Balconies;

import java.util.Scanner;

public class Balconies {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in).useDelimiter("[\\v,]+");
        int lenght1 = input.nextInt();
        int width1 = input.nextInt();
        int lenght2 = input.nextInt();
        int width2 = input.nextInt();

        if ((lenght1 * width1) > (lenght2 * width2)) {
            System.out.println("Apartment A");
        } else {
            System.out.println("Apartment B");
        }
        input.close();
    }
}