package AllData;

public class Person {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >=20 && age <=120) {
            this.age = age;
        }
    }

    private String name;
    private int age;

    @Override
    public String toString(){
        return "name: " + getName() + "age: " + getAge();
    }
    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof Person){
            return age == ((Person) o).age;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return age;
    }
}
