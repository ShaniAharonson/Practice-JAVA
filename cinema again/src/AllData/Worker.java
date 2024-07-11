package AllData;

public class Worker extends Person{
    public Worker(Gender gender, String name, int age, String id, int salary) {
        super(gender, name, age, id);
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    private int salary;

    @Override
    public String toString() {
        return "Worker{" + super.toString()+
                "salary=" + salary + '}';
    }
}
