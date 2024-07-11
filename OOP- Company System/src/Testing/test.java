package Testing;

import Utils.FactoryUtils;
import Utils.Helper;
import cls.Employee;

import java.util.LinkedList;
import java.util.List;

public class test {
    public static void main(String[] args) {
        List<Employee> employees = new LinkedList<>();

        employees.addAll(FactoryUtils.intEmployees());

        Helper.display(employees);
        Helper.report(employees);
    }
}
