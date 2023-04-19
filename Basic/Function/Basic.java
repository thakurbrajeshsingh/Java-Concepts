package Basic.Function;

public class Basic {
    public static void main(String[] args) {
//        String msg = greeting();
//        System.out.println(msg);
        int age=10;
        int age2=20;
        changeAge(10,20);
        System.out.println(age+" "+age2);
        int[] arr ={1,2,3,4};
        changeArr(arr);
        System.out.println(arr[0]);
    }


    static  void changeAge(int a,int b){
        a=5;
        b=30;
    }
    static  void changeArr(int[] arry){
      arry[0]=5;
    }

    static String greeting(){
        String greet ="How are you!!!";

        return greet;
    }

}
