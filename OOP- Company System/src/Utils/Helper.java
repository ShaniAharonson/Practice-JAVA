package Utils;

import cls.Employee;
import cls.Manager;

import java.util.List;

public class Helper {
    public static Double avgSalary(List<Employee> employees) {
        Double sum = 0.0;
        for (Employee employee : employees) {
            sum += employee.getSalary();

        }
        return sum / employees.size();
    }

    public static Double avgManagementSalary(List<Employee> employees) {
        Double sum = 0.0;
        int count = 0;
        for (Employee employee : employees) {
            if (employee instanceof Manager) {
                sum += employee.getSalary();
                count++;
            }
        }

        return sum / count;
    }

    public static void display(List<Employee> employees) {
        System.out.println();
        System.out.println("------------Employees-----------");
        for (Employee employee : employees) {
            System.out.println(employee);
        }
        System.out.println("-------------------------------");
    }

    public static void report(List<Employee>employees){
        System.out.println();
        System.out.println("-----------Report -----------");
        System.out.println("avg salary:" + avgSalary(employees));

        System.out.println("avg management salary: "+ avgManagementSalary(employees));
        System.out.println("---------------------------");
    }
}
