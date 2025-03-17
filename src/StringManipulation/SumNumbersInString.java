package StringManipulation;
//Problem: Given a string, calculate the sum of numbers in a string (multiple consecutive digits are considered one number)
/*
Example 1:
Input: string = “123xyz”
Output: 123

Example 2:
Input: string = “1xyz23”
Output: 24
 */
public class SumNumbersInString {
    static int  findSum(String s){
        String tempSum = "0";
        int res = 0;

        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);

            if(Character.isDigit(c)){
                tempSum += c;


            }
            else{
                res = res + Integer.parseInt(tempSum);
                //resetting the tempSum
                tempSum = "0";
            }

        }
        return res + Integer.parseInt(tempSum);
    }


    public static void main(String[] args) {
        String str = "1bc268";
        System.out.print("Sum: ");
        System.out.println(findSum(str));
    }
}
