package HashMap;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.HashMap;

public class HashMap_Implementation {
    public static void main(String[] args) {
        //country(key),population(value)
        //It is unordered
        HashMap<String,Integer> map = new HashMap<>();

        //Insertion
        map.put("India",120);
        map.put("US",30);
        map.put("China",150);

        System.out.println(map);
        //If key already exists and we add it again this will update the value
        map.put("China",180);

        System.out.println(map);
    }
}
