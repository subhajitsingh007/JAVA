package Basic_JAVA;
import java.util.Scanner;
public class Prime {
    boolean isPrime(int n){
        for(int i=2;i<n;i++){
            if(n%i==0){
                return false;
            }

        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println("Enter the number");
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();


        Prime p = new Prime();
       if(p.isPrime(n)){
           System.out.println("The number is prime");
       }
       else{
           System.out.println("The number is not prime");
       }

    }
}
