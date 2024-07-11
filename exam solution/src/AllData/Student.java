package AllData;

import java.util.Arrays;

public class Student extends Person {
    public Grade[] getGrades() {
        return Grades;
    }

    public void setGrades(Grade[] grades) {
        Grades = grades;
    }

    private Grade[] Grades = new Grade[6];

    public Student(String name, int age, Grade[] grades) {
        super(name, age);
        Grades = grades;
    }

    @Override
    public String toString() {
        return "Student{" +
                "Grades=" + Arrays.toString(Grades) +
                '}';
    }
}
