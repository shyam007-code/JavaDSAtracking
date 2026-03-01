package LeetCodeproblems;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class le412 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number for this fizz buzz game");
        int num = scan.nextInt();
        List<String> li = new ArrayList<>();
        for (int i = 1; i<=num; i++) {
            if ((i%3==0) && (i%5==0)) {
                li.add("FizzBuzz");
            }
            else if(i%3==0){
                li.add("Fizz");
            }
            else if(i%5==0){
                li.add("Buzz");
            }
            else{
                li.add(String.valueOf(i));
            }

        }
    System.out.println(li);
    }

}
