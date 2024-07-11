package AllData;

public class Rectangle extends Shape{
    public Rectangle(int x, int y, int height, int width) {
        super(x, y);
        Height = height;
        Width = width;
    }

    public int getHeight() {
        return Height;
    }

    public void setHeight(int height) {
        Height = height;
    }

    public int getWidth() {
        return Width;
    }

    public void setWidth(int width) {
        Width = width;
    }

    private int Height;
    private int Width;

    @Override
    public void Print() {
        System.out.println("Rectangle: ");
        super.Print();
        System.out.println("width = "+ getWidth()+ " Height= " + getHeight());
      //  System.out.println("\n");
    }
}
