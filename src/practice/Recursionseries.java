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
    void oneToN2(int i,int n){

        if(i>n){
            return;
        }
        System.out.println(i);
        oneToN2(i+1,n);

    }
    //Using Backtracking the same one To N
    void oneToN1(int i,int n){

        if(i<1){
            return;
        }

        oneToN1(i-1,n);
        System.out.println(i);

    }
    void NToone1(int i,int n){

        if(n<i){
            return;
        }
        System.out.println(n);
        NToone1(i,n-1);

    }
void NToone2(int i,int n){

    if(i>n){
        return;
    }

    NToone2(i+1,n);

    System.out.println(i);

}

 //suming numbers using parameterized recursion
    public void sum(int n,int sum){
        if(n<0){
            System.out.println(sum);
            return;
        }
      sum(n-1,sum+n);
    }
    //Functional way to upto n sum using recurion
    public int sumfunctionway(int n){
        if(n==0){
            return 0;
        }
        return n+sumfunctionway(n-1);
    }
    public static void main(String[] args){
        Recursionseries rec1=new Recursionseries();
       // rec1.recursionExample();
        //rec1. nameNtimesrec(1,10);
       //rec1. oneToN(10,10);
       // rec1. NToone(1,10);
      // rec1.sum(3,0);
       // System.out.println(rec1.sumfunctionway(3));

    }


}
