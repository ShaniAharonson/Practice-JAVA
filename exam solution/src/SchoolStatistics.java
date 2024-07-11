import AllData.*;

public class SchoolStatistics {
    public static void main(String[] args) {
        Student[] arrStudents = new Student[15];
        ClassRoom[] arrClass = new ClassRoom[5];
        for (int j = 0; j < arrClass.length; j++) {
            for (int i = 0; i < arrStudents.length; i++) {
                Grade[] arr1 = {new Grade(Profession.math, 100), new Grade(Profession.physics, 90),
                        new Grade(Profession.geography, 99), new Grade(Profession.chemistry, 85),
                        new Grade(Profession.literature, 98), new Grade(Profession.sports, 88)};
                Student s = new Student("student" + 1, 27, arr1);
                arrStudents[i] = s;
            }
            Teacher t = new Teacher("more", 90, Profession.values()[(int) (Math.random() * 6)]);

            ClassRoom cls = new ClassRoom("apple", t, arrStudents);
            arrClass[j] = cls;
        }
        School s = new School(arrClass);
        System.out.println(s);


Profession p = Profession.chemistry;
        System.out.println(p.ordinal());
        System.out.println(p.getStudentAmount());
        System.out.println(p.getTeacher());

    }
}