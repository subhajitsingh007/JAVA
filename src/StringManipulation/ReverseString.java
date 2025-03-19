package StringManipulation;
//Problem Statement: Reverse a String. Write a program that reverses a given string (in-place).


import java.util.*;

public class ReverseString {
    public static void main(String[] args) {
        String str = "HELLO";

        char [] reversedstring = new char[str.length()];
        //declaring a stack
        Stack<Character> st = new Stack<Character>();

        //pushing the elements of string into the stack
        for(int i = 0; i < str.length(); i++){
            //this line will push the character of every index into the stack;
            st.push(str.charAt(i));

        }

        //now popping the stack to get reverse string
        int i = 0;
        while(!st.isEmpty()){
            reversedstring[i++]=st.pop();
        }

        str = new String(reversedstring);

        System.out.println("The reversed string is "+str);

    }
}
