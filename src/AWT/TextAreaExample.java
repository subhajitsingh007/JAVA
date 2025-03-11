package AWT;
import java.awt.*;
public class TextAreaExample {
    TextAreaExample(){
        Frame f = new Frame("text area example");
        TextArea ta = new TextArea();

        ta.setBounds(100,200,250,250);

        f.add(ta);
        f.setSize(600,600);
        f.setLayout(null);
        f.setVisible(true);
    }
    public static void main(String[] args) {
        TextAreaExample taw = new TextAreaExample();
    }
}
