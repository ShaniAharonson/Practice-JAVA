package Utils;

import cls.*;

import java.util.ArrayList;
import java.util.List;

public class FactoryUtils {
    public static double randSalary(Class<?> employee) {
        if (employee.equals(Secretary.class)) {
            return randBtw(7000, 8500);
        }
        if (employee.equals(Engineer.class)) {
            return randBtw(9000, 11_000);
        }
        if (employee.equals(Director.class)) {
            return randBtw(18_000, 35_000);
        }
        if (employee.equals(Manager.class)) {
            return randBtw(12_000, 15_500);
        }
        return 0;
    }

    public static double randBtw(double min, double max) {
        return Math.random() * ((max - min) + 1) + min;
    }

    public static List<Employee> intEmployees() {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Secretary(Name.getRandName(),randSalary(Secretary.class),"TLV"));
        employees.add(new Secretary(Name.getRandName(),randSalary(Secretary.class),"JLM"));
        employees.add(new Manager(Name.getRandName(),randSalary(Manager.class),"R&D"));
        employees.add(new Manager(Name.getRandName(),randSalary(Manager.class),"IT"));
        employees.add(new Employee(Name.getRandName(),randSalary(Employee.class)));
        employees.add(new Employee(Name.getRandName(),randSalary(Employee.class)));
        employees.add(new Employee(Name.getRandName(),randSalary(Employee.class)));
        employees.add(new Director(Name.getRandName(),randSalary(Director.class),"Software","HAJAJ group"));
        employees.add(new Engineer(Name.getRandName(),randSalary(Engineer.class),"Backend"));
        employees.add(new Engineer(Name.getRandName(),randSalary(Engineer.class),"Frontend"));
        employees.add(new Engineer(Name.getRandName(),randSalary(Engineer.class),"Devops"));
        return employees;

    }
}
