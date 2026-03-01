package LeetCodeproblems;

import java.util.Arrays;
import java.util.Scanner;

public class le1480 {




    public  int[] sum_of_array(int[] array) {
        int sum = 0;
        int[] running_array=new int[array.length];
        for (int i = 0; i < array.length; i++) {

         running_array[i]=sum+array[i];
         sum=sum+array[i];
        }
        return  running_array;
    }

    public static void main(String[] args){

        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int[] array=new int[n];
        for(int i=0;i<n;i++){
            array[i]=scan.nextInt();
        }
        le1480 obj=new le1480();
        int[] result=obj.sum_of_array(array);
        System.out.println(Arrays.toString(result));



    }
}
