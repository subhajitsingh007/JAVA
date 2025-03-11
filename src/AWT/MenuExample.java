package AWT;
import java.awt.*;
public class MenuExample {
    public static void main(String[] args) {
        Frame f = new Frame("Menu Example");
        MenuBar mb = new MenuBar();
        Menu m = new Menu("Subhajit Singh");
        MenuItem m1 = new MenuItem("Option 1");
        MenuItem m2 = new MenuItem("Option 2");
        m.add(m1);
        m.add(m2);
        mb.add(m);
        f.setMenuBar(mb);
        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);


    }
}
