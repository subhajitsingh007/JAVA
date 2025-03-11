package AWT;
import java.awt.*;
public class TextFieldExample {
    TextFieldExample(){
        Frame f = new Frame("Textfield ");
        TextField tf = new TextField();

        tf.setBounds(100,100,200,50);

        f.add(tf);
        f.setSize(500,500);
        f.setLayout(null);
        f.setVisible(true);

    }
    public static void main(String[] args) {
        TextFieldExample tfw = new TextFieldExample();

    }
}
