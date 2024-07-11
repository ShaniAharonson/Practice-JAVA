package cls;

import java.util.List;

public class Department {
    private String name;
    private Manager manager;
    private List<Employee> employees;

    public static final String[] VALID_DEPARTMENTS = {
            "Sales", "finance", "Administration", "Engineering", "Marketing"
    };

    public Department(String name, Manager manager, List<Employee> employees) {
        setName(name);
        setManager(manager);
        setEmployees(employees);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (!isValidDepartments(name)) {
            throw new IllegalArgumentException("Invalid name" + name);
        }
        this.name = name;
    }

    public Manager getManager() {
        return manager;
    }

    public void setManager(Manager manager) {
        this.manager = manager;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        if (employees == null || employees.size() != 15) {
            throw new IllegalArgumentException("There must be 15 employees in a department.");
        }
        this.employees = employees;
    }

    private boolean isValidDepartments(String department) {
        for (String validDepartment : VALID_DEPARTMENTS) {
            if (validDepartment.equals(department)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "Department{" +
                "name='" + name + '\'' +
                ", manager=" + manager +
                ", employees=" + employees +
                '}';
    }
}
