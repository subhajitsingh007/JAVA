package Recursion;
import java.util.Scanner;
public class PrintNumberTillN {
    public static void  printN(int n){
        if(n<=0)
            return ;
        printN(n-1);
        System.out.println(n+" ")  ;
    }
    public static void main(String[] args) {
        System.out.println("Enter the range of n");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

       printN(n);

    }
}
