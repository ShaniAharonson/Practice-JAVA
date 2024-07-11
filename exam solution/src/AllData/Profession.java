package AllData;

public enum Profession {
    math("dani",12),
    chemistry("dina",20),
    geography("sima",17),
    literature("simha",15),
    physics("gadi",8),
    sports("yoav",34);

    public String getTeacher() {
        return teacher;
    }
    public int getStudentAmount() {
        return StudentAmount;
    }
    private String teacher;
    private int StudentAmount;

    Profession(String teacher, int studentAmount) {
        this.teacher = teacher;
        StudentAmount = studentAmount;
    }
}
