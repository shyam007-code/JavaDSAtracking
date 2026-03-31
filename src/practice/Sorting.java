package practice;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Sorting {
    int[] selection_sort(int array[]){

        for (int i=0;i<array.length -1;i++){  //0,1,2,3  n=5  -->n-1 times
            int min_index=i;
            for(int j=i+1;j<array.length;j++){  // 1,2,3,4
                if(array[j]<array[min_index]){
                    min_index=j;
                }
                 //swap


            }
            int temp=array[i];

            array[i]=array[min_index];
            array[min_index]=temp;
        }
        return array;
    }
    public static void main(String[] args) {
        Sorting s=new Sorting();
         int array[]={5,4,3,2,1};
        System.out.println( Arrays.toString(s.selection_sort(array)));
    }
}
