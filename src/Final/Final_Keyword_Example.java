package Final;
/*
✅ Practice Exercises:
Exercise 1: Final Variables
Create a Book class with a final int ISBN.

Initialize it through the constructor and display it.
 */
class Book{
    private final int ISBN;
    Book( int ISBN){
       this.ISBN = ISBN;
    }

    void display(){
        System.out.println("The ISBN of the book is:"+ISBN);
    }
}
public class Final_Keyword_Example {
    public static void main(String[] args) {
        Book obj = new Book(123456789);
        obj.display();

    }
}
