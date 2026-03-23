package practice;

public class Sorting {
    void selection_sort(int[]array){
        for(int i=0 ;i< array.length-1;i++){
            int min=array[i];
            for(int j=i;j<array.length;j++){
                if(array[j]<min){
                    min=array[j];
                    int temp=array[i];
                    array[i]=min;
                    array[j]=temp;
                }
            }


            }
        System.out.println("Sorted array:");
        for(int i:array){
            System.out.println(i);
        }
    }
    public static void main (String[]args){
        Sorting sort=new Sorting();
        int[]array={1,4,5,3,2};
        sort.selection_sort(array);
    }
}
