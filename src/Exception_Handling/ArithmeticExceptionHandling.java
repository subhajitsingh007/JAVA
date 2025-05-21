package Exception_Handling;
/*
Exercise 1: ArithmeticException Handling
Write a program that takes two integers as input and divides them.

Handle the ArithmeticException if the denominator is zero.
 */

import java.util.Scanner;
public class ArithmeticExceptionHandling {
    public static void main(String[] args) {
        int a;
        int b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the dividend");
        a=sc.nextInt();
        System.out.println("Enter the number to divide");
        b=sc.nextInt();

        try{
            int c = a/b;
            System.out.println("Answer is "+c);
        }catch(ArithmeticException e){
            System.out.println("Error: Cannot divide by zero. " + e.getMessage());
        }

    }
}
