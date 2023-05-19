package Oops.inheritance;

public class Boxweight extends Box {
    double weight;

    public Boxweight() {
        this.weight = 0;
    }

    Boxweight(double length, double height, double width, double weight) {
        super(length, width, height);
        this.weight = weight;
    }
}
