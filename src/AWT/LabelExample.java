package AWT;
import java.awt.*;
public class LabelExample {
    public static void main(String[] args) {
        Frame f = new Frame("Label Example");
        Label l1 = new Label();
        Label l2 = new Label();

        l1.setBounds(100,100,200,50);
        l2.setBounds(100,150,200,50);
        l1.setText("Hi! this is Subhajit here");
        l2.setText("What do you wanna know?");

        f.add(l1);
        f.add(l2);

        f.setLayout(null);
        f.setSize(500,500);
        f.setVisible(true);
    }
}
