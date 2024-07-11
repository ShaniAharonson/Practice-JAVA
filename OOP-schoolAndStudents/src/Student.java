import src.Proffesion;

import java.util.Arrays;
import java.util.Random;

public class Student extends Person {
    private Grade[] grades;


    public Student(String name, int age, Grade[] grades) {
        super(name, age);
        this.grades = new Grade[6];
        Random random = new Random();
        for (int i = 0; i < grades.length; i++) {
            grades[i] = new Grade(Proffesion.values()[(int) (Math.random()*6)],random.nextInt(61) + 40);

        }

    }

    @Override
    public String toString() {
        return "Student{" +
                "grades=" + Arrays.toString(grades) +
                '}';
    }
}



