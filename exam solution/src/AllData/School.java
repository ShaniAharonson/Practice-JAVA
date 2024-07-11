package AllData;

import java.util.Arrays;

public class School {

    public School(ClassRoom[] classRooms) {
        this.classRooms = classRooms;
    }

    public ClassRoom[] getClassRooms() {
        return classRooms;
    }

    public void setClassRooms(ClassRoom[] classRooms) {
        this.classRooms = classRooms;
    }

    private ClassRoom[] classRooms = new ClassRoom[5];

    @Override
    public String toString() {
        return "School{" +
                "classRooms=" + Arrays.toString(classRooms) +
                '}';
    }
}
