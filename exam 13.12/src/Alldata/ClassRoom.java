package Alldata;

import java.util.Arrays;

public class ClassRoom {


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

    private String name;
    private Teacher teacher;
    private Student[] students = new Student[15];

    @Override
    public String toString() {
        for (int i = 0; i < getStudents().length; i++) {
            System.out.print("Students: " + students[i]);
        }
        return "Class Room: \n" + super.toString() + " name: " + getName() + " Teacher: " + getTeacher();
    }
}