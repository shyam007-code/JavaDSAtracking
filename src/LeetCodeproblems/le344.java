package LeetCodeproblems;

import java.util.Scanner;

public class le344 {
    public char[] reverse(char[]array) {
        int left = 0;
        int right = array.length - 1;

            while (left<right) {
                char temp=array[left];
                array[left] = array[right];
                array[right] = temp;
                left = left + 1;
                right = right - 1;
            }

        return array;
    }
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter the sixe of the array:");
        int n=scan.nextInt();
        char[] character_array=new char[n];
        for(int i=0;i<character_array.length;i++){
            character_array[i]=scan.next().charAt(0);


        }
        le344 obj=new le344();
        char[] result=obj.reverse(character_array);
        System.out.println(result);

    }
}
