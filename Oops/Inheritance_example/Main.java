package Oops.inheritance;

public class Main {
    double length;
    double width;
    double height;

    public double calvol(Box old) {
        this.length = old.length;
        this.height = old.height;
        this.width = old.width;
        return length * height * width;
    }

    public static void main(String[] args) {

        Box b1 = new Box(12, 13, 14);
        Box b2 = new Box(10);
        System.out.println(b2.height + " , " + b1.length);

        Boxweight box3 = new Boxweight(19, 15, 14, 11);
        Box box4 = new Box(box3);
        System.out.println(box4.length);
    }
}
