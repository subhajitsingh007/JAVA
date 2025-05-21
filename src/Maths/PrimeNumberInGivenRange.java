package Maths;
import java.util.Scanner;
public class PrimeNumberInGivenRange {
    static boolean isPrime(int num){
        //edge case
        if(num==1 || num==0)
            return false;

        for(int i=2; i<num;i++){
            if(num%i==0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int lower;
        int upper;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the lower range");
        lower=sc.nextInt();
        System.out.println("Enter the upper range");
        upper=sc.nextInt();

        for(int i = lower;i<=upper;i++){
            if(isPrime(i)){
                System.out.print(i+" ");
            }
        }

    }
}
