package LeetCodeproblems;

import java.util.Scanner;

public class twopointerpract {
    public void twopointer(int[] array,int target){
        int left=0;
        int right=array.length-1;
        int found=0;
        while(left<right){
            if(array[left]+array[right]==target){
                System.out.println("taget found "+array[left]+" + "+array[right]+" = "+target );
                found=1;
                return;

            } else if (array[left]+array[right]<target) {
                left=left+1;

            }else {
                right=right-1;
            }

        }
        if (found==1){
            System.out.println("No matching pairs found");
        }
    }



    public static void main(String[] args){

        int[] array={1,2,3,4,5,6};
        twopointerpract obj=new twopointerpract();
        System.out.print("Enter the target:");
        Scanner scan=new Scanner(System.in);
        int target=scan.nextInt();
        obj.twopointer(array,target);

    }
}
