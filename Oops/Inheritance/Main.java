package Oops.Inheritance;

public class Main {
    public static void main(String[] args) {
        Box b1= new Box();
        Box b2=new Box(2);
        Box b3=new Box(2,3,4);
        Box b4 = new Box(b3);

        BoxWeight box = new BoxWeight();

//        System.out.println(box.h+" "+box.weight);
//        BoxWeight box2 = new BoxWeight(1,2,3,4);

//        System.out.println(b1.l+" "+b1.h+" "+b1.w);


          Box box5 = new Box(12);
          Box box7 = new Box(12);

          if(box5 == box7){
              System.out.println("==");
          }
        if (box7.equals(box7)) {
            System.out.println("equals");
        }

//        BoxWeight box6 = new Box();
//        System.out.println(box5.w);

        BoxPrice box6= new BoxPrice();
//        System.out.println(box6.l);

    }
}
