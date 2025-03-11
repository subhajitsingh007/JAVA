package AWT;
import java.awt.*;
public class CheckboxGroup1 {
    CheckboxGroup1(){
        Frame f = new Frame("ChcekboxGroup Example");
        CheckboxGroup cbg = new CheckboxGroup();

        Checkbox  cb1 = new Checkbox("AJP",cbg,true);
        Checkbox  cb2 = new Checkbox("JP",cbg,false);
        Checkbox  cb3 = new Checkbox("C++",cbg,false);

        cb1.setBounds(50,50,40,30);
        cb2.setBounds(50,90,40,30);
        cb3.setBounds(50,130,40,30);

        f.add(cb1);
        f.add(cb2);
        f.add(cb3);

        f.setLayout(null);
        f.setSize(400,400);
        f.setVisible(true);
    }
    public static void main(String[] args) {
        CheckboxGroup1 cb = new CheckboxGroup1();

    }
}
