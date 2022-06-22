package GuardFlamingos;

import java.util.Scanner;

public class GuardFlamingos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        int width = scanner.nextInt();
        scanner.close();

        //Simple calculations
        System.out.println(length + width);
    }
}
