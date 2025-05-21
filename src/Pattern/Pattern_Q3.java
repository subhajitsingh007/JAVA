package Pattern;
/*
NUmber Triangular
     1
    2 2
   3 3 3
  4 4 4 4

 */
import java.util.Scanner;
public class Pattern_Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {         // Outer loop for rows (i = 1 to n)

            // 1. Print leading spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");         // Single space
            }

            // 2. Print numbers with a space
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");     // Print the row number followed by a space
            }

            // 3. Move to the next line
            System.out.println();
        }

    }
}
