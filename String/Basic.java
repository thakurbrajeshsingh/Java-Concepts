package String;

import java.util.Arrays;

public class Basic {


    public static void main(String[] args) {

        int[] a = {1, 2, 3, 4, 5};
        int[] b = {1, 2, 3, 4, 5};


        System.out.println(a);
        System.out.println(b);

        b[2] = 0;
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));

    }


}
