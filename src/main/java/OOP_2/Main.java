package OOP_2;

import static OOP_2.Utils.*;

public class Main {
    public static void main(String[] args) {

        for (Employee d : Data.getEmployees().get("employees")) {
            System.out.println(d.getName() +
                    " : " + d.getBaseSalary() +
                    " : " + d.getBonus() +
                    " : " + d.getSalary());
        }
        System.out.println();

        for (Employee w : Data.getEmployees().get("workers")) {
            System.out.println(w.getName() +
                    " : " + w.getBaseSalary() +
                    " : " + w.getBonus() +
                    " : " + w.getSalary());
        }

        for (Employee m : Data.getEmployees().get("managers")) {
            System.out.println(m.getName() +
                    " : " + m.getBaseSalary() +
                    " : " + m.getBonus() +
                    " : " + m.getSalary());
        }

        System.out.printf("%n%s%n", "—".repeat(70));
        printEmployeeData("Tim");
        printEmployeeData("Tom");
        printEmployeeData("Ken");
        printEmployeeData("Dan");
        printEmployeeData("Kur");

        System.out.printf("%n%s%n", "—".repeat(70));
        double budget = getBudget(Data.getEmployees().get("employees"));
        System.out.println(Data.getEmployees().get("employees").length + " employees\n1 month : " + budget);

        System.out.println(MonthUtils.getQuarter3().length + " months: " + budget * MonthUtils.getQuarter3().length);

        Employee min = findMinSalaryEmployee(Data.getEmployees().get("employees"));
        Employee max = findMaxSalaryEmployee(Data.getEmployees().get("employees"));

        System.out.println("min: " + min.getName() + " with: " + min.getSalary());
        System.out.println("max: " + max.getName() + " with: " + max.getSalary());
    }

    static void printEmployeeData(String name) {

        try {
            Employee e = Utils.getEmployeeByName(name);
            System.out.println(e.getName() + " : " +
                    e.getBaseSalary() + " : " +
                    e.getBonus() + " : " +
                    e.getSalary());
        }
        catch (Exception e) {
            System.out.println("Exception: Could not find Employee: " + name);
        }
    }
}
