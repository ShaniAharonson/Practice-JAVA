package cls;

public class Manager extends Employee {
    private String department;

    public Manager(String name, Double salary, String department) {
        super(name, salary);
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Manager{" +
                "department='" + department + '\'' +
                '}' + super.toString();
    }
}
