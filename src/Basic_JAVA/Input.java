package Basic_JAVA;

import java.util.Scanner;
public class Input {
    public static void main(String[] args) {
        int age;
        System.out.println("Enter your age");
        Scanner sc = new Scanner(System.in);
        age=sc.nextInt();
        System.out.println("Your age is"+age);
    }
}
