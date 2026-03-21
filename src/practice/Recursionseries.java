package practice;

import java.util.Arrays;

public class Recursionseries {
    int count=0;
    void recursionExample(){
        System.out.print(count);
        count++;
        if(count==4){ //Base Condition
            return;
        }

        recursionExample();
    }
    void nameNtimesrec(int i,int n){

        if(i>n){
            return;
        }
        System.out.println("shyam");
        nameNtimesrec(i+1,n);

    }
//    void oneToN(int i,int n){
//
//        if(i>n){
//            return;
//        }
//        System.out.println(i);
//        oneToN(i+1,n);
//
//    }
    //Using Backtracking the same one To N
    void oneToN(int i,int n){

        if(i<1){
            return;
        }

        oneToN(i-1,n);
        System.out.println(i);

    }
//    void NToone(int i,int n){
//
//        if(n<i){
//            return;
//        }
//        System.out.println(n);
//        NToone(i,n-1);
//
//    }
void NToone(int i,int n){

    if(i>n){
        return;
    }

    NToone(i+1,n);

    System.out.println(i);



}
//reversing using the recursion using 1 two variable
    void swap(int arr[],int start,int end){
        int temp=arr[start];
        arr[start]=arr[end];
        arr[end]=temp;

    }

    int[] reverseRec(int[] arr,int start,int end){

        if(start>=end){
            return arr;
        }
        swap(arr,start,end);
        return reverseRec(arr,start+1,end-1);
    }

    //Multiple recursion in fibonacci series .

    int fibo(int num){
        if(num<=1){

            return num;
        }


        return (fibo(num-2)+fibo(num-1));
    }
    //Another efficient method for this fibonacci
     int fibo_1(int n){
        int a=0;
        int b=1;

        for(int i=0 ;i<n;i++){
            System.out.println(a);
            int c=a+b;
            a=b;
            b=c;



        }
         return a;


     }





    public static void main(String[] args){
        Recursionseries rec1=new Recursionseries();
       // rec1.recursionExample();
        //rec1. nameNtimesrec(1,10);
       //rec1. oneToN(10,10);
       // rec1. NToone(1,10);
//        int[] array={1,2,3,4,5};
//        System.out.print(Arrays.toString(rec1.reverseRec(array,0,4)));
        System.out.print(rec1.fibo_1(10));


    }


}
