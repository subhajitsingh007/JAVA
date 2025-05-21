package StringManipulation;
// A string is given , you need to find longest word starting with vowel and has even length
public class LongestWordVowel {
    //method to check if it is a vowel
    static boolean isVowel(char ch){
        if(ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U' || ch=='a' || ch=='e' || ch== 'i' || ch=='o' || ch=='u'){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        String s = "He is a smart boy";
        String [] str = s.split(" ");
        String longest = "";

       for(int i = 0; i<str.length; i++){
           String word = str[i];

           if(word.length()>0 && isVowel(word.charAt(0)) && word.length()%2==0){
               if(word.length()>longest.length()){
                   longest = word;
               }


           }
       }

       if(longest.equals("")) System.out.println("Word starting with vowel does not exist");

       else{
           System.out.println("Longest word starting with vowel "+longest);
       }


    }
}
