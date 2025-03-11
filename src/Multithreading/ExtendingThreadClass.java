package Multithreading;
import java.lang.*;

class MyThread1 extends Thread{
    @Override
    public void run(){
        int i=0;
        while(i<=100){
            System.out.println("This is thread 1");
            System.out.println("I am Subhajit");
            i++;
        }

    }
}
class MyThread2 extends Thread{
    @Override
    public void run(){
        //A thread begins its life inside run() method
        int i=0;
        while(i<=100){
            System.out.println("This is thread 2");
            System.out.println("I study in BBIT");
            i++;
        }

    }
}
public class ExtendingThreadClass {
    public static void main(String[] args) {
        MyThread1 t1= new MyThread1();
        MyThread2 t2= new MyThread2();


        //We create an object of our new class and call start() method to start the execution of a thread. Start() invokes the run() method on the Thread object.
        t1.start();
        t2.start();

    }
}
