package AWT;
import java.awt.*;
public class FrameDemo  {

    public static void main(String[] args) {
        Frame f = new Frame("Frame Example");
        Label l = new Label("This is label 1");
        Button b1 = new Button("Click me");
        TextField tf = new TextField();

        f.setSize(800,400);
        f.setLayout(null);
        f.setVisible(true);


        f.add(l);
        f.add(b1);
        f.add(tf);

        b1.setBounds(100,100,60,20);
        l.setBounds(50,50,150,15);
        tf.setBounds(20, 100, 80, 30);







    }
}
