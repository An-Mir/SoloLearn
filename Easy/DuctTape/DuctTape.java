package DuctTape;

import java.util.Scanner;

public class DuctTape {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int height = scanner.nextInt();
        int width = scanner.nextInt();
        scanner.close();

        //Determining how many square feet we need
        int need = height * width * 2;
        int tape = (60 / 12) * 2;

        //Using Math.ceil we round upwards and transforming doble into int using (int)
        int result = (int) Math.ceil((double) need / tape);

        System.out.println(result);
    }
}
