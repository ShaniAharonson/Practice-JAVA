package AllData;

import java.util.Arrays;

public class ClassRoom {
    private String name;
    private Teacher teacher;

    public ClassRoom(String name, Teacher teacher, Student[] students) {
        this.name = name;
        this.teacher = teacher;
        this.students = students;
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

    private Student[] students;

    @Override
    public String toString() {
        return "ClassRoom{" +
                "name='" + name + '\'' +
                ", teacher=" + teacher +
                ", students=" + Arrays.toString(students) +
                '}';
    }
}
