package OOP_2;

public class Worker extends Employee {

    Worker(String name) {
        super(name);
    }

    Worker(String name, double baseSalary) {
        super(name, baseSalary);
    }

    @Override
    double getSalary() {
        return super.getSalary();
    }
}
