package cls;

import java.util.List;

public class Company {
    private List<Department>departments;

    public Company(List<Department> departments) {
        setDepartments(departments);
    }

    public List<Department> getDepartments() {
        return departments;
    }

    public void setDepartments(List<Department> departments) {
        if (departments == null || departments.size() != 5) {
            throw new IllegalArgumentException("There must be 5 departments in a company.");
        }
        this.departments = departments;
    }

    @Override
    public String toString() {
        return "Company{" +
                "departments=" + departments +
                '}';
    }
}
