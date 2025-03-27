package Stack;
//In this prog. we are gonna create a stack and add basic operations like push(),pop(),isFull(),peek();

class Stack{
   private int maxsize;
   private int top;
   private int [] stack;


   //constructor to initialize stack
    public Stack(int size){
        maxsize = size;
        stack = new int[maxsize];
        top=-1;

    }

    //check if the stack is full
    public boolean isFull(){
        return top == maxsize - 1;

    }
    //check if the stack is empty
    public boolean isEmpty(){
        return top == -1;
    }

    public void push(int val){
        //handling the edge case first
        if(isFull()){
            System.out.println("The stack is full,this element cannot be inserted");
            return;
        }


        top = top + 1;
        stack[top] = val;


    }

    public int pop(){
        if(isEmpty()){
            System.out.println("The stack is empty");
            return -1;
        }

        return stack[top--];
    }

    public int size(){
        return top + 1;
    }

    public void display(){
        if(isEmpty()){
            System.out.println("The stack is empty");
        }

        else{
            for(int i = 0; i<=top;i++){
                System.out.print(stack[i]+" ");
            }
            System.out.println();
        }
    }



}
public class StackBasic {

    public static void main(String[] args) {
        Stack st = new Stack(3); // Stack of size 3

        st.push(10);
        st.push(20);
        st.push(30);
        st.display();

        System.out.println("Is stack full? " + st.isFull()); // True

        st.pop();
        st.display();

        System.out.println("Is stack full? " + st.isFull()); // False





    }
}
