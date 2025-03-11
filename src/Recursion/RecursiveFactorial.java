package Recursion;
import java.util.Scanner;
public class RecursiveFactorial {
    public static int factorial(int n){
        // base case
        if(n==1){
            return n;
        }
        return n*factorial(n-1);
    }

    public static void main(String[] args) {
        int n;
        System.out.println("Enter the number");
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();

        System.out.println("Factorial of the number is:");
        System.out.println(factorial(n));
    }
}
