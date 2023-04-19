package String;

public class Methods {
    public static void main(String[] args) {
        String str = "Hello World";
        String str2 = "Hello World";
        String str3 = new String("Hello World");

        System.out.println(str.length()); //11   counts alphabets and icluding spaces
        System.out.println(str.equals(str2));


//        equal vs ==
        System.out.println(str.equals(str3));   //true
        System.out.println(str == str3);        //false

        String[] strArr = str.split(" ");
        System.out.println(strArr[1].length());


        String strAns = "Hello World";
        String[]  strArr1 = strAns.split(" ");
        String lastWord = strArr1[strArr1.length-1];
//        System.out.println(lastWord.length());


//        trim
        System.out.println("Trim: "+strAns.trim());


        System.out.println(str.contains("z"));

    }
}
