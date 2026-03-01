package LeetCodeproblems;

import java.util.Scanner;

public class le709 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the String to convert :");
        String str = scan.nextLine();
        StringBuilder sb = new StringBuilder();

        for (char c : str.toCharArray()) {
            if (c >= 65 && c <= 90) {
                c = ((char) (c + 32));

            }
            sb.append(c);
        }

        System.out.println("The lower cased String:" + sb);

    }
}
