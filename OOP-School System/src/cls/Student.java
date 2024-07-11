package cls;

import java.util.Arrays;

public class Student extends Person{
    private Grade[] grades;

    public Student(String name, int age, Grade[] grades) {
        super(name, age);
        setGrades(grades);
    }

    public Grade[] getGrades() {
        return grades;
    }

    public void setGrades(Grade[] grades) {
        if (grades.length!=6){
            throw new IllegalArgumentException("Length must be up to 6");
        }
        this.grades = grades;
    }

    @Override
    public String toString() {
        return "Student{" + super.toString()+
                "grades=" + Arrays.toString(grades) +
                '}';
    }
}
