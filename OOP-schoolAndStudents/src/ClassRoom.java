import factory.GradesFactory;

import java.util.Arrays;
import java.util.Random;

public class ClassRoom {
    private String name;
    private Teacher teacher;
    private Student [] students;

    public ClassRoom(String name, Teacher teacher, Student[] students) {
        this.name = name;
        this.teacher = teacher;
        this.students =  new Student[15];
        Random random = new Random();
        for (int i =0; i < students.length;i++){
            this.students[i] = new Student("Student" + (i + 1), 15 + i,new Grade[]{});
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    @Override
    public String toString() {
        return "ClassRoom{" +
                "name='" + name + '\'' +
                ", teacher=" + teacher +
                ", students=" + Arrays.toString(students) +
                '}';
    }
}
