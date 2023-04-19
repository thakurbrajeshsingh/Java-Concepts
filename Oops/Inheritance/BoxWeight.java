package Oops.Inheritance;

public class BoxWeight extends Box {
    double weight;

    public BoxWeight() {
        this.weight = -1;
    }

    public BoxWeight(double l, double h, double w, double weight) {
        super(l, h, w);
        this.weight = weight;
    }
    public BoxWeight(BoxWeight other){
        super(other);
        weight=other.weight;
    }

    public BoxWeight(double side,double weight) {
        super(side);
        this.weight = -1;
    }



}
