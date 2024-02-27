package OOP_2;

import java.util.Objects;

public class Utils {

    static Employee getEmployeeByName(String name) {

        Employee empl = null;

        for (Employee e : Data.getEmployees().get("employees")) {
            if (Objects.equals(e.getName(), name)) {
                empl = e;
            }
            if (e.getName().contains(name)) {
                empl = e;
            }
        }

        return empl;
    }

    static double getBudget(Employee[] employees) {

        double budget = 0;

        for (Employee e : employees) {
            budget += e.getSalary();
        }

        return budget;
    }

    static Employee findMinSalaryEmployee(Employee[] employees) {

        Employee min = employees[0];

        for (Employee e : employees) {
            if (min.getSalary() > e.getSalary()) {
                min = e;
            }
        }

        return min;
    }

    static Employee findMaxSalaryEmployee(Employee[] employees) {

        Employee max = employees[0];

        for (Employee e : employees) {
            if (max.getSalary() < e.getSalary()) {
                max = e;
            }
        }

        return max;
    }
}
