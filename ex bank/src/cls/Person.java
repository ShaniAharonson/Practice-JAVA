package cls;

public abstract class Person {
    private Integer id;
    private String name;
    private Double age;
    public static int counter = 0;

    public Person() {
        this(0, "Client", 0.0);
    }

    public Person(Integer id, String name, Double age) {
        counter++;
        setId(counter);
        setName(name);
        setAge(age);
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name + this.getId();
    }

    public Double getAge() {
        return age;
    }

    public void setAge(Double age) {
        if (age >= 16 && age <= 120) {
            this.age = age;
        }

    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id + " name: " + name + " age: " + age +
                '}';
    }
}
