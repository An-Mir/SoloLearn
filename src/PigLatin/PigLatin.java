package PigLatin;

import java.util.Scanner;

public class PigLatin {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        String[] arr = text.split(" ");
        sc.close();

        StringBuilder sb = new StringBuilder();
        String newWord;
        for (String i:arr) {
            newWord = i.substring(1) + i.charAt(0);
            sb.append(newWord).append("ay ");

        }System.out.println(sb);
    }
}
