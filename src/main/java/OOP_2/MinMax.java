package OOP_2;

final class MinMax {

    private static Employee minSalary;
    private static Employee maxSalary;

    static Employee getMinSalary() {
        return minSalary;
    }

    static void setMinSalary(Employee minSalary) {
        MinMax.minSalary = minSalary;
    }

    public static Employee getMaxSalary() {
        return maxSalary;
    }

    public static void setMaxSalary(Employee maxSalary) {
        MinMax.maxSalary = maxSalary;
    }
}
