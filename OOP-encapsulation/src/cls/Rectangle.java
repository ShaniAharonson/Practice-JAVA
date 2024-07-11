package cls;

public class Rectangle {
    private Double a;
    private Double b;
    private String color = "white";

    public Rectangle(){
        setA(0.0);
        setB(0.0);
        setColor("white");
    }

    public Rectangle(Double a, Double b) {
        setA(a);
        setB(b);
    }

    public Rectangle(Double a, Double b, String color) {
        this.a = a;
        this.b = b;
        this.color = color;
    }

    public Double getA() {
        return a;
    }

    public void setA(Double a) {
        this.a = a;
    }

    public Double getB() {
        return b;
    }

    public void setB(Double b) {
        this.b = b;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "a=" + a +
                ", b=" + b +
                ", color='" + color + '\'' +
                '}';
    }
}
