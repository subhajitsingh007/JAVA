package Stack;
import java.util.Stack;
public class InfixToPrefix {

    static String reverse(String str){
        StringBuilder rev = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            char c = str.charAt(i);
            if(c=='('){
                c=')';
            }
            else if(c==')'){
                c='(';
            }
            rev.append(c);
        }
        return rev.toString();
    }

    static int priority(char c ){
        if(c=='^') return 3;
        else if(c=='*'|| c=='/') return 2;
        else if(c=='+'|| c=='-') return 1;

        else return -1;
    }
    static String convertToPrefix(String str){
        //1st we have to reverse the given string
        str=reverse(str);

        //2nd convert it to postfix
        Stack<Character> st = new Stack<>();
        String ans = "";

        //iterate through the loop

        for(int i =0 ;i<str.length();i++){
            char ch = str.charAt(i);

            //if i is operand
            if((ch>='A'&&ch<='Z')|| (ch>='a'&&ch<='z') || (ch>='0'&&ch<='9') ){
               ans+=ch;
            }
            // If opening bracket, push to stack
            else if (ch == '(') {
                st.push(ch);
            }
            //if we encounter closing bracket pop and to the answer until we get opening bracket
            else if(ch==')'){
               while(!st.empty() && st.peek()!='('){
                   ans += st.pop();
               }
                st.pop();
            }
            //if operator we check the priority and then do operations
            else{
                //we cannot add two power operators into the stack.
                if(ch=='^'){

                while(!st.empty()&&priority(ch)>priority(st.peek())){
                    ans+=st.pop();
                }


                }
                else{
                    while(!st.isEmpty()&&priority(ch)<priority(st.peek())){
                        ans+=st.pop();
                    }
                    st.push(ch);

                }


            }
        }
        //checking if the stack still have elements
        while(!st.empty()){
            ans += st.pop();
        }

        ans = reverse(ans);

        return ans;

    }

    public static void main(String[] args) {
        String s = "(a-b/c)*(a/k-l)";
        System.out.println(convertToPrefix(s));
    }
}
