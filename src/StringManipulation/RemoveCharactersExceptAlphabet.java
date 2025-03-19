package StringManipulation;
//Problem Statement: Write a program to remove all characters from a string except alphabets in a given string.
public class RemoveCharactersExceptAlphabet {
    public static void main(String[] args) {
        String str = "take12% *&u ^$#forward";

        StringBuffer ans = new StringBuffer();

        for(int i = 0;i < str.length(); i++){
           int ascii =  str.charAt(i); // for ascii value

            if(ascii>=65 && ascii <=90 || ascii>=97 && ascii<=122){
              ans.append(str.charAt(i));
            }
        }

        System.out.println("The string with only alphabets is "+ans);
    }

}
