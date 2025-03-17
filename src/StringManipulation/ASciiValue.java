package StringManipulation;
import java.util.Scanner;
public class ASciiValue {

    public static void main(String[] args) {
        char c ;
        Scanner sc = new Scanner(System.in);
        c=sc.next().charAt(0);

        int asciivalue ;

        asciivalue = c;

        System.out.println("The ASCII value of the given character is"+asciivalue);

    }
}
