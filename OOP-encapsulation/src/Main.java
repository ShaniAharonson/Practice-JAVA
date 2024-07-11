import cls.Light;
import cls.Rectangle;

public class Main {
    public static void main(String[] args) {
        Rectangle a = new Rectangle();
        Rectangle b = new Rectangle(4.0,6.0);
        Rectangle c = new Rectangle(4.0,6.0,"Blue");

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        Light a1 = new Light();
        Light b1 = new Light(2,80.0);
        Light c1 = new Light(4,"Yellow");
        Light d1 = new Light(5,"Green",90.5);

        System.out.println(a1);
        System.out.println(b1);
        System.out.println(c1);
        System.out.println(d1);
    }
}