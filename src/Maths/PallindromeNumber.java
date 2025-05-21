package Maths;
/*
When a number reads the same both forward and backward, it is a palindrome.
232 is pallindrome
 */
public class PallindromeNumber {
    static int reverse(int num){
        int temp = num;
        int rev = 0;
        while(temp>0){
            int digit = temp%10;
            rev = rev*10 + digit;
            temp/=10;
        }
        return rev;
    }
    static boolean isPallindrome(int num){
        int rev = reverse(num);

        if(num==rev){
            return true;
        }
        else return false;
    }

    public static void main(String[] args) {
        int n = 232;
        if(isPallindrome(n)){
            System.out.println("The number is pallindrome");
        }
        else{
            System.out.println("The number is not pallindrome");
        }

    }
}
