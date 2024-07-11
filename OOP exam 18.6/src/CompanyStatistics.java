import RandomCls.RandomFactory;
import cls.*;

import java.util.ArrayList;
import java.util.List;

import static cls.Department.VALID_DEPARTMENTS;

public class CompanyStatistics {

    public static void main(String[] args) {
        List<Department> departments = new ArrayList<>();

        for (int i = 0; i < VALID_DEPARTMENTS.length; i++) {
            // generate Manager
            String managerName = RandomFactory.generateManagerName(i + 1);
            int managerAge = RandomFactory.generateAge(30, 60);
            Salary managerSalary = new Salary(RandomFactory.generateSalaryAmount(25000, 50000), RandomFactory.generateYearlyBonus(0, 10000));
            Manager manager = new Manager(managerName, managerAge, managerSalary);

            // generate employees
            List<Employee> employees = new ArrayList<>();
            for (int index = 0; index < 15; index++) {
                String employeeName = RandomFactory.generateEmployeeName(i * 15 + index + 1);
                int employeeAge = RandomFactory.generateAge(20, 60);
                Salary employeeSalary = new Salary(RandomFactory.generateSalaryAmount(1000, 50000), RandomFactory.generateYearlyBonus(0, 10000));
                Employee employee = new Employee(employeeName, employeeAge, employeeSalary);
                employees.add(employee);
            }
            // generate departments
            Department department = new Department(VALID_DEPARTMENTS[i], manager, employees);
            departments.add(department);
        }
        // generate company
        Company company = new Company(departments);
        System.out.println("\n\n\n");
        System.out.println("==========Comany===========");
        System.out.println(company);

        avgSalaryOfManagers(company);
    }


    public static void avgSalaryOfManagers(Company company) {
        double totalSalaries = 0;
        int totalManagers = 0;
        for (Department department : company.getDepartments()) {
            // getting salary from the managers
            Manager manager = department.getManager();
            totalSalaries += manager.getSalary().getAmount();
            totalManagers++;
        }
        // calculation
        double averageSalary = totalSalaries / totalManagers;

        System.out.println("Average Salary: " + averageSalary);
    }
}
