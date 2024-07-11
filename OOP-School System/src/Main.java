import cls.*;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Create teachers
        Teacher teacher1 = new Teacher("John Doe", 35, "math");
        Teacher teacher2 = new Teacher("Jane Smith", 40, "chemistry");
        Teacher teacher3 = new Teacher("Emily Johnson", 30, "geography");
        Teacher teacher4 = new Teacher("Michael Brown", 50, "literature");
        Teacher teacher5 = new Teacher("Sarah Davis", 45, "physics");

        // Create students with random grades
        Student[] students = new Student[15];
        for (int i = 0; i < 15; i++) {
            Grade[] grades = new Grade[6];
            grades[0] = new Grade("math", (int) (Math.random() * 61) + 40);
            grades[1] = new Grade("chemistry", (int) (Math.random() * 61) + 40);
            grades[2] = new Grade("geography", (int) (Math.random() * 61) + 40);
            grades[3] = new Grade("literature", (int) (Math.random() * 61) + 40);
            grades[4] = new Grade("physics", (int) (Math.random() * 61) + 40);
            grades[5] = new Grade("sports", (int) (Math.random() * 61) + 40);

            students[i] = new Student("Student" + (i + 1), 20 + (int) (Math.random() * 101), grades);
        }

        // Create classrooms
        ClassRoom classRoom1 = new ClassRoom("Class A", teacher1, students);
        ClassRoom classRoom2 = new ClassRoom("Class B", teacher2, students);
        ClassRoom classRoom3 = new ClassRoom("Class C", teacher3, students);
        ClassRoom classRoom4 = new ClassRoom("Class D", teacher4, students);
        ClassRoom classRoom5 = new ClassRoom("Class E", teacher5, students);

        // Create school
        ClassRoom[] classRooms = {classRoom1, classRoom2, classRoom3, classRoom4, classRoom5};
        School school = new School(classRooms);
        System.out.println(school);
        // Print school statistics
        //school.printStatistics();
    }
}
