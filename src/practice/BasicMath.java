package practice;

import static java.lang.Math.max;
import static java.lang.Math.min;

class CountNumbers{
    public void countnums(int n) {
        int count=0;
        while (n > 0) {
            n=n/10;
            count+=1;
        }
        System.out.println(count);
    }
    public int reverseAnumber(int n){
        int reverse=0;
        while(n>0){
            reverse=(reverse*10)+ n%10;
            n=n/10;
        }
        return reverse;
    }
    public void palindrome(int n){
        int dup=n;
        int reverse=0;
        while(n>0){
            reverse=(reverse*10)+ n%10;
            n=n/10;

        }
        if(reverse==dup){
            System.out.println("True");
        }
        else{
            System.out.println("fALSE");
        }

    }
    public void Gcd(int n1, int n2){
        int gcd=1;
        for(int i=1;i<min(n1,n2);i++){
            if(n1%i==0 && n2%i==0){
                gcd=i;
            }


        }
        System.out.println(gcd);

    }
    public void AnotehrApproachGcd(int n1, int n2) {
        //Using the Eculeadian algorithm
        int a = n1;
        int b = n2;
        while (a > 0 && b > 0) {
            if (a > b) {
                a = a % b;
//
            } else {
                b = b % a;
//
            }
        }
        if (a == 0) {
            System.out.println("gcd " + b);

        } else {

            System.out.println("gcd " + b);


        }


    }


}

public class BasicMath {
    public static void main(String[] args){
        CountNumbers count=new CountNumbers();
        //count.countnums(123);
       // System.out.println(count.reverseAnumber(123));

        //count.palindrome(1210);
        count.AnotehrApproachGcd(21,36);
    }
}
