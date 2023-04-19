package Oops.Inheritance;

public class Box {

    double l;
    double h;
    double w;

    Box(double l, double h, double w) {
        this.l = l;
        this.h = h;
        this.w = w;
    }
    Box(){
        this.l=-1;
        this.h=-1;
        this.w=-1;
    }
    Box(Box other){
        this.l=other.l;
        this.h=other.h;
        this.w=other.w;
    }
    Box(double side){
        this.l = side;
        this.h = side;
        this.w = side;
    }

    public static  void information(){
        System.out.println("Box is Running");
    }


}
