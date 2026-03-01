package LeetCodeproblems;

import java.util.Scanner;

public class le9 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number that you want check for palindrome:");
        int num=scan.nextInt();
        if((num!=0 && num%10==0) || num<0){
            System.out.println("It is not a palindrome");
            return;
        }
        int reversed=num;
        int remaining=0;
        while(reversed>remaining){
            int number=reversed % 10;
            remaining=(remaining*10)+number;
            reversed=reversed/10;
        }
        if(reversed==remaining){
            System.out.println("the given number"+num+"is a PALINDROME");

        }
        else if(reversed<remaining){
            remaining=remaining/10;
            if(reversed==remaining){
                System.out.println("the given number "+num+"is a PALINDROME");

            }

        }

    }
}
