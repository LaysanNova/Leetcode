package OOP_2;

public class Director extends Manager {

    Director(String name) {
        super(name);
    }

    Director(String name, double baseSalary) {
        super(name, baseSalary);
    }

    public Director(String name, double baseSalary, int numberOfSubordinates) {
        super(name, baseSalary, numberOfSubordinates);
    }
}
