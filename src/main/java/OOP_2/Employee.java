package OOP_2;

import OOP_1.Month;

public class Employee {

    private final String name;
    private double baseSalary;

    Employee(String name) {
        this.name = name;
    }

    Employee(String name, double baseSalary) {
        this.name = name;
        this.baseSalary = baseSalary;
    }

    void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    String getName() {
        return name;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    double getSalary() {
        return getBaseSalary();
    }

    double getBonus() {
        return 0;
    }
}
