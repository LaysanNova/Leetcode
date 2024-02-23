package OOP;

import java.util.Arrays;

public class Data {

    Month[] period;
    static Employee ken = new Employee("Ken", 35, true, 420);
    static Employee tom = new Employee("Tom", 26, true, 370);
    static Employee ann = new Employee("Ann", 42, false, 400);
    static Employee sam = new Employee("Sam", 60, false, 420);
    static Employee[] employees = {ken, tom, ann, sam};

    static Manager roman = new Manager("Roman", 47, true, 510, 3);
    static Manager rick = new Manager("Rick", 62, true, 580, 7);
    static Manager[] managers = {roman, rick};

    public Data(Month[] data) {
        this.period = data;
        getData();
    }

    void getData() {

        System.out.println("\nPeriod: " + Arrays.toString(period)
                .replace(",", "")
                .replace("[", "")
                .replace("]", ""));

        System.out.println("-- Workers --");

        for (Employee employee : employees) {

            System.out.println(
                    employee.getId() + ": " + employee +
                    " | " + employee.printSalary(period));
        }

        System.out.println("-- Managers--");

        for (Manager manager : managers) {

            System.out.println(
                    manager.getId() + ": " + manager +
                    " | " + manager.printSalary(period) +
                    " | " + "Salary with bonus = " + manager.getSalary(period));
        }
    }
}
