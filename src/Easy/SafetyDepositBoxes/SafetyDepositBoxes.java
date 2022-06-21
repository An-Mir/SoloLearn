package Easy.SafetyDepositBoxes;

import java.util.Scanner;

import static java.util.Arrays.asList;

public class SafetyDepositBoxes {
    public static void main(String[] args) {
        int time = 0;

        Scanner input = new Scanner(System.in);
        String words = input.nextLine();
        String item = input.nextLine();
        input.close();

        time = 5 + 5 * asList(words.split(",")).indexOf(item);

        System.out.println(time);
    }
}