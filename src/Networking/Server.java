package Networking;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
public class Server {
    public static void main(String[] args) throws IOException {
        int port = 6666;
        System.out.println("Server is Started.......");
        ServerSocket ss = new ServerSocket(port);
        System.out.println("Server is waiting for the Client to responce.......");
        Socket s = ss.accept();
        System.out.println("Server is Connected with the Client.......");
//accept the input
        DataInputStream din = new DataInputStream(s.getInputStream());
        int n = din.readInt();
        System.out.println("Server is Computing Factorial of the given number.......");
//Find Factorial
        int result = 1;
        for (int i = n; i > 1; i--) result *= i;
//Send the result
        DataOutputStream dout = new DataOutputStream(s.getOutputStream());
        dout.writeInt(result);
        ss.close();
    }
}