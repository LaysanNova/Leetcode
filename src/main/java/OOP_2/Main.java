package OOP_2;


import static OOP_2.Utils.findMinMaxSalaryEmployee;
import static OOP_2.Utils.getBudget;

public class Main {
    public static void main(String[] args) {

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

        for (Employee d : Data.getEmployees().get("directors")) {
            System.out.println(d.getName() +
                    " : " + d.getBaseSalary() +
                    " : " + d.getBonus() +
                    " : " + d.getSalary());
        }

        System.out.println("\n--------------------------------------");
        printEmployeeData("Tim");
        printEmployeeData("Tom");
        printEmployeeData("Ken");
        printEmployeeData("Dan");
        printEmployeeData("Kur");


        double budget = getBudget(Data.getEmployees().get("employees"));
        System.out.println(Data.getEmployees().get("employees").length + " : " + budget);

        System.out.println(MonthUtils.getQuarter3().length + " months: " + budget * MonthUtils.getQuarter3().length);

        MinMax minMax = findMinMaxSalaryEmployee(Data.getEmployees().get("employees"));
        System.out.println("min: " + MinMax.getMinSalary().getName() + " with: " + MinMax.getMinSalary().getSalary());
        System.out.println("max: " + MinMax.getMaxSalary().getName() + " with: " + MinMax.getMaxSalary().getSalary());
    }

    static void printEmployeeData(String name) {

        try {
            Employee e = Utils.getEmployeeByName(name);
            System.out.println(e.getName() + " : " + e.getBaseSalary() + " : " + e.getBonus() + " : " + e.getSalary());
        }
        catch (Exception e) {
            System.out.println("Exception: Could not find Employee: " + name);
        }
    }
}
