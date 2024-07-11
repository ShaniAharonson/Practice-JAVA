package AllData;

public class Teacher extends Person{
    public Teacher(Gender gender, String name, int age, String id, String subject, String vetek) {
        super(gender, name, age, id);
        this.subject = subject;
        this.vetek = vetek;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getVetek() {
        return vetek;
    }

    public void setVetek(String vetek) {
        this.vetek = vetek;
    }

    private String subject;
    private String vetek;

    @Override
    public String toString() {
        return "Teacher{" + super.toString()+
                "subject='" + subject + '\'' +
                ", vetek='" + vetek + '\'' + '}';
    }
}
