package AllData;

public class Student extends Person{
    public Student(Gender gender, String name, int age, String id, String place, String subject) {
        super(gender, name, age, id);
        this.place = place;
        this.subject = subject;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    private String place;
    private String subject;

    @Override
    public String toString() {
        return "Student{" + super.toString()+
                "place='" + place + '\'' +
                ", subject='" + subject + '\'' +
                '}';
    }
}
