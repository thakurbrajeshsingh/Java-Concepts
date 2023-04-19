package Oops.ObjectCloning;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws CloneNotSupportedException{
        Human Brajesh = new Human(19,"Brajesh");
//        Human twin = new Human(Brajesh);
//        System.out.println(twin.age + " "+twin.name);
        Human twin = (Human) Brajesh.clone();
        System.out.println(twin.name +" "+twin.age);
        System.out.println(Arrays.toString(twin.arr));

        twin.arr[0]=100;

        System.out.println(Brajesh.arr[0]);
    }

}
