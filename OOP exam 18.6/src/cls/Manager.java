package cls;

public class Manager extends Employee{

    public Manager(String name, int age, Salary salary) {
        super(name, age, salary);
        if (salary.getAmount() < 25000) {
            throw new IllegalArgumentException("Manager's salary must be at least 25000.");
        }
    }

}
