package Networking;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;
public class Client {
    public static void main(String[] args) throws IOException {
        String ip="localhost";
        int port=6666;
        Socket s=new Socket(ip,port);
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number : ");
        int number=sc.nextInt();
        DataOutputStream dout=new DataOutputStream(s.getOutputStream());
        dout.writeInt(number);
        DataInputStream din=new DataInputStream(s.getInputStream());
        System.out.println("Factorial of "+number+" is = "+din.readInt());
        s.close();
    }
}
