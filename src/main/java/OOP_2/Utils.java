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

    static MinMax findMinMaxSalaryEmployee(Employee[] employees) {

        MinMax minMax = new MinMax();
        MinMax.setMinSalary(employees[0]);
        MinMax.setMaxSalary(employees[0]);

        for (Employee e : employees) {
            if (MinMax.getMinSalary().getSalary() > e.getSalary()) {
                MinMax.setMinSalary(e);
            }
            if (MinMax.getMaxSalary().getSalary() < e.getSalary()) {
                MinMax.setMaxSalary(e);
            }
        }

        return minMax;
    }
}
