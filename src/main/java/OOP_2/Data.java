package OOP_2;

import java.util.HashMap;
import java.util.Map;

public class Data {

    public static Map<String, Employee[]> getEmployees() {

        Worker worker1 = new Worker("Tim");
        worker1.setBaseSalary(3200);

        Worker worker2 = new Worker("Tom", 3500);
        Worker worker3 = new Worker("Ann", 2800);
        Worker worker4 = new Worker("Rob", 3600);
        Worker worker5 = new Worker("Sam", 3100);

        Manager manager1 = new Manager("Ken", 4200);
        manager1.setNumberOfSubordinates(2);

        Manager manager2 = new Manager("Fat", 4200, 3);

        Director director1 = new Director("Dan Conner", 5200, 7);

        Map<String, Employee[]> employees = new HashMap<String, Employee[]>();
        employees.put("employees", new Employee[]{worker1, worker2, worker3, worker4, worker5, manager1, manager2, director1});
        employees.put("workers", new Worker[]{worker1, worker2, worker3, worker4, worker5});
        employees.put("managers", new Manager[]{manager1, manager2, director1});
        employees.put("directors", new Director[]{director1});

        return employees;
    }
}
