package Oops.Polymorphism;
/*
Exercise 2: Runtime Polymorphism
Create a superclass Person with a method work().

Create subclasses Teacher and Doctor that override the work() method with specific behaviors.

Create objects of each class and call the work() method using polymorphism.
 */
class Person{
    void work(){
        System.out.println("Person is working");
    }
}
class Teacher extends Person{
    void work(){
        System.out.println("Teacher is teaching");
    }
}
class Doctor extends Person{
    void work(){
        System.out.println("Doctor is doing treatment");
    }
}
public class PolymorphismExample {
    public static void main(String[] args) {
        Person tr = new Teacher();
        Person dr = new Doctor();

        tr.work();
        dr.work();




    }
}
