public class Employee extends Person {
    String emp_id;
    float salary;

    Employee(String name, int age, String emp_id, float salary) {
        super(name, age);
        this.emp_id = emp_id;
        this.salary = salary;
    }

    void printDetails() {
        System.out.println();
    }
}