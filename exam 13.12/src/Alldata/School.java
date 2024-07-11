package Alldata;

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

    public String toString(){
        System.out.println("School: ");
        for (int i = 0; i < classRooms.length; i++) {
            classRooms[i].setName("a"+i);
            System.out.println("class: " +classRooms[i]);


        }
     return super.toString();
    }
}
