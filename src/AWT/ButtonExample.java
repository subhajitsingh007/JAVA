package AWT;
import java.awt.*;
public class ButtonExample extends Frame {
    ButtonExample() {
        Button b = new Button("Click Me");
        add(b);
        b.setBounds(150,150,100,30);

        setTitle("Button Example");
        setLayout(null);
        setSize(400,400);
        setVisible(true);

    }

    public static void main(String[] args) {
        ButtonExample bt = new ButtonExample();

    }
}
