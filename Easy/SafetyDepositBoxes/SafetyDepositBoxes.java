package SafetyDepositBoxes;

import java.util.Scanner;

import static java.util.Arrays.asList;

public class SafetyDepositBoxes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String words = scanner.nextLine();
        String item = scanner.nextLine();
        scanner.close();

        int time = 5 + 5 * asList(words.split(",")).indexOf((item));
        //returning List of items (spliting them with ",") and finding item index in List
        System.out.println(time);
    }
}
