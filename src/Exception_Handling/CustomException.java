package Exception_Handling;
/*
Exercise 3: Custom Exception
Create a custom exception NegativeAmountException.

Throw it if the user enters a negative amount for a bank transaction.
 */
class NegativeAmountException extends Exception{
    //constructor
  public NegativeAmountException(String message){
      super(message);
  }

}
public class CustomException {
    static void checkAmount(int amount) throws NegativeAmountException{
        if(amount<0){
            throw new NegativeAmountException("The entered amount cannot be negative");
        }

    }
    public static void main(String[] args) {
        try{
            checkAmount(-200);
        } catch(NegativeAmountException e){
            System.out.println(e.getMessage());
        } finally{
            System.out.println("Finally block is executed...");
        }


    }
}
