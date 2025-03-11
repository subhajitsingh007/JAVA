package AWT;
import java.awt.*;
public class ListExample {
    public static void main(String[] args) {
        Frame f = new Frame("List Example");
        List l = new List();
        l.setBounds(30,30,100,100);
        l.add("Java");
        l.add("AWT");
        l.add("Python");
        l.add("VB");

        f.add(l);
        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);
    }
}
