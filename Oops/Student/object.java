package Oops;

public class object {
    public static void main(String[] args) {
        Student s1 = new Student("micky", "hilsa", 100);
        System.out.println(s1.name);
        System.out.println(Student.college);
        Dancer d1 = new Dancer("Satiya", "Andman", 96, "Hip_hop");

        System.out.println(d1.name + " performs " + d1.dance_type);
        Student s2 = new Student();
        System.out.println(s2.name);
        System.out.println(Student.college);
    }
}