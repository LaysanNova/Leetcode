package OOP;

import java.text.DecimalFormat;

public class Employee {
    public static int number = 0;
    private final int id;
    private final String employeeName;
    private final int employeeAge;
    private final boolean employeeGender;
    private final double salaryPerDay;

    public Employee(String employeeName, int employeeAge, boolean employeeGender, double salaryPerDay) {
        number += 1;
        this.employeeName = employeeName;
        this.employeeAge = employeeAge;
        this.employeeGender = employeeGender;
        this.salaryPerDay = salaryPerDay;
        this.id = number;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public int getEmployeeAge() {
        return employeeAge;
    }

    public String isEmployeeGender() {
        if (employeeGender) {
            return "Male";
        }
        return "Female";
    }

    public double getSalaryPerDay() {
        return salaryPerDay;
    }

    double getSalary(Month[] monthArray) {

        double salary = 0;

        if (monthArray.length > 0 && monthArray.length <= 12) {
            for (Month month : monthArray) {
                salary += getSalaryPerDay() * month.getNumOfDays();
            }
        }

        return salary;
    }

    public String printSalary(Month[] monthArray) {
        return "Salary: " + getSalary(monthArray);
    }

    @Override
    public String toString() {
        return getEmployeeName() + " | " +
               getEmployeeAge() +  " | " +
               isEmployeeGender() + " | " +
               getSalaryPerDay();
    }

    public String getId() {

        String pattern = "000";
        DecimalFormat formatter = new DecimalFormat(pattern);
        String formattedNumber = formatter.format(this.id);

        return "id: " + formattedNumber;
    }
}