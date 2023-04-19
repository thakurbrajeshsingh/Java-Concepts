package Collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class Main {
    public static void main(String[] args) {
        //       List is  parent = ArrayList is children
        List<Integer> list = new ArrayList<>();

        List<Integer> list2 = new LinkedList<>();

        list.add(1);
        list.add(2);
        list2.add(5);
        list2.add(6);
        System.out.println(list);
        System.out.println(list2);


//        Vector single threaded DS
        List<Integer> vector = new Vector<>();
        vector.add(45);
        vector.add(25);
        vector.add(35);
        vector.add(55);
        System.out.println("Vector "+vector);




    }
}
