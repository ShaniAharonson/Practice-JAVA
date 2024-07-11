package cls;

public class Librarian extends Person{
    private String section;

    public Librarian(String name, int age, String section) {
        super(name, age);
        this.section = section;
    }

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }

    @Override
    public String toString() {
        return "Librarian{" + super.toString()+
                "section='" + section + '\'' +
                '}';
    }
}
