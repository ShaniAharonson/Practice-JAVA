package Alldata;

public class Teacher extends Person{
    public Teacher(String name, int age, Values values) {
        super(name, age);
        this.values = values;
    }

    public Values getValues() {
        return values;
    }

    public void setValues(Values values) {
        this.values = values;
    }

    private Values values;

    @Override
    public String toString() {
        return "Teacher: \n" + super.toString() +" and the profession are: "+ getValues() ;
    }
}
