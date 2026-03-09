package practice;
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


}

public class BasicMath {
    public static void main(String[] args){
        CountNumbers count=new CountNumbers();
        //count.countnums(123);
       // System.out.println(count.reverseAnumber(123));

        count.palindrome(1210);
    }
}
