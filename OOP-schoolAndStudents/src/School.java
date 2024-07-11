import src.Proffesion;

import java.util.Arrays;

public class School {
    private final ClassRoom[] classRooms;

    public School() {
        this.classRooms = new ClassRoom[5];
        initializeClassrooms();

    }

    @Override
    public String toString() {
        return "School{" +
                "classRooms=" + Arrays.toString(classRooms) +
                '}';
    }

    private void initializeClassrooms() {
        String[] classNames = {"Class A", "Class B", "Class C", "Class D", "Class E"};
        for (int i = 0; i < classRooms.length; i++) {
            String className = classNames[i];
            Teacher teacher = new Teacher("Teacher" + (i + 1), 30 + i,Proffesion.values()[(int)(Math.random()*6)]);
            classRooms[i] = new ClassRoom(className, teacher, new Student[15]); // Assuming 20 students per class
            System.out.println(classRooms[i]);
        }

    }

}
