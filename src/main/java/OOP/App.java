package OOP;

import java.util.Arrays;

public class App {

    static void getData(Month[] data) {

        Employee.number = 0;

        System.out.println("\nPeriod: " + Arrays.toString(data)
                .replace(",", "")
                .replace("[", "")
                .replace("]", ""));

        Employee ken = new Employee("Ken", 35, true, 420);
        Employee tom = new Employee("Tom", 26, true, 370);
        Employee ann = new Employee("Ann", 42, false, 400);
        Employee sam = new Employee("Sam", 60, false, 420);

        Employee[] employees = {ken, tom, ann, sam};

        System.out.println("-- Workers --");

        for (Employee employee : employees) {

            System.out.println(
                    employee.getId() + ": " + employee +
                    " | " + employee.printSalary(data));
        }

        System.out.println("-- Managers--");

        Manager roman = new Manager("Roman", 47, true, 510, 3);
        Manager rick = new Manager("Rick", 62, true, 580, 7);

        Manager[] managers = {roman, rick};

        for (Manager manager : managers) {

            System.out.println(
                    manager.getId() + ": " + manager +
                    " | " + manager.printSalary(data) +
                    " | " + "Salary with bonus = " + manager.getSalary(data));
        }
    }
}
