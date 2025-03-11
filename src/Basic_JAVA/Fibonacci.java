package Basic_JAVA;
import java.util.Scanner;
public class Fibonacci {
    public static void main(String[] args) {
        int a=0;
        int b=1;
        int sum=0;

        System.out.println("Enter the range of the fibonacci series");
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();

        System.out.print(a);
        System.out.print(" ");
        System.out.print(b);

        for(int i=1;i<n;i++){
            System.out.print(" ");
            sum=a+b;
            a=b;
            b=sum;
            System.out.print(sum);

        }
    }
}
