package Basic_JAVA;
import java.sql.SQLOutput;
import java.util.Scanner;
public class Hello {
    public static void main(String[] args) {

        int a , b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number");
        a=sc.nextInt();
        System.out.println("Enter the second number");
        b=sc.nextInt();
        int sum = a+b;

        System.out.println("The addition of the numbers are "+sum);

    }

}
