package Exception_Handling;
/*
Exercise 2: File Not Found Exception
Write a program to read a file named data.txt.

Handle the FileNotFoundException using the throws keyword.
 */

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileNotFoundExceptions  {
    public void readFile() throws IOException {
        FileReader file = new FileReader("data.txt");
        BufferedReader br = new BufferedReader(file);
        try{
            System.out.println(br.readLine());
        } finally{
            br.close(); //Ensure resource is closed
        }

    }
    public static void main(String[] args) {
        FileNotFoundExceptions obj = new FileNotFoundExceptions();
        try{
            obj.readFile();
        }catch(IOException e) {
            System.out.println("File not found or cannot be found "+e.getMessage());

        }

    }
}
