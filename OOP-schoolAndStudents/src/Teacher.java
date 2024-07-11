import src.Proffesion;

public class Teacher extends Person{
    private Proffesion profession;

    public Teacher(String name, int age, Proffesion profession) {
        super(name, age);
        this.profession = profession;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "profession=" + profession +
                '}';
    }
}





