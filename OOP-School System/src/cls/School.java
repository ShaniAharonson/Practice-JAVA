package cls;

import java.util.Arrays;

public class School {
    private ClassRoom[] classRooms;

    public School(ClassRoom[] classRooms) {
        setClassRooms(classRooms);
    }

    public ClassRoom[] getClassRooms() {
        return classRooms;
    }

    public void setClassRooms(ClassRoom[] classRooms) {
        if (classRooms.length!=5){
            throw new IllegalArgumentException("there must be only 5 class rooms in school");
        }
        this.classRooms = classRooms;
    }

    @Override
    public String toString() {
        return "School{" +
                "classRooms=" + Arrays.toString(classRooms) +
                '}';
    }
}
