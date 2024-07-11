package cls;

import java.util.Arrays;

public class Teacher extends Person{
    private String profession;

    public Teacher(String name, int age, String profession) {
        super(name, age);
        setProfession(profession);
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        if (!Arrays.asList(Grade.VALID_PROFESSIONS).contains(profession)){
            throw new IllegalArgumentException("invalid profession"+ profession);
        }
        this.profession = profession;
    }

    @Override
    public String toString() {
        return "Teacher{" + super.toString()+
                ", profession='" + profession + '\'' +
                '}';
    }
}
