package Oops.inheritance;

public class Box {
    double length;
    double height;
    double width;

    Box() {
        this.height = 0;
        this.length = 0;
        this.width = 0;
    }

    //cube
    Box(double side) {
        this.width = side;
        this.length = side;
        this.height = side;
    }

    Box(double length, double height, double width) {
        this.length = length;
        this.height = height;
        this.width = width;
    }

    Box(Box old) {
        this.height = old.height;
        this.length = old.length;
        this.width = old.width;
    }
}