public class Student extends Person {
    String stu_id;
    int marks;

    Student(String name, int age, String stu_id, int marks) {
        super(name, age);
        this.stu_id = stu_id;
        this.marks = marks;
    }

    void printDetails() {
        System.out.println();
    }
}
