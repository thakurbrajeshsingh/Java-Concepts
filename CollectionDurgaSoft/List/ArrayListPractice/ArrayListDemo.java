package CollectionDurgaSoft.List.ArrayListPractice;

import java.util.ArrayList;

public class ArrayListDemo {


    public static void main(String[] args, int index) {
        ArrayList al = new ArrayList();
        al.add("A");
        al.add(1);
       int size =  al.size();
       System.out.println(al);
        al.add("C");
        al.add(5);
        al.add( index,'J');
        al.add(5,null);
        al.remove(1);
        System.out.println(al);


    }
}
