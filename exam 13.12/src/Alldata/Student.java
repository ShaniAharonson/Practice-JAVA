package Alldata;

import java.util.Arrays;

public class Student extends Person {

    public Student(String name, int age, Grade[] grades) {
        super(name, age);
        this.grades = grades;
    }

    public Grade[] getGrades() {
        return grades;
    }

    public void setGrades(Grade[] grades) {
        this.grades = grades;
    }

    private Grade[] grades = new Grade[6];

    @Override
    public String toString() {
        System.out.println("Grades: ");

        for (int i = 0; i < getGrades().length; i++) {
            System.out.print("grades: " + grades[i]);

        }
        return super.toString();
    }
}
