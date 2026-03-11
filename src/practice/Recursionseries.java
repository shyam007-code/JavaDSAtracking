package practice;

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
    public static void main(String[] args){
        Recursionseries rec1=new Recursionseries();
       // rec1.recursionExample();
        //rec1. nameNtimesrec(1,10);
       //rec1. oneToN(10,10);
        rec1. NToone(1,10);


    }


}
