package Oops;

public class WrapperClass {
    public static void main(String[] args) {

        int a=10;
        Integer num = 20; //It is Object of class Integer
        int ans =num.compareTo(20);
        System.out.println(check(ans));


        System.out.println(ans);
    }
    static boolean check(int ans){
        if(ans == -1){
            return false;
        }else {
            return true;
        }
    }
}
