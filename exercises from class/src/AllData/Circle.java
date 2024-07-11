package AllData;

public class Circle extends Shape{

    public Circle(int x, int y, int radius) {
        super(x, y);
        Radius = radius;
    }

    public int getRadius() {
        return Radius;
    }

    public void setRadius(int radius) {
        Radius = radius;
    }

    private int Radius;

    @Override
    public void Print() {
        System.out.println("Circle: ");
        super.Print();
        System.out.println("radius= " + getRadius());
        System.out.println("\n");
    }
}
