package Easy.Balconies;

import java.util.Scanner;

public class Balconies {

    public static void main(String[] args) {

        //Dividing input into primitive int numbers using Delimiter
        Scanner input = new Scanner(System.in).useDelimiter("[\\v,]+");
        int lenght1 = input.nextInt();
        int width1 = input.nextInt();
        int lenght2 = input.nextInt();
        int width2 = input.nextInt();
        input.close();

        //Finding out which balcony is larger
        if ((lenght1 * width1) > (lenght2 * width2)) {
            System.out.println("Apartment A");
        } else {
            System.out.println("Apartment B");
        }
    }
}