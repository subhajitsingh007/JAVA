package Multithreading;

import java.lang.*;
class MyThread implements Runnable{
    @Override
    public void run(){
        System.out.println("Thread "+Thread.currentThread().getId()+" is running" );
    }
}
public class RunnableInterface {
    public static void main(String[] args) {
        int n=8; //number of threads



        for (int i=0;i<n;i++){
           Thread obj = new Thread( new MyThread());
           obj.start();
        }
    }
}
