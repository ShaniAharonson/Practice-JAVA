package cls;

public class Employee extends Person {
    private Salary salary;

    public Employee(String name, int age, Salary salary) {
        super(name, age);
        setSalary(salary);
    }

    public Salary getSalary() {
        return salary;
    }

    public void setSalary(Salary salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" + super.toString() +
                "salary=" + salary +
                '}';
    }
}
