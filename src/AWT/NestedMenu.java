package AWT;
import java.awt.*;
public class NestedMenu {
    public static void main(String [] args) {
        Frame f= new Frame("Nested Menu Example");
        MenuBar mb = new MenuBar();
        Menu mn1= new Menu("Cars");

        MenuItem m1 = new MenuItem("Honda");
        MenuItem m2 = new MenuItem("Chevy");
        MenuItem m3 = new MenuItem("Porshe");
        mn1.add(m1);
        mn1.add(m2);
        mn1.add(m3);
        mb.add(mn1);

        Menu mn2 = new Menu("Bikes");
        MenuItem m4 = new MenuItem("Bugatti");
        MenuItem m5 = new MenuItem("Harley");
        mn2.add(m4);
        mn2.add(m5);
        mb.add(mn2);



        Menu mn3 = new Menu("Planes");
        MenuItem m6 = new MenuItem("Boeing");
        MenuItem m7 = new MenuItem("KingFisher");
        MenuItem m8 = new MenuItem("Air India");
        mn3.add(m6);
        mn3.add(m7);
        mn3.add(m8);
        mb.add(mn3);

        f.setMenuBar(mb);
        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);



    }

}