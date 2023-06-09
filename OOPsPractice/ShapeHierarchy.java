package OOPsPractice;


import java.util.Arrays;
import java.util.Scanner;

interface Shape {
    abstract double getArea();

    abstract double getPerimeter();
}

abstract class AbstractShape implements Shape {
    private String colour;

    AbstractShape(String colour) {
        this.colour = colour;
    }

    void setColour(String colour) {
        this.colour = colour;
    }

    String getColour() {
        return colour;
    }

    @Override
    public String toString() {
        return String.format("Colour=%s", colour);
    }
}


class Rectangle extends AbstractShape {
    private int length;
    private int breadth;

    Rectangle(String colour, int length, int breadth) {
        super(colour);
        this.length = length;
        this.breadth = breadth;
    }


    @Override
    public double getArea() {
        return length * breadth;
    }

    @Override
    public double getPerimeter() {
        return (2 * (length + breadth));
    }

    @Override
    public String toString() {
        return String.format("Rectangle [colour=%a, length=%b, breadth=%c]", this.getColour(), length, breadth);
    }
}

class Circle extends AbstractShape {
    private int radius;

    Circle(String color, int radius) {
        super(color);
        this.radius = radius;
    }


    @Override
    public double getArea() {
        return (Math.PI * radius * radius);
    }

    @Override
    public double getPerimeter() {
        return (2 * Math.PI * radius);
    }

    @Override
    public String toString() {
        return String.format("Circle [colour=%a, radius=%b]", this.getColour(), radius);
    }

}


public class ShapeHierarchy {


    public static void printShape(AbstractShape a) {
        System.out.println(a);
        int area = (int) Math.round(a.getArea());
        int peri = (int) Math.round(a.getPerimeter());
        System.out.println("Area:" + area + " Perimeter: " + peri);
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ch = sc.nextLine();


        if (ch.equalsIgnoreCase("CIRCLE")) {
            String[] input1 = sc.nextLine().split(" ");
            Circle c = new Circle(input1[0], Integer.parseInt(input1[1]));
            printShape(c);
        } else if (ch.equalsIgnoreCase("RECTANGLE")) {
            String[] input2 = sc.nextLine().split(" ");
            Rectangle r = new Rectangle(input2[0], Integer.parseInt(input2[1]), Integer.parseInt(input2[2]));
            printShape(r);
        }

    }
}
