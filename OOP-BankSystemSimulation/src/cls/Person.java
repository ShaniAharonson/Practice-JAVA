package cls;

import AgeCls.ageFactory;

public abstract class Person {
    protected Integer id;
    protected String name;
    protected Double age;

    protected static Integer counter = 1;



    public Person() {
       this.age = (ageFactory.getRandomAge());
    }

    public Integer getId() {
        return id;
    }


    public String getName() {
        return name;
    }



    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + id+ '\'' +
                ", age=" + age +
                '}';
    }
}
