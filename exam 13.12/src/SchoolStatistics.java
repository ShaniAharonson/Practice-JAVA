import Alldata.*;

import java.util.Random;

public class SchoolStatistics {
    public static void main(String[] args) {


        Teacher t1 = new Teacher("simha", 50, Values.Chemistry);
        Teacher t2 = new Teacher("ziva", 40, Values.Geography);
        Teacher t3 = new Teacher("Malca", 60, Values.literature);
        Teacher t4 = new Teacher("Yael", 80, Values.Math);
        Teacher t5 = new Teacher("shlomit", 55, Values.physics);
        ClassRoom[] classRooms = new ClassRoom[5];
        for (int i = 0; i < classRooms.length; i++) {
classRooms[i]=new ClassRoom();
            classRooms[i].setName("class" + i);
            Student[] students = new Student[15];
            Grade[] grades = new Grade[6];
            for (int k = 0; k < students.length; k++) {
               students[k] = new Student();
                students[i].setName("student" + k);


                for (int j = 0; j < grades.length; j++) {
                    int random = (int) (Math.random() * 61) + 40;
                    int random2 = (int) (Math.random() * 7);
                    grades[i] = new Grade(Values.values()[random2], random);


                }

            }


            classRooms[i].setStudents(students);
            classRooms[i].setTeacher(t1);

        }

        School school = new School(classRooms);
        System.out.println(school);

    }

    static void SchoolAvg(School[] school, Grade g) {
        int totalGrades = 0;
        int totalStudents = 0;
        for (int i = 0; i < school.length; i++) {
            totalGrades += g.getScore();
            totalStudents++;
        }
        System.out.println("School Average: " + (totalStudents / totalStudents));

    }

    static void ClassRoomlAvg(ClassRoom[] classRoom, Grade g) {
        int totalGradesInClass = 0;
        int totalStudents = 15;
        for (int i = 0; i < classRoom.length; i++) {
            totalGradesInClass += g.getScore();
        }
        System.out.println("School average: " + totalGradesInClass / totalStudents);

    }
    static void avgForEachProfession(Values[] v, Grade g){
        int sumChemistry= 0;
        int countChemisty = 0;
        int sumMath = 0;
        int countMath = 0;
        int sumPhysics = 0;
        int countPhysics =0;
        int sumLit = 0;
        int countLit = 0;
        int sumSport = 0;
        int countSport=0;
        int countGeo= 0;
        int sumGeo= 0;
        for (int i = 0; i < v.length; i++) {

            if (g instanceof Values.Chemistry){
                sumChemistry+=g.getScore();
                countChemisty++;

            } else if (g instanceof Values.Math) {
                sumMath+=g.getScore();
                countMath++;

            } else if (g instanceof Values.physics) {
                sumPhysics+=g.getScore();
                countPhysics++;

            } else if (g instanceof Values.literature) {
                sumLit+=g.getScore();
                countLit++;

            }
            else if (g instanceof Values.sports){
                sumSport+=g.getScore();
                countSport++;

            } else if (g instanceof (Values.Geography) {
                sumGeo+=g.getScore();
                countGeo++;

            }

        }
        System.out.println("avg chemistry: "+sumChemistry/countChemisty);
        System.out.println("avg math: "+ sumMath/countMath);
        System.out.println("avg physics: "+sumPhysics/countPhysics);
        System.out.println("avg literature: "+sumLit/countLit);
        System.out.println("avg Sport:" +sumSport/countSport);
        System.out.println("avg geo:" +sumGeo/countGeo);
    }
}

