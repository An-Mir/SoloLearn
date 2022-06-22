package Medium.PigLatin;

import java.util.Scanner;

public class PigLatin {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        sc.close();
        // Splitting input and making an Array with input values
        String[] arr = text.split(" ");

        //Making StringBuilder so we can change values
        StringBuilder sb = new StringBuilder();
        String newWord;

        //Using ForEach loop, we change words by subtracting first letter
        //and putting it to the end, and then adding "ay" to the end
        for (String i:arr) {
            newWord = i.substring(1) + i.charAt(0);
            sb.append(newWord).append("ay ");

        }System.out.println(sb);
    }
}
