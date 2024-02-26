package OOP_2;

public class Manager extends Employee {

    private int NumberOfSubordinates;
    Manager(String name) {
        super(name);
    }

    Manager(String name, double baseSalary) {
        super(name, baseSalary);
    }

    public Manager(String name, double baseSalary, int numberOfSubordinates) {
        super(name, baseSalary);
        this.NumberOfSubordinates = numberOfSubordinates;
    }

    int getNumberOfSubordinates() {
        return NumberOfSubordinates;
    }

    void setNumberOfSubordinates(int numberOfSubordinates) {
        this.NumberOfSubordinates = numberOfSubordinates;
    }

    @Override
    double getBonus() {
        return super.getSalary() * getNumberOfSubordinates() / 100;
    }

    @Override
    double getSalary() {
        return super.getSalary() + getBonus();
    }
}
