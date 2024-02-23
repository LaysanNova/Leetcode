package OOP;

public class Manager extends Employee{

    private final int subordinate;

    public Manager(String employeeName, int employeeAge, boolean employeeGander, double salaryPerDay, int subordinate) {
        super(employeeName, employeeAge, employeeGander, salaryPerDay);
        this.subordinate = subordinate;
    }

    public int getSubordinate() {
        return subordinate;
    }
    @Override
    public String toString() {
        return getEmployeeName() + " | " +
                getEmployeeAge() +  " | " +
                isEmployeeGender() + " | " +
                getSalaryPerDay() + " | " +
                getSubordinate();
    }
}
