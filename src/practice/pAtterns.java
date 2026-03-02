package practice;

public class pAtterns{
    public void pattern1() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public void pattern2(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }

            System.out.println();
        }

    }
    public void pattern3(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    public void pattern4(int n){
        int num=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(num+" ");
            }
            num+=1;
            System.out.println();

        }
    }
    public void pattern5(int n){
        for(int i=0;i<=n;i++){
            for(int j=0;j<n-i;j++){
                System.out.print("* ");
            }

            System.out.println();
        }
    }
    public void pattern6(int n){
        for(int i=0;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(j+" ");
            }

            System.out.println();
        }
    }
    public void pattern7(int n){
        int space=n;
        for(int i=1;i<=n;i++){

            //space
            for(int j=1;j<=space;j++)
            {
                System.out.print(" ");
            }

            //stars
            for(int j=1;j<=2*n-1-i;j++){
                System.out.print("*");

            }
            //space
            for(int j=1;j<=space;j++)
            {
                System.out.print(" ");
            }
            space-=1;
            System.out.println();
        }
    }
    public void pattern8(int n){
        for(int i=0;i<=n;i++){
            //space
            for(int j=1;j<=i;j++){
                System.out.print(" ");
            }
            //stars
            for(int j=0;j<2*n-1-i*2;j++){
                System.out.print("*");
            }
            //space
            for(int j=1;j<=i;j++){
                System.out.print(" ");
            }
            System.out.println();


        }

    }
    public void pattern9(int n){

        int k;
        for(int i=1;i<=2*n;i++){

            if(i<=n){
                k=i;
            }
            else{
                k=2*n-i+1;
            }
            int space=n-k;
            int stars=2*k-1;
            //space
            for(int j=1;j<=space;j++){
                System.out.print(" ");
            }

            //stars
            for(int j=1;j<=stars;j++){
                System.out.print("*");
            }
            //space
            for(int j=0;j<=space;j++){
                System.out.print(" ");
            }
            System.out.println();
        }


    }
    public void pattern10(int n){
        for(int i=1;i<=2*n-1;i++){
            int stars;
            if(i<=n){
                stars=i;
            }
            else{
                stars=2*n-i;
            }
            for(int j=1;j<=stars;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public void pattern11(int n){

        for(int i=1;i<=n;i++){
            int k;
            if(i%2==0){
                k=0;
            }
            else{
                k=1;
            }
            for(int j=1;j<=i;j++){
                System.out.print(k +" ");
                k=(k==1)?0:1;

            }

            System.out.println();
        }
    }




}
