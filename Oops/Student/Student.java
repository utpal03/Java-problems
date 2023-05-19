package Oops;

class Student {
    String name;
    String address;
    int marks;
    static String college = "Galgotias University";

    Student() {
        this.name = "micky";
        this.address = "No_where";
        this.marks = 100;
    }

    Student(String name, String address, int marks) {
        this.name = name;
        this.address = address;
        this.marks = marks;
    }
}

class Dancer extends Student {
    String dance_type;

    Dancer(String name, String address, int marks, String dance_type) {
        super(name, address, marks);
        this.dance_type = dance_type;
    }
}