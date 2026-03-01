package LeetCodeproblems;

import java.util.Arrays;
import java.util.Scanner;

public class le1920 {
    public int[] permutation(int[] arrray){
        int[] ans=new int[arrray.length];
        for(int i=0;i<arrray.length;i++){

         ans[i]=arrray[arrray[i]];


        }
        return ans;

    }
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int[]array=new int[n];
        for(int i=0;i<array.length;i++) {
            array[i]=scan.nextInt();

        }
        int[] result=array;
        System.out.println("input"+ Arrays.toString(result));
        le1920 obj=new le1920();
        System.out.println( obj.permutation(result));
    }
}
